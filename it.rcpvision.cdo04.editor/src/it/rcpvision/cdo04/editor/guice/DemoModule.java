package it.rcpvision.cdo04.editor.guice;

import it.rcpvision.cdo04.editor.labeling.DemoBindingFactory;
import it.rcpvision.cdo04.editor.labeling.DemoFeatureLabelProvider;
import it.rcpvision.cdo04.editor.labeling.DemoLabelProvider;

import org.eclipse.emf.formeditor.cdo.CDOEmfFormEditorModule;
import org.eclipse.emf.formeditor.ui.binding.EmfSwtBindingFactory;
import org.eclipse.emf.formeditor.ui.provider.CompositeLabelProvider;
import org.eclipse.emf.formeditor.ui.provider.FeatureLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class DemoModule extends CDOEmfFormEditorModule {

	public DemoModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return DemoLabelProvider.class;
	}

	@Override
	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return DemoFeatureLabelProvider.class;
	}

	@Override
	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return DemoBindingFactory.class;
	}

	
}
