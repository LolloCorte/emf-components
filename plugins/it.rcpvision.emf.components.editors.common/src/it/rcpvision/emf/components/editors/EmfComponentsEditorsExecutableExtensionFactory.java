package it.rcpvision.emf.components.editors;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;

public class EmfComponentsEditorsExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EmfComponentsEditorsActivator.getDefault().getBundle();
	}



	
}
