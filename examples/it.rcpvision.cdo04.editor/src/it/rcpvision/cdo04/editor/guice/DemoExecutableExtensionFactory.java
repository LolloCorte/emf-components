package it.rcpvision.cdo04.editor.guice;

import it.rcpvision.cdo04.editor.Activator;
import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.service.EmfComponentsGenericModule;

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
