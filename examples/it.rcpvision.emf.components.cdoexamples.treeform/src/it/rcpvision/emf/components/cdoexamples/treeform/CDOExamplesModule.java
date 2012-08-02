package it.rcpvision.emf.components.cdoexamples.treeform;

import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.cdo.CDOEmfComponentsModule;
import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.editors.EmfActionBarContributor;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

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
	public Class<? extends EmfActionBarContributor> bindEmfActionBarContributor() {
		return CDOExamplesTreeActionBarContributor.class;
	}

	@Override
	public Class<? extends FeaturesProvider> bindFeaturesProvider() {
		return CDOExampleEStructuralFeatureProvider.class;
	}
	
	@Override
	public Class<? extends FormFeatureControlFactory> bindFormFeatureControlFactory() {
		return CDOExampleFormFeatureControlFactory.class;
	}
	
}
