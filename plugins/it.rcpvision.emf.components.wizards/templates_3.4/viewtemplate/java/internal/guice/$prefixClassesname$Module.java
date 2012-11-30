package $packageName$.internal.guice;


import $packageName$.$prefixClassesname$ViewConfigurator;
import $packageName$.$prefixClassesname$CDOSessionManager;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.view.masterdetail.ViewConfigurator;
import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.ui.provider.FormPropertyDescriptionProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class $prefixClassesname$Module extends CDOEmfComponentsModule {

	public $prefixClassesname$Module(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ViewConfigurator> bindViewConfigurator(){
		return $prefixClassesname$ViewConfigurator.class;
	}
	
	public Class<? extends CDOSessionManager> bindCDOSessionManager(){
		return $prefixClassesname$CDOSessionManager.class;
	}
	
	@Override
	public Class<? extends FeatureLabelProvider> bindFormFeatureLabelProvider() {
		return $prefixClassesname$FeatureLabelProvider.class;
	}
	
	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return $prefixClassesname$BindingFactory.class;
	}
	
}
