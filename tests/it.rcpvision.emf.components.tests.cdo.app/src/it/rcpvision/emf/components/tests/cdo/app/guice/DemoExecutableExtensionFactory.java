package it.rcpvision.emf.components.tests.cdo.app.guice;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.service.EmfComponentsGenericModule;
import it.rcpvision.emf.components.tests.cdo.app.Activator;

import org.osgi.framework.Bundle;

public class DemoExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new DemoModule(Activator.getDefault());
	}

	
}
