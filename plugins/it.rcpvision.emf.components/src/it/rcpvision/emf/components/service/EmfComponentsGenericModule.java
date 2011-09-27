/**
 * 
 */
package it.rcpvision.emf.components.service;

import it.rcpvision.emf.components.handlers.ContentOutlineSelectionHandler;
import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.listeners.ResourceDeltaVisitor;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import it.rcpvision.emf.components.views.ComposedAdapterFactoryProvider;
import it.rcpvision.emf.components.views.EmfViewerFactory;
import it.rcpvision.emf.components.views.EmfViewerManager;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
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
public class EmfComponentsGenericModule extends AbstractGenericModule {

	private final AbstractUIPlugin plugin;

	public EmfComponentsGenericModule(AbstractUIPlugin plugin) {
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