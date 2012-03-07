package it.rcpvision.emf.components.examples.views;

import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.EmfViewerManager;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class ResourceTreeFormView extends ViewPart {

	@Inject
	protected EmfViewerManager emfViewerManager;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	protected TreeFormComposite treeFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		treeFormComposite = new TreeFormComposite(parent, SWT.BORDER,
				emfViewerManager, emfDetailsFactory);
		
		URI uri = URI.createPlatformResourceURI("/library/Library.xmi", true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		
		treeFormComposite.update(resource);
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}

}
