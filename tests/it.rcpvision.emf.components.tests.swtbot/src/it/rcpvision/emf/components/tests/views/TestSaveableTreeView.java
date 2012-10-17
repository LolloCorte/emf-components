package it.rcpvision.emf.components.tests.views;

import it.rcpvision.emf.components.tests.EmfComponentsAbstractTests;
import it.rcpvision.emf.components.views.AbstractSaveableTreeView;

import org.eclipse.emf.common.util.URI;

public class TestSaveableTreeView extends AbstractSaveableTreeView {

	@Override
	protected URI createResourceURI() {
		return URI.createPlatformResourceURI(
				EmfComponentsAbstractTests.MY_EXTLIBRARY_RELATIVE_PATH, true);
	}

}
