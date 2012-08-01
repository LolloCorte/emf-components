/**
 * 
 */
package it.rcpvision.emf.components.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

/**
 * @author bettini
 *
 */
public class ResourceLoader {
	
	@Inject private EmptyResourceInitializer emptyResourceInitializer;

	public Resource getResource(ResourceSet resourceSet, URI resourceURI) {
		Resource resource = resourceSet.getResource(resourceURI, true);
		if (resource.getContents().isEmpty())
			emptyResourceInitializer.initialize(resource);
		return resource;
	}

}
