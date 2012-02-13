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
	EmfComponentsFormTests.class,
	EmfComponentsWizardsTests.class
})
public class EmfComponentsTestsSuite {
}
