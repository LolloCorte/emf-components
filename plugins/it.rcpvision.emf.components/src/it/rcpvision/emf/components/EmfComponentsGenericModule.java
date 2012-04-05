/**
 * 
 */
package it.rcpvision.emf.components;

import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.edit.ResourceSaveManager;
import it.rcpvision.emf.components.editors.EmfActionBarContributor;
import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.factories.EmfFormCompositeFactory;
import it.rcpvision.emf.components.factories.EmfViewerFactory;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.guice.ComposedAdapterFactoryProvider;
import it.rcpvision.emf.components.handlers.ContentOutlineSelectionHandler;
import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.listeners.ResourceDeltaVisitor;
import it.rcpvision.emf.components.menus.StructuredViewerContextMenuManagerCreator;
import it.rcpvision.emf.components.outline.EmfEditorContentOutlineFactory;
import it.rcpvision.emf.components.outline.EmfEditorContentOutlinePage;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeatureColumnProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;
import it.rcpvision.emf.components.util.EmfSelectionHelper;
import it.rcpvision.emf.components.views.EObjectManager;
import it.rcpvision.emf.components.views.TableViewerBuilder;
import it.rcpvision.emf.components.views.TableViewerColumnBuilder;
import it.rcpvision.emf.components.views.ViewerInitializer;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Binder;
import com.google.inject.Provider;

/**
 * Default Google Guice bindings.
 * 
 * @author Lorenzo Bettini
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

	public Class<? extends FormFeatureLabelProvider> bindFormFeatureLabelProvider() {
		return FormFeatureLabelProvider.class;
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

	public Class<? extends EmfCompositeFactory> bindEmfCompositeFactory() {
		return EmfCompositeFactory.class;
	}

	public Class<? extends EmfFormCompositeFactory> bindEmfFormCompositeFactory() {
		return EmfFormCompositeFactory.class;
	}

	public Class<? extends ViewerInitializer> bindViewerInitializer() {
		return ViewerInitializer.class;
	}

	public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
		return EmfSwtBindingFactory.class;
	}

	public Class<? extends Provider<ComposedAdapterFactory>> provideComposedAdapterFactory() {
		return ComposedAdapterFactoryProvider.class;
	}

	public Class<? extends StructuredViewerContextMenuManagerCreator> bindStructuredViewerContextMenuManagerCreator() {
		return StructuredViewerContextMenuManagerCreator.class;
	}

	public Class<? extends EmfEditorContentOutlinePage> bindEmfEditorContentOutlinePage() {
		return EmfEditorContentOutlinePage.class;
	}

	public Class<? extends EmfEditorContentOutlineFactory> bindEmfEditorContentOutlineFactory() {
		return EmfEditorContentOutlineFactory.class;
	}

	public Class<? extends EObjectManager> bindEObjectManager() {
		return EObjectManager.class;
	}

	public Class<? extends JfaceProviderFactory> bindJfaceProviderFactory() {
		return JfaceProviderFactory.class;
	}

	public Class<? extends EStructuralFeatureColumnProvider> bindEStructuralFeatureColumnProvider() {
		return EStructuralFeatureColumnProvider.class;
	}

	public Class<? extends TableViewerBuilder> bindTableViewerBuilder() {
		return TableViewerBuilder.class;
	}

	public Class<? extends TableViewerColumnBuilder> bindTableViewerColumnBuilder() {
		return TableViewerColumnBuilder.class;
	}

	public Class<? extends EmfActionBarContributor> bindEmfActionBarContributor() {
		return EmfActionBarContributor.class;
	}

	public Class<? extends EditingDomainFinder> bindEditingDomainFinder() {
		return EditingDomainFinder.class;
	}

	public Class<? extends EStructuralFeaturesProvider> bindEStructuralFeaturesProvider() {
		return EStructuralFeaturesProvider.class;
	}

	public Class<? extends EmfSelectionHelper> bindEmfSelectionHelper() {
		return EmfSelectionHelper.class;
	}
	
	public Class<? extends ResourceSaveManager> bindResourceSaveManager() {
		return ResourceSaveManager.class;
	}
}
