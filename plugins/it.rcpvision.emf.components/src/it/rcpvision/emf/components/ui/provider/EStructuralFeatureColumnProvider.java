package it.rcpvision.emf.components.ui.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * A column provider based on an Emf feature.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EStructuralFeatureColumnProvider extends ColumnLabelProvider {
	protected EStructuralFeature eStructuralFeature;

	protected ILabelProvider labelProvider;

	public EStructuralFeature geteStructuralFeature() {
		return eStructuralFeature;
	}

	public void seteStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}

	public ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

	@Override
	public String getText(Object element) {
		try {
			Object featureValue = getFeatureValue(element);
			return featureValue != null ? labelProvider.getText(featureValue)
					: "";
		} catch (Exception e) {
			// avoid exceptions during rendering
			return "";
		}
	}

	/**
	 * @param element
	 * @return
	 */
	protected Object getFeatureValue(Object element) {
		EObject p = (EObject) element;
		Object featureValue = p.eGet(eStructuralFeature);
		return featureValue;
	}

	@Override
	public Image getImage(Object element) {
		try {
			Object featureValue = getFeatureValue(element);
			return featureValue != null ? labelProvider.getImage(featureValue)
					: null;
		} catch (Exception e) {
			// avoid exceptions during rendering
			return null;
		}
	}
}