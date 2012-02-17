/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * Provides the list of {@link EStructuralFeature} of an {@link EClass}. The
 * default is to return the list of all the features in the EClass, but the
 * programmer can customize it (for instance, by returning only a superset, or
 * using a different order) on an EClass-based strategy. The customization can
 * be done also declarative, by providing an implementation of the method
 * featuresFor with a specific Java class of your meta-models as parameter.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EStructuralFeaturesProvider {

	private PolymorphicDispatcher<List<EStructuralFeature>> getFeaturesDispatcher = PolymorphicDispatcher
			.createForSingleTarget("featuresFor", 1, 1, this);

	public List<EStructuralFeature> getFeatures(EObject eObject) {
		if (eObject == null)
			return Collections.emptyList();

		List<EStructuralFeature> polymorphicFeaturesFor = getFeaturesDispatcher
				.invoke(eObject);
		if (polymorphicFeaturesFor != null)
			return polymorphicFeaturesFor;

		return getFeatures(eObject.eClass());
	}

	public List<EStructuralFeature> getFeatures(EClass eClass) {
		if (eClass == null)
			return Collections.emptyList();

		return new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
	}

	protected List<EStructuralFeature> featuresFor(EObject eObject) {
		return null;
	}

}
