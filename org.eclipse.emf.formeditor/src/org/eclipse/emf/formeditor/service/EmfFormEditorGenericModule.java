/**
 * 
 */
package org.eclipse.emf.formeditor.service;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.formeditor.EditingDomainFactory;
import org.eclipse.emf.formeditor.EditingDomainResourceLoader;
import org.eclipse.emf.formeditor.ResourceLoader;
import org.eclipse.emf.formeditor.handlers.ContentOutlineSelectionHandler;
import org.eclipse.emf.formeditor.listeners.EmfViewerMouseAdapter;
import org.eclipse.emf.formeditor.listeners.ResourceDeltaVisitor;
import org.eclipse.emf.formeditor.ui.binding.EmfSwtBindingFactory;
import org.eclipse.emf.formeditor.ui.provider.CompositeLabelProvider;
import org.eclipse.emf.formeditor.ui.provider.FeatureLabelProvider;
import org.eclipse.emf.formeditor.views.ComposedAdapterFactoryProvider;
import org.eclipse.emf.formeditor.views.EmfViewerFactory;
import org.eclipse.emf.formeditor.views.EmfViewerManager;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Binder;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EmfFormEditorGenericModule extends AbstractGenericModule {

	private final AbstractUIPlugin plugin;

	public EmfFormEditorGenericModule(AbstractUIPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(AbstractUIPlugin.class).toInstance(plugin);
		binder.bind(IDialogSettings.class).toInstance(
				plugin.getDialogSettings());
	}

	public Class<? extends IImageHelper> bindIImageHelper() {
		return PluginImageHelper.class;
	}

	public Class<? extends ResourceLoader> bindResourceLoader() {
		return ResourceLoader.class;
	}

	public Class<? extends EditingDomainResourceLoader> bindEditingDomainResourceLoader() {
		return EditingDomainResourceLoader.class;
	}

	public Class<? extends EmfViewerMouseAdapter> bindEmfViewerMouseAdapter() {
		return EmfViewerMouseAdapter.class;
	}

	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return CompositeLabelProvider.class;
	}

	public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
		return FeatureLabelProvider.class;
	}

	public Class<? extends ContentOutlineSelectionHandler> bindContentOutlineSelectionHandler() {
		return ContentOutlineSelectionHandler.class;
	}

	public Class<? extends EditingDomainFactory> bindEditingDomainFactory() {
		return EditingDomainFactory.class;
	}

	public Class<? extends ResourceDeltaVisitor> bindResourceDeltaVisitor() {
		return ResourceDeltaVisitor.class;
	}

	public Class<? extends EmfViewerFactory> bindEmfViewerFactory() {
		return EmfViewerFactory.class;
	}

	public Class<? extends EmfViewerManager> bindEmfViewerManager() {
		return EmfViewerManager.class;
	}

	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return EmfSwtBindingFactory.class;
	}

	public Class<? extends Provider<ComposedAdapterFactory>> provideComposedAdapterFactory() {
		return ComposedAdapterFactoryProvider.class;
	}
}
