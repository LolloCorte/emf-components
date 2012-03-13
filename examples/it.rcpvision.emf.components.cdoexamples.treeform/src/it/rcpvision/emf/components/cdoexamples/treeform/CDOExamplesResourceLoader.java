package it.rcpvision.emf.components.cdoexamples.treeform;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;

import com.google.inject.Inject;

import it.rcpvision.emf.components.cdo.CDOResourceLoader;

public class CDOExamplesResourceLoader extends CDOResourceLoader {

	@Inject
	protected EmptyResourceInitializer emptyResourceInitializer;

	@Override
	protected CDOResource getResourceFromTransaction(String resourceName,
			CDOTransaction t) {
		CDOResource resource = t.getOrCreateResource(resourceName);
		emptyResourceInitializer.initializeResource(resource);
		return resource;
	}

}
