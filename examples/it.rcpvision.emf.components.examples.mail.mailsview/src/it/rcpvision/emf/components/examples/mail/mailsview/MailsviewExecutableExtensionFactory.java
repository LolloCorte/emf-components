package it.rcpvision.emf.components.examples.mail.mailsview;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

import com.google.inject.Injector;

public class MailsviewExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MailsviewActivator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return MailsviewActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return MailsviewActivator.getDefault().getInjector();
	}
}
