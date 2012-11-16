/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.tests.EmfComponentsTestsActivator;

import com.google.inject.Injector;

/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class CustomContentProviderLibraryExecutableExtensionFactory extends
		EmfComponentsTestsExecutableExtensionFactory {

	@Override
	public Injector getInjector() {
		return EmfComponentsTestsActivator.getDefault().getInjector(
				this.getClass());
	}

}
