/*
 * generated by Xtext
 */
package it.rcpvision.emf.components.examples.fowlerdsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StatemachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return it.rcpvision.emf.components.examples.fowlerdsl.ui.internal.StatemachineActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return it.rcpvision.emf.components.examples.fowlerdsl.ui.internal.StatemachineActivator.getInstance().getInjector("it.rcpvision.emf.components.examples.fowlerdsl.Statemachine");
	}
	
}
