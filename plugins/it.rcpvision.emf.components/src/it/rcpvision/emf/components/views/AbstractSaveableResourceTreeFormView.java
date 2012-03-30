package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.edit.action.TreeActionBarContributor;
import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.menus.StructuredViewerContextMenuCreator;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import java.io.IOException;
import java.util.Collection;
import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public abstract class AbstractSaveableResourceTreeFormView extends AbstractSaveableResourceView implements IMenuListener {

	@Inject
	protected EmfCompositeFactory emfCompositeFactory;

	protected TreeFormComposite treeFormComposite;

	@Inject
	protected StructuredViewerContextMenuCreator structuredViewerContextMenuCreator;

	@Inject
	protected TreeActionBarContributor actionBarContributor;


	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	private Resource resource;


	public Resource getResource() {
		return resource;
	}



	@Override
	public void createPartControl(Composite parent) {
		// INIT
		initializeEditingDomain();
		actionBarContributor.initialize(getViewSite().getPart(), editingDomain);

		// DON'T USE THE changeAdapter!!!
		// it will act as an item provider editing adapter
		// and actions won't be created!!!
		treeFormComposite = emfCompositeFactory.createTreeFormComposite(parent,
				SWT.BORDER);
		
		
		URI uri = createResourceURI();
		// ResourceSet resourceSet = new ResourceSetImpl();
		// resource = resourceSet.getResource(uri, true);
		resource = resourceLoader.getResource(editingDomain, uri).getResource();

		treeFormComposite.update(resource);

		createContextMenuFor(treeFormComposite.getViewer());
		actionBarContributor.setViewerForSelection(treeFormComposite.getViewer());

		treeFormComposite.getViewer().addSelectionChangedListener(
				actionBarContributor);
	}

	protected void customizePostCommandStackChanged(Command mostRecentCommand) {
		if (mostRecentCommand != null
				&& mostRecentCommand instanceof CreateChildCommand) {
			setSelectionToViewer(mostRecentCommand
					.getAffectedObjects());
		}
	}

	protected abstract URI createResourceURI() ;

	public void createContextMenuFor(StructuredViewer viewer) {
		MenuManager menuManager = structuredViewerContextMenuCreator
				.createContextMenuFor(viewer, this, editingDomain);
		menuManager.addMenuListener(this);
	}

	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
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


	@Override
	public void doSaveAs() {

	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveOnCloseNeeded() {
		// TODO Auto-generated method stub
		return false;
	}

}
