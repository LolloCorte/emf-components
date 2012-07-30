package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.examples.rap.ui.providers.CustomLabelProvider;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;


public class EmfComponentsGuiceModule extends EmfComponentsGenericModule {

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return CustomLabelProvider.class;
	}
}
