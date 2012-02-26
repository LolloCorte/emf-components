package it.rcpvision.emf.components.view.masterdetail;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class TreeActionBarContributor implements IMenuListener,
		ISelectionChangedListener {

	private IWorkbenchPart workbenchPart;

	protected EditingDomain editingDomain;

	public void initialize(IWorkbenchPart workbenchPart,
			EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		this.workbenchPart = workbenchPart;

		createChildMenuManager = new MenuManager(EcoreEditorPlugin.getPlugin()
				.getString("_UI_CreateChild_menu_item"));
		createSiblingMenuManager = new MenuManager(EcoreEditorPlugin
				.getPlugin().getString("_UI_CreateSibling_menu_item"));
		
		createDeleteAction();
	}

	public void menuAboutToShow(IMenuManager menuManager) {
		addDeleteAction(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(
				EcoreEditorPlugin.INSTANCE
						.getString("_UI_CreateChild_menu_item"));
		populateManager(submenuManager, createChildActions, null);
		menuManager.add(submenuManager);

		submenuManager = new MenuManager(
				EcoreEditorPlugin.INSTANCE
						.getString("_UI_CreateSibling_menu_item"));
		populateManager(submenuManager, createSiblingActions, null);
		menuManager.add(submenuManager);
	}

	protected SelectionChangedEvent lastSelectionChangedEvent;

	public void selectionChanged(SelectionChangedEvent event) {
		lastSelectionChangedEvent = event;
		selectionChangedGen(event);
	}

	public void selectionChangedGen(SelectionChangedEvent event) {
		lastSelectionChangedEvent = event;
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			depopulateManager(createSiblingMenuManager, createSiblingActions);
		}

		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection
				&& ((IStructuredSelection) selection).size() == 1) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection
					.getFirstElement();

			newChildDescriptors = editingDomain.getNewChildDescriptors(object,
					null);
			newSiblingDescriptors = editingDomain.getNewChildDescriptors(null,
					object);
			
			deleteAction.updateSelection(structuredSelection);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(newChildDescriptors,
				selection);
		createSiblingActions = generateCreateSiblingActions(
				newSiblingDescriptors, selection);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingActions,
					null);
			createSiblingMenuManager.update(true);
		}
	}

	protected Collection<IAction> createChildActions;

	protected IMenuManager createChildMenuManager;

	protected Collection<IAction> createSiblingActions;

	protected IMenuManager createSiblingMenuManager;

	protected DeleteAction deleteAction;

	protected void depopulateManager(IContributionManager manager,
			Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem)
							.getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem)
							.getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	protected void populateManager(IContributionManager manager,
			Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
	}

	// EditingDomainActionBarContributor
	private void addDeleteAction(IMenuManager menuManager) {
		menuManager.add(new ActionContributionItem(deleteAction));
	}

	protected DeleteAction createDeleteAction() {
		ISharedImages sharedImages = PlatformUI.getWorkbench()
				.getSharedImages();
		deleteAction = new DeleteAction(editingDomain, true);
		deleteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		return deleteAction;
	}

	protected Collection<IAction> generateCreateChildActions(
			Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				if (descriptor instanceof CommandParameter)// !showGenericsAction.isChecked()
															// &&
				{
					Object feature = ((CommandParameter) descriptor)
							.getFeature();
					if (isGenericFeature(feature)) {
						continue;
					}
				}
				actions.add(new CreateChildAction(workbenchPart, selection,
						descriptor));
			}
		}
		return actions;
	}

	protected Collection<IAction> generateCreateSiblingActions(
			Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				if (descriptor instanceof CommandParameter) {
					Object feature = ((CommandParameter) descriptor)
							.getFeature();
					if (isGenericFeature(feature)) {
						continue;
					}
				}
				actions.add(new CreateSiblingAction(workbenchPart, selection,
						descriptor));
			}
		}
		return actions;
	}

	protected boolean isGenericFeature(Object feature) {
		return feature == EcorePackage.Literals.ECLASS__EGENERIC_SUPER_TYPES
				|| feature == EcorePackage.Literals.ECLASSIFIER__ETYPE_PARAMETERS
				|| feature == EcorePackage.Literals.EOPERATION__EGENERIC_EXCEPTIONS
				|| feature == EcorePackage.Literals.EOPERATION__ETYPE_PARAMETERS
				|| feature == EcorePackage.Literals.ETYPED_ELEMENT__EGENERIC_TYPE;
	}

}
