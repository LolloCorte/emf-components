package it.rcpvision.emf.components.tests;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Lorenzo Bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsExamplesWizardsTests extends
		EmfComponentsAbstractTests {

	@Test
	public void canCreateMailExampleProjectWithWizard() throws Exception {
		createExampleProjectsInWorkspace(EMF_COMPONENTS_MAIL_RCP_EXAMPLE,
				"it.rcpvision.emf.components.examples.mail.model");
		assertNoErrorsInProjectAfterAutoBuild();
	}

	@Test
	public void canCreateFirstExampleProjectWithWizard() throws Exception {
		createExampleProjectsInWorkspace(EMF_COMPONENTS_FIRST_EXAMPLE,
				"it.rcpvision.emf.components.examples.firstexample",
				"org.eclipse.emf.examples.library",
				"org.eclipse.emf.examples.library.edit");
		assertNoErrorsInProjectAfterAutoBuild();
	}

	@Test
	public void canCreateViewsExamplesProjectWithWizard() throws Exception {
		createExampleProjectsInWorkspace(EMF_COMPONENTS_VIEWS_EXAMPLES,
				"it.rcpvision.emf.components.examples.views");
		assertNoErrorsInProjectAfterAutoBuild();
	}

}
