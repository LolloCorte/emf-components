package it.rcpvision.emf.components.tests.cdo.app.guice;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DateTime;

import it.rcpvision.emf.components.ui.binding.ControlObservablePair;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;

public class DemoBindingFactory extends EmfSwtBindingFactory {

	public ControlObservablePair control_Persona_dataNascita(EStructuralFeature feature) {
		DateTime dateTime = new DateTime(getParent(), SWT.DROP_DOWN);
		getToolkit().adapt(dateTime);
		return new ControlObservablePair(dateTime,	SWTObservables.observeSelection(dateTime));
	}

}
