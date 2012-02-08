package it.rcpvision.emf.components.cdo.examples.masterdetail.tree.internal.guice;

import it.rcpvision.emf.components.ui.binding.ControlObservablePair;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DateTime;

public class TreeMasterDetailBindingFactory extends EmfSwtBindingFactory {

	public ControlObservablePair control_Task_begin(EStructuralFeature feature) {
		DateTime dateTime= new DateTime(getParent(), SWT.DROP_DOWN);
		getToolkit().adapt(dateTime);
		return new ControlObservablePair(dateTime, SWTObservables.observeSelection(dateTime));
	}
	
	public ControlObservablePair control_Task_end(EStructuralFeature feature) {
		DateTime dateTime= new DateTime(getParent(), SWT.DROP_DOWN);
		getToolkit().adapt(dateTime);
		return new ControlObservablePair(dateTime, SWTObservables.observeSelection(dateTime));
	}
}
