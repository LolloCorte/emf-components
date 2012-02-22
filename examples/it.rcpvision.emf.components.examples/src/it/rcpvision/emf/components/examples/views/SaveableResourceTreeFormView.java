package it.rcpvision.emf.components.examples.views;

import java.io.IOException;

import it.rcpvision.emf.components.examples.composite.TreeFormComposite;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.EmfViewerManager;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class SaveableResourceTreeFormView extends ViewPart implements ISaveablePart{

	@Inject
	protected EmfViewerManager emfViewerManager;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	protected TreeFormComposite treeFormComposite;
	
	private boolean dirty;
	
	private Adapter changeAdapter=new Adapter(){

		@Override
		public void notifyChanged(Notification notification) {
			// TODO Auto-generated method stub
			dirty=true;
			firePropertyChange(PROP_DIRTY);
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
	
	@Override
	public void createPartControl(Composite parent) {
		
		treeFormComposite = new TreeFormComposite(parent, SWT.BORDER,
				emfViewerManager, emfDetailsFactory, changeAdapter);
		
		URI uri = URI.createPlatformResourceURI("/library/Library.xmi", true);
		ResourceSet resourceSet = new ResourceSetImpl();
		resource = resourceSet.getResource(uri, true);
		
		treeFormComposite.update(resource);
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
		dirty=false;
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
