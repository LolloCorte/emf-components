package it.rcpvision.emf.components.examples.views;

import it.rcpvision.emf.components.examples.composite.TreeFormComposite;
import it.rcpvision.emf.components.menus.StructuredViewerContextMenuCreator;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.view.masterdetail.TreeActionBarContributor;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.EmfViewerManager;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class SaveableResourceTreeFormView extends ViewPart implements
		ISaveablePart, IMenuListener {

	@Inject
	protected EmfViewerManager emfViewerManager;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	protected TreeFormComposite treeFormComposite;

	@Inject
	protected StructuredViewerContextMenuCreator structuredViewerContextMenuCreator;

	@Inject
	protected TreeActionBarContributor actionBarContributor;

	@Inject
	protected EditingDomainFactory editingDomainFactory;
	
	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	private boolean dirty;

	private Adapter changeAdapter = new Adapter() {

		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getEventType() != Notification.REMOVING_ADAPTER) {
				dirty = true;
				firePropertyChange(PROP_DIRTY);
			}
		}

		@Override
		public Notifier getTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
			System.out.println();
		}

		@Override
		public boolean isAdapterForType(Object type) {
			// TODO Auto-generated method stub
			return true;
		}
	};

	private Resource resource;

	private AdapterFactoryEditingDomain editingDomain;

	@Override
	public void createPartControl(Composite parent) {
		// INIT
		editingDomain = editingDomainFactory.create();
		actionBarContributor.initialize(getViewSite().getPart(), editingDomain);

		// DON'T USE THE changeAdapter!!!
		// it will act as an item provider editing adapter
		// and actions won't be created!!!
		treeFormComposite = new TreeFormComposite(parent, SWT.BORDER,
				emfViewerManager, emfDetailsFactory); //, changeAdapter);

		URI uri = URI.createPlatformResourceURI("/library/Library.xmi", true);
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resource = resourceSet.getResource(uri, true);
		resource = resourceLoader.getResource(editingDomain, uri).getResource();

		treeFormComposite.update(resource);

		createContextMenuFor(treeFormComposite.getViewer());

		treeFormComposite.getViewer().addSelectionChangedListener(
				actionBarContributor);
	}

	public void createContextMenuFor(StructuredViewer viewer) {
		MenuManager menuManager = structuredViewerContextMenuCreator
				.createContextMenuFor(viewer, this, editingDomain);
		menuManager.addMenuListener(this);
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
	public void doSave(IProgressMonitor monitor) {
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dirty = false;
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public void doSaveAs() {

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return dirty;
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
