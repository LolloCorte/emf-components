package it.rcpvision.cdo04.editor.guice;

import it.rcpvision.cdo04.editor.Activator;
import it.rcpvision.emf.components.EmfFormEditorExecutableExtensionFactory;
import it.rcpvision.emf.components.service.EmfFormEditorGenericModule;

import org.osgi.framework.Bundle;

public class DemoExecutableExtensionFactory extends
		EmfFormEditorExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfFormEditorGenericModule getModule() {
		return new DemoModule(Activator.getDefault());
	}

	
}
