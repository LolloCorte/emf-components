package it.rcpvision.emf.components.examples.library;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import it.rcpvision.emf.components.service.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

public class EmfComponentsGuiceModule extends EmfComponentsGenericModule {

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return CustomLabelProvider.class;
	}

	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return CustomFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends EStructuralFeaturesProvider> bindEStructuralFeaturesProvider() {
		return CustomEStructuralFeaturesProvider.class;
	}

}