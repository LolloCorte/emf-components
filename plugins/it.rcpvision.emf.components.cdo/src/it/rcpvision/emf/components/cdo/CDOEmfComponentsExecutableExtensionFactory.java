/**
 * 
 */
package it.rcpvision.emf.components.cdo;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.service.EmfComponentsGenericModule;
import it.rcpvision.emf.components.views.EObjectManager;

/**
 * @author bettini
 *
 */
public class CDOEmfComponentsExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new CDOEmfComponentsModule(Activator.getDefault());
	}
	
	
	

}
