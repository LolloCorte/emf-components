package it.rcpvision.cdo04.editor.guice;

import it.rcpvision.cdo04.editor.labeling.DemoBindingFactory;
import it.rcpvision.cdo04.editor.labeling.DemoFeatureLabelProvider;
import it.rcpvision.cdo04.editor.labeling.DemoLabelProvider;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class DemoModule extends CDOEmfComponentsModule {

	public DemoModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return DemoLabelProvider.class;
	}

	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return DemoFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return DemoBindingFactory.class;
	}

	
}