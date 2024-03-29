/**
 * 
 */
package it.rcpvision.emf.components.examples.library;

import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author bettini
 * 
 */
public class CustomFeatureLabelProvider extends PropertyDescriptionProvider {

	public String text_Person_firstName(EStructuralFeature f) {
		return "First name";
	}

	public String text_Person_lastName(EStructuralFeature f) {
		return "Surname";
	}
}
