package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.GuiceModule;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsExtensionFactory;

import org.osgi.framework.Bundle;

public class CDOExamplesExecutableExtensionFactory extends
		CDOEmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected GuiceModule getModule() {
		return new CDOExamplesModule(Activator.getDefault());
	}

}
