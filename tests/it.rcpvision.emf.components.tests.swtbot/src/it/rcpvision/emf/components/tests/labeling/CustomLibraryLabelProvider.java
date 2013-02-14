/**
 * 
 */
package it.rcpvision.emf.components.tests.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import com.google.inject.Inject;

import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Borrower;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;


/**
 * @author bettini
 * 
 */
public class CustomLibraryLabelProvider extends ViewerLabelProvider {

	@Inject
	public CustomLibraryLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public String text(Book book) {
		return "Book: " + book.getTitle();
	}

	public String image(Book book) {
		return "book2.png";
	}
	
	public String text(Borrower b) {
		return "Borrower: " + b.getFirstName();
	}
}
