package it.rcpvision.emf.components.cdoexample.masterdetail.table;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

public class TableMasterDetailFeatureLabelProvider extends FeatureLabelProvider{
	
	/**
	 * 
	 * @param feature
	 * @return
	 */
	public String text_Author_name(EStructuralFeature feature) {
		return "Name: ";
	}
	
	/**
	 * 
	 * @param parent
	 * @param feature
	 * @return
	 */
	public Label label_Customer_description(Composite parent, EStructuralFeature feature) {
		return new Label(parent, SWT.NONE);
	}

	
}
