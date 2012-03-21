package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.edit.action.TreeActionBarContributor;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class CDOExamplesModule extends CDOEmfComponentsModule {

	public CDOExamplesModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ResourceLoader> bindResourceLoader() {
		return CDOExamplesResourceLoader.class;
	}

	@Override
	public Class<? extends CDOSessionManager> bindCDOSessionManager() {
		return CDOExamplesSessionManager.class;
	}
	
	@Override
	public Class<? extends TreeActionBarContributor> bindActionBarContributor() {
		return CDOExamplesTreeActionBarContributor.class;
	}

	@Override
	public Class<? extends EStructuralFeaturesProvider> bindEStructuralFeaturesProvider() {
		return CDOExampleEStructuralFeatureProvider.class;
	}
	
	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return CDOExampleEmfSwtBindingFactory.class;
	}
	
}
