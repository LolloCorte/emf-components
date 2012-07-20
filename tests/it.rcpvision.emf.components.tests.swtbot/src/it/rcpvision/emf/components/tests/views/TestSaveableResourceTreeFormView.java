package it.rcpvision.emf.components.tests.views;

import org.eclipse.emf.common.util.URI;

import it.rcpvision.emf.components.tests.EmfComponentsAbstractTests;
import it.rcpvision.emf.components.views.AbstractSaveableTreeFormView;

public class TestSaveableResourceTreeFormView extends
		AbstractSaveableTreeFormView {

	@Override
	protected URI createResourceURI() {
		return URI.createPlatformResourceURI(
				EmfComponentsAbstractTests.MY_EXTLIBRARY_RELATIVE_PATH, true);
	}

}
