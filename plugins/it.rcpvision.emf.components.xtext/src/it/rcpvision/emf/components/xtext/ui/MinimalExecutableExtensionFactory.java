/**
 * 
 */
package it.rcpvision.emf.components.xtext.ui;

import it.rcpvision.emf.components.xtext.service.AbstractGenericModule;

import com.google.inject.Injector;
import static com.google.inject.Guice.createInjector;

/**
 * @author bettini
 *
 */
public abstract class MinimalExecutableExtensionFactory extends
		AbstractGuiceAwareExecutableExtensionFactory {

	protected Injector getInjector() {
		return createInjector(getModule());
	}

	protected abstract AbstractGenericModule getModule();

}
