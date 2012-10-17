/**
 * 
 */
package it.rcpvision.emf.components.tests.resource;

import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author bettini
 *
 */
public class TestEmptyLibraryResourceInitializer extends
		EmptyResourceInitializer {

	@Override
	public void initialize(Resource resource) {
		super.initialize(resource);
		
		if (resource.getURI().lastSegment().endsWith("extlibrary")) {
			Library library = EXTLibraryFactory.eINSTANCE.createLibrary();
			resource.getContents().add(library);
			createBook(library, "First Book");
			createBook(library, "Second Book");
			createBook(library, "Third Book");
		}
	}
	
	protected void createBook(Library library, String title) {
		Book book = EXTLibraryFactory.eINSTANCE.createBook();
		book.setTitle(title);
		library.getBooks().add(book);
	}
}
