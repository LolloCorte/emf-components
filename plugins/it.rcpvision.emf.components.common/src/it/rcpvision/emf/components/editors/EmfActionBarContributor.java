package it.rcpvision.emf.components.editors;

import it.rcpvision.emf.components.edit.action.EditingActionBarContributor;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

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


	@Inject
	protected EmfActionManager emfActionManager;


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
	}

	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		setActivePart(part);
	}

	public void selectionChanged(SelectionChangedEvent event) {
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
