package it.rcpvision.emf.components.cdoexample.masterdetail.tree.internal.guice;


import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.cdoexample.masterdetail.tree.TreeMasterDetailCDOSessionManager;
import it.rcpvision.emf.components.cdoexample.masterdetail.tree.TreeMasterDetailViewConfigurator;
import it.rcpvision.emf.components.view.masterdetail.TreeViewConfigurator;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TreeMasterDetailModule extends CDOEmfComponentsModule {

	public TreeMasterDetailModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends TreeViewConfigurator> bindViewConfigurator(){
		return TreeMasterDetailViewConfigurator.class;
	}
	
	public Class<? extends CDOSessionManager> bindCDOSessionManager(){
		return TreeMasterDetailCDOSessionManager.class;
	}
	
	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return TreeMasterDetailFeatLblProvider.class;
	}
	
	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return TreeMasterDetailBindingFactory.class;
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return TreeMasterDetailLabelProvider.class;
	}
	
	
}
