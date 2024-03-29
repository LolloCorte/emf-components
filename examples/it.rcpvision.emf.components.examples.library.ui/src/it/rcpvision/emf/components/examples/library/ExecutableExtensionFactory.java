package it.rcpvision.emf.components.examples.library;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

public class ExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return new EmfComponentsGuiceModule(Activator.getDefault());
	}

}
