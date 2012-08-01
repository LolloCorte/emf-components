/**
 * 
 */
package it.rcpvision.emf.components.cdo;

import it.rcpvision.emf.components.GuiceModule;
import it.rcpvision.emf.components.resource.ResourceLoader;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author bettini
 *
 */
public class CDOEmfComponentsModule extends GuiceModule {

	public CDOEmfComponentsModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ResourceLoader> bindResourceLoader() {
		return CDOResourceLoader.class;
	}
	
	public Class<? extends CDOSessionManager> bindCDOSessionManager(){
		return CDOSessionManager.class;
	}
	
}
