package it.rcpvision.emf.components.dsl.tests

import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import it.rcpvision.emf.components.dsl.model.Model
import it.rcpvision.emf.components.dsl.tests.inputs.TestInputs
import it.rcpvision.emf.components.dsl.tests.inputs.TestInputsWithErrors
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import org.junit.BeforeClass

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslAbstractTests {
	
	@Inject
	protected TestInputs inputs
	
	@Inject
	protected TestInputsWithErrors inputsWithErrors
	
	@Inject extension ParseHelper<Model>
 
    @Inject extension ValidationTestHelper
    
    @BeforeClass
	def static void setCRLF() {
		System::setProperty("line.separator", "\n")
	}
    
    def parseAndAssertNoError(CharSequence s) {
		var ts = s.parse
		ts.assertNoErrors
		ts
	}
	
	def parseAndAssertError(CharSequence s, EClass objectType, String code,
			String messagePart) {
		s.parse.assertError(objectType, code, messagePart)			
	}
	
	def parseModel(CharSequence s) {
		s.parse
	}
	
	def parseAndAssertErrors(CharSequence s) {
		(s.parse.validate.size > 0).assertTrue
	}
	
	def module(CharSequence s) {
		s.parseAndAssertNoError.module
	}
	
	def assertEqualsStrings(Object o1, Object o2) {
		assertEquals("" + o1, "" + o2)
	}
}