package it.rcpvision.emf.components.tests;

import static org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil.root;
import static org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil.waitForAutoBuild;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsWizardsTests extends EmfComponentsAbstractTests {

	protected static final String EMF_COMPONENTS_PROJECT = "EmfComponentsProject";
	protected static final String NEW_EMF_COMPONENTS_PROJECT = "New Emf Components Project";
	protected static final String EMF_COMPONENTS_CATEGORY = "Emf Components";

	protected static final String PLUGINPROJECT_CATEGORY = "Plug-in Development";
	protected static final String NEW_PLUGINPROJECT = "Plug-in Project";
	protected static final String NAME_PLUGINPROJECT = "it.rcpvision.countervision.demoentity";
	protected static final String NAME_ENTITY = "DemoEntity";

	// @Test
	public void canCreateProjectWithWizard() throws Exception {
		createProjectInWorkspace(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_PROJECT, EMF_COMPONENTS_PROJECT);
		assertNoErrorsInProject();
	}

	protected void assertNoErrorsInProject() throws CoreException {
		IMarker[] markers = root().findMarkers(IMarker.PROBLEM, true,
				IResource.DEPTH_INFINITE);
		assertEquals("expected no markers: " + printMarkers(markers), 0,
				markers.length);
	}

	private String printMarkers(IMarker[] markers) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < markers.length; i++) {
			try {
				buffer.append(markers[i].getAttribute(IMarker.MESSAGE) + "\n");
			} catch (CoreException e) {
			}
		}
		return buffer.toString();
	}

	// @Test
	public void createPluginProjectFromWizard() throws Exception {
		createEditableMasterDetailFromWizard(PLUGINPROJECT_CATEGORY,
				NEW_PLUGINPROJECT, NAME_PLUGINPROJECT, NAME_ENTITY);
		checkPerspectiveDialog();
		assertTrue("Project doesn't exist",
				isProjectCreated(NAME_PLUGINPROJECT));
		assertNoErrorsInProject();
		runAfterEveryTest();
	}

	@Test
	public void checkPluginProjectFromWizard() throws Exception {

		createEditableMasterDetailFromWizard(PLUGINPROJECT_CATEGORY,
				NEW_PLUGINPROJECT, NAME_PLUGINPROJECT, NAME_ENTITY);
		checkPerspectiveDialog();
		assertTrue("Project doesn't exist",
				isProjectCreated(NAME_PLUGINPROJECT));
		assertNoErrorsInProject();
		checkClassNames();

		runAfterEveryTest();
	}

	private void checkClassNames() {
		SWTBotTreeItem srcTreeItem = getProjectTree()
				.getTreeItem(NAME_PLUGINPROJECT).expand().getNode("src");
		SWTBotTreeItem[] packageRootContent = srcTreeItem.expand().getNode(NAME_PLUGINPROJECT).expand().getItems();
		List<String> packageRootContentClassNames = new ArrayList<String>();
		for (SWTBotTreeItem classItem : packageRootContent) {
			packageRootContentClassNames.add(classItem.getText());
		}
		assertTrue(packageRootContentClassNames.contains("Activator.java"));
		assertTrue(packageRootContentClassNames.contains(NAME_ENTITY + "ViewConfigurator.java"));
		
		SWTBotTreeItem[] packageGuiceContent = srcTreeItem.expand().getNode(NAME_PLUGINPROJECT + ".internal.guice").expand().getItems();
		List<String> packageGuiceContentClassNames = new ArrayList<String>();
		for (SWTBotTreeItem classInternalItem : packageGuiceContent) {
			packageGuiceContentClassNames.add(classInternalItem.getText());
		}
		assertTrue(packageGuiceContentClassNames.contains(NAME_ENTITY + "BindingFactory.java"));
		assertTrue(packageGuiceContentClassNames.contains(NAME_ENTITY + "ExecutableExtensionFactory.java"));
		assertTrue(packageGuiceContentClassNames.contains(NAME_ENTITY + "FeatureLabelProvider.java"));
		assertTrue(packageGuiceContentClassNames.contains(NAME_ENTITY + "Module.java"));
	}
}
