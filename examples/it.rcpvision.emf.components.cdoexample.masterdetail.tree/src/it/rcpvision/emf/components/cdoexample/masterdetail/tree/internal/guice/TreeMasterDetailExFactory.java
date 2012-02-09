package it.rcpvision.emf.components.cdoexample.masterdetail.tree.internal.guice;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.cdoexample.masterdetail.tree.Activator;
import it.rcpvision.emf.components.service.EmfComponentsGenericModule;

import org.osgi.framework.Bundle;

public class TreeMasterDetailExFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new TreeMasterDetailModule(Activator.getDefault());
	}

}