package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class InsertAuthorTest extends CdoExampleUiTable {
	private static final String AUTHOR_NAME_TOINSERT = "Edward";
	private static final String AUTHOR_SURNAME_TOINSERT = "Merks";
	//private static final String AUTHOR_BIRTHDAY_TOINSERT = "01/01/1966";

	@Test
	public void testInsertAuthor() {
		bot.menu(MENU_MASTER_DETAIL).click();
		bot.viewByTitle(VIEW_MASTER_DETAIL).setFocus();
		
		bot.button(INSERT_BUTTON).click();
		bot.textWithLabel("Name: ").setText(AUTHOR_NAME_TOINSERT);
		bot.textWithLabel("surname").setText(AUTHOR_SURNAME_TOINSERT);
		// bot.textWithLabel("birthdate").setText(AUTHOR_BIRTHDAY_TOINSERT);
		bot.viewByTitle(VIEW_MASTER_DETAIL).close();

		bot.menu(MENU_MASTER_DETAIL).click();
		bot.viewByTitle(VIEW_MASTER_DETAIL).setFocus();
		SWTBotTableItem authorItem = getAuthorItemByName(AUTHOR_NAME_TOINSERT);
		String insertedAuthorName = authorItem.getText(getPositionColumn(NAMEAUTHOR_NAMECOLUMN));
		String insertedAuthorSurname = authorItem.getText(getPositionColumn(SURNAMEAUTHOR_NAMECOLUMN));
//		String insertedAuthorBirthdate = authorItem.getText(getPositionColumn(BIRTHDATEAUTHOR_NAMECOLUMN));
		assertTrue(insertedAuthorName.equals(AUTHOR_NAME_TOINSERT));
		assertTrue(insertedAuthorSurname.equals(AUTHOR_SURNAME_TOINSERT));
	}
}
