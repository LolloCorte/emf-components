package it.rcpvision.emf.components.examples.library;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.emf.examples.extlibrary.Person;

public class CustomLabelProvider extends CompositeLabelProvider {

	public String text(Book book) {
		return "Book: " + book.getTitle();
	}
	
	public String image(Library l) {
		return "library.gif";
	}
	
	public String image(Person p) {
		return "person.gif";
	}
	
	public String image(Book b) {
		return "book.png";
	}
}
