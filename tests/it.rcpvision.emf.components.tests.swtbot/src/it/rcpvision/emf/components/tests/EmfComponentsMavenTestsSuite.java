package it.rcpvision.emf.components.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author bettini
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	EmfLabelProviderTests.class,
	EmfProviderTests.class,
	EmfComponentsViewTests.class,
	EmfComponentsEditorTests.class,
	EmfComponentsFormTests.class
	// for the moment wizard tests does not work
	// when built with maven...
	// EmfComponentsWizardsTests.class
})
public class EmfComponentsMavenTestsSuite {
}
