package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import it.rcpvision.emf.components.cdoexample.rcp.tests.CdoExampleAbstract;

import java.util.List;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CdoExampleUiTable extends CdoExampleAbstract {

	protected static final String MENU_MASTER_DETAIL = "Table Master Detail";
	protected static final String VIEW_MASTER_DETAIL = "Table Master Detail";
	protected static final String NAMEAUTHOR_NAMECOLUMN = "name";
	protected static final String SURNAMEAUTHOR_NAMECOLUMN = "surname";
	protected static final String BIRTHDATEAUTHOR_NAMECOLUMN = "birthdate";

	protected SWTBotTableItem getAuthorItemByName(String authorName) {
		int positionColumn = getPositionColumn(SURNAMEAUTHOR_NAMECOLUMN);
		int indexOfItem = bot.table().indexOf(authorName, positionColumn);
		if (indexOfItem == -1)
			return null;
		return bot.table().getTableItem(indexOfItem);
	}

	protected int getPositionColumn(String nameColumn) throws AssertionError {
		List<String> tableColumnsName = bot.table().columns();
		int positionColumn = tableColumnsName.indexOf(nameColumn);
		if (positionColumn == -1)
			throw new AssertionError(nameColumn);
		return positionColumn;
	}

}
