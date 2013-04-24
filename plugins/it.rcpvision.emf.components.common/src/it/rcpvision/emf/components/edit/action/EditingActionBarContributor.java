package it.rcpvision.emf.components.edit.action;

import it.rcpvision.emf.components.util.ActionBarsUtils;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
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
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;

import com.google.inject.Inject;


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
   * This is the action used to perform validation.
   */
  protected EditingDomainValidateAction validateAction;
  
  /**
   * This is the action used to control or uncontrol a contained object.
   */
  protected ControlAction controlAction;

  /**
   * This style bit indicates that the "additions" separator should come after the "edit" separator.
   */
  public static final int ADDITIONS_LAST_STYLE = 0x1;
  
  /**
   * This is used to encode the style bits.
   */
  protected int style;
  
  @Inject
  protected EditingActionManager editingActionManager;
  
	/**
	 * If the active part does not implement {@link ISelectionProvider} we
	 * can still set an explicit one. 
	 */
	protected ISelectionProvider explicitSelectionProvider = null;

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
  
	public void setExplicitSelectionProvider(
			ISelectionProvider explicitSelectionProvider) {
		this.explicitSelectionProvider = explicitSelectionProvider;
	}

  @Override
  public void init(IActionBars actionBars)
  {
    super.init(actionBars);
    initializeActions(actionBars);
  }

  protected void initializeActions(IActionBars actionBars) {
    editingActionManager.initializeActions(actionBars);
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
    editingActionManager.shareGlobalActions(page,actionBars);
  }

//  /**
//   * @deprecated
//   */
//  @Deprecated
//  public void setActiveView(IViewPart part)
//  {
//    IActionBars actionBars = part.getViewSite().getActionBars();
//    actionManager.shareGlobalActions(part,actionBars);
//    actionBars.updateActionBars();
//  }

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

//    deleteAction.setActiveWorkbenchPart(null);
//    cutAction.setActiveWorkbenchPart(null);
//    copyAction.setActiveWorkbenchPart(null);
//    pasteAction.setActiveWorkbenchPart(null);
//    undoAction.setActiveWorkbenchPart(null);
//    redoAction.setActiveWorkbenchPart(null);

//    if (controlAction != null)
//    {
//      controlAction.setActiveWorkbenchPart(null);
//    }
//
//    if (validateAction != null)
//    {
//      validateAction.setActiveWorkbenchPart(null);
//    }

    ISelectionProvider selectionProvider = 
      retrieveSelectionProvider();

    if (selectionProvider != null)
    {

    	editingActionManager.removeSelectionChangeListener(selectionProvider);
    	
	 if (controlAction != null)
      {
    	  selectionProvider.removeSelectionChangedListener(controlAction);
      }
    	 
      if (validateAction != null)
      {
        selectionProvider.removeSelectionChangedListener(validateAction);
      }
    }
  }

  public void activate()
  {
    activePart.addPropertyListener(this);
    
    ensureActionsAreInitialized();
    
    if (activePart instanceof IEditingDomainProvider)
    {
      EditingDomain editingDomain = ((IEditingDomainProvider)activePart).getEditingDomain();
      editingActionManager.setEditingDomain(editingDomain);
      
      if (controlAction != null){
    	  controlAction.setEditingDomain(editingDomain);
      }
      if (validateAction != null){
    	  validateAction.setEditingDomain(editingDomain);
      }
    }

   


    ISelectionProvider selectionProvider = 
      retrieveSelectionProvider();

    if (selectionProvider != null)
    {

    	editingActionManager.addSelectionListener(selectionProvider);
    	
	 if (controlAction != null)
      {
    	  selectionProvider.addSelectionChangedListener(controlAction);
      } 
    	 
      if (validateAction != null)
      {
        selectionProvider.addSelectionChangedListener(validateAction);
      }

    }

    update();
  }

	protected ISelectionProvider retrieveSelectionProvider() {
		if (explicitSelectionProvider != null)
			return explicitSelectionProvider;
		
		return activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();
	}

  public void update()
  {
    ISelectionProvider selectionProvider = 
      retrieveSelectionProvider();

    if (selectionProvider != null)
    {
      ISelection selection = selectionProvider.getSelection();
      IStructuredSelection structuredSelection =
        selection instanceof IStructuredSelection ?  (IStructuredSelection)selection : StructuredSelection.EMPTY;

        editingActionManager.updateSelection(structuredSelection);
        if (controlAction != null)
	      {
	    	  controlAction.updateSelection(structuredSelection);
	      }
        
      if (validateAction != null)
      {
        validateAction.updateSelection(structuredSelection);
      }

    }

    editingActionManager.updateUndoRedo();
    
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
    editingActionManager.menuAboutToShow(menuManager);

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
	if (editingActionManager.getUndoAction() != null)
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

  }

  public void propertyChanged(Object source, int id)
  {
    update();
  }
  
  
}
