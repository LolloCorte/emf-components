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
public class EmfFormEditorTests extends EmfFormEditorAbstractTests {

	public void canCreateProject() throws Exception {
		createSimpleProject();
	}

	public void canCreateProjectWithFile() throws Exception {
		createProjectAndTestFile();
		getProjectTreeItem(MY_TEST_PROJECT).expand();
	}

	@Test
	public void canOpenEmfFormEditorOnTestFile() throws Exception {
		openEmfFormEditorOnTestFile(EMF_TREE_EDITOR, MY_EXTLIBRARY);
	}

	@Test
	public void canAccessEditorTreeOfLibrary() throws Exception {
		getWriterNode(getLibraryNode(getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI)));
	}

	@Test
	public void canAccessContextMenuOfLibrary() throws Exception {
		getSubMenuItem(
				getLibraryNode(
						getRootOfEditorTree(EMF_TREE_EDITOR, MY_EXTLIBRARY,
								MY_EXT_LIBRARY_PLATFORM_URI)).contextMenu(
						"New Child"), "Book");
	}

	@Test
	public void canAccessEditorTreeOfStatemachine() throws Exception {
		accessStateMachineNodes(getRootOfEditorTree(
				EMF_TREE_EDITOR_STATEMACHINE, MY_STATEMACHINE,
				MY_STATEMACHINE_PLATFORM_URI));
	}

	@Test
	public void canPopulateOutlineView() throws Exception {
		openEmfFormEditorOnTestFile(EMF_TREE_EDITOR, MY_EXTLIBRARY);
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
	public void detailViewShowsDetailsOnSelection() throws Exception {
		getRootOfEditorTree(EMF_TREE_EDITOR, MY_EXTLIBRARY,
				MY_EXT_LIBRARY_PLATFORM_URI);
		SWTBotView detailView = openTestView(EMF_DETAIL_VIEW);
		getLibraryWriterNode(getRootOfOutlineViewTree()).select();
		SWTFormsBot formbot = new SWTFormsBot(detailView.getWidget());
		System.out.println(formbot.label("address"));
		System.out.println(formbot.text("writer's address"));
	}

}
