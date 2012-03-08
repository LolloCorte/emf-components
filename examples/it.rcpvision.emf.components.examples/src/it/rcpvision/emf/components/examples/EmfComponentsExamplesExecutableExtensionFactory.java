package it.rcpvision.emf.components.examples;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;

import org.osgi.framework.Bundle;

public class EmfComponentsExamplesExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsExamplesModule(Activator.getDefault());
	}

}
