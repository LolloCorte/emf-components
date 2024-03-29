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
	EClassTests.class,
	EmfComponentsDslParserTests.class,
	EmfComponentsDslValidatorTests.class,
	EmfComponentsDslJvmModelInferrerTests.class,
	EmfComponentsDslPluginXmlGeneratorTests.class,
	EmfComponentsDslGeneratorTests.class
})
public class EmfComponentsDslAllTests {

}
