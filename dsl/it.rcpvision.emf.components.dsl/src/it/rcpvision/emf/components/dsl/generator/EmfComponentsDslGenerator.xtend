package it.rcpvision.emf.components.dsl.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

/**
 * This generator calls the standard JvmModelGenerator and
 * the generator for plugin.xml_gen
 */
class EmfComponentsDslGenerator implements IGenerator {

	@Inject JvmModelGenerator jvmModelGenerator
	
	@Inject EmfComponentsDslPluginXmlGenerator pluginXmlGenerator

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		jvmModelGenerator.doGenerate(input, fsa);
		pluginXmlGenerator.doGenerate(input, fsa);
	}
	
}