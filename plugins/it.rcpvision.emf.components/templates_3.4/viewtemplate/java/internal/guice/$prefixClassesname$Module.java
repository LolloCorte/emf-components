package $packageName$.internal.guice;


import $packageName$.$prefixClassesname$ViewConfigurator;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.ViewConfigurator;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class $prefixClassesname$Module extends CDOEmfComponentsModule {

	public $prefixClassesname$Module(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ViewConfigurator> bindViewConfigurator(){
		return $prefixClassesname$ViewConfigurator.class;
	}
	
	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return $prefixClassesname$FeatureLabelProvider.class;
	}
	
	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return $prefixClassesname$BindingFactory.class;
	}
	
}
