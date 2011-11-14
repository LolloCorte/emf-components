package it.rcpvision.emf.components.tests;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsWizardsTests extends EmfComponentsAbstractTests {

	@Test
	public void canCreateProjectWithWizard() throws Exception {
		createProjectInWorkspace("Emf Components",
				"New Emf Components Project", "EmfComponentsProject");
	}

}
