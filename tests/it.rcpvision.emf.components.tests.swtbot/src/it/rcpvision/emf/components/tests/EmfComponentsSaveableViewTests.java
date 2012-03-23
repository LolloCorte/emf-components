package it.rcpvision.emf.components.tests;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsSaveableViewTests extends EmfComponentsAbstractTests {

	@Test
	public void canAccessEditingActionsOfSaveableResourceTreeFormView()
			throws Exception {
		createProjectAndTestFiles();
		openTestView(TEST_SAVEABLE_RESOURCE_TREE_FORM_VIEW);
		SWTBotTreeItem libraryNode = getRootOfTreeFromView(
				TEST_SAVEABLE_RESOURCE_TREE_FORM_VIEW).getTreeItem(
				LIBRARY_LABEL);
		canAccessStandardEditingActions(libraryNode);
	}

}
