/**
 * 
 */
package org.eclipse.emf.formeditor.cdo;

import it.rcpvision.emf.components.EmfFormEditorExecutableExtensionFactory;
import it.rcpvision.emf.components.service.EmfFormEditorGenericModule;

/**
 * @author bettini
 *
 */
public class CDOEmfFormEditorExecutableExtensionFactory extends
		EmfFormEditorExecutableExtensionFactory {

	@Override
	protected EmfFormEditorGenericModule getModule() {
		return new CDOEmfFormEditorModule(Activator.getDefault());
	}

}
