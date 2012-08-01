package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.GuiceModule;
import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.tests.binding.CustomLibraryBindingFactory;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFormFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryTableColumnLabelProvider;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelFactory;
import it.rcpvision.emf.components.ui.provider.TableColumnLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public final class CustomLibraryModule extends
		GuiceModule {
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
	public Class<? extends FormFeatureLabelFactory> bindFormFeatureLabelFactory() {
		return CustomLibraryFormFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends FormFeatureControlFactory> bindFormFeatureControlFactory() {
		return CustomLibraryBindingFactory.class;
	}

	@Override
	public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
		return CustomLibraryTableColumnLabelProvider.class;
	}
}