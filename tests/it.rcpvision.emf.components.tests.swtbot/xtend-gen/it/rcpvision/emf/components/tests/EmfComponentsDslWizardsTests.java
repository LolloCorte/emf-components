package it.rcpvision.emf.components.tests;

import com.google.common.base.Objects;
import it.rcpvision.emf.components.dsl.generator.EmfComponentsDslOutputConfigurationProvider;
import it.rcpvision.emf.components.tests.EmfComponentsAbstractTests;
import java.util.List;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = SWTBotJunit4ClassRunner.class)
@SuppressWarnings("all")
public class EmfComponentsDslWizardsTests extends EmfComponentsAbstractTests {
  private final String TEST_PROJ_NAME = "my.emfcomponents.proj";
  
  @Test
  public void canCreateDslProjectWithWizard() {
    try {
      this.createProjectInWorkspace(EmfComponentsAbstractTests.EMF_COMPONENTS_CATEGORY, 
        EmfComponentsAbstractTests.NEW_EMF_COMPONENTS_DSL_PROJECT, this.TEST_PROJ_NAME);
      this.assertNoErrorsInProjectAfterAutoBuild();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkPluginXmlGen() {
    try {
      this.createProjectInWorkspace(EmfComponentsAbstractTests.EMF_COMPONENTS_CATEGORY, 
        EmfComponentsAbstractTests.NEW_EMF_COMPONENTS_DSL_PROJECT, this.TEST_PROJ_NAME);
      this.assertNoErrorsInProjectAfterAutoBuild();
      final SWTBotEditor editor = EmfComponentsAbstractTests.bot.editorByTitle("module.emfcomponents");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module ");
      _builder.append(this.TEST_PROJ_NAME, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// parts should trigger generation of ");
      _builder.append(EmfComponentsDslOutputConfigurationProvider.PLUGIN_XML_EMFCOMPONENTS_GEN, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("parts {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("viewpart id {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("viewname \"View Name\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("viewclass it.rcpvision.emf.components.views.AbstractSaveableTreeView");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// viewcategory my.category");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.setEditorContentsSaveAndWaitForAutoBuild(editor, _builder);
      final SWTBotTreeItem projTree = this.getProjectTreeItem(this.TEST_PROJ_NAME);
      SWTBotTreeItem _expand = projTree.expand();
      _expand.getNode(EmfComponentsDslOutputConfigurationProvider.PLUGIN_XML_EMFCOMPONENTS_GEN);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module ");
      _builder_1.append(this.TEST_PROJ_NAME, "");
      _builder_1.append(" {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("// removed parts");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("// ");
      _builder_1.append(EmfComponentsDslOutputConfigurationProvider.PLUGIN_XML_EMFCOMPONENTS_GEN, "	");
      _builder_1.append(" should be removed");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _builder_1.newLine();
      this.setEditorContentsSaveAndWaitForAutoBuild(editor, _builder_1);
      String _plus = (EmfComponentsDslOutputConfigurationProvider.PLUGIN_XML_EMFCOMPONENTS_GEN + " still present!");
      List<String> _nodes = projTree.getNodes();
      final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
          public Boolean apply(final String it) {
            boolean _notEquals = (!Objects.equal(it, EmfComponentsDslOutputConfigurationProvider.PLUGIN_XML_EMFCOMPONENTS_GEN));
            return Boolean.valueOf(_notEquals);
          }
        };
      boolean _forall = IterableExtensions.<String>forall(_nodes, _function);
      Assert.assertTrue(_plus, _forall);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
