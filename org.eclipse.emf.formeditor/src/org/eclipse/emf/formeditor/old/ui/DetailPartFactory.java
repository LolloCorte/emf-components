package org.eclipse.emf.formeditor.old.ui;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

public interface DetailPartFactory {
	
	public Control createControl(Composite parent, FormToolkit formToolkit);
	public IObservableValue createBinding(Control control);

}
