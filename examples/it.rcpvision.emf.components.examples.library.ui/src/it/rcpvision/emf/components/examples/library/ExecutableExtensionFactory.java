package it.rcpvision.emf.components.examples.library;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;

public class ExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsGuiceModule(Activator.getDefault());
	}

}
