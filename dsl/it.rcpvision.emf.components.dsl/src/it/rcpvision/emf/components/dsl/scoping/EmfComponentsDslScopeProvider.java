/**
 * 
 */
package it.rcpvision.emf.components.dsl.scoping;

import java.util.Collections;

import it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

/**
 * @author Lorenzo Bettini
 * 
 */
@SuppressWarnings("restriction")
public class EmfComponentsDslScopeProvider extends XbaseScopeProvider {

	public IScope __getScope(EObject context, EReference reference) {
		if (context instanceof FeatureLabelSpecification
				&& TypesPackage.Literals.JVM_IDENTIFIABLE_ELEMENT
						.isSuperTypeOf(reference.getEReferenceType())) {
			IScope parent = super.getScope(context, reference);

			FeatureLabelSpecification featureLabelSpecification = (FeatureLabelSpecification) context;
			JvmTypeReference parameterType = featureLabelSpecification
					.getParameterType();
			JvmFeatureScopeAcceptor featureScopeDescriptions = new JvmFeatureScopeAcceptor();
			JvmDeclaredType type = (JvmDeclaredType) parameterType.getType();
			addFeatureScopes(parameterType, context, type, null, null,
					getDefaultPriority(), featureScopeDescriptions);
			IScope result = featureScopeDescriptions.createScope(parent);
			// IScope featureScopeForTypeRef = createFeatureScopeForTypeRef(
			// parameterType, parameterType, null, IScope.NULLSCOPE);
			// IScope result = createFeatureScopeForTypeRef(parameterType,
			// featureLabelSpecification, null, IScope.NULLSCOPE);
			return result;
			// System.out.println(reference);
		}

		return super.getScope(context, reference);
	}

	@Override
	protected JvmDeclaredType getContextType(EObject obj) {
		if (obj instanceof FeatureLabelSpecification) {
			FeatureLabelSpecification featureLabelSpecification = (FeatureLabelSpecification) obj;
			return (JvmDeclaredType) featureLabelSpecification
					.getParameterType().getType();
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
								featureLabelSpecification.getParameterType()
										.getType())));
			}
		}

		return parentScope;
	}
}
