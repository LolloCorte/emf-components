package it.rcpvision.emf.components;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EmfComponentsActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "it.rcpvision.emf.components"; //$NON-NLS-1$

	// The shared instance
	private static EmfComponentsActivator plugin;

	/**
	 * The constructor
	 */
	public EmfComponentsActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
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
	public static EmfComponentsActivator getDefault() {
		return plugin;
	}

	public static void log(Status status) {
		getDefault().getLog().log(status);
	}

	public static void logError(String errorMessage) {
		log(new Status(IStatus.ERROR, EmfComponentsActivator.PLUGIN_ID,
				errorMessage));
	}

	public static void log(Throwable exception) {
		log(new Status(IStatus.ERROR, EmfComponentsActivator.PLUGIN_ID,
				exception.getMessage(),
				exception));
	}

}
