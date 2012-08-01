package it.rcpvision.emf.components.examples;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.GuiceModule;

import org.osgi.framework.Bundle;

public class EmfComponentsExamplesExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected GuiceModule getModule() {
		return new EmfComponentsExamplesModule(Activator.getDefault());
	}

}
