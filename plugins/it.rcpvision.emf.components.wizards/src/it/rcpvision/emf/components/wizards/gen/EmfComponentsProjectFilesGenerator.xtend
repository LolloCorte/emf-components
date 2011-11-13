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
}