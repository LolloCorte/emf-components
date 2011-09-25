/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.listeners.EmfViewerNoOpMouseAdapter;
import it.rcpvision.emf.components.service.EmfComponentsGenericModule;
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
	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsGenericModule(
				EmfFormEditorTestsActivator.getDefault()) {

			@Override
			public Class<? extends EmfViewerMouseAdapter> bindEmfViewerMouseAdapter() {
				return EmfViewerNoOpMouseAdapter.class;
			}

		};
	}

}
