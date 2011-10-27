/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
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
	protected Provider<CompositeLabelProvider> compositeLabelProviderProvider;

	public void initialize(StructuredViewer viewer, URI resourceURI) {
		initialize(viewer, loadResource(resourceURI));
	}

	public void initialize(StructuredViewer viewer,
			AdapterFactoryEditingDomain editingDomain) {
		AdapterFactory editingDomainAdapterFactory = editingDomain
				.getAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(
				editingDomainAdapterFactory));
		CompositeLabelProvider compositeLabelProvider = compositeLabelProviderProvider
				.get();
		compositeLabelProvider
				.setDelegateLabelProvider(new AdapterFactoryLabelProvider(
						editingDomainAdapterFactory));
		viewer.setLabelProvider(compositeLabelProvider);
		viewer.setInput(editingDomain.getResourceSet());
	}

	protected AdapterFactoryEditingDomain loadResource(URI resourceURI) {
		AdapterFactoryEditingDomain editingDomain = editingDomainFactory
				.create();
		resourceLoader.getResource(editingDomain, resourceURI);
		return editingDomain;
	}

}
