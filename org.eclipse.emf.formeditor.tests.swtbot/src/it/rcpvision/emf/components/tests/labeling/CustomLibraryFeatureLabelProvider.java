/**
 * 
 */
package it.rcpvision.emf.components.tests.labeling;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IFormColors;

/**
 * @author bettini
 * 
 */
public class CustomLibraryFeatureLabelProvider extends FeatureLabelProvider {

	public String text_Person_firstName(EStructuralFeature feature) {
		return "First name";
	}

	public String text_Person_lastName(EStructuralFeature feature) {
		return "Last name";
	}
	
	public Label label_Writer_name(Composite parent, EStructuralFeature feature) {
		Label label = defaultLabel(parent, feature);
		label.setBackground(getFormToolkit().getColors().getColor(IFormColors.TITLE));
		return label;
	}
}
