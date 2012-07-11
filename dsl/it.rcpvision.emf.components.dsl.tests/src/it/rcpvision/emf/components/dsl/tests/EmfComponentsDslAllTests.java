/**
 * 
 */
package it.rcpvision.emf.components.dsl.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author bettini
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	EmfComponentsDslParserTests.class,
	EmfComponentsDslJvmModelInferrerTests.class,
	EmfComponentsDslGeneratorTests.class
})
public class EmfComponentsDslAllTests {

}
