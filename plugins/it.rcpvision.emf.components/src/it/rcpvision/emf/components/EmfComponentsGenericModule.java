/**
 * 
 */
package it.rcpvision.emf.components;

import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.builders.TableViewerBuilder;
import it.rcpvision.emf.components.builders.TableViewerColumnBuilder;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.edit.ResourceSaveManager;
import it.rcpvision.emf.components.editors.EmfActionBarContributor;
import it.rcpvision.emf.components.factories.EmfActionFactory;
import it.rcpvision.emf.components.factories.EmfViewerFactory;
import it.rcpvision.emf.components.factories.FormFactory;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.guice.AbstractGenericModule;
import it.rcpvision.emf.components.guice.ComposedAdapterFactoryProvider;
import it.rcpvision.emf.components.handlers.ContentOutlineSelectionHandler;
import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.listeners.ResourceDeltaVisitor;
import it.rcpvision.emf.components.menus.StructuredViewerContextMenuManagerCreator;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.ui.IImageHelper;
import it.rcpvision.emf.components.ui.PluginImageHelper;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesColumnProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelFactory;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.TableColumnLabelProvider;
import it.rcpvision.emf.components.util.EmfSelectionHelper;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;

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

	public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
		return PropertyDescriptionProvider.class;
	}

	public Class<? extends FormFeatureLabelFactory> bindFormFeatureLabelFactory() {
		return FormFeatureLabelFactory.class;
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

	public Class<? extends TreeFormFactory> bindTreeFormFactory() {
		return TreeFormFactory.class;
	}

	public Class<? extends FormFactory> bindFormFactory() {
		return FormFactory.class;
	}

	public Class<? extends ViewerInitializer> bindViewerInitializer() {
		return ViewerInitializer.class;
	}

	public Class<? extends FormFeatureControlFactory> bindFormFeatureControlFactory() {
		return FormFeatureControlFactory.class;
	}

	public Class<? extends Provider<ComposedAdapterFactory>> provideComposedAdapterFactory() {
		return ComposedAdapterFactoryProvider.class;
	}

	public Class<? extends StructuredViewerContextMenuManagerCreator> bindStructuredViewerContextMenuManagerCreator() {
		return StructuredViewerContextMenuManagerCreator.class;
	}

	public Class<? extends JfaceProviderFactory> bindJfaceProviderFactory() {
		return JfaceProviderFactory.class;
	}

	public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
		return TableColumnLabelProvider.class;
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

	public Class<? extends EStructuralFeaturesColumnProvider> bindEStructuralFeaturesColumnProvider() {
		return EStructuralFeaturesColumnProvider.class;
	}

	public Class<? extends EmfSelectionHelper> bindEmfSelectionHelper() {
		return EmfSelectionHelper.class;
	}

	public Class<? extends ResourceSaveManager> bindResourceSaveManager() {
		return ResourceSaveManager.class;
	}

	public Diagnostician bindDiagnostician() {
		return Diagnostician.INSTANCE;
	}

	public Class<? extends EmfActionFactory> bindEmfActionFactory() {
		return EmfActionFactory.class;
	}
}
