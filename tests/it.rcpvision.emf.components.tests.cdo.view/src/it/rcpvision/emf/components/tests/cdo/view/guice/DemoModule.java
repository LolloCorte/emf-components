package it.rcpvision.emf.components.tests.cdo.view.guice;


import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

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
//	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
//		return DemoFeatureLabelProvider.class;
//	}
//
//	@Override
//	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
//		return DemoBindingFactory.class;
//	}
	
	public Class<? extends CDOSessionManager> bindCDOSessionManager(){
		return DemoCDOSessionManager.class;
	}
	
	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return DemoFeatureLabelProvider.class;
	}

	
}
