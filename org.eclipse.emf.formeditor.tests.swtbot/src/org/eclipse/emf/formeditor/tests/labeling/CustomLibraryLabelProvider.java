/**
 * 
 */
package org.eclipse.emf.formeditor.tests.labeling;

import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.formeditor.ui.provider.CompositeLabelProvider;

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
}
