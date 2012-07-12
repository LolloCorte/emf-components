package it.rcpvision.emf.components.dsl.tests

import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import it.rcpvision.emf.components.dsl.jvmmodel.EmfComponentsDslJvmModelInferrer
import com.google.inject.Inject



@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslJvmModelInferrerTests extends EmfComponentsDslAbstractTests {
 
	@Inject EmfComponentsDslJvmModelInferrer inferrer
 
    @Test
	def void testEmptyModule() {
        inputs.emptyModule.parseAndAssertNoError
    }

	@Test
	def void testModuleName() {
        "my.empty.EmfComponentsGuiceModuleGen".assertEqualsStrings(
        	inferrer.moduleQN(inputs.emptyModule.module)
        )
    }

	@Test
	def void testExecutableExtensionFactoryName() {
        "my.empty.ExecutableExtensionFactory".assertEqualsStrings(
        	inferrer.executableExtensionFactoryQN(inputs.emptyModule.module)
        )
    }

	@Test
	def void testActivatorName() {
        "my.empty.Activator".assertEqualsStrings(
        	inferrer.activatorQN(inputs.emptyModule.module)
        )
    }
	 
}