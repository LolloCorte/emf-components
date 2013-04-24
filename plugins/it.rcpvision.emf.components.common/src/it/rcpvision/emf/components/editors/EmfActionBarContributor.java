package it.rcpvision.emf.components.editors;

import it.rcpvision.emf.components.EmfComponentsActivator;
import it.rcpvision.emf.components.edit.action.EditingActionBarContributor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.ui.action.ViewerFilterAction;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import com.google.inject.Inject;


/**
 * This is the action bar contributor for the Emf actions.
 * 
 * It comes from the original EcoreActionBarContributor with some modifications
 * so that we can use a {@link IWorkbenchPart} instead of an {@link IEditorPart}.
 */
public class EmfActionBarContributor
  extends EditingActionBarContributor
  implements ISelectionChangedListener
{
  /**
   * This keeps track of the active part.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IWorkbenchPart activePart;

  /**
   * This keeps track of the current selection provider.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ISelectionProvider selectionProvider;
  
  
  @Inject
  protected EmfActionManager emfActionManager;

  /**
   * This action opens the Properties view.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IAction showPropertiesViewAction =
    new Action("Show &Properties View")
    {
      @Override
      public void run()
      {
        try
        {
          getPage().showView("org.eclipse.ui.views.PropertySheet");
        }
        catch (PartInitException exception)
        {
          EmfComponentsActivator.log(exception);
        }
      }
    };

  /**
   * This action refreshes the viewer of the current editor if the editor
   * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IAction refreshViewerAction =
    new Action("&Refresh")
    {
      @Override
      public boolean isEnabled()
      {
        return activePart instanceof IViewerProvider;
      }

      @Override
      public void run()
      {
        if (activePart instanceof IViewerProvider)
        {
          Viewer viewer = ((IViewerProvider)activePart).getViewer();
          if (viewer != null)
          {
            viewer.refresh();
          }
        }
      }
    };


  

  protected SelectionChangedEvent lastSelectionChangedEvent;
  
  protected ViewerFilterAction showGenericsAction = 
    new ViewerFilterAction("Show &Generics", IAction.AS_CHECK_BOX)
    {
      @Override
      protected void refreshViewers()
      {
        super.refreshViewers();
        if (lastSelectionChangedEvent != null && activePart instanceof IEditingDomainProvider)
        {
          selectionChanged(lastSelectionChangedEvent); 
        }
      }
      
      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
        return isChecked() ||
         !(element instanceof ETypeParameter || 
           element instanceof EGenericType);
      }    
    };
  
  /**
   * This creates an instance of the contributor.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EmfActionBarContributor()
  {
    super(ADDITIONS_LAST_STYLE);
    
    showGenericsAction.setChecked
      (Boolean.parseBoolean(EmfComponentsActivator.getDefault().getDialogSettings().get("showGenericsAction")));    
  }

	@Override
	protected void initializeActions(IActionBars actionBars) {
		super.initializeActions(actionBars);

		validateAction = editingActionManager.createValidateAction();
		controlAction = editingActionManager.createControlAction();
	}
  
  public void showGenerics(boolean isChecked)
  {
    if (showGenericsAction != null)
    {
      showGenericsAction.setChecked(isChecked);
    }
  }

  @Override
  public void dispose()
  {
    EmfComponentsActivator.getDefault().getDialogSettings().put(
      "showGenericsAction", Boolean.toString(showGenericsAction.isChecked()));
    
    super.dispose();
  }

  /**
   * This adds Separators for editor additions to the tool bar.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void contributeToToolBar(IToolBarManager toolBarManager)
  {
    toolBarManager.add(new Separator("ecore-settings"));
    toolBarManager.add(new Separator("ecore-additions"));
  }

  /**
   * This adds to the menu bar a menu and some separators for editor additions,
   * as well as the sub-menus for object creation items.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public void contributeToMenu(IMenuManager menuManager)
  {
    super.contributeToMenu(menuManager);

    IMenuManager submenuManager = createSubmenuManager();

    menuManager.insertAfter("additions", submenuManager);
    submenuManager.add(new Separator("settings"));
    submenuManager.add(new Separator("actions"));
    submenuManager.add(new Separator("additions"));
    submenuManager.add(new Separator("additions-end"));

    emfActionManager.contributeToMenu(submenuManager);
    
    // Force an update because Eclipse hides empty menus now.
    //
    submenuManager.addMenuListener
      (new IMenuListener()
       {
         public void menuAboutToShow(IMenuManager menuManager)
         {
           menuManager.updateAll(true);
         }
       });

    addGlobalActions(submenuManager);
    submenuManager.insertBefore("additions-end", showGenericsAction);
  }

  protected IMenuManager createSubmenuManager()
  {
    return new MenuManager("Emf Components", "it.rcpvision.emf.components.MenuID");
  }

  

  public void setActivePart(IWorkbenchPart part) {
	  super.setActivePart(part);
	activePart = part;

    // Switch to the new selection provider.
    //
    if (selectionProvider != null)
    {
      selectionProvider.removeSelectionChangedListener(this);
    }
    if (part == null)
    {
      selectionProvider = null;
    }
    else
    {
        selectionProvider = part.getSite().getSelectionProvider();
    }
    
    if (selectionProvider != null) {
      selectionProvider = part.getSite().getSelectionProvider();
      selectionProvider.addSelectionChangedListener(this);

      // Fake a selection changed event to update the menus.
      //
      if (selectionProvider.getSelection() != null)
      {
        selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
      }
    }
}
  
  @Override
  public void setActiveEditor(IEditorPart part)
  {
	  super.setActiveEditor(part);
	   setActivePart(part);
    
      showGenericsAction.setEnabled(false);
   
  }

  
  
  public void selectionChanged(SelectionChangedEvent event)
  {
    lastSelectionChangedEvent = event;

    EditingDomain domain = ((IEditingDomainProvider)activePart).getEditingDomain();
    emfActionManager.updateSelection(event.getSelection(), domain);
  
  }

 

 

  

  
    
 

  /**
   * This populates the pop-up menu before it appears.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void menuAboutToShow(IMenuManager menuManager)
  {
    super.menuAboutToShow(menuManager);
    emfActionManager.menuAboutToShow(menuManager);
  }

  /**
   * This inserts global actions before the "additions-end" separator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void addGlobalActions(IMenuManager menuManager)
  {
    menuManager.insertAfter("additions-end", new Separator("ui-actions"));
    menuManager.insertAfter("ui-actions", showPropertiesViewAction);

    refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
    menuManager.insertAfter("ui-actions", refreshViewerAction);

    super.addGlobalActions(menuManager);
  }

  /**
   * This ensures that a delete action will clean up all references to deleted objects.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean removeAllReferencesOnDelete()
  {
    return true;
  }

}
