package org.eclipse.emf.formeditor.old.ui.binding;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.formeditor.ui.binding.ControlObservablePair;

public interface FeatureControlMapper {

	public ControlObservablePair getControlObservablePairByFeature(EStructuralFeature feature);
	
}
