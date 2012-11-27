package it.rcpvision.emf.components.dsl.tests

import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.generator.EmfComponentsDslPluginXmlGenerator
import org.junit.Test
import it.rcpvision.emf.components.dsl.model.Module
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import it.rcpvision.emf.components.dsl.generator.EmfComponentsDslOutputConfigurationProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslPluginXmlGeneratorTests extends EmfComponentsDslAbstractTests {

	@Inject EmfComponentsDslPluginXmlGenerator pluginXmlGenerator

	@Test
	def void testEmptyContents() {
		"".assertPluginXmlContents(
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
</plugin>
'''			
		)
	}

	@Test
	def void testViewExtensionPoint() {
'''
<view
      category="it.rcpvision.emf.components"
      class="my.test.ExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeView"
      id="my.view.part"
      name="My View"
      restorable="true">
</view>
'''.assertEqualsStrings(
	pluginXmlGenerator.generateViewExtensionPoint(
		inputs.nonEmptyViewsSpecifications.viewSpecification
	)
)
	}

	@Test
	def void testNoViewSpecification() {
		inputs.emptyModule.module.assertPluginXmlContents("")
	}

	@Test
	def void testSingleViewSpecification() {
		inputs.nonEmptyViewsSpecifications.module.assertPluginXmlContents(
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
	<extension
	      point="org.eclipse.ui.views">
	    <view
	          category="it.rcpvision.emf.components"
	          class="my.test.ExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeView"
	          id="my.view.part"
	          name="My View"
	          restorable="true">
	    </view>
	</extension>
</plugin>
'''
		)
	}

	@Test
	def void testMultipleViewSpecification() {
		inputs.multipleViewsSpecifications.module.assertPluginXmlContents(
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
	<extension
	      point="org.eclipse.ui.views">
	    <view
	          category="it.rcpvision.emf.components"
	          class="my.test.ExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeView"
	          id="my.view.tree.part"
	          name="My Tree View"
	          restorable="true">
	    </view>
	    <view
	          category="it.rcpvision.emf.components"
	          class="my.test.ExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeFormView"
	          id="my.view.form.part"
	          name="My Tree Form View"
	          restorable="true">
	    </view>
	</extension>
</plugin>
'''
		)
	}

	@Test
	def void testPluginXmlGen() {
		inputs.multipleViewsSpecifications.
			assertPluginXmlGeneration(
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
	<extension
	      point="org.eclipse.ui.views">
	    <view
	          category="it.rcpvision.emf.components"
	          class="my.test.ExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeView"
	          id="my.view.tree.part"
	          name="My Tree View"
	          restorable="true">
	    </view>
	    <view
	          category="it.rcpvision.emf.components"
	          class="my.test.ExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeFormView"
	          id="my.view.form.part"
	          name="My Tree Form View"
	          restorable="true">
	    </view>
	</extension>
</plugin>
'''				
			)
	}

	def private void assertPluginXmlGeneration(CharSequence input, CharSequence expected) {
		val access = new InMemoryFileSystemAccess();
		val parsed = input.parseAndAssertNoError
		pluginXmlGenerator.doGenerate(parsed.eResource(), access);
		val entrySet = access.getFiles().entrySet()
		assertEqualsStrings(1, entrySet.size)
		val e = entrySet.head
		val name = e.getKey().substring(
				EmfComponentsDslOutputConfigurationProvider::PROJECT_ROOT_OUTPUT.length());
		assertEqualsStrings(
			EmfComponentsDslOutputConfigurationProvider::PLUGIN_XML_EMFCOMPONENTS_GEN,
				name)
		assertEqualsStrings(expected, e.value)
	}

	def private void assertPluginXmlContents(Module module, CharSequence expected) {
		assertEqualsStrings(expected, pluginXmlGenerator.generatePluginXml(module))
	}

	def private void assertPluginXmlContents(CharSequence contents, CharSequence expected) {
		assertEqualsStrings(expected, pluginXmlGenerator.generatePluginXml(contents))
	}
}