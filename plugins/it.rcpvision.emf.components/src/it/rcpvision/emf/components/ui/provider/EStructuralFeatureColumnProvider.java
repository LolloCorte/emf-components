package it.rcpvision.emf.components.ui.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;

/**
 * A column provider based on an Emf feature.
 * 
 * @author Lorenzo Bettini
 *
 */
public class EStructuralFeatureColumnProvider extends ColumnLabelProvider {
	private final EStructuralFeature eStructuralFeature;

	public EStructuralFeatureColumnProvider(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}

	@Override
	public String getText(Object element) {
		try {
			EObject p = (EObject) element;
			Object featureValue = p.eGet(eStructuralFeature);
			return featureValue != null ? featureValue.toString() : "";
		} catch (Exception e) {
			// avoid exceptions during rendering
			return "";
		}
	}
}