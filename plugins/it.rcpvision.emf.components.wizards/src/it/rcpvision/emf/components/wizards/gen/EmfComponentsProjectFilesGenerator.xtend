package it.rcpvision.emf.components.wizards.gen

class EmfComponentsProjectFilesGenerator {

	def generateManifest(String projectName)
'''
Manifest-Version: 1.0
Bundle-ManifestVersion: 2
Bundle-Name: «projectName»
Bundle-SymbolicName: «projectName»;singleton:=true
Bundle-Version: 1.0.0.qualifier
Bundle-Activator: «projectName».Activator
Require-Bundle: org.eclipse.ui,
 org.eclipse.core.runtime,
 it.rcpvision.emf.components
Bundle-ActivationPolicy: lazy
Bundle-RequiredExecutionEnvironment: JavaSE-1.6
'''

	def generateBuildProperties()
'''
source.. = src/
output.. = bin/
bin.includes = META-INF/,\
               .
'''

	def generateActivator(String projectName)
'''
package «projectName»;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "«projectName»"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
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
	public static Activator getDefault() {
		return plugin;
	}

}
'''
	
	def generateExecutableExtensionFactory(String projectName)
'''
package «projectName»;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;

public class ExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsGuiceModule(Activator.getDefault());
	}

}
'''

	def generateModule(String projectName)
'''
package «projectName»;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import it.rcpvision.emf.components.EmfComponentsGenericModule;

public class EmfComponentsGuiceModule extends EmfComponentsGenericModule {

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

}
'''
}