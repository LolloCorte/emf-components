/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.Inject;

import it.rcpvision.emf.components.ui.provider.EClassFeatureProvider;
import it.rcpvision.emf.components.util.EStructuralFeatureNameComparator;

/**
 * @author bettini
 *
 */
public class OrderedEClassFeatureProvider extends EClassFeatureProvider {

	@Inject
	EStructuralFeatureNameComparator comparator;
	
	@Override
	public List<EStructuralFeature> getFeatures(EClass eClass) {
		List<EStructuralFeature> features = super.getFeatures(eClass);
		Collections.sort(features, new EStructuralFeatureNameComparator());
		return features;
	}

}
