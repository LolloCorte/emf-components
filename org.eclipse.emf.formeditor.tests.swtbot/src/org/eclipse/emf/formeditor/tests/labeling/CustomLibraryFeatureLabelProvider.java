/**
 * 
 */
package org.eclipse.emf.formeditor.tests.labeling;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.formeditor.ui.provider.FeatureLabelProvider;
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
