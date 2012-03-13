package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsExecutableExtensionFactory;

import org.osgi.framework.Bundle;

public class CDOExamplesExecutableExtensionFactory extends
		CDOEmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new CDOExamplesModule(Activator.getDefault());
	}

}
