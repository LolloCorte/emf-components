/**
 * 
 */
package it.rcpvision.emf.components;

import it.rcpvision.emf.components.guice.AbstractGuiceAwareExecutableExtensionFactory;

import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import static com.google.inject.Guice.createInjector;

/**
 * @author bettini
 * 
 */
public class EmfComponentsExecutableExtensionFactory extends
		AbstractGuiceAwareExecutableExtensionFactory {

	/**
	 * Remember to override this method in your plugin, if you plan to create an
	 * instance of a class of your plugin (otherwise the classloader will not
	 * find it); if in your plugin you use guice only to inject your specific
	 * implementation into an instance of a class from this very plugin, then
	 * you do not need to override this method.
	 * 
	 * @see org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory#getBundle()
	 */
	@Override
	protected Bundle getBundle() {
		return EmfComponentsActivator.getDefault().getBundle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory
	 * #getInjector()
	 */
	@Override
	protected Injector getInjector() {
		return createInjector(getModule());
	}

	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsGenericModule(EmfComponentsActivator.getDefault());
	}

}
