/**
 * 
 */
package org.eclipse.emf.formeditor.tests.factories;

import org.eclipse.emf.formeditor.EmfFormEditorExecutableExtensionFactory;
import org.eclipse.emf.formeditor.tests.EmfFormEditorTestsActivator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class EmfFormEditorTestsExecutableExtensionFactory extends
		EmfFormEditorExecutableExtensionFactory {

	/**
	 * We override it since we use guice to load a class from this very plugin.
	 * 
	 * @see org.eclipse.emf.formeditor.EmfFormEditorExecutableExtensionFactory#getBundle()
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
