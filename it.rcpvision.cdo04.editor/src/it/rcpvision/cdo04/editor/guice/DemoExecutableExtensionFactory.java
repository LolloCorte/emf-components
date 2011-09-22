package it.rcpvision.cdo04.editor.guice;

import it.rcpvision.cdo04.editor.Activator;

import org.eclipse.emf.formeditor.EmfFormEditorExecutableExtensionFactory;
import org.eclipse.emf.formeditor.service.EmfFormEditorGenericModule;
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
