package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.editors.EmfActionBarContributor;
import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.menus.StructuredViewerContextMenuManagerCreator;
import it.rcpvision.emf.components.viewers.ViewerSelectionProvider;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

public abstract class AbstractSaveableTreeFormView extends AbstractSaveableView
		implements IMenuListener{

	@Inject
	protected TreeFormFactory treeFormFactory;

	@Inject
	protected StructuredViewerContextMenuManagerCreator structuredViewerContextMenuManagerCreator;

	@Inject
	protected EmfActionBarContributor actionBarContributor;

	protected TreeFormComposite treeFormComposite;

	protected Object getContents(Resource resource){
		return resource;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		// DON'T USE THE changeAdapter!!!
		// it will act as an item provider editing adapter
		// and actions won't be created!!!
		treeFormComposite = treeFormFactory.createTreeFormMasterDetailComposite(parent,
				SWT.BORDER);
		
		treeFormComposite.update(getContents(getResource()));

		createContextMenuFor(treeFormComposite.getViewer());
//		actionBarContributor.setViewerForSelection(treeFormComposite.getViewer());

		ViewerSelectionProvider viewerSelectionProvider = new ViewerSelectionProvider(
				treeFormComposite.getViewer());
		actionBarContributor
				.setExplicitSelectionProvider(viewerSelectionProvider);
		viewerSelectionProvider
				.addSelectionChangedListener(actionBarContributor);

		actionBarContributor.setActivePart(this);
	}

	@Override
    protected void customizePostCommandStackChanged(Command mostRecentCommand) {
		if (mostRecentCommand != null
				&& mostRecentCommand instanceof CreateChildCommand) {
			setSelectionToViewer(mostRecentCommand
					.getAffectedObjects());
		}
	}

	@Override
    protected abstract URI createResourceURI();

	public void createContextMenuFor(StructuredViewer viewer) {
		MenuManager menuManager = structuredViewerContextMenuManagerCreator
				.createContextMenuFor(viewer, this, editingDomain);
		menuManager.addMenuListener(this);
	}

	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				@Override
                public void run() {
					// Try to select the items in the current content viewer of
					// the editor.
					//
					if (treeFormComposite.getViewer() != null) {
						treeFormComposite.getViewer()
								.setSelection(
										new StructuredSelection(
												theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		actionBarContributor.menuAboutToShow(menuManager);
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}
	
	public StructuredViewer getViewer() {
	    return treeFormComposite.getViewer();
	}

}
