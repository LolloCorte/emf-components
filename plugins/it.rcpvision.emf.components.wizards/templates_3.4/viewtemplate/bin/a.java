package it.rcpvision.cdo04.editor.labeling;

import it.rcpvision.emf.components.binding.ControlObservablePair;
import it.rcpvision.emf.components.binding.FormControlFactory;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DateTime;

public class DemoBindingFactory extends EmfSwtBindingFactory {

	public ControlObservablePair control_Order_date(EStructuralFeature feature) {
		DateTime dateTime= new DateTime(getParent(), SWT.DROP_DOWN);
		getToolkit().adapt(dateTime);
		return new ControlObservablePair(dateTime, SWTObservables.observeSelection(dateTime));
	}
}
