package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.tests.binding.CustomLibraryBindingFactory;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFormFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryTableColumnLabelProvider;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;
import it.rcpvision.emf.components.ui.provider.TableColumnLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public final class CustomLibraryModule extends
		EmfComponentsGenericModule {
	public CustomLibraryModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return CustomLibraryLabelProvider.class;
	}

	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return CustomLibraryFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends FormFeatureLabelProvider> bindFormFeatureLabelProvider() {
		return CustomLibraryFormFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return CustomLibraryBindingFactory.class;
	}

	@Override
	public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
		return CustomLibraryTableColumnLabelProvider.class;
	}
}