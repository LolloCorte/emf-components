package it.rcpvision.emf.components.examples.mail.mailsview;

import org.osgi.framework.BundleContext;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.ui.EmfComponentsAbstractActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class MailsviewActivator extends EmfComponentsAbstractActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "it.rcpvision.emf.components.examples.mail.mailsview"; //$NON-NLS-1$

	// The shared instance
	private static MailsviewActivator plugin;

	public MailsviewActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MailsviewActivator getDefault() {
		return plugin;
	}

	/**
	 * Creates the EmfComponentsGuiceModule for this this plugin
	 *
	 * @return the EmfComponentsGuiceModule for this this plugin
	 */
	public EmfComponentsGuiceModule createModule() {
		return new MailsviewGuiceModule(getDefault());
	}
}
