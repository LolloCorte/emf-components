/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
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
	protected JfaceProviderFactory jfaceProviderFactory;

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
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				adapterFactory);
		initialize(viewer, input, contentProvider,
				jfaceProviderFactory
						.createLabelProvider(new AdapterFactoryLabelProvider(
								adapterFactory)));
	}

	/**
	 * @param viewer
	 * @param input
	 * @param contentProvider
	 * @param labelProvider
	 *            can be null (in that case it is not set)
	 */
	public void initialize(StructuredViewer viewer, Object input,
			IStructuredContentProvider contentProvider,
			IBaseLabelProvider labelProvider) {
		viewer.setContentProvider(contentProvider);
		if (labelProvider != null)
			viewer.setLabelProvider(labelProvider);
		viewer.setInput(input);
	}

	protected AdapterFactoryEditingDomain loadResource(URI resourceURI) {
		AdapterFactoryEditingDomain editingDomain = editingDomainFactory
				.create();
		resourceLoader.getResource(editingDomain, resourceURI);
		return editingDomain;
	}

}
