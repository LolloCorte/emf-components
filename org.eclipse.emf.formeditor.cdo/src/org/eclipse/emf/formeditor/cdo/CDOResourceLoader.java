/**
 * 
 */
package org.eclipse.emf.formeditor.cdo;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSession;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.formeditor.ResourceLoader;
import org.eclipse.emf.formeditor.cdo.util.CDOURIData;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;

/**
 * @author bettini
 * 
 */
public class CDOResourceLoader extends ResourceLoader {

	@Override
	public Resource getResource(ResourceSet resourceSet, URI resourceURI) {
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
		TCPUtil.prepareContainer(IPluginContainer.INSTANCE);

		CDOURIData data = CDOURIData.parse(resourceURI);
		
		String host = data.host;
		String repoName = data.sessionName;
		String resourceName = data.resourceName;

		CDOSession cdoSession = openSession(repoName, host);
		URI uri = CDOURIUtil.createResourceURI(cdoSession, "/" + resourceName);

		System.out.println("URI: " + uri);

		CDOTransaction t = cdoSession.openTransaction();
		t.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
		CDOResource resource = t.getResource(resourceName);

		resourceSet.getResources().add(resource);

		return resource;
	}

	private static CDOSession openSession(String repoName, String host) {
		final IConnector connector = (IConnector) IPluginContainer.INSTANCE
				.getElement( //
						"org.eclipse.net4j.connectors", // Product group
						"tcp", // Type
						host); // Description

		CDOSessionConfiguration config = CDONet4jUtil
				.createSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName(repoName);

		CDOSession session = config.openSession();

		session.addListener(new LifecycleEventAdapter() {
			@Override
			protected void onDeactivated(ILifecycle lifecycle) {
				connector.close();
			}
		});

		return session;
	}
}
