package it.rcpvision.emf.components.generator.common

class EmfComponentsProjectFilesGenerator {

	def prefixFromProject(String projectName) {
		var prefixName = projectName
		val dotIndex = projectName.lastIndexOf(".")
		if (dotIndex > 0)
			prefixName = projectName.substring(dotIndex+1)
		return prefixName.toFirstUpper
	}

	def activatorName(String projectName)
	'''«projectName.prefixFromProject»Activator'''

	def moduleName(String projectName)
	'''«projectName.prefixFromProject»GuiceModule'''

	def extFactoryName(String projectName)
	'''«projectName.prefixFromProject»ExecutableExtensionFactory'''

	def generateManifest(String projectName)
'''
Manifest-Version: 1.0
Bundle-ManifestVersion: 2
Bundle-Name: «projectName»
Bundle-SymbolicName: «projectName»;singleton:=true
Bundle-Version: 1.0.0.qualifier
Bundle-Activator: «projectName».«projectName.activatorName»
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

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.ui.EmfComponentsAbstractActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class «projectName.activatorName» extends EmfComponentsAbstractActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "«projectName»"; //$NON-NLS-1$

	// The shared instance
	private static «projectName.activatorName» plugin;

	public «projectName.activatorName»() {
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
	public static «projectName.activatorName» getDefault() {
		return plugin;
	}

	/**
	 * Creates the EmfComponentsGuiceModule for this this plugin
	 *
	 * @return the EmfComponentsGuiceModule for this this plugin
	 */
	public EmfComponentsGuiceModule createModule() {
		return new «projectName.moduleName»(getDefault());
	}
}
'''
	
	def generateExecutableExtensionFactory(String projectName)
'''
package «projectName»;

import org.osgi.framework.Bundle;

import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

import com.google.inject.Injector;

public class «projectName.extFactoryName» extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return «projectName.activatorName».getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return «projectName.activatorName».getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return «projectName.activatorName».getDefault().getInjector();
	}
}
'''

	def generateModule(String projectName, String superClass)
'''
package «projectName»;

import org.eclipse.ui.plugin.AbstractUIPlugin;

«IF superClass == "EmfComponentsGuiceModule"»
import it.rcpvision.emf.components.EmfComponentsGuiceModule;
«ENDIF»

public class «projectName.moduleName» extends «superClass» {

	public «projectName.moduleName»(AbstractUIPlugin plugin) {
		super(plugin);
	}

}
'''
}
