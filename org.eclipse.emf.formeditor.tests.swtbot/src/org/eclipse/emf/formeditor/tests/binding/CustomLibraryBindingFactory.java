/**
 * 
 */
package org.eclipse.emf.formeditor.tests.binding;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.formeditor.ui.binding.ControlObservablePair;
import org.eclipse.emf.formeditor.ui.binding.EmfSwtBindingFactory;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author bettini
 * 
 */
public class CustomLibraryBindingFactory extends EmfSwtBindingFactory {

	public ControlObservablePair control_Writer_name(EStructuralFeature feature) {
		Text t = getToolkit().createText(getParent(), "");
		t.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		t.setBackground(getToolkit().getColors().getColor(IFormColors.TITLE));
		return new ControlObservablePair(t, SWTObservables.observeText(t,
				SWT.Modify));
	}
}
