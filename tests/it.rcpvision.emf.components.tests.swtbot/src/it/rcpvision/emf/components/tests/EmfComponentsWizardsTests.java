package it.rcpvision.emf.components.tests;


import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Lorenzo Bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsWizardsTests extends EmfComponentsAbstractTests {

	@Test
	public void canCreateProjectWithWizard() throws Exception {
		createProjectInWorkspace(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_PROJECT, EMF_COMPONENTS_PROJECT);
		// bot.sleep(300000);
		assertNoErrorsInProjectAfterAutoBuild();
	}

	@Test
	public void canCreateProjectWithWizardWithNoSelectedView() throws Exception {
		createProjectInWorkspaceWithView(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_PROJECT, EMF_COMPONENTS_PROJECT, null);
		assertNoErrorsInProjectAfterAutoBuild();
	}

	@Test
	public void canCreateProjectWithWizardWithSelectedTreeFormView()
			throws Exception {
		createProjectInWorkspaceWithView(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_PROJECT, EMF_COMPONENTS_PROJECT,
				"Create a TreeFormView");
		assertNoErrorsInProjectAfterAutoBuild();
	}

	@Test
	public void canCreateProjectWithWizardWithSelectedTableView()
			throws Exception {
		createProjectInWorkspaceWithView(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_PROJECT, EMF_COMPONENTS_PROJECT,
				"Create a TableView");
		assertNoErrorsInProjectAfterAutoBuild();
	}

}
