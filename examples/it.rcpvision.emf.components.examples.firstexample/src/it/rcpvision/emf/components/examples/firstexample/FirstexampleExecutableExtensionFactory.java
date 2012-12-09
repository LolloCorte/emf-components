package it.rcpvision.emf.components.examples.firstexample;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

import com.google.inject.Injector;

public class FirstexampleExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FirstexampleActivator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return FirstexampleActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return FirstexampleActivator.getDefault().getInjector();
	}
}
