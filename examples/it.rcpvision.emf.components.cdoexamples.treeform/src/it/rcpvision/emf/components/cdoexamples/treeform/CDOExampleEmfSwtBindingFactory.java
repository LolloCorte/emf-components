package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import library.Book;

import org.eclipse.swt.widgets.Control;

public class CDOExampleEmfSwtBindingFactory extends FormFeatureControlFactory {
	
	public Control createAndBind_Book_authors(Book book){
		return getToolkit().createLabel(getParent(),""+book.getAuthors());
	}

}
