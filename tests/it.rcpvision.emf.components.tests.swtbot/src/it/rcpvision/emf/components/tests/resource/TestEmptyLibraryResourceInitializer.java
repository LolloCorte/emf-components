/**
 * 
 */
package it.rcpvision.emf.components.tests.resource;

import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;
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
			createBook(library, "First Book", null);
			createBook(library, "Second Book", createWriter("A Writer"));
			createBook(library, "Third Book", null);
		}
	}

	protected void createBook(Library library, String title, Writer writer) {
		Book book = EXTLibraryFactory.eINSTANCE.createBook();
		book.setTitle(title);
		library.getBooks().add(book);
		if (writer != null) {
			library.getWriters().add(writer);
			book.setAuthor(writer);
		}
	}

	protected Writer createWriter(String name) {
		Writer writer = EXTLibraryFactory.eINSTANCE.createWriter();
		writer.setName(name);
		return writer;
	}
}
