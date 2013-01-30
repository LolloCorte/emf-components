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

import it.rcpvision.emf.components.EmfComponentsActivator;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.runtime.util.PolymorphicDispatcher;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.edit.EditingDomainEObjectObservableValue;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

/**
 * 
 * Creates Control for an {@link EStructuralFeature}
 * 
 * @author Dennis Huebner initial code
 * @author Lorenzo Bettini refactoring for EmfComponents
 * 
 */
public class FormControlFactory {
	@Inject
	protected JfaceProviderFactory jfaceProviderFactory;

	private Composite parent = null;

	private FormToolkit toolkit = null;
	private EObject owner;
	protected EditingDomain domain;
	protected EMFDataBindingContext edbc;
	private ProposalCreator proposalcreator;
	public static final String EOBJECT_KEY = EcorePackage.Literals.EOBJECT
			.getName();
	public static final String ESTRUCTURALFEATURE_KEY = EcorePackage.Literals.ESTRUCTURAL_FEATURE
			.getName();

	private PolymorphicDispatcher.ErrorHandler<ControlObservablePair> control_errorHandler = new PolymorphicDispatcher.NullErrorHandler<ControlObservablePair>();

	private PolymorphicDispatcher.ErrorHandler<Control> createControl_errorHandler = new PolymorphicDispatcher.NullErrorHandler<Control>();

	private PolymorphicDispatcher.ErrorHandler<IObservableValue> observeable_errorHandler = new PolymorphicDispatcher.NullErrorHandler<IObservableValue>();

	private PolymorphicDispatcher.ErrorHandler<List<?>> proposals_errorHandler = new PolymorphicDispatcher.NullErrorHandler<List<?>>();
	
	public FormControlFactory() {

	}

	public void init(EditingDomain domain, EObject owner, Composite parent,
			FormToolkit toolkit) {
		this.edbc = new EMFDataBindingContext();
		this.domain = domain;
		this.proposalcreator = new ProposalCreator(
				getResourceSet(domain, owner));
		this.owner = owner;
		this.parent = parent;
		this.toolkit = toolkit;
	}

	protected ResourceSet getResourceSet(EditingDomain domain, EObject owner) {
		Resource resource = owner.eResource();
		ResourceSet resourceSet = (resource == null ? null : resource
				.getResourceSet());
		return domain == null ? resourceSet : domain.getResourceSet();
	}

	public Control create(EStructuralFeature feature) {
		Control control = null;

		control = polymorphicCreateControl(feature);
		if (control == null) {
			if (feature.isMany()) {
				control = bindList(feature);
			} else {
				control = bindValue(feature);
			}
			setupControl(feature, control);
		}
		return control;
	}

