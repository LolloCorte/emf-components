package it.rcpvision.cdo04.editor.initdata;

import my.Container;
import my.MyFactory;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSession;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.junit.BeforeClass;
import org.junit.Test;

public class PopolaCDO {

	private static CDOSession cdoSession;

	@BeforeClass
	public static void init() {
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
		TCPUtil.prepareContainer(IPluginContainer.INSTANCE);

		cdoSession = openSession("demo");

	}
	
	@Test
	public void popola() throws CommitException {
		
		CDOTransaction t = cdoSession.openTransaction();
		CDOResource res = t.getOrCreateResource("/myResource");
		Container container = MyFactory.eINSTANCE.createContainer();
//		Item item = MyFactory.eINSTANCE.createItem();
//		item.setCode("001");
//		container.getListItem().add(item);
		res.getContents().add(container);
		t.commit();
		cdoSession.close();
	}

	private static CDOSession openSession(String repoName) {
		final IConnector connector = (IConnector) IPluginContainer.INSTANCE
				.getElement( //
						"org.eclipse.net4j.connectors", // Product group
						"tcp", // Type
						"localhost"); // Description

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
