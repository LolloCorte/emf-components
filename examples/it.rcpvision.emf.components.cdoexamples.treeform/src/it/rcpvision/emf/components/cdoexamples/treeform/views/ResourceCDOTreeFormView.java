package it.rcpvision.emf.components.cdoexamples.treeform.views;

import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class ResourceCDOTreeFormView extends ViewPart {

	@Inject
	protected TreeFormFactory treeFormFactory;

	@Inject
	protected ResourceLoader resourceLoader;

	protected TreeFormComposite treeFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		treeFormComposite = treeFormFactory.createTreeFormMasterDetailComposite(parent,
				SWT.BORDER);

		String uriStr = "cdo://localhost:2036/demo/myResource/";
		URI uri = URI.createURI(uriStr);

		Resource resource = resourceLoader.getResource(new ResourceSetImpl(),
				uri);

		treeFormComposite.update(resource);
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}

}
