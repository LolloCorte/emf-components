package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.binding.FormControlFactory;
import library.Book;

import org.eclipse.swt.widgets.Control;

public class CDOExampleFormFeatureControlFactory extends FormControlFactory {
	
	public Control create_Book_authors(Book book){
		return getToolkit().createLabel(getParent(),""+book.getAuthors());
	}

}
