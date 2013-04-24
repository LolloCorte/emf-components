package it.rcpvision.emf.components.editors;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;

public class EmfActionManager {

	/**
	   * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	   * generated for the current selection by the item provider.
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	  protected Collection<IAction> createSiblingActions;
	  


	/**
	   * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	   * generated for the current selection by the item provider.
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	  protected Collection<IAction> createChildActions;

	
	
	 /**
	   * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	   * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	  protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions)
	  {
		if(manager!=null && actions != null)
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
	   * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
	   * and returns the collection of these actions.
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated NOT
	   */
	  protected void generateCreateChildActions(EditingDomain domain, Collection<?> descriptors, ISelection selection)
	  {
	    Collection<IAction> actions = new ArrayList<IAction>();
	    if (descriptors != null)
	    {
	      for (Object descriptor : descriptors)
	      {
	        actions.add(new CreateChildAction(domain, selection, descriptor));
	      }
	    }
	    createChildActions= actions;
	  }

	  
	  /**
	   * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	   * and returns the collection of these actions.
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated NOT
	   */
	  protected void generateCreateSiblingActions(EditingDomain domain, Collection<?> descriptors, ISelection selection)
	  {
	    Collection<IAction> actions = new ArrayList<IAction>();
	    if (descriptors != null)
	    {
	      for (Object descriptor : descriptors)
	      {
	        actions.add(new CreateSiblingAction(domain, selection, descriptor));
	      }
	    }
	    createSiblingActions= actions;
	  }

	public void depopulateChildManager(IMenuManager menuManager) {
		depopulateManager(menuManager, createChildActions);
	}
	
	public void depopulateSibilingManager(IMenuManager menuManager) {
		depopulateManager(menuManager, createSiblingActions);
	}


	  public Collection<IAction> getCreateSiblingActions() {
		return createSiblingActions;
	}

	public Collection<IAction> getCreateChildActions() {
		return createChildActions;
	}
	
	public void menuAboutToShow(IMenuManager menuManager) {
		MenuManager submenuManager = null;

	    submenuManager = new MenuManager("&New Child");
	    populateManager(submenuManager, createChildActions, null);
	    menuManager.insertBefore("edit", submenuManager);

	    submenuManager = new MenuManager("N&ew Sibling");
	    populateManager(submenuManager, createSiblingActions, null);
	    menuManager.insertBefore("edit", submenuManager);
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

	public void populateChildMenuManager(IMenuManager menuManager) {
		 populateManager(menuManager, createChildActions, null);
	}
	
	public void populateSibilingMenuManager(IMenuManager menuManager) {
		 populateManager(menuManager, createSiblingActions, null);
	}
}
