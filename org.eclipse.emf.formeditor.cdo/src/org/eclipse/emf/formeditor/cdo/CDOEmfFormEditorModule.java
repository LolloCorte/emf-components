/**
 * 
 */
package org.eclipse.emf.formeditor.cdo;

import it.rcpvision.emf.components.ResourceLoader;
import it.rcpvision.emf.components.service.EmfFormEditorGenericModule;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author bettini
 *
 */
public class CDOEmfFormEditorModule extends EmfFormEditorGenericModule {

	public CDOEmfFormEditorModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ResourceLoader> bindResourceLoader() {
		return CDOResourceLoader.class;
	}

}
