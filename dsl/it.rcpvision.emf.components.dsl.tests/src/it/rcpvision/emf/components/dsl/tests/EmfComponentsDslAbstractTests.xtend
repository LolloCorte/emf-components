package it.rcpvision.emf.components.dsl.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.tests.inputs.TestInputs
import org.eclipse.xtext.junit4.util.ParseHelper
import it.rcpvision.emf.components.dsl.model.Model
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

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
	
}