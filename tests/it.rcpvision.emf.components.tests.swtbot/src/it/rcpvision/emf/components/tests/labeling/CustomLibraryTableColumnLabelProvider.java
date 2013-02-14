package it.rcpvision.emf.components.tests.labeling;

import it.rcpvision.emf.components.examples.library.Writer;
import it.rcpvision.emf.components.ui.provider.TableColumnLabelProvider;

public class CustomLibraryTableColumnLabelProvider extends
		TableColumnLabelProvider {

	public String text_Writer_name(Object element) {
		if (element instanceof Writer) {
			Writer writer = (Writer) element;
			return "Writer " + writer.getName();
		}
		return null;
	}

}
