package it.rcpvision.emf.components.edit.action;

import it.rcpvision.emf.components.util.ActionBarsUtils;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;


/**
 * This is a contributor for an editor, multi-page or otherwise,
 * that implements {@link IEditingDomainProvider}.
 * It automatically hooks up the Undo, Redo, Cut, Copy, Paste, and Delete actions on the Edit menu
 * to the corresponding commands supported by the {@link org.eclipse.emf.edit.domain.EditingDomain}.
 * The editor site'selection provider is used to keep the Cut, Copy, Paste, and Delete actions up-to-date.
 * The actions are also refreshed every time the editor fires to its {@link IPropertyListener}s.
 * <p>
 * Another very useful feature of this contributor is that it can be used as follows:
 * <pre>
 *   ((IMenuListener)((IEditorSite)getSite()).getActionBarContributor()).menuAboutToShow(menuManager);
 * </pre>
 * to contribute the Edit menu actions to a pop-up menu.
 */
public class EditingActionBarContributor 
  extends 
    MultiPageEditorActionBarContributor 
  implements 
    IMenuListener,
    IPropertyListener
{
  /**
   * This keeps track of the current part.
   */
  protected IWorkbenchPart activePart;

  /**
   * This is the action used to implement delete.
   */
  protected DeleteAction deleteAction;

  /**
   * This is the action used to implement cut.
   */
  protected CutAction cutAction;

  /**
   * This is the action used to implement copy.
   */
  protected CopyAction copyAction;

  /**
   * This is the action used to implement paste.
   */
  protected PasteAction pasteAction;

  /**
   * This is the action used to implement undo.
   */
  protected UndoAction undoAction;

  /**
   * This is the action used to implement redo.
   */
  protected RedoAction redoAction;

  /**
   * This is the action used to load a resource.
   */
  protected LoadResourceAction loadResourceAction;

  /**
   * This is the action used to control or uncontrol a contained object.
   */
  protected ControlAction controlAction;

  /**
   * This is the action used to perform validation.
   */
  protected ValidateAction validateAction;

  /**
   * This style bit indicates that the "additions" separator should come after the "edit" separator.
   */
  public static final int ADDITIONS_LAST_STYLE = 0x1;
  
  /**
   * This is used to encode the style bits.
   */
  protected int style;

  /**
   * This creates an instance of the contributor.
   */
  public EditingActionBarContributor()
  {
    super();
  }

  /**
   * This creates an instance of the contributor.
   */
  public EditingActionBarContributor(int style)
  {
    super();
    this.style = style;
  }

  @Override
  public void init(IActionBars actionBars)
  {
    super.init(actionBars);
    initializeActions(actionBars);
  }

  protected void initializeActions(IActionBars actionBars) {
	ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

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

  /**
   * Returns the action used to implement delete.
   * @see #deleteAction
   * @since 2.6
   */
  protected DeleteAction createDeleteAction()
  {
    return new DeleteAction(removeAllReferencesOnDelete());
  }

  /**
   * Returns the action used to implement cut.
   * @see #cutAction
   * @since 2.6
   */
  protected CutAction createCutAction()
  {
    return new CutAction();
  }

  /**
   * Returns the action used to implement copy.
   * @see #copyAction
   * @since 2.6
   */
  protected CopyAction createCopyAction()
  {
    return new CopyAction();
  }

  /**
   * Returns the action used to implement paste.
   * @see #pasteAction
   * @since 2.6
   */
  protected PasteAction createPasteAction()
  {
    return new PasteAction();
  }

  /**
   * Returns the action used to implement undo.
   * @see #undoAction
   * @since 2.6
   */
  protected UndoAction createUndoAction()
  {
    return new UndoAction();
  }

  /**
   * Returns the action used to implement redo.
   * @see #redoAction
   * @since 2.6
   */
  protected RedoAction createRedoAction()
  {
    return new RedoAction();
  }


  /**
   * This determines whether or not the delete action should clean up all references to the deleted objects.
   * It is false by default, to provide the same beahviour, by default, as in EMF 2.1 and before.
   * You should probably override this method to return true, in order to get the new, more useful beahviour.
   * @since 2.2
   */
  protected boolean removeAllReferencesOnDelete()
  {
    return true;
  }

  @Override
  public void contributeToMenu(IMenuManager menuManager) 
  {
    super.contributeToMenu(menuManager);
  }

  @Override
  public void contributeToStatusLine(IStatusLineManager statusLineManager) 
  {
    super.contributeToStatusLine(statusLineManager);
  }

  @Override
  public void contributeToToolBar(IToolBarManager toolBarManager)
  {
    super.contributeToToolBar(toolBarManager);
  }

  public void shareGlobalActions(IPage page, IActionBars actionBars)
  {
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

  /**
   * @deprecated
   */
  @Deprecated
  public void setActiveView(IViewPart part)
  {
    IActionBars actionBars = part.getViewSite().getActionBars();
    if (!(part instanceof PropertySheet))
    {
      actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);
      actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);
      actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);
      actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);
    }
    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);

    actionBars.updateActionBars();
  }

  public IEditorPart getActiveEditor()
  {
	  if (activePart instanceof IEditorPart) {
		return (IEditorPart) activePart;
	}
    return null;
  }

  @Override
  public void setActiveEditor(IEditorPart part) 
  {
    super.setActiveEditor(part);

    setActivePart(part);
  }

  protected void setActivePart(IWorkbenchPart part) {
	if (part != activePart)
    {
      if (activePart != null)
      {
        deactivate();
      }

      if (part instanceof IEditingDomainProvider)
      {
        activePart = part;
        activate();

      }
    }
}

  @Override
  public void setActivePage(IEditorPart part) 
  {
    // Do nothing
  }

  public void deactivate()
  {
    activePart.removePropertyListener(this);

    deleteAction.setActiveWorkbenchPart(null);
    cutAction.setActiveWorkbenchPart(null);
    copyAction.setActiveWorkbenchPart(null);
    pasteAction.setActiveWorkbenchPart(null);
    undoAction.setActiveWorkbenchPart(null);
    redoAction.setActiveWorkbenchPart(null);

    if (loadResourceAction != null)
    {
      loadResourceAction.setActiveWorkbenchPart(null);
    }

    if (controlAction != null)
    {
      controlAction.setActiveWorkbenchPart(null);
    }

    if (validateAction != null)
    {
      validateAction.setActiveWorkbenchPart(null);
    }

    ISelectionProvider selectionProvider = 
      activePart instanceof ISelectionProvider ?
        (ISelectionProvider)activePart :
        activePart.getSite().getSelectionProvider();

    if (selectionProvider != null)
    {
      selectionProvider.removeSelectionChangedListener(deleteAction);
      selectionProvider.removeSelectionChangedListener(cutAction);
      selectionProvider.removeSelectionChangedListener(copyAction);
      selectionProvider.removeSelectionChangedListener(pasteAction);

      if (validateAction != null)
      {
        selectionProvider.removeSelectionChangedListener(validateAction);
      }

      if (controlAction != null)
      {
        selectionProvider.removeSelectionChangedListener(controlAction);
      }
    }
  }

  public void activate()
  {
    activePart.addPropertyListener(this);
    
    ensureActionsAreInitialized();

    deleteAction.setActiveWorkbenchPart(activePart);
    cutAction.setActiveWorkbenchPart(activePart);
    copyAction.setActiveWorkbenchPart(activePart);
    pasteAction.setActiveWorkbenchPart(activePart);
    undoAction.setActiveWorkbenchPart(activePart);
    redoAction.setActiveWorkbenchPart(activePart);

    if (loadResourceAction != null)
    {
      loadResourceAction.setActiveWorkbenchPart(activePart);
    }

    if (controlAction != null)
    {
      controlAction.setActiveWorkbenchPart(activePart);
    }

    if (validateAction != null)
    {
      validateAction.setActiveWorkbenchPart(activePart);
    }

    ISelectionProvider selectionProvider = 
      activePart instanceof ISelectionProvider ?
        (ISelectionProvider)activePart :
        activePart.getSite().getSelectionProvider();

    if (selectionProvider != null)
    {
      selectionProvider.addSelectionChangedListener(deleteAction);
      selectionProvider.addSelectionChangedListener(cutAction);
      selectionProvider.addSelectionChangedListener(copyAction);
      selectionProvider.addSelectionChangedListener(pasteAction);

      if (validateAction != null)
      {
        selectionProvider.addSelectionChangedListener(validateAction);
      }

      if (controlAction != null)
      {
        selectionProvider.addSelectionChangedListener(controlAction);
      }      
    }

    update();
  }

  public void update()
  {
    ISelectionProvider selectionProvider = 
      activePart instanceof ISelectionProvider ?
        (ISelectionProvider)activePart :
        activePart.getSite().getSelectionProvider();

    if (selectionProvider != null)
    {
      ISelection selection = selectionProvider.getSelection();
      IStructuredSelection structuredSelection =
        selection instanceof IStructuredSelection ?  (IStructuredSelection)selection : StructuredSelection.EMPTY;

      deleteAction.updateSelection(structuredSelection);
      cutAction.updateSelection(structuredSelection);
      copyAction.updateSelection(structuredSelection);
      pasteAction.updateSelection(structuredSelection);

      if (validateAction != null)
      {
        validateAction.updateSelection(structuredSelection);
      }

      if (controlAction != null)
      {
        controlAction.updateSelection(structuredSelection);
      }
    }

    undoAction.update();
    redoAction.update();

    if (loadResourceAction != null)
    {
      loadResourceAction.update();
    }
  }

  /**
   * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
   */
  public void menuAboutToShow(IMenuManager menuManager)
  {
    // Add our standard marker.
    //
    if ((style & ADDITIONS_LAST_STYLE) == 0)
    {
      menuManager.add(new Separator("additions"));
    }
    menuManager.add(new Separator("edit"));
    
    // make sure actions are initialized
    // this can take at different times: during init for an editor part
    // or now for a view part
    ensureActionsAreInitialized();

    // Add the edit menu actions.
    //
    menuManager.add(new ActionContributionItem(undoAction));
    menuManager.add(new ActionContributionItem(redoAction));
    menuManager.add(new Separator());
    menuManager.add(new ActionContributionItem(cutAction));
    menuManager.add(new ActionContributionItem(copyAction));
    menuManager.add(new ActionContributionItem(pasteAction));
    menuManager.add(new Separator());
    menuManager.add(new ActionContributionItem(deleteAction));
    menuManager.add(new Separator());

    if ((style & ADDITIONS_LAST_STYLE) != 0)
    {
      menuManager.add(new Separator("additions"));
      menuManager.add(new Separator());
    }
    // Add our other standard marker.
    //
    menuManager.add(new Separator("additions-end"));

    addGlobalActions(menuManager);
  }

  protected void ensureActionsAreInitialized() {
	if (undoAction != null)
		return;
	initializeActions(ActionBarsUtils.getActionBars(activePart));
  }

/**
   * This inserts global actions before the "additions-end" separator.
   */
  protected void addGlobalActions(IMenuManager menuManager)
  {
    String key = (style & ADDITIONS_LAST_STYLE) == 0 ? "additions-end" : "additions";
    if (validateAction != null)
    {
      menuManager.insertBefore(key, new ActionContributionItem(validateAction));
    }

    if (controlAction != null)
    {
      menuManager.insertBefore(key, new ActionContributionItem(controlAction));
    }

    if (validateAction != null || controlAction != null)
    {
      menuManager.insertBefore(key, new Separator());
    }

    if (loadResourceAction != null)
    {
      menuManager.insertBefore("additions-end", new ActionContributionItem(loadResourceAction));
      menuManager.insertBefore("additions-end", new Separator());
    }
  }

  public void propertyChanged(Object source, int id)
  {
    update();
  }
}
