/**
 * 
 */
package it.rcpvision.emf.components;

import it.rcpvision.emf.components.binding.FormControlFactory;
import it.rcpvision.emf.components.binding.ProposalCreator;
import it.rcpvision.emf.components.builders.TableViewerBuilder;
import it.rcpvision.emf.components.builders.TableViewerColumnBuilder;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.edit.ResourceSaveManager;
import it.rcpvision.emf.components.edit.provider.InjectableAdapterFactory;
import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;
import it.rcpvision.emf.components.editors.EmfActionBarContributor;
import it.rcpvision.emf.components.factories.EmfActionFactory;
import it.rcpvision.emf.components.factories.FormFactory;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.factories.ViewerFactory;
import it.rcpvision.emf.components.handlers.OutlineSelectionHandler;
import it.rcpvision.emf.components.listeners.ViewerMouseAdapter;
import it.rcpvision.emf.components.menus.ViewerContextMenuFactory;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.runtime.service.AbstractGenericModule;
import it.rcpvision.emf.components.runtime.ui.IImageHelper;
import it.rcpvision.emf.components.runtime.ui.PluginImageHelper;
import it.rcpvision.emf.components.ui.provider.FeaturesColumnProvider;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormPropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.TableColumnLabelProvider;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import it.rcpvision.emf.components.util.EmfSelectionHelper;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.google.inject.Binder;

/**
 * Default Google Guice bindings.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfComponentsGuiceModule extends AbstractGenericModule {

	private final AbstractUIPlugin plugin;

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
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

	public Class<? extends ViewerMouseAdapter> bindViewerMouseAdapter() {
		return ViewerMouseAdapter.class;
	}

	public Class<? extends ViewerLabelProvider> bindViewerLabelProvider() {
		return ViewerLabelProvider.class;
	}

	public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
		return PropertyDescriptionProvider.class;
	}

	public Class<? extends FormPropertyDescriptionProvider> bindFormPropertyDescriptionProvider() {
		return FormPropertyDescriptionProvider.class;
	}

	public Class<? extends OutlineSelectionHandler> bindOutlineSelectionHandler() {
		return OutlineSelectionHandler.class;
	}

	public Class<? extends EditingDomainFactory> bindEditingDomainFactory() {
		return EditingDomainFactory.class;
	}

	public Class<? extends ViewerFactory> bindViewerFactory() {
		return ViewerFactory.class;
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

	public Class<? extends FormControlFactory> bindFormControlFactory() {
		return FormControlFactory.class;
	}

	public Class<? extends ViewerContextMenuFactory> bindViewerContextMenuFactory() {
		return ViewerContextMenuFactory.class;
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

	public Class<? extends FeaturesProvider> bindFeaturesProvider() {
		return FeaturesProvider.class;
	}

	public Class<? extends FeaturesColumnProvider> bindFeaturesColumnProvider() {
		return FeaturesColumnProvider.class;
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

	public Class<? extends EmptyResourceInitializer> bindEmptyResourceInitializer() {
		return EmptyResourceInitializer.class;
	}

	public Class<? extends ViewerContentProvider> bindViewerContentProvider() {
		return ViewerContentProvider.class;
	}

	public Class<? extends ProposalCreator> bindProposalCreator() {
		return ProposalCreator.class;
	}
	
	public Class<? extends AdapterFactory> bindAdapterFactory() {
		return InjectableAdapterFactory.class;
	}

	public ComposedAdapterFactory.Descriptor.Registry bindComposedAdapterFactory$Descriptor$RegistryToInstance() {
		return ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
	}
}
