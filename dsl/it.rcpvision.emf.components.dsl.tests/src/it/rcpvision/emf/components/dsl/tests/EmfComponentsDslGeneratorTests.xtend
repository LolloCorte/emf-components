package it.rcpvision.emf.components.dsl.tests

import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import it.rcpvision.emf.components.dsl.tests.util.CustomCompilationTestHelper
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslGeneratorTests extends EmfComponentsDslAbstractTests {
 
	@Inject extension CustomCompilationTestHelper

	@Test
	def testEmptyModule() {
		inputs.emptyModule.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TestModule extends EmfComponentsGenericModule {
  public TestModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
''',
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;

public class TestExecutableExtensionFactory extends EmfComponentsExecutableExtensionFactory {
}
'''
		)
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input, CharSequence expectedModule, CharSequence expectedFactory) {
		input.compileAll [
			for (e : allGeneratedResources.entrySet) {
				if (e.key.endsWith("ExecutableExtensionFactory.java") && expectedFactory != null) {
					// check the expected Java code for the factory
					assertEquals(expectedFactory.toString, e.value.toString)
				} else if (e.key.endsWith("Module.java") && expectedModule != null) {
					// check the expected Java code for the module
					assertEquals(expectedModule.toString, e.value.toString)
				} else
					fail("unexpected generated code: " + e.value)
			}
			
			// this will issue Java generation
			compileToJava
		]
	}
}