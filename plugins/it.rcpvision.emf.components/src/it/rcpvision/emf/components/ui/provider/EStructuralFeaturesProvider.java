/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Provides the list of {@link EStructuralFeature} of an {@link EClass}. The
 * default is to return the list of all the features in the EClass, but the
 * programmer can customize it (for instance, by returning only a superset, or
 * using a different order) on an EClass-based strategy. The customization can
 * be done redefining buildMap and adding mappings.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EStructuralFeaturesProvider {

	public static class EClassToEStructuralFeatureMap extends
			HashMap<EClass, List<EStructuralFeature>> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 670116975392207101L;

	}

	protected EClassToEStructuralFeatureMap map = null;

	public List<EStructuralFeature> getFeatures(EObject eObject) {
		if (eObject == null)
			return Collections.emptyList();

		return getFeatures(eObject.eClass());
	}

	public List<EStructuralFeature> getFeatures(EClass eClass) {
		if (eClass == null)
			return Collections.emptyList();

		List<EStructuralFeature> fromMap = getFromMap(eClass);
		if (fromMap != null)
			return fromMap;

		return new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
	}

	protected List<EStructuralFeature> getFromMap(EClass eClass) {
		if (map == null)
			buildMapInternal();

		return map.get(eClass);
	}

	private void buildMapInternal() {
		map = new EClassToEStructuralFeatureMap();
		buildMap(map);
	}
	
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		// default implementation is empty
	}

}
