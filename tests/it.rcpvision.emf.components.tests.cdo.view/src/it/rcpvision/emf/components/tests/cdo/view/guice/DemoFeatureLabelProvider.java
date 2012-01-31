package it.rcpvision.emf.components.tests.cdo.view.guice;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IFormColors;

public class DemoFeatureLabelProvider extends FeatureLabelProvider{

	public String text_Customer_code(EStructuralFeature feature) {
		return "CODICE";
	}
	
	
	public Label label_Customer_address(Composite parent, EStructuralFeature feature) {

		
		return new Label(parent, SWT.NONE);
	}
}
