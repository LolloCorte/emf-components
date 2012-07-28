package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.xtext.service.MinimalModule;
import it.rcpvision.emf.components.xtext.ui.MinimalExecutableExtensionFactory;

import org.osgi.framework.Bundle;

public class ExecutableExtensionFactory extends
		MinimalExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected MinimalModule getModule() {
		return new EmfComponentsGuiceModule(Activator.getDefault());
	}

}
