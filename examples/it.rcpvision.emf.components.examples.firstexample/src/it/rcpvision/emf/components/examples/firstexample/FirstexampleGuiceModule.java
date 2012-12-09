package it.rcpvision.emf.components.examples.firstexample;

import it.rcpvision.emf.components.resource.EmptyResourceInitializer;

import org.eclipse.ui.plugin.AbstractUIPlugin;


public class FirstexampleGuiceModule extends EmfComponentsGuiceModuleGen {

	public FirstexampleGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends EmptyResourceInitializer> bindEmptyResourceInitializer() {
		return LibraryEmptyResourceInitializer.class;
	}
}
