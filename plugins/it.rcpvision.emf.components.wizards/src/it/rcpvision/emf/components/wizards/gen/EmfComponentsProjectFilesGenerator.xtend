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
 it.rcpvision.emf.components,
 it.rcpvision.emf.components.views
Bundle-ActivationPolicy: lazy
Bundle-RequiredExecutionEnvironment: JavaSE-1.6
'''

	def generateBuildProperties(boolean hasPluginXml)
'''
source.. = src/
output.. = bin/
bin.includes = META-INF/,\
               .«IF hasPluginXml»,\
               plugin.xml«ENDIF»
'''

	def generateActivator(String projectName)
'''
package «projectName»;

import org.osgi.framework.BundleContext;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.EmfComponentsAbstractActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends EmfComponentsAbstractActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "«projectName»"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

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

	/**
	 * Creates the EmfComponentsGenericModule for this this plugin
	 *
	 * @return the EmfComponentsGenericModule for this this plugin
	 */
	public EmfComponentsGenericModule createModule() {
		return new EmfComponentsGuiceModule(getDefault());
	}
}
'''
	
	def generateExecutableExtensionFactory(String projectName)
'''
package «projectName»;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;

import com.google.inject.Injector;

public class ExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return Activator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return Activator.getDefault().getInjector();
	}
}
'''

	def generateModule(String projectName, String superClass)
'''
package «projectName»;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import it.rcpvision.emf.components.EmfComponentsGenericModule;

public class EmfComponentsGuiceModule extends «superClass» {

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

}
'''
}