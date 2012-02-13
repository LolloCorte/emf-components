/**
 * 
 */
package it.rcpvision.emf.components.tests.labeling;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.Borrower;

/**
 * @author bettini
 * 
 */
public class CustomLibraryLabelProvider extends CompositeLabelProvider {

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
