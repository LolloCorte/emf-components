package it.rcpvision.emf.components.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.forms.finder.SWTFormsBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsEditorTests extends EmfComponentsAbstractTests {

	protected static final String BOOK_ON_TAPE = "Book On Tape";

	protected static final String NEW_CHILD = "New Child";

	public void canCreateProject() throws Exception {
		createSimpleProject();
	}

	public void canCreateProjectWithFile() throws Exception {
		createProjectAndTestFile();
		getProjectTreeItem(MY_TEST_PROJECT).expand();
	}

	@Test
	public void canOpenEmfFormEditorOnTestFile() throws Exception {
		openEmfEditorOnTestFile(EMF_TREE_EDITOR, MY_EXTLIBRARY);
	}

	@Test
	public void canAccessEditorTreeOfLibrary() throws Exception {
		getWriterNode(getLibraryNode(getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI)));
	}

	@Test
	public void canAccessContextMenuOfLibrary() throws Exception {
		SWTBotTreeItem libraryNode = getLibraryNode(getRootOfEditorTree(
				EMF_TREE_EDITOR, MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI));
		getSubMenuItem(libraryNode.contextMenu(NEW_CHILD), BOOK_ON_TAPE)
				.click();
		// check that the new item was created
		libraryNode.expand().getNode(BOOK_ON_TAPE);
		getEditor(EMF_TREE_EDITOR).saveAndClose();
	}

	@Test
	public void canAccessEditorTreeOfStatemachine() throws Exception {
		accessStateMachineNodes(getRootOfEditorTree(
				EMF_TREE_EDITOR_STATEMACHINE, MY_STATEMACHINE,
				MY_STATEMACHINE_PLATFORM_URI));
	}

	@Test
	public void canPopulateOutlineView() throws Exception {
		openEmfEditorOnTestFile(EMF_TREE_EDITOR, MY_EXTLIBRARY);
		getRootOfOutlineViewTree();
	}

	@Test
	public void canOpenPropertyViewWithDoubleClick() throws Exception {
		// double click on Library node on the tree of the editor and outline
		// view should open the property view
		getLibraryNode(
				getRootOfEditorTree(EMF_TREE_EDITOR, MY_EXTLIBRARY,
						MY_EXT_LIBRARY_PLATFORM_URI)).doubleClick();
		assertPropertyViewIsOpenedAndCloseIt();
		getLibraryNode(getRootOfOutlineViewTree()).doubleClick();
		assertPropertyViewIsOpenedAndCloseIt();
	}

	@Test
	public void testEditorWithNoMouseEvents() throws Exception {
		// double click on Library node on the tree of the editor and outline
		// view should NOT open the property view
		getLibraryNode(
				getRootOfEditorTree(EMF_TREE_EDITOR_NO_MOUSE, MY_EXTLIBRARY,
						MY_EXT_LIBRARY_PLATFORM_URI)).doubleClick();
		assertPropertyViewIsNotShown();
		getLibraryNode(getRootOfOutlineViewTree()).doubleClick();
		assertPropertyViewIsNotShown();
	}

	@Test
	public void testEditorWithCustomLabels() throws Exception {
		SWTBotTreeItem rootOfTree = getRootOfEditorTree(
				EMF_TREE_EDITOR_CUSTOM_LABEL, MY_EXTLIBRARY,
				MY_EXT_LIBRARY_PLATFORM_URI);
		accessTreeWithCustomLabels(rootOfTree);
		accessTreeWithCustomLabels(getRootOfOutlineViewTree());
	}

	@Test
	public void testEditorWithCustomLibraryLabels() throws Exception {
		SWTBotTreeItem rootOfTree = getRootOfEditorTree(
				EMF_CUSTOM_LIBRARY_EDITOR, MY_EXTLIBRARY,
				MY_EXT_LIBRARY_PLATFORM_URI);
		SWTBotTreeItem treeItem = accessTreeWithCustomLibraryLabels(rootOfTree);
		assertTreeItemImage(treeItem, getImageDescriptorFromTest("book2.png"));
		treeItem = accessTreeWithCustomLibraryLabels(getRootOfOutlineViewTree());
		assertTreeItemImage(treeItem, getImageDescriptorFromTest("book2.png"));
	}

	@Test
	public void canSelectInOutlineView() throws Exception {
		SWTBotTreeItem editorTreeRoot = getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI);
		getLibraryWriterNode(getRootOfOutlineViewTree()).select();
		assertTrue("writer node should be selected",
				getLibraryWriterNode(editorTreeRoot).isSelected());
	}
	
	@Test
	public void statusLineFromOutlineView() throws Exception {
		getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI);
		getLibraryWriterNode(getRootOfOutlineViewTree()).select();
		assertStatusLine("Selected Object: " + WRITER_LABEL);
	}

	@Test
	public void detailViewShowsDetailsOnSelection() throws Exception {
		SWTBotView detailView = openTestView(EMF_DETAIL_VIEW);
		// select on the editor's tree
		SWTBotTreeItem rootOfEditorTree = getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI);
		getLibraryWriterNode(rootOfEditorTree).select();
		SWTFormsBot formbot = new SWTFormsBot(detailView.getWidget());
		formbot.label(ADDRESS_LABEL);
		formbot.text(WRITER_S_ADDRESS_TEXT);
		// select on the outline view
		getLibraryNode(getRootOfOutlineViewTree()).select();
		formbot.label(ADDRESS_LABEL);
		formbot.text(LIBRARY_S_ADDRESS_TEXT);
		// now select again on the editor's tree
		getLibraryWriterNode(rootOfEditorTree).select();
		formbot.label(ADDRESS_LABEL);
		formbot.text(WRITER_S_ADDRESS_TEXT);
	}

}