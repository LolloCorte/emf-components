package it.rcpvision.emf.components.dsl.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider;
import it.rcpvision.emf.components.dsl.tests.EmfComponentsDslAbstractTests;
import it.rcpvision.emf.components.dsl.tests.util.CustomCompilationTestHelper;
import it.rcpvision.emf.components.dsl.tests.util.CustomCompilationTestHelper.Result;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = EmfComponentsDslInjectorProvider.class)
@SuppressWarnings("all")
public class EmfComponentsDslGeneratorTests extends EmfComponentsDslAbstractTests {
  @Inject
  private CustomCompilationTestHelper _customCompilationTestHelper;
  
  @Test
  public void testEmptyModule() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.plugin.AbstractUIPlugin;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class TestModule extends EmfComponentsGenericModule {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public TestModule(final AbstractUIPlugin plugin) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("super(plugin);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.empty;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import com.google.inject.Injector;");
    _builder_1.newLine();
    _builder_1.append("import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;");
    _builder_1.newLine();
    _builder_1.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder_1.newLine();
    _builder_1.append("import org.osgi.framework.Bundle;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class TestExecutableExtensionFactory extends EmfComponentsExecutableExtensionFactory {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("protected Bundle getBundle() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return my.empty.TestActivator.getDefault().getBundle();");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("protected EmfComponentsGenericModule getModule() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return my.empty.TestActivator.getDefault().createModule();");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("protected Injector getInjector() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return my.empty.TestActivator.getDefault().getInjector();");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("package my.empty;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder_2.newLine();
    _builder_2.append("import it.rcpvision.emf.components.ui.EmfComponentsAbstractActivator;");
    _builder_2.newLine();
    _builder_2.append("import org.osgi.framework.BundleContext;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public class TestActivator extends EmfComponentsAbstractActivator {");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("public final static String PLUGIN_ID = \"my.empty.Test\";");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("private static TestActivator plugin;");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("public void start(final BundleContext context) throws Exception {");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("super.start(context);");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("plugin = this;");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("public void stop(final BundleContext context) throws Exception {");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("plugin = null;");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("super.stop(context);");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("public static TestActivator getDefault() {");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("return plugin;");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("protected EmfComponentsGenericModule createModule() {");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("return new my.empty.TestModule(getDefault());");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    this.assertCorrectJavaCodeGeneration(_emptyModule, _builder, _builder_1, _builder_2);
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expectedModule, final CharSequence expectedFactory, final CharSequence expectedActivator) {
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          Map<String,CharSequence> _allGeneratedResources = it.getAllGeneratedResources();
          Set<Entry<String,CharSequence>> _entrySet = _allGeneratedResources.entrySet();
          for (final Entry<String,CharSequence> e : _entrySet) {
            boolean _and = false;
            String _key = e.getKey();
            boolean _endsWith = _key.endsWith("ExecutableExtensionFactory.java");
            if (!_endsWith) {
              _and = false;
            } else {
              boolean _notEquals = (!Objects.equal(expectedFactory, null));
              _and = (_endsWith && _notEquals);
            }
            if (_and) {
              String _string = expectedFactory.toString();
              CharSequence _value = e.getValue();
              String _string_1 = _value.toString();
              Assert.assertEquals(_string, _string_1);
            } else {
              boolean _and_1 = false;
              String _key_1 = e.getKey();
              boolean _endsWith_1 = _key_1.endsWith("Module.java");
              if (!_endsWith_1) {
                _and_1 = false;
              } else {
                boolean _notEquals_1 = (!Objects.equal(expectedModule, null));
                _and_1 = (_endsWith_1 && _notEquals_1);
              }
              if (_and_1) {
                String _string_2 = expectedModule.toString();
                CharSequence _value_1 = e.getValue();
                String _string_3 = _value_1.toString();
                Assert.assertEquals(_string_2, _string_3);
              } else {
                boolean _and_2 = false;
                String _key_2 = e.getKey();
                boolean _endsWith_2 = _key_2.endsWith("Activator.java");
                if (!_endsWith_2) {
                  _and_2 = false;
                } else {
                  boolean _notEquals_2 = (!Objects.equal(expectedActivator, null));
                  _and_2 = (_endsWith_2 && _notEquals_2);
                }
                if (_and_2) {
                  String _string_4 = expectedActivator.toString();
                  CharSequence _value_2 = e.getValue();
                  String _string_5 = _value_2.toString();
                  Assert.assertEquals(_string_4, _string_5);
                } else {
                  CharSequence _value_3 = e.getValue();
                  String _plus = ("unexpected generated code: " + _value_3);
                  Assert.fail(_plus);
                }
              }
            }
          }
          it.compileToJava();
        }
      };
    this._customCompilationTestHelper.compileAll(input, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
}
