/**
 * 
 */
package it.rcpvision.emf.components.tests.labeling;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author bettini
 * 
 */
public class CustomLibraryFeatureLabelProvider extends FeatureLabelProvider {

	public String text_Person_firstName(EStructuralFeature feature) {
		return "First name";
	}
	
	public String text_Person_lastName(EStructuralFeature feature) {
		return "Cognome";
	}
	
}
