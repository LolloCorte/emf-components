package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import java.util.List;

import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SaveableTreeFormTest extends CdoExampleUiTable {

	private static final String MODIFIED_NAME = "Ciccio Pasticcio";
	private static final String LIBRARY = "Library";
	private static final String SAVEABLE_TREEFORM_VIEW_TITLE = "Saveable Resource CDO Tree Form View";
//	private static final String BOOK_CIAO = "Book Book Ciao";
	private static final String BOOK_NOME_LIBRO = "Book";
	SWTBotShell displayNameShell;
	

	
	
	@Test
	public void testExpandLibrary() {
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		bot.tree().expandNode(LIBRARY);
	}


	@Test
	public void testSelectBook() {
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		SWTBotTreeItem root = bot.tree().expandNode(LIBRARY);
		root.expand();
		root.getNode("Book Book").select();
	}

	@Test
	public void insertAndSaveDetailsBook() throws WidgetNotFoundException,
			ParseException {
		bot.textWithLabel("title").setText(MODIFIED_NAME);
		openDisplayNameAuthorDialog();
		modifyAuthorName();
		bot.textWithLabel("pages").setText("458");
		saveModifications();
	}

	@Test 
	public void resetModifications() throws WidgetNotFoundException, ParseException{
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		SWTBotTreeItem root = bot.tree().expandNode(LIBRARY);
		root.expand();
		root.getNode("Book Ciccio Pasticcio").select();
		bot.textWithLabel("title").setText(BOOK_NOME_LIBRO);
		saveModifications();
	}
	
	public void saveModifications() throws WidgetNotFoundException,
			ParseException {
		SWTBotPreferences.KEYBOARD_LAYOUT = "EN_US";
		System.out.println("Nome activeShell:" + bot.activeShell().getText());
		char s = 's';
		bot.activeShell().pressShortcut(SWT.CTRL, s);
	}

	private void openDisplayNameAuthorDialog() {
		bot.button("...").click();
		displayNameShell = bot.activeShell();
		displayNameShell.bot().button("Cancel").click();
		
	}


	private void modifyAuthorName() {
		bot.button("...").click();
		SWTBotShell displayNameShell2 = bot.activeShell();
		SWTBotTable choices = displayNameShell2.bot().tableWithLabel("Choices");
		choices.setFocus();
		choices.getTableItem(1).select();
		bot.button("Add");
		//TODO Aggiungere controllo per la tabella feature
		bot.button("OK").click();
	}



	@Test
	public void verifyContentTree(){
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		SWTBotTreeItem root = bot.tree().expandNode(LIBRARY);
		root.select();
		List<String> contentTree = root.getNodes();
		for (String swtBotTreeItem : contentTree) {
			System.out.println("Elementi dell'albero: " + swtBotTreeItem);
		}
		
	}
	
//	@Test
	public void testCreateBook() {
		bot.viewByTitle(SAVEABLE_TREEFORM_VIEW_TITLE).setFocus();
		SWTBotTreeItem root = bot.tree().expandNode(LIBRARY);
		root.select();

	}

}