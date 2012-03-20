package it.rcpvision.emf.components.examples.views;

import org.eclipse.emf.common.util.URI;

import it.rcpvision.emf.components.views.AbstractSaveableResourceTreeFormView;

public class SaveableResourceTreeFormView extends AbstractSaveableResourceTreeFormView{

	@Override
	protected URI createResourceURI() {
		return URI.createPlatformResourceURI("/library/Library.xmi", true);
	}

}
