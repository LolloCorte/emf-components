package it.rcpvision.emf.components.examples.mail.messageview;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

import com.google.inject.Injector;

public class MessageviewExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MessageviewActivator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return MessageviewActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return MessageviewActivator.getDefault().getInjector();
	}
}
