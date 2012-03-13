package it.rcpvision.emf.components.cdoexamples.treeform;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;

import it.rcpvision.emf.components.cdo.CDOResourceLoader;

public class CDOExamplesResourceLoader extends CDOResourceLoader {

	@Override
	protected CDOResource getResourceFromTransaction(String resourceName,
			CDOTransaction t) {
		return t.getOrCreateResource(resourceName);
	}

}
