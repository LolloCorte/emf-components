package it.rcpvision.emf.components.dsl.tests.inputs;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestInputsWithErrors {
  public CharSequence duplicateLabelSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("labelProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("labels {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("images {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("labels {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence wrongFeatureLabelSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("featureLabelProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("labels {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Item:publicationDate -> \'Publication Date\'");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library:newArrayList(1) -> \'Name\' // static method, wrong");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library:getBooks -> \'Books\' // don\'t use get methods");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer:lastName -> name.toFirstUpper // the implicit param is an EStructuralFeature");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}