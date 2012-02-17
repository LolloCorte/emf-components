/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Provides the list of {@link EStructuralFeature} of an {@link EClass}. The
 * default is to return the list of all the features in the EClass, but the
 * programmer can customize it on an EClass-based strategy.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EClassFeatureProvider {

	public List<EStructuralFeature> getFeatures(EClass eClass) {
		return new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
	}

}
