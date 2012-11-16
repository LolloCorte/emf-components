package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;
import it.rcpvision.emf.components.tests.providers.CustomLibraryViewerContentProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public final class CustomContentProviderLibraryModule extends
		CustomLibraryModule {
	public CustomContentProviderLibraryModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ViewerContentProvider> bindViewerContentProvider() {
		return CustomLibraryViewerContentProvider.class;
	}
}