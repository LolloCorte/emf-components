/**
 * 
 */
package it.rcpvision.emf.components;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import com.google.inject.Inject;

/**
 * Tries to load the resource using the resource set of the editing domain and
 * returns a {@link LoadResourceResponse}.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EditingDomainResourceLoader {

	@Inject
	protected ResourceLoader resourceLoader;

	public LoadResourceResponse getResource(AdapterFactoryEditingDomain editingDomain,
			URI resourceURI) {
		Resource resource = null;
		Exception exception = null;
		try {
			// Load the resource through the editing domain.
			resource = resourceLoader.getResource(
					editingDomain.getResourceSet(), resourceURI);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}

		return new LoadResourceResponse(resource, exception);
	}

}
