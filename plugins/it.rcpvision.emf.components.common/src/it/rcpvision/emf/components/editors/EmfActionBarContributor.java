package it.rcpvision.emf.components.editors;

import it.rcpvision.emf.components.EmfComponentsCommonActivator;
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
          EmfComponentsCommonActivator.log(exception);
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

  /**
   * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
   * generated for the current selection by the item provider.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<IAction> createChildActions;

  /**
   * This is the menu manager into which menu contribution items should be added for CreateChild actions.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IMenuManager createChildMenuManager;

  /**
   * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
   * generated for the current selection by the item provider.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<IAction> createSiblingActions;

  /**
   * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IMenuManager createSiblingMenuManager;

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
      (Boolean.parseBoolean(EmfComponentsCommonActivator.getDefault().getDialogSettings().get("showGenericsAction")));    
  }

	@Override
	protected void initializeActions(IActionBars actionBars) {
		super.initializeActions(actionBars);

		validateAction = emfActionFactory.createValidateAction();
		controlAction = emfActionFactory.createControlAction();
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
    EmfComponentsCommonActivator.getDefault().getDialogSettings().put(
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

    // Prepare for CreateChild item addition or removal.
    //
    createChildMenuManager = new MenuManager("&New Child");
    submenuManager.insertBefore("additions", createChildMenuManager);

    // Prepare for CreateSibling item addition or removal.
    //
    createSiblingMenuManager = new MenuManager("N&ew Sibling");
    submenuManager.insertBefore("additions", createSiblingMenuManager);
    
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

  /**
   * When the active editor changes, this remembers the change and registers with it as a selection provider.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActiveEditorGen(IEditorPart part)
  {
    super.setActiveEditor(part);
    setActivePart(part);
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
    setActiveEditorGen(part);
    
//    if (part instanceof EcoreEditor)
//    {
//      showGenericsAction.addViewer(((EcoreEditor)part).getViewer());
//      showGenericsAction.setEnabled(true);
//    }
//    else
//    {
      showGenericsAction.setEnabled(false);
//    }    
  }

  /**
   * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
   * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
   * that can be added to the selected object and updating the menus accordingly.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void selectionChangedGen(SelectionChangedEvent event)
  {
    // Remove any menu items for old selection.
    //
    if (createChildMenuManager != null)
    {
      depopulateManager(createChildMenuManager, createChildActions);
    }
    if (createSiblingMenuManager != null)
    {
      depopulateManager(createSiblingMenuManager, createSiblingActions);
    }

    // Query the new selection for appropriate new child/sibling descriptors
    //
    Collection<?> newChildDescriptors = null;
    Collection<?> newSiblingDescriptors = null;

    ISelection selection = event.getSelection();
    if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1)
    {
      Object object = ((IStructuredSelection)selection).getFirstElement();

      EditingDomain domain = ((IEditingDomainProvider)activePart).getEditingDomain();

      newChildDescriptors = domain.getNewChildDescriptors(object, null);
      newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
    }

    // Generate actions for selection; populate and redraw the menus.
    //
    createChildActions = generateCreateChildActions(newChildDescriptors, selection);
    createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);

    if (createChildMenuManager != null)
    {
      populateManager(createChildMenuManager, createChildActions, null);
      createChildMenuManager.update(true);
    }
    if (createSiblingMenuManager != null)
    {
      populateManager(createSiblingMenuManager, createSiblingActions, null);
      createSiblingMenuManager.update(true);
    }
  }
  
  public void selectionChanged(SelectionChangedEvent event)
  {
    lastSelectionChangedEvent = event;
    selectionChangedGen(event);
  }

  /**
   * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
   * and returns the collection of these actions.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection)
  {
    Collection<IAction> actions = new ArrayList<IAction>();
    if (descriptors != null)
    {
      for (Object descriptor : descriptors)
      {
        if (!showGenericsAction.isChecked() && descriptor instanceof CommandParameter)
        {
          Object feature = ((CommandParameter)descriptor).getFeature();
          if (isGenericFeature(feature))
          {
            continue;
          }
        }
        actions.add(new CreateChildAction(activePart, selection, descriptor));
      }
    }
    return actions;
  }

  /**
   * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
   * and returns the collection of these actions.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection)
  {
    Collection<IAction> actions = new ArrayList<IAction>();
    if (descriptors != null)
    {
      for (Object descriptor : descriptors)
      {
        if (!showGenericsAction.isChecked() && descriptor instanceof CommandParameter)
        {
          Object feature = ((CommandParameter)descriptor).getFeature();
          if (isGenericFeature(feature))
          {
            continue;
          }
        }
        actions.add(new CreateSiblingAction(activePart, selection, descriptor));
      }
    }
    return actions;
  }

  protected boolean isGenericFeature(Object feature)
  {
    return feature == EcorePackage.Literals.ECLASS__EGENERIC_SUPER_TYPES ||
      feature == EcorePackage.Literals.ECLASSIFIER__ETYPE_PARAMETERS ||
      feature == EcorePackage.Literals.EOPERATION__EGENERIC_EXCEPTIONS || 
      feature == EcorePackage.Literals.EOPERATION__ETYPE_PARAMETERS ||
      feature == EcorePackage.Literals.ETYPED_ELEMENT__EGENERIC_TYPE;
  }

  /**
   * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
   * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
   * by inserting them before the specified contribution item <code>contributionID</code>.
   * If <code>contributionID</code> is <code>null</code>, they are simply added.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID)
  {
    if (actions != null)
    {
      for (IAction action : actions)
      {
        if (contributionID != null)
        {
          manager.insertBefore(contributionID, action);
        }
        else
        {
          manager.add(action);
        }
      }
    }
  }
    
  /**
   * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
   * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions)
  {
    if (actions != null)
    {
      IContributionItem[] items = manager.getItems();
      for (int i = 0; i < items.length; i++)
      {
        // Look into SubContributionItems
        //
        IContributionItem contributionItem = items[i];
        while (contributionItem instanceof SubContributionItem)
        {
          contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
        }

        // Delete the ActionContributionItems with matching action.
        //
        if (contributionItem instanceof ActionContributionItem)
        {
          IAction action = ((ActionContributionItem)contributionItem).getAction();
          if (actions.contains(action))
          {
            manager.remove(contributionItem);
          }
        }
      }
    }
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
    MenuManager submenuManager = null;

    submenuManager = new MenuManager("&New Child");
    populateManager(submenuManager, createChildActions, null);
    menuManager.insertBefore("edit", submenuManager);

    submenuManager = new MenuManager("N&ew Sibling");
    populateManager(submenuManager, createSiblingActions, null);
    menuManager.insertBefore("edit", submenuManager);
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
