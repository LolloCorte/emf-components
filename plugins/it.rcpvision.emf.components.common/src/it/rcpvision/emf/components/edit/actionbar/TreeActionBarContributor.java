package it.rcpvision.emf.components.edit.actionbar;

import it.rcpvision.emf.components.EmfComponentsActivator;
import it.rcpvision.emf.components.edit.action.EditingActionManager;
import it.rcpvision.emf.components.edit.action.EmfActionManager;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;
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
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;

import com.google.inject.Inject;

public class TreeActionBarContributor implements IMenuListener,
		ISelectionChangedListener {

	private static final String IMG_TOOL_DELETE = "icons/delete_16x16.gif";

	protected EditingDomain editingDomain;
	
	@Inject 
	EmfActionManager emfActionManager;
	
	@Inject 
	EditingActionManager editingActionManager;

	public void initialize(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		
		editingActionManager.setEditingDomain(editingDomain);
	}

	public void menuAboutToShow(IMenuManager menuManager) {
		menuManager.add(new Separator("edit"));
		emfActionManager.menuAboutToShow(menuManager);
		editingActionManager.menuAboutToShow(menuManager);
	}

	protected SelectionChangedEvent lastSelectionChangedEvent;

	public void selectionChanged(SelectionChangedEvent event) {
		editingActionManager.updateSelection(event.getSelection());
		emfActionManager.updateSelection(event.getSelection(), editingDomain);
	}

	

	protected StructuredViewer viewer;

	
    public void setViewerForSelection(StructuredViewer viewer) {
        this.viewer = viewer;
    }

}
