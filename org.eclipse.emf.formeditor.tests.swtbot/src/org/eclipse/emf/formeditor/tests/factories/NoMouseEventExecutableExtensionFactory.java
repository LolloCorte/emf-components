/**
 * 
 */
package org.eclipse.emf.formeditor.tests.factories;

import org.eclipse.emf.formeditor.listeners.EmfViewerMouseAdapter;
import org.eclipse.emf.formeditor.listeners.EmfViewerNoOpMouseAdapter;
import org.eclipse.emf.formeditor.service.EmfFormEditorGenericModule;
import org.eclipse.emf.formeditor.tests.EmfFormEditorTestsActivator;

/**
 * Uses a mouse adapter that does not react to mouse events.
 * 
 * @author bettini
 * 
 */
public class NoMouseEventExecutableExtensionFactory extends
		EmfFormEditorTestsExecutableExtensionFactory {

	@Override
	protected EmfFormEditorGenericModule getModule() {
		return new EmfFormEditorGenericModule(
				EmfFormEditorTestsActivator.getDefault()) {

			@Override
			public Class<? extends EmfViewerMouseAdapter> bindEmfViewerMouseAdapter() {
				return EmfViewerNoOpMouseAdapter.class;
			}

		};
	}

}
