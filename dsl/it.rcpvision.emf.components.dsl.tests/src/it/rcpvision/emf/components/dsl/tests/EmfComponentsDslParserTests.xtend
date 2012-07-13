package it.rcpvision.emf.components.dsl.tests

import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslParserTests extends EmfComponentsDslAbstractTests {
 
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
	def void testFeatureLabelSpecifications() {
		inputs.featureLabelSpecifications.parseAndAssertNoError
	}
}