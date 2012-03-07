package it.rcpvision.emf.components.tests;

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
public class EmfComponentsFormTests extends EmfComponentsAbstractTests {

	@Test
	public void detailViewShowsDetailsOnSelection() throws Exception {
		SWTBotView detailView = openTestView(EMF_DETAIL_VIEW);
		// select on the editor's tree
		SWTBotTreeItem rootOfEditorTree = getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI);
		getLibraryWriterNode(rootOfEditorTree).select();
		SWTFormsBot formbot = formBotFromView(detailView);
		formbot.label(ADDRESS_LABEL);
		formbot.text(WRITER_S_ADDRESS_TEXT);
		formbot.label(FIRSTNAME_LABEL);
		// select on the outline view
		getLibraryNode(getRootOfOutlineViewTree()).select();
		formbot.label(ADDRESS_LABEL);
		formbot.text(LIBRARY_S_ADDRESS_TEXT);
		// the label for 'people'
		formbot.label(PEOPLE_LABEL);
		// the inner label listing all the people, before the button "..."
		formbot.label(PEOPLE_TEXT);
		// now select again on the editor's tree
		getLibraryWriterNode(rootOfEditorTree).select();
		formbot.label(ADDRESS_LABEL);
		formbot.text(WRITER_S_ADDRESS_TEXT);
		// detailView.close();
	}

	protected SWTFormsBot formBotFromView(SWTBotView detailView) {
		return new SWTFormsBot(detailView.getWidget());
	}

	@Test
	public void detailViewShowsCustomDetailsOnSelection() throws Exception {
		SWTBotView detailView = openTestView(LIBRARY_CUSTOM_DETAIL_VIEW);
		// select on the editor's tree
		SWTBotTreeItem rootOfEditorTree = getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI);
		getLibraryWriterNode(rootOfEditorTree).select();
		SWTFormsBot formbot = formBotFromView(detailView);
		formbot.label(ADDRESS_LABEL);
		formbot.text(WRITER_S_ADDRESS_TEXT);
		formbot.label(CUSTOM_FIRSTNAME_LABEL);
		formbot.label(CUSTOM_SURNAME_LABEL);
		// select on the outline view
		getLibraryNode(getRootOfOutlineViewTree()).select();
		formbot.label(ADDRESS_LABEL);
		formbot.text(LIBRARY_S_ADDRESS_TEXT);
		// the label for 'people'
		formbot.label(PEOPLE_LABEL);
		// the inner label listing all the people, before the button "..."
		formbot.label(CUSTOM_PEOPLE_TEXT);
	}

	@Test
	public void treeFormViewShowsOnSelection() throws Exception {
		SWTBotView view = openTestView(EMF_TREE_FORM_DETAIL_VIEW);
		// select on the editor's tree
		SWTBotTreeItem rootOfEditorTree = getRootOfEditorTree(EMF_TREE_EDITOR,
				MY_EXTLIBRARY, MY_EXT_LIBRARY_PLATFORM_URI);
		// select on the editor
		getLibraryNode(rootOfEditorTree).select();
		
		// now select on the tree inside the view
		view.bot().tree().getTreeItem(WRITER_LABEL).select();
		
		SWTFormsBot formbot = formBotFromView(view);
		formbot.label(ADDRESS_LABEL);
		formbot.text(WRITER_S_ADDRESS_TEXT);
		formbot.label(FIRSTNAME_LABEL);
	}
}
