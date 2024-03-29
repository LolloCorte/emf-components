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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslParserTests extends EmfComponentsDslAbstractTests {

 	@Inject extension ValidationTestHelper

	@Test
	def void testEmptyModule() {
		inputs.emptyModule.parseAndAssertNoError
	}

	@Test
	def void testModuleWithExtends() {
		inputs.moduleWithExtends.parseAndAssertNoError
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
	def void testFormControlSpecifications() {
		inputs.formControlSpecifications.parseAndAssertNoError
	}

	@Test
	def void testProposalsSpecifications() {
		inputs.proposalsSpecifications.parseAndAssertNoError
	}

	@Test
	def void testViewerContentProviderSpecifications() {
		inputs.viewerContentProviderSpecifications.parseAndAssertNoError
	}

	@Test
	def void testEmptyViewsSpecifications() {
		inputs.emptyViewsSpecifications.parseAndAssertNoError
	}

	@Test
	def void testNonEmptyViewsSpecifications() {
		inputs.nonEmptyViewsSpecifications.parseAndAssertNoError
	}

	@Test
	def void testMultipleViewsSpecifications() {
		inputs.multipleViewsSpecifications.parseAndAssertNoError
	}
}