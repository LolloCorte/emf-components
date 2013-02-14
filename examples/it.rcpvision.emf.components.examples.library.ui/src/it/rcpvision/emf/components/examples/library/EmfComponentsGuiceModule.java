package it.rcpvision.emf.components.examples.library;

import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModule extends it.rcpvision.emf.components.EmfComponentsGuiceModule {

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ILabelProvider> bindILabelProvider() {
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
