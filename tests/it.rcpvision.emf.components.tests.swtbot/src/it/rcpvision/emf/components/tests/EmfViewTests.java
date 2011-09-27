package it.rcpvision.emf.components.tests;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfViewTests extends EmfFormEditorAbstractTests {

	@Test
	public void canOpenEmfTestView() throws Exception {
		openTestView(LIBRARY_EMF_VIEW);
		// bot.sleep(2000);
		closeLibraryView(LIBRARY_EMF_VIEW);
	}

	@Test
	public void emfTestViewHasTree() throws Exception {
		SWTBotView view = openTestView(LIBRARY_EMF_VIEW);
		getWriterNode(getLibraryNode(view.bot().tree()
				.getTreeItem(HARDCODED_LIBRARY_PLATFORM_URI)));
		// bot.sleep(2000);
		view.close();
	}

	@Test
	public void emfTestViewHasTreeWithCustomLabels() throws Exception {
		SWTBotView view = openTestView(LIBRARY_EMF_VIEW_CUSTOM_LABEL);
		accessTreeWithCustomLabels(view.bot().tree()
				.getTreeItem(HARDCODED_LIBRARY_PLATFORM_URI));
		// bot.sleep(2000);
		view.close();
	}

	@Test
	public void emfViewShowsSelectedFile() throws Exception {
		SWTBotView view = openTestView(LIBRARY_EMF_VIEW);
		createProjectAndTestFiles();
		getFileItemFromTestProject(MY_EXTLIBRARY).select();
		bot.sleep(2000);
		getWriterNode(getLibraryNode(getRootOfTreeFromView(LIBRARY_EMF_VIEW)
				.getTreeItem(MY_EXT_LIBRARY_PLATFORM_URI)));
		getFileItemFromTestProject(MY_STATEMACHINE).select();
		bot.sleep(2000);
		SWTBotTreeItem root = getRootOfTreeFromView(LIBRARY_EMF_VIEW)
				.getTreeItem(MY_STATEMACHINE_PLATFORM_URI);
		accessStateMachineNodes(root);
		view.close();
	}

	@Test
	public void testCustomBookImage() throws Exception {
		SWTBotView view = openTestView(LIBRARY_EMF_VIEW);
		createProjectAndTestFiles();
		getFileItemFromTestProject(MY_EXTLIBRARY).select();
		bot.sleep(2000);
		SWTBotTreeItem item = getLibraryBookNode(getRootOfTreeFromView(
				LIBRARY_EMF_VIEW).getTreeItem(MY_EXT_LIBRARY_PLATFORM_URI));
		assertTreeItemImage(item,
				getImageDescriptorFromLibraryEdit("custom_book.png"));
		view.close();
	}

}
