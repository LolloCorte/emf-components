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
    this.assertCorrectJavaCodeGeneration(_emptyModule, _builder, null, null, null);
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
    _builder.append("@Override");
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
    this.assertCorrectJavaCodeGeneration(_emptyLabelProvider, _builder, _builder_1, null, null);
  }
  
  @Test
  public void testEmptyFeatureLabelProvider() {
    CharSequence _emptyFeatureLabelProvider = this.inputs.emptyFeatureLabelProvider();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;");
    _builder.newLine();
    _builder.append("import my.empty.ui.provider.FeatureLabelProviderGen;");
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
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return FeatureLabelProviderGen.class;");
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
    _builder_1.append("import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class FeatureLabelProviderGen extends FeatureLabelProvider {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_emptyFeatureLabelProvider, _builder, _builder_1, null, null);
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
      null, _builder, null, null);
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
    _builder.append("import it.rcpvision.emf.components.examples.library.BookOnTape;");
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
    _builder.append("public String text(final BookOnTape it) {");
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
      null, _builder, null, null);
  }
  
  @Test
  public void testFeatureLabelSpecifications() {
    CharSequence _featureLabelSpecifications = this.inputs.featureLabelSpecifications();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;");
    _builder.newLine();
    _builder.append("import my.empty.ui.provider.FeatureLabelProviderGen;");
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
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return FeatureLabelProviderGen.class;");
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
    _builder_1.append("import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.emf.ecore.EStructuralFeature;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.StringExtensions;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class FeatureLabelProviderGen extends PropertyDescriptionProvider {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String text_Library_name(final EStructuralFeature it) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return \"Name\";");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String text_Library_books(final EStructuralFeature it) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return \"Books\";");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String text_Writer_lastName(final EStructuralFeature it) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String _name = it.getName();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String _firstUpper = StringExtensions.toFirstUpper(_name);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return _firstUpper;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_featureLabelSpecifications, _builder, null, _builder_1, null);
  }
  
  @Test
  public void testFeatureSpecifications() {
    CharSequence _featureSpecifications = this.inputs.featureSpecifications();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.empty;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.EmfComponentsGenericModule;");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;");
    _builder.newLine();
    _builder.append("import my.empty.ui.provider.EStructuralFeaturesProviderGen;");
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
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Class<? extends EStructuralFeaturesProvider> bindEStructuralFeaturesProvider() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return EStructuralFeaturesProviderGen.class;");
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
    _builder_1.append("import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;");
    _builder_1.newLine();
    _builder_1.append("import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider.EClassToEStructuralFeatureAsStringsMap;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class EStructuralFeaturesProviderGen extends EStructuralFeaturesProvider {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("super.buildStringMap(stringMap);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("stringMap.mapTo(\"it.rcpvision.emf.components.examples.library.Library\",");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("\"name\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("stringMap.mapTo(\"it.rcpvision.emf.components.examples.library.Writer\",");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("\"firstName\", \"lastName\", \"books\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_featureSpecifications, _builder, null, null, _builder_1);
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expectedModule, final CharSequence expectedLabelProvider, final CharSequence expectedFeatureLabelProvider, final CharSequence expectedFeatureProvider) {
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
              boolean _endsWith_1 = _key_1.endsWith("FeatureLabelProviderGen.java");
              if (_endsWith_1) {
                boolean _notEquals_1 = (!Objects.equal(expectedFeatureLabelProvider, null));
                if (_notEquals_1) {
                  CharSequence _value_1 = e.getValue();
                  EmfComponentsDslGeneratorTests.this.assertEqualsStrings(expectedFeatureLabelProvider, _value_1);
                }
              } else {
                String _key_2 = e.getKey();
                boolean _endsWith_2 = _key_2.endsWith("EStructuralFeaturesProviderGen.java");
                if (_endsWith_2) {
                  boolean _notEquals_2 = (!Objects.equal(expectedFeatureProvider, null));
                  if (_notEquals_2) {
                    CharSequence _value_2 = e.getValue();
                    EmfComponentsDslGeneratorTests.this.assertEqualsStrings(expectedFeatureProvider, _value_2);
                  }
                } else {
                  String _key_3 = e.getKey();
                  boolean _endsWith_3 = _key_3.endsWith("LabelProviderGen.java");
                  if (_endsWith_3) {
                    boolean _notEquals_3 = (!Objects.equal(expectedLabelProvider, null));
                    if (_notEquals_3) {
                      CharSequence _value_3 = e.getValue();
                      EmfComponentsDslGeneratorTests.this.assertEqualsStrings(expectedLabelProvider, _value_3);
                    }
                  } else {
                    CharSequence _value_4 = e.getValue();
                    String _plus = ("unexpected generated code: " + _value_4);
                    Assert.fail(_plus);
                  }
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
