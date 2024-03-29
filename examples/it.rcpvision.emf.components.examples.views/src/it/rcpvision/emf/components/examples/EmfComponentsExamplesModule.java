package it.rcpvision.emf.components.examples;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.builders.TableViewerColumnBuilder;
import it.rcpvision.emf.components.builders.TableViewerEditableColumnBuilder;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsExamplesModule extends EmfComponentsGuiceModule {

	public EmfComponentsExamplesModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends TableViewerColumnBuilder> bindTableViewerColumnBuilder() {
		return TableViewerEditableColumnBuilder.class;
	}


}
