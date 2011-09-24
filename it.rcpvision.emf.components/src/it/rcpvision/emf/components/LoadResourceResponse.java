/**
 * 
 */
package it.rcpvision.emf.components;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author bettini
 * 
 */
public class LoadResourceResponse {

	protected Resource resource;

	protected Exception exception;

	public LoadResourceResponse(Resource resource, Exception exception) {
		super();
		this.resource = resource;
		this.exception = exception;
	}

	public Resource getResource() {
		return resource;
	}

	public Exception getException() {
		return exception;
	}

}
