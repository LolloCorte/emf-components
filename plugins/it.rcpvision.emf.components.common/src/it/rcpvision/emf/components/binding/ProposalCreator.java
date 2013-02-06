/**
 * <copyright> 
 *
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package it.rcpvision.emf.components.binding;

import it.rcpvision.emf.components.runtime.util.PolymorphicDispatcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Predicate;

/**
 * @author Dennis H�bner Initial
 * @author Lorenzo Bettini polymorphic proposals
 * 
 */
public class ProposalCreator {
	private ResourceSet resourceSet;
	
	private PolymorphicDispatcher.ErrorHandler<List<?>> proposals_errorHandler = new PolymorphicDispatcher.NullErrorHandler<List<?>>();

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	protected void retrieveResourceSet(EObject eObject) {
		Resource resource = eObject.eResource();
		resourceSet = (resource == null ? null : resource
				.getResourceSet());
	}

	/**
	 * Calculates possible values for given operating object.
	 * 
	 * @param feature
	 * @return possible values
	 */
	public List<?> proposals(EObject eObject, EStructuralFeature feature) {
		
		List<?> proposals  = polymorphicCreateProposals(eObject, feature);
		if(proposals != null){
			return proposals;
		}
		
		if (resourceSet == null)
			retrieveResourceSet(eObject);

		List<?> retVal = null;
		// TODO Reference[] handle
		if (feature instanceof EReference) {
			retVal = findAllInstances(feature.getEType());
		} else if (feature.getEType() instanceof EEnumImpl) {
			EEnum eEnum = (EEnum) feature.getEType();
			List<Enumerator> enumerators = new ArrayList<Enumerator>();
			for (Iterator<?> iter = eEnum.getELiterals().iterator(); iter
					.hasNext();) {
				Enumerator instance = ((EEnumLiteral) iter.next())
						.getInstance();
				enumerators.add(instance);
			}
			retVal = enumerators;
		}
		return retVal;
	}

	private List<Object> findAllInstances(EClassifier type) {
		List<Object> objects = new ArrayList<Object>();
		
		if (resourceSet == null)
			return objects;
		
		TreeIterator<Object> allContents = EcoreUtil.getAllContents(
				resourceSet.getResources(), true);
		while (allContents.hasNext()) {
			Object o = allContents.next();
			if (type.isInstance(o))
				objects.add(o);
		}
		for (TreeIterator<Object> iter = EcoreUtil
				.getAllContents(EcoreUtil.getRootContainer(
						EcorePackage.eINSTANCE, true), false); iter.hasNext();) {
			Object next = iter.next();
			if ((type.isInstance(next)) && !objects.contains(next)) {
				objects.add(next);
			}
		}
		return objects;
	}
	
	private List<?> polymorphicCreateProposals(EObject element,	EStructuralFeature feature) {
		PolymorphicDispatcher<List<?>> dispatcher = new PolymorphicDispatcher<List<?>>(
				Collections.singletonList(this),
				getCreateProposalsPredicate(feature),
				new PolymorphicDispatcher.NullErrorHandler<List<?>>()) {
			@Override
			protected List<?> handleNoSuchMethod(Object... params) {
				if (PolymorphicDispatcher.NullErrorHandler.class
						.equals(proposals_errorHandler.getClass()))
					return null;
				return super.handleNoSuchMethod(params);
			}
		};

		return dispatcher.invoke(element);
	}

	protected Predicate<Method> getCreateProposalsPredicate(
			EStructuralFeature feature) {
		String methodName = "proposals_"
				+ feature.getEContainingClass().getName() + "_"
				+ feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 1);
	}
}
