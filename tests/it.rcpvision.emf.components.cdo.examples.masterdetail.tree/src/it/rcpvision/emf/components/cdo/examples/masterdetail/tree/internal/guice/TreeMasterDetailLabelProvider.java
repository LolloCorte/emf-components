package it.rcpvision.emf.components.cdo.examples.masterdetail.tree.internal.guice;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import library.Book;

import org.eclipse.jface.viewers.StyledString;

public class TreeMasterDetailLabelProvider extends CompositeLabelProvider {

	public String text(Book book) {
		
		StyledString styledString = new StyledString(
				book.getAuthor() != null ? book.getTitle() : "*noname*", null);
		String decoration = " (" + book.getAuthor().size() + " Authors)";
		styledString.append(decoration, StyledString.COUNTER_STYLER);
		
		return styledString.getString();
	}
	
	public String image(Book book) {
		return "book.jpg";
	}
}
