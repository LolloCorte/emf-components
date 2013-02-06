package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.binding.FormControlFactory;
import it.rcpvision.emf.components.binding.ProposalCreator;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;
import it.rcpvision.emf.components.tests.binding.CustomLibraryFormControlFactory;
import it.rcpvision.emf.components.tests.binding.CustomLibraryProposalCreator;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFormFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryTableColumnLabelProvider;
import it.rcpvision.emf.components.tests.providers.TestFeaturesColumnProvider;
import it.rcpvision.emf.components.tests.providers.TestFeaturesProvider;
import it.rcpvision.emf.components.tests.resource.TestEmptyLibraryResourceInitializer;
import it.rcpvision.emf.components.ui.provider.FeaturesColumnProvider;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.FormPropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.TableColumnLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class CustomLibraryModule extends EmfComponentsGuiceModule {
	public CustomLibraryModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ViewerLabelProvider> bindViewerLabelProvider() {
		return CustomLibraryLabelProvider.class;
	}

	@Override
	public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
		return CustomLibraryFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends FormPropertyDescriptionProvider> bindFormPropertyDescriptionProvider() {
		return CustomLibraryFormFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends FormControlFactory> bindFormControlFactory() {
		return CustomLibraryFormControlFactory.class;
	}

	@Override
	public Class<? extends ProposalCreator> bindProposalCreator() {
		return CustomLibraryProposalCreator.class;
	}

	@Override
	public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
		return CustomLibraryTableColumnLabelProvider.class;
	}

	@Override
	public Class<? extends EmptyResourceInitializer> bindEmptyResourceInitializer() {
		return TestEmptyLibraryResourceInitializer.class;
	}

	@Override
	public Class<? extends FeaturesProvider> bindFeaturesProvider() {
		return TestFeaturesProvider.class;
	}

	@Override
	public Class<? extends FeaturesColumnProvider> bindFeaturesColumnProvider() {
		return TestFeaturesColumnProvider.class;
	}
}