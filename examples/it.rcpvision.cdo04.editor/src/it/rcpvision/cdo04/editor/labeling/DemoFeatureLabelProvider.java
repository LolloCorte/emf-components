package it.rcpvision.cdo04.editor.labeling;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IFormColors;

public class DemoFeatureLabelProvider extends FeatureLabelProvider {

	public String text_Customer_code(EStructuralFeature feature) {
		return "codice";
	}
	
	public String text_Order_orderNumber(EStructuralFeature feature) {
		return "order N.";
	}
	
	public Label label_Order_orderNumber(Composite parent, EStructuralFeature feature) {
		Label lab = formToolkit.createLabel(parent, getText(feature));
		lab.setLayoutData(new GridData());
		lab.setForeground(formToolkit.getColors().getColor(IFormColors.TITLE));
		return lab;
	}
}
