package it.rcpvision.emf.components.tests

/*
 * @author Lorenzo Bettini
 * 
 */
import org.junit.runner.RunWith
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.junit.Test
import static it.rcpvision.emf.components.dsl.generator.EmfComponentsDslOutputConfigurationProvider.*
import org.junit.Assert

@RunWith(typeof(SWTBotJunit4ClassRunner))
public class EmfComponentsDslWizardsTests extends EmfComponentsAbstractTests {

	val TEST_PROJ_NAME = "my.emfcomponents.proj"

	@Test
	def canCreateDslProjectWithWizard() {
		createProjectInWorkspace(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_DSL_PROJECT, TEST_PROJ_NAME);
		//bot.sleep(300000);
		assertNoErrorsInProjectAfterAutoBuild();
	}
	
	@Test
	def void checkPluginXmlGen() {
		createProjectInWorkspace(EMF_COMPONENTS_CATEGORY,
				NEW_EMF_COMPONENTS_DSL_PROJECT, TEST_PROJ_NAME);
		assertNoErrorsInProjectAfterAutoBuild();
		
		val editor = bot.editorByTitle("module.emfcomponents")
		
		editor.setEditorContentsSaveAndWaitForAutoBuild(
'''
module «TEST_PROJ_NAME» {
	
	// parts should trigger generation of «PLUGIN_XML_EMFCOMPONENTS_GEN»
	
	parts {
		viewpart id {
			viewname "View Name"
			viewclass it.rcpvision.emf.components.views.AbstractSaveableTreeView
			// viewcategory my.category
		}
	}
}
'''			
		)
		
		// now the generated plugin xml file should be available
		val projTree = getProjectTreeItem(TEST_PROJ_NAME)
		projTree.expand.getNode(PLUGIN_XML_EMFCOMPONENTS_GEN)
		
		editor.setEditorContentsSaveAndWaitForAutoBuild(
'''
module «TEST_PROJ_NAME» {
	// removed parts
	
	// «PLUGIN_XML_EMFCOMPONENTS_GEN» should be removed
}
'''			
		)
		
		// now the generated plugin xml file must have been removed
		Assert::assertTrue(
			PLUGIN_XML_EMFCOMPONENTS_GEN + " still present!",
			projTree.nodes.forall [ it != PLUGIN_XML_EMFCOMPONENTS_GEN ]
		)
	}

}