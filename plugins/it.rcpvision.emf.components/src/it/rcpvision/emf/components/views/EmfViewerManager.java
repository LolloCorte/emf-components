/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Manager for viewers for EMF resources.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfViewerManager {

	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	@Inject
	protected EditingDomainFactory editingDomainFactory;

	@Inject
	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;

	@Inject
	protected Provider<CompositeLabelProvider> compositeLabelProviderProvider;

	public void initialize(StructuredViewer viewer, URI resourceURI) {
		initialize(viewer, loadResource(resourceURI));
	}

	public void initialize(StructuredViewer viewer, Resource resource) {
		initialize(viewer, resource, createComposedAdapterFactory());
	}

	public void initialize(StructuredViewer viewer, EObject eObject) {
		initialize(viewer, eObject, createComposedAdapterFactory());
	}

	protected ComposedAdapterFactory createComposedAdapterFactory() {
		return composedAdapterFactoryProvider.get();
	}

	public void initialize(StructuredViewer viewer,
			AdapterFactoryEditingDomain editingDomain) {
		ResourceSet resourceSet = editingDomain.getResourceSet();
		AdapterFactory editingDomainAdapterFactory = editingDomain
				.getAdapterFactory();
		initialize(viewer, resourceSet, editingDomainAdapterFactory);
	}

	/**
	 * @param viewer
	 * @param input
	 * @param adapterFactory
	 */
	public void initialize(StructuredViewer viewer, Object input,
			AdapterFactory adapterFactory) {
		viewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
		CompositeLabelProvider compositeLabelProvider = compositeLabelProviderProvider
				.get();
		compositeLabelProvider
				.setDelegateLabelProvider(new AdapterFactoryLabelProvider(
						adapterFactory));
		viewer.setLabelProvider(compositeLabelProvider);
		viewer.setInput(input);
	}

	protected AdapterFactoryEditingDomain loadResource(URI resourceURI) {
		AdapterFactoryEditingDomain editingDomain = editingDomainFactory
				.create();
		resourceLoader.getResource(editingDomain, resourceURI);
		return editingDomain;
	}

}
