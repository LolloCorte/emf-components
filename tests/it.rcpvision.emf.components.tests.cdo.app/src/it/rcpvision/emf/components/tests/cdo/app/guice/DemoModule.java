package it.rcpvision.emf.components.tests.cdo.app.guice;


import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class DemoModule extends CDOEmfComponentsModule {

	public DemoModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

//	@Override
//	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
//		return DemoLabelProvider.class;
//	}
//
//	@Override
//	public Class<? extends FormFeatureLabelProvider> bindFormFeatureLabelProvider() {
//		return DemoFeatureLabelProvider.class;
//	}
//
//	@Override
//	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
//		return DemoBindingFactory.class;
//	}

	
}
