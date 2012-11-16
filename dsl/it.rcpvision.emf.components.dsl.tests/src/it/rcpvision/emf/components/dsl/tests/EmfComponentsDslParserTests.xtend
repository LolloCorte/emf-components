package it.rcpvision.emf.components.dsl.tests

import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XbasePackage
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.BeforeClass

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslParserTests extends EmfComponentsDslAbstractTests {

 	@Inject extension ValidationTestHelper

	@BeforeClass
	def static void setCRLF() {
		System::setProperty("line.separator", "\n")
	}

	@Test
	def void testEmptyModule() {
		inputs.emptyModule.parseAndAssertNoError
	}

	@Test
	def void testEmptyLabelProvider() {
		inputs.emptyLabelProvider.parseAndAssertNoError
	}

	@Test
	def void testEmptyLabelSpecifications() {
		inputs.emptyLabelSpecifications.parseAndAssertNoError
	}

	@Test
	def void testLabelSpecifications() {
		inputs.labelSpecifications.parseAndAssertNoError
	}
	
	@Test
	def void testDuplicateLabelSpecifications() {
		inputsWithErrors.duplicateLabelSpecifications.parseAndAssertErrors
	}
	
	@Test
	def void testPropertyDescriptionSpecifications() {
		inputs.propertyDescriptionSpecifications.parseAndAssertNoError
	}

	@Test
	def void testWrongFeatureLabelSpecifications() {
		val model = inputsWithErrors.wrongPropertyDescriptionSpecifications.parseModel
		model.assertError(
			XbasePackage::eINSTANCE.XFeatureCall,
			Diagnostic::LINKING_DIAGNOSTIC,
			"newArrayList"
		)
		model.assertError(
			XbasePackage::eINSTANCE.XFeatureCall,
			Diagnostic::LINKING_DIAGNOSTIC,
			"getBooks"
		)
	}
	
	@Test
	def void testFeaturesSpecifications() {
		inputs.featuresSpecifications.parseAndAssertNoError
	}

	@Test
	def void testFormFeatureControlSpecifications() {
		inputs.formFeatureControlSpecifications.parseAndAssertNoError
	}

	@Test
	def void testViewerContentProviderSpecifications() {
		inputs.viewerContentProviderSpecifications.parseAndAssertNoError
	}
}