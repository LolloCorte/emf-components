/**
 * 
 */
package org.eclipse.emf.formeditor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author bettini
 *
 */
public class ResourceLoader {

	public Resource getResource(ResourceSet resourceSet, URI resourceURI) {
		return resourceSet.getResource(resourceURI, true);
	}

}
