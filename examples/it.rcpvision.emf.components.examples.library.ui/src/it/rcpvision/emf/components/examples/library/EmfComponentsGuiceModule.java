package it.rcpvision.emf.components.examples.library;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;

public class EmfComponentsGuiceModule extends it.rcpvision.emf.components.GuiceModule {

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ViewerLabelProvider> bindViewerLabelProvider() {
		return CustomLabelProvider.class;
	}

	@Override
	public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
		return CustomFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends FeaturesProvider> bindFeaturesProvider() {
		return CustomEStructuralFeaturesProvider.class;
	}

}
