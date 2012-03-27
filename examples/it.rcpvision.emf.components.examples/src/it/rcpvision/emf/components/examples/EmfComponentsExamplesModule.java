package it.rcpvision.emf.components.examples;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.views.TableViewerColumnBuilder;
import it.rcpvision.emf.components.views.TableViewerEditableColumnBuilder;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsExamplesModule extends EmfComponentsGenericModule {

	public EmfComponentsExamplesModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends TableViewerColumnBuilder> bindTableViewerColumnBuilder() {
		return TableViewerEditableColumnBuilder.class;
	}


}
