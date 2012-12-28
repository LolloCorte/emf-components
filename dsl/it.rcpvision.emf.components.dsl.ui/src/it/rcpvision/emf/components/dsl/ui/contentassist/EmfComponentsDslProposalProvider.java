/*
 * generated by Xtext
 */
package it.rcpvision.emf.components.dsl.ui.contentassist;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.dsl.model.EmfFeatureAccess;
import it.rcpvision.emf.components.dsl.model.LabelSpecification;
import it.rcpvision.emf.components.dsl.model.ModelPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IViewPart;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;

import com.google.inject.Inject;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class EmfComponentsDslProposalProvider extends
		AbstractEmfComponentsDslProposalProvider {

	@Inject
	private ITypesProposalProvider typeProposalProvider;

	@Inject
	private JvmTypesBuilder typesBuilder;

	@Override
	public void completeViewSpecification_Type(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		showOnlySubtypesOf(model, context, acceptor, IViewPart.class,
				ModelPackage.Literals.VIEW_SPECIFICATION__TYPE);
	}

	@Override
	public void completePropertyDescriptionSpecification_ParameterType(
			EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		showSubtypesOfEObjectForEmfFeatureAccess(model, context, acceptor);
	}

	@Override
	public void completeFeatureSpecification_ParameterType(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		showSubtypesOfEObjectForEmfFeatureAccess(model, context, acceptor);
	}

	@Override
	public void completeFormControlSpecification_ParameterType(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		showSubtypesOfEObjectForEmfFeatureAccess(model, context, acceptor);
	}

	@Override
	public void completeExtendsClause_SuperType(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		showOnlySubtypesOf(model, context, acceptor,
				EmfComponentsGuiceModule.class,
				ModelPackage.Literals.EXTENDS_CLAUSE__SUPER_TYPE);
	}

	protected void showSubtypesOfEObjectForEmfFeatureAccess(EObject model,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		showOnlySubtypesOf(model, context, acceptor, EObject.class,
				ModelPackage.Literals.EMF_FEATURE_ACCESS__PARAMETER_TYPE);
	}

	protected void showOnlySubtypesOf(EObject model,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor,
			Class<?> superType, EReference reference) {
		typeProposalProvider.createSubTypeProposals(
				typesBuilder.newTypeRef(model, superType).getType(), this,
				context, reference, acceptor);
	}

	@Override
	public void completeXFeatureCall_Feature(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof EmfFeatureAccess) {
			createLocalVariableAndImplicitProposals(model, context, acceptor);
			return;
		}

		if (model instanceof LabelSpecification) {
			createLocalVariableAndImplicitProposals(context.getPreviousModel(),
					context, acceptor);
			return;
		}

		super.completeXFeatureCall_Feature(model, assignment, context, acceptor);
	}
}
