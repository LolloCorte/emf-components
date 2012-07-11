package it.rcpvision.emf.components.dsl.tests

import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import it.rcpvision.emf.components.dsl.model.Model
import it.rcpvision.emf.components.dsl.tests.inputs.TestInputs
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslAbstractTests {
	
	@Inject
	protected TestInputs inputs
	
	@Inject extension ParseHelper<Model>
 
    @Inject extension ValidationTestHelper
    
    def parseAndAssertNoError(CharSequence s) {
		var ts = s.parse
		ts.assertNoErrors
		ts
	}
	
	def module(CharSequence s) {
		s.parseAndAssertNoError.module
	}
	
	def assertEqualsStrings(Object o1, Object o2) {
		Assert::assertEquals("" + o1, "" + o2)
	}
}