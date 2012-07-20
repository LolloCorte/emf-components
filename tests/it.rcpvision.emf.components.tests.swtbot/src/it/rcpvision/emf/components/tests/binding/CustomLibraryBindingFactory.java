/**
 * 
 */
package it.rcpvision.emf.components.tests.binding;

import it.rcpvision.emf.components.binding.ControlObservablePair;
import it.rcpvision.emf.components.binding.FormFeatureControlFactory;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author bettini
 * 
 */
public class CustomLibraryBindingFactory extends FormFeatureControlFactory {

	public ControlObservablePair control_Writer_name(EStructuralFeature feature) {
		Text t = getToolkit().createText(getParent(), "");
		t.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		t.setBackground(getToolkit().getColors().getColor(IFormColors.TITLE));
		return new ControlObservablePair(t, SWTObservables.observeText(t,
				SWT.Modify));
	}
}
