/**
 * 
 */
package it.rcpvision.emf.components.examples.rap.ui.providers;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

/**
 * @author bettini
 *
 */
public class CustomLabelProvider extends CompositeLabelProvider {

	public String text(Object o) {
		return "Custom label: " + o.toString();
	}
	
	public Object image(Object o) {
		return "component.jpg";
	}
}
