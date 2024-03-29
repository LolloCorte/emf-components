/**
 * 
 */
package it.rcpvision.emf.components.tests.binding;

import static org.eclipse.xtext.xbase.lib.IterableExtensions.join;
import static org.eclipse.xtext.xbase.lib.IterableExtensions.map;
import it.rcpvision.emf.components.binding.FormControlFactory;
import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Writer;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * @author Lorenzo Bettini
 * 
 */
public class CustomLibraryFormControlFactory extends FormControlFactory {

//	public ControlObservablePair control_Writer_name(EStructuralFeature feature) {
//		Text t = getToolkit().createText(getParent(), "");
//		t.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
//		t.setBackground(getToolkit().getColors().getColor(IFormColors.TITLE));
//		return new ControlObservablePair(t, SWTObservables.observeText(t,
//				SWT.Modify));
//	}

	public Control control_Writer_name(DataBindingContext dbc,
			IObservableValue featureObservable) {
		Text text = getToolkit().createText(getParent(), "");
		text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		text.setBackground(getToolkit().getColors().getColor(IFormColors.TITLE));
		dbc.bindValue(SWTObservables.observeText(text, SWT.Modify),
				featureObservable);
		return text;
	}
	
	public Control control_Writer_books(Writer writer) {
		return getToolkit().createLabel(getParent(),
				join(map(writer.getBooks(), new Function1<Book, String>() {
					public String apply(Book book) {
						return book.getTitle();
					}
				}), ", "));
	}

	public List<?> proposals_Book_author(Book book) {
		List<Object> proposals = new LinkedList<Object>();
		Writer writer = EXTLibraryFactory.eINSTANCE.createWriter();
		writer.setFirstName("Fake");
		writer.setLastName("Writer");
		proposals.add(writer);
		writer = EXTLibraryFactory.eINSTANCE.createWriter();
		writer.setFirstName("Fake");
		writer.setLastName("Writer2");
		proposals.add(writer);
		return proposals;
	}
}
