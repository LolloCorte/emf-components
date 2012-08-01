/**
 * 
 */
package it.rcpvision.emf.components.cdo;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

/**
 * @author bettini
 *
 */
public class CDOEmfComponentsExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return new CDOEmfComponentsModule(Activator.getDefault());
	}
	
	
	

}
