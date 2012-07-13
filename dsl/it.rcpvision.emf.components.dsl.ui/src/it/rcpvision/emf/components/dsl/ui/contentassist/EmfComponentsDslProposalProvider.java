/*
 * generated by Xtext
 */
package it.rcpvision.emf.components.dsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification;
import it.rcpvision.emf.components.dsl.model.LabelSpecification;
import it.rcpvision.emf.components.dsl.ui.contentassist.AbstractEmfComponentsDslProposalProvider;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class EmfComponentsDslProposalProvider extends
		AbstractEmfComponentsDslProposalProvider {

	@SuppressWarnings("restriction")
	@Override
	public void completeXFeatureCall_Feature(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof FeatureLabelSpecification) {
			createLocalVariableAndImplicitProposals(model, context, acceptor);
			return;
		}
		
		if (model instanceof LabelSpecification) {
			createLocalVariableAndImplicitProposals(context.getPreviousModel(), context, acceptor);
			return;
		}

		super.completeXFeatureCall_Feature(model, assignment, context, acceptor);
	}
}
