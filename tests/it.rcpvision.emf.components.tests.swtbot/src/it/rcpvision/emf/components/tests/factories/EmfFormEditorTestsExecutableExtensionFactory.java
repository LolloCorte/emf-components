/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.tests.EmfFormEditorTestsActivator;

import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class EmfFormEditorTestsExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	/**
	 * We override it since we use guice to load a class from this very plugin.
	 * 
	 * @see it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory#getBundle()
	 */
	@Override
	protected Bundle getBundle() {
		return EmfFormEditorTestsActivator.getDefault().getBundle();
	}

	@Override
	public Injector getInjector() {
		return super.getInjector();
	}

}
