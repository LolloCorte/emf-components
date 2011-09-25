/**
 * 
 */
package it.rcpvision.emf.components.cdo;

import it.rcpvision.emf.components.ResourceLoader;
import it.rcpvision.emf.components.service.EmfComponentsGenericModule;

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

}
