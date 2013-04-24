package it.rcpvision.emf.components.edit.action;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

public class EditingActionManager {


	  /**
	   * This is the action used to implement delete.
	   */
	  private CommandActionHandler deleteAction;

	  /**
	   * This is the action used to implement cut.
	   */
	  private CommandActionHandler cutAction;

	  /**
	   * This is the action used to implement copy.
	   */
	  private CommandActionHandler copyAction;

	  /**
	   * This is the action used to implement paste.
	   */
	  private CommandActionHandler pasteAction;

	  /**
	   * This is the action used to implement undo.
	   */
	  private UndoAction undoAction;

	  public UndoAction getUndoAction() {
		return undoAction;
	}

	/**
	   * This is the action used to implement redo.
	   */
	  private RedoAction redoAction;


	public void initializeActions(IActionBars actionBars) {
		ISharedImages sharedImages = getSharedImages();
		
		deleteAction = createDeleteAction(); 
	    deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
	    actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);

	    cutAction = createCutAction();
	    cutAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
	    actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);

	    copyAction = createCopyAction();
	    copyAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
	    actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);

	    pasteAction = createPasteAction();
	    pasteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
	    actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);

	    undoAction = createUndoAction();
	    undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
	    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);

	    redoAction = createRedoAction();
	    redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
	    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
	}

	protected ISharedImages getSharedImages() {
		return PlatformUI.getWorkbench().getSharedImages();
	}

	public void shareGlobalActions(IPage page, IActionBars actionBars) {
		if (!(page instanceof IPropertySheetPage))
	    {
	      actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);
	      actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);
	      actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);
	      actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);
	    }
	    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
	    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
	}

//	public void shareGlobalActions(IViewPart part, IActionBars actionBars) {
//		if (!(part instanceof PropertySheet))
//	    {
//	      actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);
//	      actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);
//	      actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);
//	      actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);
//	    }
//	    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
//	    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
//	}

	public void removeSelectionChangeListener(
			ISelectionProvider selectionProvider) {

	      selectionProvider.removeSelectionChangedListener(deleteAction);
	      selectionProvider.removeSelectionChangedListener(cutAction);
	      selectionProvider.removeSelectionChangedListener(copyAction);
	      selectionProvider.removeSelectionChangedListener(pasteAction);
	      
	     

	}

	public void setEditingDomain(EditingDomain editingDomain) {
		deleteAction.setEditingDomain(editingDomain);
	      cutAction.setEditingDomain(editingDomain);
	      copyAction.setEditingDomain(editingDomain);
	      pasteAction.setEditingDomain(editingDomain);
	      undoAction.setEditingDomain(editingDomain);
	      redoAction.setEditingDomain(editingDomain);
	      
	}

	public void addSelectionListener(ISelectionProvider selectionProvider) {
	      selectionProvider.addSelectionChangedListener(deleteAction);
	      selectionProvider.addSelectionChangedListener(cutAction);
	      selectionProvider.addSelectionChangedListener(copyAction);
	      selectionProvider.addSelectionChangedListener(pasteAction);
	          

	}

	public void updateSelection(IStructuredSelection structuredSelection) {
	      deleteAction.updateSelection(structuredSelection);
	      cutAction.updateSelection(structuredSelection);
	      copyAction.updateSelection(structuredSelection);
	      pasteAction.updateSelection(structuredSelection);
	      
	      
	}

	public void updateUndoRedo() {
		undoAction.update();
	     redoAction.update();
	}

	public void menuAboutToShow(IMenuManager menuManager) {
		menuManager.add(new ActionContributionItem(undoAction));
	    menuManager.add(new ActionContributionItem(redoAction));
	    menuManager.add(new Separator());
	    menuManager.add(new ActionContributionItem(cutAction));
	    menuManager.add(new ActionContributionItem(copyAction));
	    menuManager.add(new ActionContributionItem(pasteAction));
	    menuManager.add(new Separator());
	    menuManager.add(new ActionContributionItem(deleteAction));
	    menuManager.add(new Separator());
	}

	public DeleteAction createDeleteAction() {
		return new DeleteAction(true);
	}

	public CutAction createCutAction() {
		return new CutAction();
	}

	public CopyAction createCopyAction() {
		return new CopyAction();
	}

	public PasteAction createPasteAction() {
		return new PasteAction();
	}

	public UndoAction createUndoAction() {
		return new UndoAction();
	}

	public RedoAction createRedoAction() {
		return new RedoAction();
	}

	public LoadResourceAction createLoadResourceAction() {
		return new LoadResourceAction();
	}

	public ControlAction createControlAction() {
		return new ControlAction();
	}

	public EditingDomainValidateAction createValidateAction() {
		return new EditingDomainValidateAction();
	}
}
