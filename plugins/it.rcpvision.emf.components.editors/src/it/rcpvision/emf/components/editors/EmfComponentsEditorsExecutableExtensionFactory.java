package it.rcpvision.emf.components.editors;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;

public class EmfComponentsEditorsExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EmfComponentsEditorsActivator.getDefault().getBundle();
	}



	
}
