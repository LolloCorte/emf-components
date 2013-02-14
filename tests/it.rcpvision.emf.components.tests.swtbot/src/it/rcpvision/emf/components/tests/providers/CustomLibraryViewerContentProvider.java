/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;
import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.google.inject.Inject;

/**
 * A custom content provider for Library
 * 
 * @author Lorenzo Bettini
 * 
 */
public class CustomLibraryViewerContentProvider extends ViewerContentProvider {

	@Inject
	public CustomLibraryViewerContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object children(Library library) {
		return library.getBooks();
	}

	public Object children(Book book) {
		ArrayList<Object> children = new ArrayList<Object>();
		Writer author = book.getAuthor();
		if (author != null) {
			children.add(author);
		}
		children.addAll(book.getBorrowers());
		return children;
	}
}
