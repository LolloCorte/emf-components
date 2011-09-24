package it.rcpvision.emf.components.old.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class ButtonsComposite extends Composite {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Button buttonSave;

	public ButtonsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = formToolkit.createComposite(this, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));
		
		buttonSave = formToolkit.createButton(composite, "Save", SWT.NONE);
	}
	
	public void addSaveSelectionListener(SelectionAdapter selectionAdapter) {
		buttonSave.addSelectionListener(selectionAdapter);
	}
}
