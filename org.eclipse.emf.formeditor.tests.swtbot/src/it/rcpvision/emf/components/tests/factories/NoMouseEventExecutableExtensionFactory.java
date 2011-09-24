/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.listeners.EmfViewerNoOpMouseAdapter;
import it.rcpvision.emf.components.service.EmfFormEditorGenericModule;
import it.rcpvision.emf.components.tests.EmfFormEditorTestsActivator;


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
