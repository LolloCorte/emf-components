package it.rcpvision.emf.components.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IViewPart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsSaveableViewTests extends EmfComponentsAbstractTests {

	boolean treeFormViewOpened = false;

	boolean tableViewOpened = false;

	boolean treeViewOpened = false;

	@Before
	public void runBefore() {
		treeFormViewOpened = false;
		tableViewOpened = false;
		treeViewOpened = false;
	}

	@After
	public void runAfterEveryTest() throws CoreException {
		if (treeFormViewOpened)
			closeLibraryView(TEST_SAVEABLE_TREE_FORM_VIEW);
		if (tableViewOpened)
			closeLibraryView(TEST_SAVEABLE_TABLE_VIEW);
		if (treeViewOpened)
			closeLibraryView(TEST_SAVEABLE_TREE_VIEW);
		super.runAfterEveryTest();
	}

	@Test
	public void canAccessEditingActionsOnSaveableResourceTreeFormView()
			throws Exception {
		SWTBotTreeItem libraryNode = prepareSaveableViewAndGetLibraryNode();
		canAccessStandardEditingActions(libraryNode);
	}

	@Test
	public void canPerformNewChildActionOnSaveableResourceTreeFormView()
			throws Exception {
		SWTBotTreeItem libraryNode = prepareSaveableViewAndGetLibraryNode();
		createNewChild(libraryNode, BOOK_ON_TAPE);
		assertDirtyThenSaveAndAssertNotDirty(TEST_SAVEABLE_TREE_FORM_VIEW);
	}

	@Test
	public void canPerformDeleteActionOnSaveableResourceTreeFormView()
			throws Exception {
		clickOnContextMenu(
				getWriterNode(prepareSaveableViewAndGetLibraryNode()),
				ACTION_DELETE);
		assertDirtyThenSaveAndAssertNotDirty(TEST_SAVEABLE_TREE_FORM_VIEW);
	}

	@Test
	public void canPerformUndoDeleteActionOnSaveableResourceTreeFormView()
			throws Exception {
		SWTBotTreeItem libraryNode = prepareSaveableViewAndGetLibraryNode();
		clickOnContextMenu(getWriterNode(libraryNode), ACTION_DELETE);
		assertSaveableViewIsDirty(true, TEST_SAVEABLE_TREE_FORM_VIEW);
		undo(ACTION_DELETE);
		// make sure the writer is back
		getWriterNode(libraryNode);
		saveViewAndAssertNotDirty(TEST_SAVEABLE_TREE_FORM_VIEW);
	}

	@Test
	public void canPerformDeleteActionOnSaveableTableView() throws Exception {
		SWTBotTable table = prepareSaveableTableView();
		table.select(0); // otherwise context menu might not be created
		clickOnContextMenu(table, ACTION_DELETE);
		assertDirtyThenSaveAndAssertNotDirty(TEST_SAVEABLE_TABLE_VIEW);
	}

	@Test
	public void canPerformNewSiblingActionOnSaveableTableView()
			throws Exception {
		SWTBotTable table = prepareSaveableTableView();
		assertTableItemsSize(table, 2);
		table.select(0); // otherwise context menu might not be created
		clickOnContextMenu(table, NEW_SIBLING, "Book");
		assertTableItemsSize(table, 3);
		assertDirtyThenSaveAndAssertNotDirty(TEST_SAVEABLE_TABLE_VIEW);
	}

	@Test
	public void canPerformUndoDeleteActionOnSaveableTreeView() throws Exception {
		SWTBotTreeItem libraryNode = prepareSaveableTreeViewAndGetLibraryNode();
		clickOnContextMenu(getWriterNode(libraryNode), ACTION_DELETE);
		assertSaveableViewIsDirty(true, TEST_SAVEABLE_TREE_VIEW);
		undo(ACTION_DELETE);
		// make sure the writer is back
		getWriterNode(libraryNode);
		saveViewAndAssertNotDirty(TEST_SAVEABLE_TREE_VIEW);
	}

	protected void createNewChild(SWTBotTreeItem libraryNode, String childType) {
		clickOnContextMenu(libraryNode, NEW_CHILD, childType);
		// check that the new item was created
		libraryNode.expand().getNode(childType);
	}

	protected void assertDirtyThenSaveAndAssertNotDirty(String viewName) {
		assertSaveableViewIsDirty(true, viewName);
		saveViewAndAssertNotDirty(viewName);
	}

	protected void assertSaveableViewIsDirty(boolean isDirty, String viewName) {
		ISaveablePart viewAsSaveablePart = getViewAsSaveablePart(viewName);
		assertEquals(isDirty, viewAsSaveablePart.isDirty());
	}

	protected ISaveablePart getViewAsSaveablePart(String viewName) {
		SWTBotView view = getLibraryView(viewName);
		IViewPart viewPart = view.getViewReference().getView(false);
		ISaveablePart viewAsSaveablePart = (ISaveablePart) viewPart;
		return viewAsSaveablePart;
	}

	protected void saveViewAndAssertNotDirty(final String viewName) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				getViewAsSaveablePart(viewName).doSave(
						new NullProgressMonitor());
			}
		});
		assertSaveableViewIsDirty(false, viewName);
	}

	protected void assertTableItemsSize(final SWTBotTable table,
			final int expectedSize) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				assertEquals(expectedSize, table.widget.getItems().length);
			}
		});
	}

	protected SWTBotTreeItem prepareSaveableViewAndGetLibraryNode()
			throws CoreException, InvocationTargetException,
			InterruptedException, IOException {
		createProjectAndTestFiles();
		openTestView(TEST_SAVEABLE_TREE_FORM_VIEW);
		treeFormViewOpened = true;
		SWTBotTreeItem libraryNode = getRootOfTreeFromView(
				TEST_SAVEABLE_TREE_FORM_VIEW).getTreeItem(LIBRARY_LABEL);
		return libraryNode;
	}

	protected SWTBotTable prepareSaveableTableView() throws CoreException,
			InvocationTargetException, InterruptedException, IOException {
		createProjectAndTestFiles();
		openTestView(TEST_SAVEABLE_TABLE_VIEW);
		SWTBotTable table = bot.table();
		tableViewOpened = true;
		return table;
	}

	protected SWTBotTreeItem prepareSaveableTreeViewAndGetLibraryNode()
			throws CoreException, InvocationTargetException,
			InterruptedException, IOException {
		createProjectAndTestFiles();
		openTestView(TEST_SAVEABLE_TREE_VIEW);
		treeViewOpened = true;
		SWTBotTreeItem libraryNode = getRootOfTreeFromView(
				TEST_SAVEABLE_TREE_VIEW).getTreeItem(LIBRARY_LABEL);
		return libraryNode;
	}

}
