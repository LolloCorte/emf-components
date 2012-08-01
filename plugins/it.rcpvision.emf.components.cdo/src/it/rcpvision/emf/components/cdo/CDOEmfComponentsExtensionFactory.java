/**
 * 
 */
package it.rcpvision.emf.components.cdo;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.GuiceModule;

/**
 * @author bettini
 *
 */
public class CDOEmfComponentsExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected GuiceModule getModule() {
		return new CDOEmfComponentsModule(Activator.getDefault());
	}
	
	
	

}
