package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.editors.EmfActionBarContributor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;

public class CDOExamplesTreeActionBarContributor extends
		EmfActionBarContributor {

	@Override
	protected DeleteAction createDeleteAction() {
		return new ConfirmDeleteAction();
	}
	
	class ConfirmDeleteAction extends DeleteAction{

		public ConfirmDeleteAction() {
			super(true);
		}
		
		@Override
		public void run() {
			if(MessageDialog.openConfirm(null, "Delete", "Do you want to delete this?")){
				super.run();
			}
		}
		
	}
	
	@Override
	protected Collection<IAction> generateCreateSiblingActions(
			Collection<?> descriptors, ISelection selection) {
		return new ArrayList<IAction>();
	}

}
