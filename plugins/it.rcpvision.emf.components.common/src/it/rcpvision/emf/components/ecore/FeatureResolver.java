/**
 * 
 */
package it.rcpvision.emf.components.ecore;

import it.rcpvision.emf.components.EmfComponentsCommonActivator;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author Lorenzo Bettini
 * 
 */
public class FeatureResolver {

	public List<EStructuralFeature> getFeatures(EClass eClass,
			List<FeatureNamePath> paths) {
		List<EStructuralFeature> features = new LinkedList<EStructuralFeature>();
		collectFeatures(eClass, paths, features);
		return features;
	}

	protected void collectFeatures(EClass eClass, List<FeatureNamePath> paths,
			List<EStructuralFeature> features) {
		for (FeatureNamePath path : paths) {
			EStructuralFeature feature = getFeature(eClass,
					path.getFeatureName());
			if (feature == null)
				continue;
			if (path.getPaths() == null) {
				features.add(feature);
			} else {
				EClassifier type = feature.getEType();
				if (type instanceof EClass) {
					EClass eC = (EClass) type;
					// recursive call
					collectFeatures(eC, path.getPaths(), features);
				} else {
					EmfComponentsCommonActivator.logError("feature '"
							+ feature.getName() + "' in EClass '" + eClass.getName() + "'" +
							" is not an EClass.");
				}
			}
		}
	}

	protected EStructuralFeature getFeature(EClass eClass, String featureName) {
		EStructuralFeature feature = eClass.getEStructuralFeature(featureName);
		if (feature != null)
			return feature;
		else
			EmfComponentsCommonActivator.logError("cannot find feature '"
					+ featureName + "' in EClass '" + eClass.getName() + "'");
		return null;
	}
}
