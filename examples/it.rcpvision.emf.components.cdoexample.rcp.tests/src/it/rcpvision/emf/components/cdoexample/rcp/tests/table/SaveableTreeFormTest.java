package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SaveableTreeFormTest extends CdoExampleUiTable{

	private static final String LIBRARY = "Library";
	private static final String SAVEABLE_TREEFORM_VIEW_TITLE = "Saveable Resource CDO Tree Form View";
	private static final String BOOK_CIAO = "Book Ciao";

	@Test
	public void testExpandLibrary() {
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		bot.tree().expandNode(LIBRARY);
	}
	
	@Test
	public void testSelectBook() {
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		bot.tree().select(BOOK_CIAO);
		bot.sleep(2000);
	}
}
