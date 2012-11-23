package it.rcpvision.emf.components.dsl.tests

import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import it.rcpvision.emf.components.dsl.model.ModelPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static it.rcpvision.emf.components.dsl.validation.EmfComponentsDslJavaValidator.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslValidatorTests extends EmfComponentsDslAbstractTests {

 	@Inject extension ValidationTestHelper

	@Test
	def void testNonEmptyViewsSpecifications() {
		inputsWithErrors.viewSpecificationIsNotIViewPart.parseModel.
			assertError(
				ModelPackage::eINSTANCE.viewSpecification,
				NOT_I_VIEW_PART,
				"Must be an IViewPart"
			)
	}
}