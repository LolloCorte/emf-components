package it.rcpvision.emf.components.examples.views;

import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.widgets.TreeFormMasterDetailComposite;

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
	protected EmfCompositeFactory emfCompositeFactory;

	protected TreeFormMasterDetailComposite treeFormMasterDetailComposite;

	@Override
	public void createPartControl(Composite parent) {
		treeFormMasterDetailComposite = emfCompositeFactory.createTreeFormMasterDetailComposite(parent,
				SWT.BORDER);

		URI uri = URI.createPlatformResourceURI("/library/Library.xmi", true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);

		treeFormMasterDetailComposite.update(resource);
	}

	@Override
	public void setFocus() {
		treeFormMasterDetailComposite.setFocus();
	}

}