	protected Predicate<Method> getControlPredicate(EStructuralFeature feature) {
		String methodName = "control_" + owner.eClass().getName() + "_"
				+ feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 1);
	}

	protected Control bindList(final EStructuralFeature feature) {
		IObservableValue source = createFeatureObserveable(feature);

		ControlObservablePair retValAndTargetPair = createControlForList(feature);
		Control retVal = retValAndTargetPair.getControl();
		IObservableValue target = retValAndTargetPair.getObservableValue();

		// TODO Controllare perch� il bindValue � diverso!
		Binding binding = edbc.bindValue(target, source);
		binding.updateModelToTarget();
		return retVal;
	}

	private IObservableValue createFeatureObserveable(final EStructuralFeature feature) {
		IObservableValue source=polymorphicCreateObserveable(domain, owner, feature);
		if(source==null){	
			if (domain != null){
				source = new EditingDomainEObjectObservableValue(domain, owner, feature);
			}else{
				source = EMFObservables.observeValue(owner, feature);
			}
		}
		return source;
	}

	protected ControlObservablePair createControlForList(
			final EStructuralFeature feature) {
		ControlObservablePair result = polymorphicGetObservableControl(feature);
		if (result != null)
			return result;

		MultipleFeatureControl mfc = new MultipleFeatureControl(parent,
				toolkit, jfaceProviderFactory.createLabelProvider(), owner,
				feature, proposalcreator);
		IObservableValue target = new MultipleFeatureControlObservable(mfc);
		ControlObservablePair retValAndTargetPair = new ControlObservablePair(
				mfc, target);
		return retValAndTargetPair;
	}

	private Control bindValue(EStructuralFeature feature) {
		IObservableValue featureObservable = createFeatureObserveable(feature);
		
		Control control = polymorphicCreateControl(feature, featureObservable);
		if (control != null)
			return control;

		ControlObservablePair retValAndTargetPair = createControlAndObservableValue(feature);
		Control retVal = retValAndTargetPair.getControl();
		IObservableValue controlObservable = retValAndTargetPair
				.getObservableValue();

		if (retVal != null && controlObservable != null) {
			edbc.bindValue(controlObservable, featureObservable, null, null);
		}
		return retVal;
	}

	protected ControlObservablePair createControlAndObservableValue(
			EStructuralFeature feature) {
		ControlObservablePair result = polymorphicGetObservableControl(feature);
		if (result != null)
			return result;

		if (isBooleanFeature(feature)) {
			return createControlAndObservableValueForBoolean();
		} else {
			return createControlAndObservableValueForNonBooleanFeature(feature);
		}
	}

	protected boolean isBooleanFeature(EStructuralFeature feature) {
		return feature.getEType().equals(EcorePackage.Literals.EBOOLEAN)
				|| feature.getEType().equals(
						EcorePackage.Literals.EBOOLEAN_OBJECT)
				|| (feature.getEType() instanceof EDataType && (feature
						.getEType().getInstanceClass() == Boolean.class || feature
						.getEType().getInstanceClass() == Boolean.TYPE));
	}

	protected ControlObservablePair createControlAndObservableValueForBoolean() {
		ControlObservablePair retValAndTargetPair = new ControlObservablePair();
		Button b = toolkit.createButton(parent, "", SWT.CHECK);
		retValAndTargetPair.setControl(b);
		retValAndTargetPair.setObservableValue(SWTObservables
				.observeSelection(b));
		return retValAndTargetPair;
	}

	protected boolean hasPredefinedProposals(EStructuralFeature feature) {
		return feature instanceof EReference
				|| feature.getEType() instanceof EEnumImpl;
	}

	protected ControlObservablePair createControlAndObservableValueForNonBooleanFeature(
			EStructuralFeature feature) {
		List<?> proposals = createProposals(feature);
		if (hasPredefinedProposals(feature)) {
			return createControlAndObservableWithPredefinedProposals(proposals);
		} else {
			return createControlAndObservableWithoutPredefinedProposals(proposals);
		}
	}

	protected List<?> createProposals(EStructuralFeature feature) {
		List<?> proposals  = polymorphicCreateProposals(owner, feature);
		if(proposals==null){
			proposals = proposalcreator.proposals(feature);
		}
		return proposals;
	}

	protected ControlObservablePair createControlAndObservableWithPredefinedProposals(
			List<?> proposals) {
		ComboViewer combo = new ComboViewer(parent, SWT.READ_ONLY);
		toolkit.adapt(combo.getCombo());
		combo.setContentProvider(new ArrayContentProvider());
		combo.setLabelProvider(jfaceProviderFactory.createLabelProvider());
		combo.setInput(proposals);
		ControlObservablePair retValAndTargetPair = new ControlObservablePair();
		retValAndTargetPair.setControl(combo.getCombo());
		retValAndTargetPair.setObservableValue(ViewersObservables
				.observeSingleSelection(combo));
		return retValAndTargetPair;
	}

	protected ControlObservablePair createControlAndObservableWithoutPredefinedProposals(
			List<?> proposals) {
		Text t = toolkit.createText(parent, "");
		t.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		addContentProposalAdapter(t, proposals);
		ControlObservablePair retValAndTargetPair = new ControlObservablePair();
		retValAndTargetPair.setControl(t);
		retValAndTargetPair.setObservableValue(SWTObservables.observeText(t,
				SWT.Modify));
		return retValAndTargetPair;
	}

	protected void addContentProposalAdapter(Text t, List<?> proposals) {
		if (proposals != null && !proposals.isEmpty()) {
			// TODO prevent adding null to a list, for example a Collection Type
			while (proposals.remove(null)) {
				// clear null entries
			}
			ControlDecoration field = new ControlDecoration(t, SWT.BORDER);
			FieldDecoration requiredFieldIndicator = FieldDecorationRegistry
					.getDefault().getFieldDecoration(
							FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
			field.setImage(requiredFieldIndicator.getImage());
			field.setDescriptionText(requiredFieldIndicator.getDescription());
			KeyStroke keyStroke = null;
			String string = "Ctrl+Space";
			try {
				keyStroke = KeyStroke.getInstance(string);
			} catch (ParseException e) {
				EmfComponentsActivator
						.getDefault()
						.getLog()
						.log(new Status(IStatus.ERROR,
								EmfComponentsActivator.PLUGIN_ID,
								"Error while parse: " + string, e));
			}
			new ContentProposalAdapter(t, new TextContentAdapter(),
					new SimpleContentProposalProvider(proposals
							.toArray(new String[] {})), keyStroke,
					null);
		}
	}

	private void setupControl(EStructuralFeature f, Control c) {
		// disable unchangeable and unserializable
		if (c != null) {
			c.setEnabled(f.isChangeable()
					&& (!(f.getEType() instanceof EDataType && !((EDataType) f
							.getEType()).isSerializable())));
			c.setData(FormControlFactory.ESTRUCTURALFEATURE_KEY, f);
			c.setData(FormControlFactory.EOBJECT_KEY, owner);
			c.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		}
	}

	public void dispose() {
		edbc.dispose();
		parent.dispose();
		// toolkit.dispose();
	}

	public FormToolkit getToolkit() {
		return toolkit;
	}

	public Composite getParent() {
		return parent;
	}

	private ControlObservablePair polymorphicGetObservableControl(EStructuralFeature element) {
		PolymorphicDispatcher<ControlObservablePair> dispatcher = new PolymorphicDispatcher<ControlObservablePair>(
				Collections.singletonList(this),
				getObservableControlPredicate(element), control_errorHandler) {
			@Override
			protected ControlObservablePair handleNoSuchMethod(Object... params) {
				if (PolymorphicDispatcher.NullErrorHandler.class
						.equals(control_errorHandler.getClass()))
					return null;
				return super.handleNoSuchMethod(params);
			}
		};

		return dispatcher.invoke(element);
	}

	/**
	 * Polymorphically invokes a create_EClass_feature(DataBindingContext, IObservableValue)
	 * @param element
	 * @param featureObservable
	 * @return
	 */
	private Control polymorphicCreateControl(EStructuralFeature element,
			IObservableValue featureObservable) {
		PolymorphicDispatcher<Control> dispatcher = createPolymorphicDispatcherForCreateControl(
				element, 2);

		return dispatcher.invoke(edbc, featureObservable);
	}

	/**
	 * Polymorphically invokes a create_EClass_feature(EObject)
	 * @param element
	 * @return
	 */
	private Control polymorphicCreateControl(EStructuralFeature element) {
		PolymorphicDispatcher<Control> dispatcher = createPolymorphicDispatcherForCreateControl(
				element, 1);

		return dispatcher.invoke(owner);
	}

	private PolymorphicDispatcher<Control> createPolymorphicDispatcherForCreateControl(
			EStructuralFeature element, int numOfParams) {
		return new PolymorphicDispatcher<Control>(
				Collections.singletonList(this),
				getCreateControlMethodPredicate(element, numOfParams),
				createControl_errorHandler) {
			@Override
			protected Control handleNoSuchMethod(Object... params) {
				if (PolymorphicDispatcher.NullErrorHandler.class
						.equals(createControl_errorHandler.getClass()))
					return null;
				return super.handleNoSuchMethod(params);
			}
		};
	}

	protected Predicate<Method> getObservableControlPredicate(
			EStructuralFeature feature) {
		String methodName = "control_"
				+ feature.getEContainingClass().getName() + "_"
				+ feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 1);
	}
	
	protected Predicate<Method> getCreateControlMethodPredicate(
			EStructuralFeature feature, int numOfParams) {
		String methodName = "control_"
				+ feature.getEContainingClass().getName() + "_"
				+ feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, numOfParams);
	}

	private IObservableValue polymorphicCreateObserveable(EditingDomain domain, EObject element,
			EStructuralFeature feature) {
		PolymorphicDispatcher<IObservableValue> dispatcher = new PolymorphicDispatcher<IObservableValue>(
				Collections.singletonList(this),
				getCreateObserveablePredicate(feature),
				new PolymorphicDispatcher.NullErrorHandler<IObservableValue>()) {
			@Override
			protected IObservableValue handleNoSuchMethod(Object... params) {
				if (PolymorphicDispatcher.NullErrorHandler.class
						.equals(observeable_errorHandler.getClass()))
					return null;
				return super.handleNoSuchMethod(params);
			}
		};

		return dispatcher.invoke(domain, element);
	}

	protected Predicate<Method> getCreateObserveablePredicate(
			EStructuralFeature feature) {
		String methodName = "observe_"
				+ feature.getEContainingClass().getName() + "_"
				+ feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 2);
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

		return dispatcher.invoke(domain, element);
	}

	protected Predicate<Method> getCreateProposalsPredicate(
			EStructuralFeature feature) {
		String methodName = "proposals_"
				+ feature.getEContainingClass().getName() + "_"
				+ feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 2);
	}
}