/**
 * 
 */
package it.rcpvision.emf.components.dsl.scoping;

import it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification;
import it.rcpvision.emf.components.dsl.model.FeatureSpecification;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * @author Lorenzo Bettini
 * 
 */
@SuppressWarnings("restriction")
public class EmfComponentsDslScopeProvider extends XbaseScopeProvider {

	// public IScope __getScope(EObject context, EReference reference) {
	// if (context instanceof FeatureLabelSpecification
	// && TypesPackage.Literals.JVM_IDENTIFIABLE_ELEMENT
	// .isSuperTypeOf(reference.getEReferenceType())) {
	// IScope parent = super.getScope(context, reference);
	//
	// FeatureLabelSpecification featureLabelSpecification =
	// (FeatureLabelSpecification) context;
	// // JvmTypeReference parameterType = featureLabelSpecification
	// // .getParameterType();
	// JvmFeatureScopeAcceptor featureScopeDescriptions = new
	// JvmFeatureScopeAcceptor();
	// JvmDeclaredType type = (JvmDeclaredType) parameterType.getType();
	// addFeatureScopes(parameterType, context, type, null, null,
	// getDefaultPriority(), featureScopeDescriptions);
	// IScope result = featureScopeDescriptions.createScope(parent);
	// // IScope featureScopeForTypeRef = createFeatureScopeForTypeRef(
	// // parameterType, parameterType, null, IScope.NULLSCOPE);
	// // IScope result = createFeatureScopeForTypeRef(parameterType,
	// // featureLabelSpecification, null, IScope.NULLSCOPE);
	// return result;
	// // System.out.println(reference);
	// }
	//
	// return super.getScope(context, reference);
	// }

	@Override
	protected JvmDeclaredType getContextType(EObject obj) {
		if (obj instanceof FeatureLabelSpecification) {
			FeatureLabelSpecification featureLabelSpecification = (FeatureLabelSpecification) obj;
			JvmType parameterType = featureLabelSpecification
					.getParameterType();
			if (parameterType instanceof JvmDeclaredType) {
				return (JvmDeclaredType) parameterType;
			}
		}
		if (obj instanceof FeatureSpecification) {
			FeatureSpecification featureSpecification = (FeatureSpecification) obj;
			JvmType parameterType = featureSpecification.getParameterType();
			if (parameterType instanceof JvmDeclaredType) {
				return (JvmDeclaredType) parameterType;
			}
		}

		return super.getContextType(obj);
	}

	@Override
	protected IScope createLocalVarScope(IScope parentScope,
			LocalVariableScopeContext scopeContext) {
		parentScope = super.createLocalVarScope(parentScope, scopeContext);

		if (scopeContext != null && scopeContext.getContext() != null) {
			EObject context = scopeContext.getContext();
			if (context instanceof FeatureLabelSpecification) {
				FeatureLabelSpecification featureLabelSpecification = (FeatureLabelSpecification) context;
				return new SimpleScope(parentScope,
						Collections.singleton(EObjectDescription.create(THIS,
								featureLabelSpecification.getParameterType())));
			}
			if (context instanceof FeatureSpecification) {
				FeatureSpecification featureSpecification = (FeatureSpecification) context;
				return new SimpleScope(parentScope,
						Collections.singleton(EObjectDescription.create(THIS,
								featureSpecification.getParameterType())));
			}
		}

		return parentScope;
	}

	@Override
	protected IScope createImplicitFeatureCallScope(EObject call,
			Resource resource, IScope parent, IScope localVariableScope) {
		IScope superScope = super.createImplicitFeatureCallScope(call,
				resource, parent, localVariableScope);

		return filterScope(call, superScope);
	}

	protected IScope filterScope(EObject call, IScope superScope) {
		boolean shouldFilter = false;
		EObject container = call.eContainer();
		if (container instanceof FeatureLabelSpecification) {
			FeatureLabelSpecification featureLabelSpecification = (FeatureLabelSpecification) container;
			if (featureLabelSpecification.getFeature() == call)
				shouldFilter = true;
		}
		if (container instanceof FeatureSpecification) {
			FeatureSpecification featureSpecification = (FeatureSpecification) container;
			if (featureSpecification.getFeatures().contains(call))
				shouldFilter = true;

		}

		if (!shouldFilter)
			return superScope;

		Iterable<IEObjectDescription> exportedObjects = superScope
				.getAllElements();

		// we filter the feature scope so that it contains only
		// the name of the features, no get/set/is method names
		// no static methods, etc.
		Iterable<IEObjectDescription> filtered = Iterables.filter(
				exportedObjects, new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						EObject element = input.getEObjectOrProxy();
						if (element instanceof JvmOperation) {
							JvmOperation operation = (JvmOperation) element;
							if (operation.isStatic())
								return false;
							if (isPropertyNameForGetterSetterMethod(input
									.toString()))
								return false;
							if (input.toString().contains("("))
								return false;
							return true;
						}
						return false;
					}
				});

		return new SimpleScope(filtered);
	}

	protected boolean isPropertyNameForGetterSetterMethod(String opName) {
		if ((opName.startsWith("get") || opName.startsWith("set"))
				&& opName.length() > 3
				&& Character.isUpperCase(opName.charAt(3)))
			return true;

		if (opName.startsWith("is") && opName.length() > 2
				&& Character.isUpperCase(opName.charAt(2)))
			return true;
		return false;
	}
}
