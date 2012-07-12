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
    _builder.append("public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("super(plugin);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertCorrectJavaCodeGeneration(_emptyModule, _builder, null);
  }
  
  @Test
  public void testEmptyLabelProvider() {
    CharSequence _emptyLabelProvider = this.inputs.emptyLabelProvider();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;");
    _builder.newLine();
    _builder.append("import my.empty.ui.provider.LabelProviderGen;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.plugin.AbstractUIPlugin;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("super(plugin);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return LabelProviderGen.class;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.empty.ui.provider;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class LabelProviderGen extends CompositeLabelProvider {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_emptyLabelProvider, _builder, _builder_1);
  }
  
  @Test
  public void testEmptyLabelSpecifications() {
    CharSequence _emptyLabelSpecifications = this.inputs.emptyLabelSpecifications();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty.ui.provider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class LabelProviderGen extends CompositeLabelProvider {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertCorrectJavaCodeGeneration(_emptyLabelSpecifications, 
      null, _builder);
  }
  
  @Test
  public void testLabelSpecifications() {
    CharSequence _labelSpecifications = this.inputs.labelSpecifications();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty.ui.provider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.Book;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.Borrower;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.Lendable;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.Library;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.Writer;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.graphics.ImageData;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.xbase.lib.Functions.Function1;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.xbase.lib.ListExtensions;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.xbase.lib.StringExtensions;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class LabelProviderGen extends CompositeLabelProvider {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public String text(final Library it) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return \"foo\";");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public String text(final Writer writer) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String _name = writer.getName();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return _name;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public String text(final Book it) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String _title = it.getTitle();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return _title;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public String text(final Lendable it) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int _copies = it.getCopies();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String _plus = (\"copies: \" + Integer.valueOf(_copies));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return _plus;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public String text(final Borrower it) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String _xblockexpression = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("EList<Lendable> _borrowed = it.getBorrowed();");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("final Function1<Lendable,Integer> _function = new Function1<Lendable,Integer>() {");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("public Integer apply(final Lendable b) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("int _copies = b.getCopies();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return Integer.valueOf(_copies);");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("List<Integer> _map = ListExtensions.<Lendable, Integer>map(_borrowed, _function);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("final String buffer = (\"borrowed: \" + _map);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("String _upperCase = buffer.toUpperCase();");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("_xblockexpression = (_upperCase);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return _xblockexpression;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Object image(final Library it) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return \"library.jpeg\";");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Object image(final Writer writer) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Object _xifexpression = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String _name = writer.getName();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (_isNullOrEmpty) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("_xifexpression = \"noname.gif\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("ImageData _imageData = new ImageData(\"writer.jpeg\");");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("_xifexpression = _imageData;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return _xifexpression;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertCorrectJavaCodeGeneration(_labelSpecifications, 
      null, _builder);
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expectedModule, final CharSequence expectedLabelProvider) {
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          Map<String,CharSequence> _allGeneratedResources = it.getAllGeneratedResources();
          Set<Entry<String,CharSequence>> _entrySet = _allGeneratedResources.entrySet();
          for (final Entry<String,CharSequence> e : _entrySet) {
            String _key = e.getKey();
            boolean _endsWith = _key.endsWith("ModuleGen.java");
            if (_endsWith) {
              boolean _notEquals = (!Objects.equal(expectedModule, null));
              if (_notEquals) {
                CharSequence _value = e.getValue();
                EmfComponentsDslGeneratorTests.this.assertEqualsStrings(expectedModule, _value);
              }
            } else {
              String _key_1 = e.getKey();
              boolean _endsWith_1 = _key_1.endsWith("LabelProviderGen.java");
              if (_endsWith_1) {
                boolean _notEquals_1 = (!Objects.equal(expectedLabelProvider, null));
                if (_notEquals_1) {
                  CharSequence _value_1 = e.getValue();
                  EmfComponentsDslGeneratorTests.this.assertEqualsStrings(expectedLabelProvider, _value_1);
                }
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
