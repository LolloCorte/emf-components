package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.resource.EmptyResourceInitializer;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class View extends ViewPart {
	public static final String ID = "it.rcpvision.emf.components.examples.rap.ui.view";

	private StructuredViewer viewer;
	
	@Inject protected CompositeLabelProvider labelProvider;
	
	@Inject protected ViewerInitializer viewerInitializer;
	
	@Inject protected EmptyResourceInitializer emptyResourceInitializer;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		int style = SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL;
		viewer = new TreeViewer(parent, style);
		
		Resource resource = new ResourceImpl();
		emptyResourceInitializer.initialize(resource);
		
		viewerInitializer.initialize(viewer, resource);
		
//		viewer.setContentProvider(new ViewContentProvider());
//		labelProvider.setDelegateLabelProvider(new ViewLabelProvider());
//		viewer.setLabelProvider(labelProvider);
//		viewer.setInput(getViewSite());
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}