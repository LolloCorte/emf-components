package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import static org.junit.Assert.assertNull;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class DeleteAuthorTest extends CdoExampleUiTable{

//	private static final String AUTHOR_NAME = "Edward";
	private static final String AUTHOR_NAME = "Ed Merks";
	
	@Test
	public void testDeleteAuthorByName() {
		bot.menu("Table Master Detail").click();
		bot.viewByTitle("Table Master Detail").setFocus();
		
		SWTBotTableItem rcpItem = getAuthorItemByName(AUTHOR_NAME);
		bot.table().select(rcpItem.getText());
		
		bot.button(DELETE_BUTTON).click();
		SWTBotShell shellCancellazione = bot.shell("Cancellazione");
		shellCancellazione.activate();
		bot.button("OK").click();

		assertNull(getAuthorItemByName(AUTHOR_NAME));
	}
}
