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
        "my.empty.EmptyExecutableExtensionFactory".assertEqualsStrings(
        	inferrer.executableExtensionFactoryQN(inputs.emptyModule.module)
        )
    }

	@Test
	def void testViewSpecificationExecutableExtensionFactoryName() {
        "my.test.TestExecutableExtensionFactory".assertEqualsStrings(
        	inferrer.executableExtensionFactoryQN(
        		inputs.nonEmptyViewsSpecifications.partSpecification
        	)
        )
    }

	@Test
	def void testActivatorName() {
        "my.empty.Activator".assertEqualsStrings(
        	inferrer.activatorQN(inputs.emptyModule.module)
        )
    }
    
    @Test
	def void testLabelProviderName() {
        "my.empty.ui.provider.LabelProviderGen".assertEqualsStrings(
        	inferrer.labelProviderQN(inputs.emptyModule.module)
        )
    }

    @Test
	def void testPropertyDescriptionProviderName() {
        "my.empty.ui.provider.PropertyDescriptionProviderGen".assertEqualsStrings(
        	inferrer.propertyDescriptionProviderQN(inputs.emptyModule.module)
        )
    }

    @Test
	def void testFeaturesProviderName() {
        "my.empty.ui.provider.FeaturesProviderGen".assertEqualsStrings(
        	inferrer.featuresProviderQN(inputs.emptyModule.module)
        )
    }

    @Test
	def void testFormFeatureControlFactoryName() {
        "my.empty.binding.FormFeatureControlFactoryGen".assertEqualsStrings(
        	inferrer.formFeatureControlFactoryQN(inputs.emptyModule.module)
        )
    }

	@Test
	def void testViewerContentProviderName() {
        "my.empty.edit.ui.provider.ViewerContentProviderGen".assertEqualsStrings(
        	inferrer.viewerContentProviderQN(inputs.emptyModule.module)
        )
    }

	@Test
	def void testProposalCreatorName() {
        "my.empty.binding.ProposalCreatorGen".assertEqualsStrings(
        	inferrer.proposalCreatorQN(inputs.proposalsSpecifications.module)
        )
    }
}