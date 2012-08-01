/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.GuiceModule;
import it.rcpvision.emf.components.listeners.ViewerMouseAdapter;
import it.rcpvision.emf.components.listeners.ViewerNoOpMouseAdapter;
import it.rcpvision.emf.components.tests.EmfComponentsTestsActivator;


/**
 * Uses a mouse adapter that does not react to mouse events.
 * 
 * @author bettini
 * 
 */
public class NoMouseEventExecutableExtensionFactory extends
		EmfComponentsTestsExecutableExtensionFactory {

	@Override
	protected GuiceModule getModule() {
		return new GuiceModule(
				EmfComponentsTestsActivator.getDefault()) {

			@Override
			public Class<? extends ViewerMouseAdapter> bindViewerMouseAdapter() {
				return ViewerNoOpMouseAdapter.class;
			}

		};
	}

}
