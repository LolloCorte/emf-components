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
 * so that we can use a {@link IWorkbenchPart} instead of an {@link IEditorPart}
 * .
 */
public class EmfActionBarContributor extends EditingActionBarContributor
		implements ISelectionChangedListener {

	protected IWorkbenchPart activePart;

	protected ISelectionProvider selectionProvider;

	@Inject
	protected EmfActionManager emfActionManager;

	protected SelectionChangedEvent lastSelectionChangedEvent;

	public EmfActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
	}

	@Override
	protected void initializeActions(IActionBars actionBars) {
		super.initializeActions(actionBars);

		validateAction = editingActionManager.createValidateAction();
		controlAction = editingActionManager.createControlAction();
	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("ecore-settings"));
		toolBarManager.add(new Separator("ecore-additions"));
	}

	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = createSubmenuManager();

		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		emfActionManager.contributeToMenu(submenuManager);

		submenuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager menuManager) {
				menuManager.updateAll(true);
			}
		});

		addGlobalActions(submenuManager);
	}

	protected IMenuManager createSubmenuManager() {
		return new MenuManager("Emf Components",
				"it.rcpvision.emf.components.MenuID");
	}

	public void setActivePart(IWorkbenchPart part) {
		super.setActivePart(part);
		activePart = part;

		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		} else {
			selectionProvider = part.getSite().getSelectionProvider();
		}

		if (selectionProvider != null) {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider,
						selectionProvider.getSelection()));
			}
		}
	}

	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		setActivePart(part);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		lastSelectionChangedEvent = event;
		EditingDomain domain = ((IEditingDomainProvider) activePart)
				.getEditingDomain();
		emfActionManager.updateSelection(event.getSelection(), domain);
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		emfActionManager.menuAboutToShow(menuManager);
	}

	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		super.addGlobalActions(menuManager);
	}

	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

}
