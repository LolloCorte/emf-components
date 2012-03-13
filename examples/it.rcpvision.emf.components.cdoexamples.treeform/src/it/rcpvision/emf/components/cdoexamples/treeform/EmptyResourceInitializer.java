package it.rcpvision.emf.components.cdoexamples.treeform;

import library.Book;
import library.Library;
import library.LibraryFactory;

import org.eclipse.emf.ecore.resource.Resource;

public class EmptyResourceInitializer {

	public void initializeResource(Resource resource) {
		if (!resource.getContents().isEmpty())
			return;

		Library library = LibraryFactory.eINSTANCE.createLibrary();
		resource.getContents().add(library);
		Book book = LibraryFactory.eINSTANCE.createBook();
		library.getBooks().add(book);
	}
}
