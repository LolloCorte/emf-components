package it.rcpvision.emf.components.examples.mail.accountsview;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

import com.google.inject.Injector;

public class AccountsviewExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AccountsviewActivator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return AccountsviewActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return AccountsviewActivator.getDefault().getInjector();
	}
}
