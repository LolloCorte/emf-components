package it.rcpvision.emf.components.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.part.ViewPart;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsSaveableViewTests extends EmfComponentsAbstractTests {

	@After
	public void runAfterEveryTest() throws CoreException {
		closeLibraryView(TEST_SAVEABLE_RESOURCE_TREE_FORM_VIEW);
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
		assertSaveableViewIsDirty(true);
		saveViewAndAssertNotDirty();
	}

	protected void createNewChild(SWTBotTreeItem libraryNode, String childType) {
		getSubMenuItem(libraryNode.contextMenu(NEW_CHILD), childType).click();
		// check that the new item was created
		libraryNode.expand().getNode(childType);
	}

	protected void assertSaveableViewIsDirty(boolean isDirty) {
		ISaveablePart viewAsSaveablePart = getViewAsSaveablePart();
		assertEquals(isDirty, viewAsSaveablePart.isDirty());
	}

	protected ISaveablePart getViewAsSaveablePart() {
		SWTBotView view = getLibraryView(TEST_SAVEABLE_RESOURCE_TREE_FORM_VIEW);
		IViewPart viewPart = view.getViewReference().getView(false);
		ISaveablePart viewAsSaveablePart = (ISaveablePart) viewPart;
		return viewAsSaveablePart;
	}

	protected void saveViewAndAssertNotDirty() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				getViewAsSaveablePart().doSave(new NullProgressMonitor());
			}
		});
		assertSaveableViewIsDirty(false);
	}

	protected SWTBotTreeItem prepareSaveableViewAndGetLibraryNode()
			throws CoreException, InvocationTargetException,
			InterruptedException, IOException {
		createProjectAndTestFiles();
		openTestView(TEST_SAVEABLE_RESOURCE_TREE_FORM_VIEW);
		SWTBotTreeItem libraryNode = getRootOfTreeFromView(
				TEST_SAVEABLE_RESOURCE_TREE_FORM_VIEW).getTreeItem(
				LIBRARY_LABEL);
		return libraryNode;
	}

}
