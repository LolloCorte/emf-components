package it.rcpvision.emf.components.tests;

import static org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil.cleanWorkspace;
import static org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil.createFile;
import static org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil.waitForAutoBuild;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import it.rcpvision.emf.components.tests.views.LibraryEmfView;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.results.WidgetResult;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfFormEditorAbstractTests {

	protected static final String WRITER_LABEL = "Writer Lorenzo Bettini";

	protected static final String BOOK_LABEL = "Book Lorenzo's Book";

	protected static final String LIBRARY_LABEL = "Library";

	protected static final String OUTLINE_VIEW = "Outline";

	protected static final String STATEMACHINE_LABEL = "Statemachine";

	protected static final String EVENT_LABEL = "Event doorOpened";

	protected static final String STATE_LABEL = "State idle";

	protected static final String TRANSITION_LABEL = "Transition";

	protected static final String EMF_FORM_EDITOR = "EMF Form Editor";

	protected static final String EMF_FORM_EDITOR_STATEMACHINE = "EMF Form Editor Statemachine";

	protected static final String EMF_FORM_EDITOR_NO_MOUSE = "EMF Form Editor No Mouse Events";

	protected static final String EMF_FORM_EDITOR_CUSTOM_LABEL = "EMF Form Editor Custom Label";

	protected static final String EMF_CUSTOM_LIBRARY_EDITOR = "EMF Custom Library Editor";

	protected static final String MY_EXTLIBRARY = "My.extlibrary";

	protected static final String MY_STATEMACHINE = "fowlerdsl.statemachine";

	protected static final String MY_TEST_PROJECT = "MyTestProject";

	protected static final String MY_EXTLIBRARY_RELATIVE_PATH = MY_TEST_PROJECT
			+ "/" + MY_EXTLIBRARY;

	protected static final String MY_STATEMACHINE_RELATIVE_PATH = MY_TEST_PROJECT
			+ "/" + MY_STATEMACHINE;

	protected static final String MY_EXT_LIBRARY_PLATFORM_URI = "platform:/resource/"
			+ MY_EXTLIBRARY_RELATIVE_PATH;

	protected static final String MY_STATEMACHINE_PLATFORM_URI = "platform:/resource/"
			+ MY_STATEMACHINE_RELATIVE_PATH;

	protected static final String HARDCODED_LIBRARY_PLATFORM_URI = LibraryEmfView.resourceUri;

	protected static final String LIBRARY_EMF_VIEW = "LibraryEmfView";

	protected static final String LIBRARY_EMF_VIEW_CUSTOM_LABEL = "LibraryEmfView Custom Label";

	protected static SWTWorkbenchBot bot;

	protected static Map<String, String> editorNamesToId;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();

		// increase timeout to 10 seconds
		// SWTBotPreferences.TIMEOUT = 10000;

		try {
			bot.viewByTitle("Welcome").close();
		} catch (WidgetNotFoundException e) {
			// OK!
		}

		editorNamesToId = new HashMap<String, String>();
		editorNamesToId.put(EMF_FORM_EDITOR,
				EmfFormEditorTestsActivator.EMF_FORM_EDITOR);
		editorNamesToId.put(EMF_FORM_EDITOR_STATEMACHINE,
				EmfFormEditorTestsActivator.EMF_FORM_EDITOR_FOR_STATEMACHINE);
		editorNamesToId.put(EMF_FORM_EDITOR_NO_MOUSE,
				EmfFormEditorTestsActivator.EMF_FORM_EDITOR_NO_MOUSE_ID);
		editorNamesToId.put(EMF_FORM_EDITOR_CUSTOM_LABEL,
				EmfFormEditorTestsActivator.EMF_FORM_EDITOR_CUSTOM_LABEL);
		editorNamesToId.put(EMF_CUSTOM_LIBRARY_EDITOR,
				EmfFormEditorTestsActivator.EMF_EDITOR_FOR_LIBRARY);

		bot.viewByTitle(OUTLINE_VIEW).show();
	}

	@AfterClass
	public static void clean() throws CoreException {

	}

	@After
	public void runAfterEveryTest() throws CoreException {
		// bot.sleep(2000);
		cleanWorkspace();
		waitForAutoBuild();
	}

	protected void assertPropertyViewIsOpenedAndCloseIt() {
		SWTBotView propertyView = bot.viewByTitle("Properties");
		bot.sleep(2000);
		propertyView.close();
	}

	protected SWTBotTreeItem getLibraryWriterNode(SWTBotTreeItem editorTreeRoot) {
		return getWriterNode(getLibraryNode(editorTreeRoot));
	}

	protected SWTBotTreeItem getLibraryBookNode(SWTBotTreeItem editorTreeRoot) {
		return getBookNode(getLibraryNode(editorTreeRoot));
	}

	protected SWTBotTreeItem getBookNode(SWTBotTreeItem treeItem) {
		return treeItem.expand().getNode(BOOK_LABEL);
	}

	protected void accessTreeWithCustomLabels(SWTBotTreeItem rootOfTree) {
		rootOfTree.expand().getNode("TEST " + LIBRARY_LABEL + " ENDTEST")
				.expand().getNode("TEST " + WRITER_LABEL + " ENDTEST");
	}

	protected SWTBotTreeItem accessTreeWithCustomLibraryLabels(
			SWTBotTreeItem rootOfTree) {
		return rootOfTree.expand().getNode(LIBRARY_LABEL).expand()
				.getNode("Book: Lorenzo's Book");
	}

	protected SWTBotTreeItem getLibraryNode(final SWTBotTreeItem treeItemRoot) {
		return treeItemRoot.expand().getNode(LIBRARY_LABEL);
	}

	protected SWTBotTreeItem getWriterNode(final SWTBotTreeItem treeItem) {
		return treeItem.expand().getNode(WRITER_LABEL);
	}

	protected SWTBotTreeItem getStatemachineNode(final SWTBotTreeItem treeItem) {
		return treeItem.expand().getNode(STATEMACHINE_LABEL);
	}

	protected SWTBotTreeItem getEventNode(final SWTBotTreeItem treeItem) {
		return treeItem.expand().getNode(EVENT_LABEL);
	}

	protected SWTBotTreeItem getStateNode(final SWTBotTreeItem treeItem) {
		return treeItem.expand().getNode(STATE_LABEL);
	}

	protected SWTBotTreeItem getTransitionNode(final SWTBotTreeItem treeItem) {
		return treeItem.expand().getNode(TRANSITION_LABEL);
	}

	protected void assertPropertyViewIsNotShown() {
		try {
			SWTBotView propertyView = bot.viewByTitle("Properties");
			propertyView.close();
			fail("Properties view should not show");
		} catch (WidgetNotFoundException e) {
			// OK!
		}
	}

	protected SWTBotTreeItem getRootOfOutlineViewTree() {
		SWTBotTree outlineTree = getRootOfTreeFromView(OUTLINE_VIEW);
		return outlineTree.getTreeItem(MY_EXT_LIBRARY_PLATFORM_URI);
	}

	protected SWTBotTree getRootOfTreeFromView(String view) {
		SWTBotView outlineView = bot.viewByTitle(view);
		SWTBotTree outlineTree = outlineView.bot().tree();
		return outlineTree;
	}

	protected SWTBotTreeItem getRootOfEditorTree(
			String emfFormEditorContextMenuString, String fileName,
			String treeRootLabel) throws CoreException,
			InvocationTargetException, InterruptedException, IOException {
		SWTBotTree tree = getEditorTree(emfFormEditorContextMenuString,
				fileName);
		SWTBotTreeItem treeItemRoot = tree.getTreeItem(treeRootLabel);
		return treeItemRoot;
	}

	protected SWTBotTree getEditorTree(String emfFormEditorContextMenuString,
			String fileName) throws CoreException, InvocationTargetException,
			InterruptedException, IOException {
		SWTBotEditor editor = openEmfFormEditorOnTestFile(
				emfFormEditorContextMenuString, fileName);
		SWTBotTree tree = editor.bot().tree();
		return tree;
	}

	protected SWTBotEditor openEmfFormEditorOnTestFile(
			String emfFormEditorContextMenuString, String fileName)
			throws CoreException, InvocationTargetException,
			InterruptedException, IOException {
		createProjectAndTestFiles();
		SWTBotMenu contextMenu = getFileItemFromTestProject(fileName)
				.contextMenu("Open With");
		getSubMenuItem(contextMenu, emfFormEditorContextMenuString).click();
		SWTBotEditor editor = bot.editorById(editorNamesToId
				.get(emfFormEditorContextMenuString));
		return editor;
	}

	protected SWTBotTreeItem getFileItemFromTestProject(String fileName) {
		return getProjectTreeItem(MY_TEST_PROJECT).expand().getNode(fileName);
	}

	protected void createProjectAndTestFile() throws CoreException,
			InvocationTargetException, InterruptedException, IOException {
		createSimpleProject();
		IFile file = createFile(MY_EXTLIBRARY_RELATIVE_PATH,
				localFileContents(MY_EXTLIBRARY));
		assertTrue(file.exists());
	}

	protected void createProjectAndTestFiles() throws CoreException,
			InvocationTargetException, InterruptedException, IOException {
		createProjectAndTestFile();
		IFile file = createFile(MY_STATEMACHINE_RELATIVE_PATH,
				localFileContents(MY_STATEMACHINE));
		assertTrue(file.exists());
	}

	protected String localFileContents(String string) throws IOException {
		return EmfFormEditorTestsActivator.localFileContents(string);
	}

	protected void createSimpleProject() {
		bot.menu("File").menu("New").menu("Project...").click();

		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("General").select("Project");
		bot.button("Next >").click();

		bot.textWithLabel("Project name:").setText(MY_TEST_PROJECT);

		bot.button("Finish").click();

		assertTrue("Project doesn't exist", isProjectCreated(MY_TEST_PROJECT));

		waitForAutoBuild();
	}

	protected static SWTBotView getPackageExplorer() {
		SWTBotView view = bot.viewByTitle("Package Explorer");
		return view;
	}

	protected boolean isProjectCreated(String name) {
		try {
			getProjectTreeItem(name);
			return true;
		} catch (WidgetNotFoundException e) {
			return false;
		}
	}

	protected static SWTBotTree getProjectTree() {
		SWTBotView packageExplorer = getPackageExplorer();
		SWTBotTree tree = packageExplorer.bot().tree();
		return tree;
	}

	protected SWTBotTreeItem getProjectTreeItem(String myTestProject) {
		return getProjectTree().getTreeItem(myTestProject);
	}

	protected void accessStateMachineNodes(SWTBotTreeItem root) {
		getEventNode(getStatemachineNode(root));
		getTransitionNode(getStateNode(getStatemachineNode(root)));
	}

	protected void assertTreeItemImage(SWTBotTreeItem item,
			final ImageDescriptor expectedImage) {
		final TreeItem widget = item.widget;
		// part of test that requires UI-thread
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					Image image = widget.getImage();
					// System.out.println(image);
					assertImageDataIs(expectedImage.getImageData(),
							image.getImageData());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	protected ImageDescriptor getImageDescriptorFromLibraryEdit(
			String imageFileName) {
		return getImageDescriptorFromPlugin(
				"org.eclipse.emf.examples.library.edit", "icons/full/obj16/"
						+ imageFileName);
	}

	protected ImageDescriptor getImageDescriptorFromTest(String imageFileName) {
		return getImageDescriptorFromPlugin(
				"it.rcpvision.emf.components.tests.swtbot", "icons/"
						+ imageFileName);
	}

	protected ImageDescriptor getImageDescriptorFromPlugin(String pluginId,
			String imageFileName) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(pluginId,
				imageFileName);
	}

	protected SWTBotView openTestLibraryView(String libraryView) {
		bot.menu("Window").menu("Show View").menu("Other...").click();
		SWTBotShell shell = bot.shell("Show View");
		shell.activate();
		bot.tree().expandNode("Other").select(libraryView);
		bot.button("OK").click();
		return getLibraryView(libraryView);
	}

	protected SWTBotView getLibraryView(String libraryView) {
		return bot.viewByTitle(libraryView);
	}

	protected void closeLibraryView(String libraryView) {
		getLibraryView(libraryView).close();
	}

	protected static void assertImageDataIs(ImageData expectedImageData,
			ImageData actualImageData) {
		if (expectedImageData.width != actualImageData.width
				|| expectedImageData.height != actualImageData.height) {
			fail(MessageFormat
					.format("Image data do not have the same dimensions ({0}x{1} expected, got {2}x{3})",
							expectedImageData.width, expectedImageData.height,
							actualImageData.width, actualImageData.height));
		}

		for (int y = 0; y < expectedImageData.height; y++) {
			for (int x = 0; x < expectedImageData.width; x++) {
				int actualPixel = actualImageData.getPixel(x, y);
				int expectedPixel = expectedImageData.getPixel(x, y);
				RGB actualRGB = actualImageData.palette.getRGB(actualPixel);
				RGB expectedRGB = expectedImageData.palette
						.getRGB(expectedPixel);
				if (!actualRGB.equals(expectedRGB)) {
					fail(MessageFormat.format(
							"Image data do not match at ({0},{1})", x, y));
				}
			}
		}
	}

	/**
	 * Taken from http://www.prait.ch/wordpress/?p=218
	 * 
	 * @param parentMenu
	 * @param itemText
	 * @return
	 * @throws WidgetNotFoundException
	 */
	protected static SWTBotMenu getSubMenuItem(final SWTBotMenu parentMenu,
			final String itemText) throws WidgetNotFoundException {

		MenuItem menuItem = UIThreadRunnable
				.syncExec(new WidgetResult<MenuItem>() {
					public MenuItem run() {
						Menu bar = parentMenu.widget.getMenu();
						if (bar != null) {
							for (MenuItem item : bar.getItems()) {
								if (item.getText().equals(itemText)) {
									return item;
								}
							}
						}
						return null;
					}
				});

		if (menuItem == null) {
			throw new WidgetNotFoundException("MenuItem \"" + itemText
					+ "\" not found.");
		} else {
			return new SWTBotMenu(menuItem);
		}
	}
}
