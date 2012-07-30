package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class View extends ViewPart {
	public static final String ID = "it.rcpvision.emf.components.examples.rap.ui.view";

	@Inject private EmptyResourceInitializer emptyResourceInitializer;
	
	@Inject private TreeFormFactory treeFormFactory;
	
	protected TreeFormComposite treeFormComposite;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		treeFormComposite = treeFormFactory.createTreeFormMasterDetailComposite(parent,
				SWT.BORDER);
		
		Resource resource = new ResourceImpl();
		emptyResourceInitializer.initialize(resource);
		
		treeFormComposite.update(resource);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		treeFormComposite.setFocus();
	}
}