package it.rcpvision.emf.components.tests;


import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsDslWizardsTests extends EmfComponentsAbstractTests {

	@Test
	public void canCreateDslProjectWithWizard() throws Exception {
		createProjectInWorkspace(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_DSL_PROJECT, "my.emfcomponents.proj");
		//bot.sleep(300000);
		assertNoErrorsInProjectAfterAutoBuild();
	}

}
