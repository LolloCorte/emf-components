package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.edit.action.TreeActionBarContributor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class CDOExamplesTreeActionBarContributor extends
		TreeActionBarContributor {

	
	private DeleteAction customAction;


	@Override
	protected DeleteAction createDeleteAction() {
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		deleteAction = new ConfirmDeleteAction(editingDomain, true);
		deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		return deleteAction;
	}
	
	class ConfirmDeleteAction extends DeleteAction{

		public ConfirmDeleteAction(EditingDomain editingDomain, boolean b) {
			super(editingDomain, b);
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

	
	@Override
	public void initialize(IWorkbenchPart workbenchPart,
			EditingDomain editingDomain) {
		super.initialize(workbenchPart, editingDomain);
		customAction=createDeleteAction();
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		menuManager.add(customAction);
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);
		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection
				&& ((IStructuredSelection) selection).size() == 1) {
			customAction.updateSelection((IStructuredSelection) selection);
		}
	}
}
