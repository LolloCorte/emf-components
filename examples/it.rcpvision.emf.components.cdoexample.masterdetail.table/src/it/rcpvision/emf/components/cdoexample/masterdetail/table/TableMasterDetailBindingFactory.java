package it.rcpvision.emf.components.cdoexample.masterdetail.table;

import it.rcpvision.emf.components.binding.ControlObservablePair;
import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DateTime;

//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.jface.databinding.swt.SWTObservables;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.DateTime;

public class TableMasterDetailBindingFactory extends EmfSwtBindingFactory {

	/*
	 * Example: manage "date" fields with a date picker. 
	 */ 
	public ControlObservablePair control_Author_birthdate(EStructuralFeature feature) {
		DateTime dateTime= new DateTime(getParent(), SWT.DROP_DOWN);
		getToolkit().adapt(dateTime);
		return new ControlObservablePair(dateTime, SWTObservables.observeSelection(dateTime));
	}
	
}
