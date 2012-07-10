/**
 * 
 */
package it.rcpvision.emf.components.tests;

import it.rcpvision.emf.components.tests.factories.CustomLibraryExecutableExtensionFactory;

import com.google.inject.Injector;

/**
 * @author bettini
 * 
 */
public class EmfComponentsCustomLibraryAbstractTests extends
		EmfComponentsAbstractTests {

	protected Injector getInjector() {
		return EmfComponentsTestsActivator.getDefault().getInjector(
				CustomLibraryExecutableExtensionFactory.class);
	}
}
