package org.eclipse.emf.formeditor.cdo.examples.rcp;

import library.Book;
import library.Library;
import library.LibraryFactory;

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
		CDOResource res = t.getOrCreateResource("/res2");
		Library library = LibraryFactory.eINSTANCE.createLibrary();
		Book book = LibraryFactory.eINSTANCE.createBook();
		book.setTitle("aaaa");
		library.getListBook().add(book);
		res.getContents().add(library);
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

//		PasswordCredentialsProvider credentialsProvider = new PasswordCredentialsProvider(
//				"user1", "pwd1");
//		// PasswordCredentialsProvider credentialsProvider = new
//		// PasswordCredentialsProvider(ResourceActivator.getDefault().username,
//		// ResourceActivator.getDefault().password);
//		config.getAuthenticator().setCredentialsProvider(credentialsProvider);

		CDOSession session = config.openSession();
		// view = session.openView();

		session.addListener(new LifecycleEventAdapter() {
			@Override
			protected void onDeactivated(ILifecycle lifecycle) {
				connector.close();
			}
		});

		return session;
	}

}
