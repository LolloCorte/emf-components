package it.rcpvision.emf.components.tests.views;

import it.rcpvision.emf.components.examples.library.EXTLibraryPackage;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.tests.EmfComponentsAbstractTests;
import it.rcpvision.emf.components.views.AbstractSaveableTableView;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

public class TestSaveableResourceTableView extends AbstractSaveableTableView {

	@Override
	protected Object getContents(Resource resource) {
		Library library=(Library) resource.getContents().get(0);
		return library.getBooks();
	}

	@Override
	protected EClass getEClass() {
		return EXTLibraryPackage.Literals.BOOK;
	}
	
	@Override
	protected URI createResourceURI() {
		return URI.createPlatformResourceURI(
				EmfComponentsAbstractTests.MY_EXTLIBRARY_RELATIVE_PATH, true);
	}

}
