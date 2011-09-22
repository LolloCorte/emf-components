/**
 * 
 */
package org.eclipse.emf.formeditor.cdo;

import org.eclipse.emf.formeditor.EmfFormEditorExecutableExtensionFactory;
import org.eclipse.emf.formeditor.service.EmfFormEditorGenericModule;

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
