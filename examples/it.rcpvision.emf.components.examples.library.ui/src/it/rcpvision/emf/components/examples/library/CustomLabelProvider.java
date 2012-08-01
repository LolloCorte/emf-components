package it.rcpvision.emf.components.examples.library;

import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Person;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;


public class CustomLabelProvider extends ViewerLabelProvider {

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
