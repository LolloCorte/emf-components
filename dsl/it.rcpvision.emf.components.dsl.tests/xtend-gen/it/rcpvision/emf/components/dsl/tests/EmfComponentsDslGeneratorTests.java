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
    _builder_1.append("import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class TestExecutableExtensionFactory extends EmfComponentsExecutableExtensionFactory {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_emptyModule, _builder, _builder_1);
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expectedModule, final CharSequence expectedFactory) {
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
                CharSequence _value_2 = e.getValue();
                String _plus = ("unexpected generated code: " + _value_2);
                Assert.fail(_plus);
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
