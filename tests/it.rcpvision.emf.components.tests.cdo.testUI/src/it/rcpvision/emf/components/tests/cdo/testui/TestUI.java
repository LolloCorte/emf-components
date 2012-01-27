package it.rcpvision.emf.components.tests.cdo.testui;

import static org.junit.Assert.assertNotNull;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestUI {
	

	private static SWTWorkbenchBot bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
	}
	
	@Test
	public void openMenu(){ 
		bot.menu("Open Editor").click();
		SWTBotTree tree=bot.activeEditor().bot().tree();
		assertNotNull(tree);
		tree.expandNode("CDO Resource myResource");
		bot.sleep(2000);
		SWTBotTreeItem contextualMenu=tree.getTreeItem("Container");
		contextualMenu.expand();
//		contextualMenu.contextMenu(arg0)
		
	}
	
}
