package it.rcpvision.emf.components.tests.cdo.view.guice;

import it.rcpvision.emf.components.cdo.CDOSessionManager;

import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;

public class DemoCDOSessionManager extends CDOSessionManager {

	
	static CDOSession session;

	static {
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
		TCPUtil.prepareContainer(IPluginContainer.INSTANCE);

		// OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
		// OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
		// OMPlatform.INSTANCE.setDebugging(true);
		session = openSession();
	}
	
	public CDOSession getSession(EObject obj) {
		// TODO Auto-generated method stub
		return session;
	}

	private static CDOSession openSession() {
		return openSession("demo");
	}

	private static CDOSession openSession(String repoName) {
		
		String server = "localhost";// buildmachine,localhost
//		if (CounterVisionActivator.getDefault()!=null) {
//			IPreferenceStore pref = CounterVisionActivator.getDefault().getPreferenceStore();
//			server = pref.getString(WorkbenchPreferencePage.PREF_CDO_SERVER_ADDRESS);
//		}
		final IConnector connector = (IConnector) IPluginContainer.INSTANCE
				.getElement( //
						"org.eclipse.net4j.connectors", // Product group
						"tcp", // Type
						server); 

		CDOSessionConfiguration config = CDONet4jUtil.createSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName(repoName);

		PasswordCredentialsProvider credentialsProvider = new PasswordCredentialsProvider("user1", "pwd1");
//		PasswordCredentialsProvider credentialsProvider = new PasswordCredentialsProvider(ResourceActivator.getDefault().username, ResourceActivator.getDefault().password);
		config.getAuthenticator().setCredentialsProvider(credentialsProvider);

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
