package it.rcpvision.emf.components.cdoexample.masterdetail.tree.internal.guice;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

public class TreeMasterDetailFeatLblProvider extends FeatureLabelProvider{
	
	/**
	 * 
	 * @param feature
	 * @return
	 */
	public String text_Task_code(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return "Code: ";
	}
	
	/**
	 * 
	 * @param parent
	 * @param feature
	 * @return
	 */
	public Label label_Task_description(Composite parent, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return new Label(parent, SWT.NONE);
	}

	
}
