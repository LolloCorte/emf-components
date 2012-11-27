package it.rcpvision.emf.components.dsl.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.jvmmodel.EmfComponentsDslJvmModelInferrer
import it.rcpvision.emf.components.dsl.model.ViewSpecification
import it.rcpvision.emf.components.dsl.model.Module

class EmfComponentsDslPluginXmlGenerator implements IGenerator {
	
	@Inject EmfComponentsDslJvmModelInferrer inferrer;

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(module: resource.allContents.toIterable.filter(typeof(Module))) {
			fsa.generateFile(
            	EmfComponentsDslOutputConfigurationProvider::PLUGIN_XML_EMFCOMPONENTS_GEN,
            	EmfComponentsDslOutputConfigurationProvider::PROJECT_ROOT_OUTPUT,
            	module.generatePluginXml)
		}
	}

	def generatePluginXml(Module module) {
		val viewSpecs = module?.views?.views
		if (viewSpecs == null || viewSpecs.empty) {
			return ''''''
		} else {
'''
<extension
      point="org.eclipse.ui.views">
    «viewSpecs.map[generateViewExtensionPoint].join("")»
</extension>
'''.generatePluginXml
		}
	}

	def generateViewExtensionPoint(ViewSpecification viewSpecification) {
'''
  <view
        category="it.rcpvision.emf.components"
        class="«inferrer.executableExtensionFactoryQN(viewSpecification)»:«viewSpecification.type.identifier»"
        id="«viewSpecification.id»"
        name="«viewSpecification.viewName»"
        restorable="true">
  </view>
'''
	}

	def generatePluginXml(CharSequence contents) {
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
	«contents»
</plugin>
'''
	}
}