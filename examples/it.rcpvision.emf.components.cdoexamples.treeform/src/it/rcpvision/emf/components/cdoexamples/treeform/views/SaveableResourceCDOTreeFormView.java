package it.rcpvision.emf.components.cdoexamples.treeform.views;

import org.eclipse.emf.common.util.URI;

import it.rcpvision.emf.components.examples.views.SaveableResourceTreeFormView;

public class SaveableResourceCDOTreeFormView extends
		SaveableResourceTreeFormView {

	@Override
	protected URI createResourceURI() {
		String uriStr = "cdo://localhost:2036/demo/myResource/";
		return URI.createURI(uriStr);
	}

}
