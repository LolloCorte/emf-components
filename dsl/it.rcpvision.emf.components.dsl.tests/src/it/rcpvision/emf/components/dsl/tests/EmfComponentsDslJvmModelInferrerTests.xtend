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
        inferrer.moduleQN(inputs.emptyModule.module).assertEqualsStrings(
        	"my.empty.TestModule"
        )
    }

	@Test
	def void testExecutableExtensionFactoryName() {
        inferrer.executableExtensionFactoryQN(inputs.emptyModule.module).assertEqualsStrings(
        	"my.empty.TestExecutableExtensionFactory"
        )
    }

	@Test
	def void testActivatorName() {
        inferrer.activatorQN(inputs.emptyModule.module).assertEqualsStrings(
        	"my.empty.TestActivator"
        )
    }
	 
}