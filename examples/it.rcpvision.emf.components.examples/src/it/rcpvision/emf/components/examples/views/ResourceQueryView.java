package it.rcpvision.emf.components.examples.views;

import org.eclipse.emf.common.util.URI;

import it.rcpvision.emf.components.views.AbstractQueryView;

public class ResourceQueryView extends AbstractQueryView {

	@Override
	protected URI createResourceURI() {
		return URI.createPlatformResourceURI("/library/Library.xmi", true);
	}

	
}
