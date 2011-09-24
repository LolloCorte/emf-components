package it.rcpvision.emf.components.old.ui.binding;

import it.rcpvision.emf.components.ui.binding.ControlObservablePair;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface FeatureControlMapper {

	public ControlObservablePair getControlObservablePairByFeature(EStructuralFeature feature);
	
}
