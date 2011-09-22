/**
 * 
 */
package org.eclipse.emf.formeditor.cdo;

import org.eclipse.emf.formeditor.ResourceLoader;
import org.eclipse.emf.formeditor.service.EmfFormEditorGenericModule;
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
