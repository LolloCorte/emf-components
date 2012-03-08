/**
 * 
 */
package it.rcpvision.emf.components.cdo;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.views.EObjectManager;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author bettini
 *
 */
public class CDOEmfComponentsModule extends EmfComponentsGenericModule {

	public CDOEmfComponentsModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ResourceLoader> bindResourceLoader() {
		return CDOResourceLoader.class;
	}
	
	@Override
	public Class<? extends EObjectManager> bindEObjectManager(){
		return CDOObjectManager.class;
	}
	
	public Class<? extends CDOSessionManager> bindCDOSessionManager(){
		return CDOSessionManager.class;
	}
	
}
