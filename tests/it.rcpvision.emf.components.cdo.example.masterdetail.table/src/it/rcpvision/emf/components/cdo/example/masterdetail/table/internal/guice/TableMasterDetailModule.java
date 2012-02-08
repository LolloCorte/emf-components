package it.rcpvision.emf.components.cdo.example.masterdetail.table.internal.guice;


import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.cdo.example.masterdetail.table.TableMasterDetailCDOSessionManager;
import it.rcpvision.emf.components.cdo.example.masterdetail.table.TableMasterDetailViewConfigurator;
import it.rcpvision.emf.components.view.masterdetail.TableViewConfigurator;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TableMasterDetailModule extends CDOEmfComponentsModule {

	public TableMasterDetailModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends TableViewConfigurator> bindViewConfigurator(){
		return TableMasterDetailViewConfigurator.class;
	}
	
	public Class<? extends CDOSessionManager> bindCDOSessionManager(){
		return TableMasterDetailCDOSessionManager.class;
	}
	
	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return TableMasterDetailFeatureLabelProvider.class;
	}
	
	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return TableMasterDetailBindingFactory.class;
	}
	
}
