package it.rcpvision.emf.components.dsl.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.jvmmodel.EmfComponentsDslJvmModelInferrer
import it.rcpvision.emf.components.dsl.model.ViewSpecification
import it.rcpvision.emf.components.dsl.model.Module
import it.rcpvision.emf.components.dsl.model.PartSpecification

class EmfComponentsDslPluginXmlGenerator implements IGenerator {
	
	@Inject EmfComponentsDslJvmModelInferrer inferrer;

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(module: resource.allContents.toIterable.filter(typeof(Module))) {
			val contents = module.generatePluginXml
			if (contents?.length > 0)
				fsa.generateFile(
	            	EmfComponentsDslOutputConfigurationProvider::PLUGIN_XML_EMFCOMPONENTS_GEN,
	            	contents)
		}
	}

	def generatePluginXml(Module module) {
		val partSpecs = module?.parts
		if (partSpecs == null || partSpecs.empty) {
			return ''''''
		} else {
'''
<extension
      point="org.eclipse.ui.views">
    «partSpecs.map[generateExtensionPoint].join("")»
</extension>
'''.generatePluginXml
		}
	}

	def dispatch generateExtensionPoint(PartSpecification partSpecification) {
		
	}

	def dispatch generateExtensionPoint(ViewSpecification viewSpecification) {
'''
<view
      category="«if (viewSpecification.category == null || viewSpecification.category.empty)
  	"it.rcpvision.emf.components" else
    viewSpecification.category»"
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