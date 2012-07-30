package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;

import org.osgi.framework.Bundle;

public class ExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return new EmfComponentsGuiceModule(Activator.getDefault());
	}

}
