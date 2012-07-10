package it.rcpvision.emf.components.dsl.tests

import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsParserTest extends EmfComponentsDslAbstractTests{
 
    @Test
    def void testEmptyModule() {
        inputs.emptyModule.parseAndAssertNoError
    }
 
}