package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class UpdateAuthorTest extends CdoExampleUiTable{

//	private static final String AUTHOR_NAME = "Edward";
	private static final String AUTHOR_NAME = "Ed Merks";

	@Test
	public void testUpdateAuthorSurname() {
		bot.menu("Table Master Detail").click();
		bot.viewByTitle("Table Master Detail").setFocus();
		
		SWTBotTableItem rcpItem = getAuthorItemByName(AUTHOR_NAME);
		bot.table().select(rcpItem.getText());
		String modifiedAuthorSurname = rcpItem.getText(getPositionColumn(SURNAMEAUTHOR_NAMECOLUMN)) + " cognomemodificato";
		bot.textWithLabel("surname").setText(modifiedAuthorSurname);

		bot.button(SAVE_BUTTON).click();
		bot.viewByTitle(VIEW_MASTER_DETAIL).close();
		
		bot.menu(MENU_MASTER_DETAIL).click();
		bot.viewByTitle(VIEW_MASTER_DETAIL).setFocus();
		String modifiedSurnameRetrieved = getAuthorItemByName(AUTHOR_NAME).getText(getPositionColumn(SURNAMEAUTHOR_NAMECOLUMN));
		assertTrue(modifiedSurnameRetrieved.equals(modifiedAuthorSurname));
	}
}
