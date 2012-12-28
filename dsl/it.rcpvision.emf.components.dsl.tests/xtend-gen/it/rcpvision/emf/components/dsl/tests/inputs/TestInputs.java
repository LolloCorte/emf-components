package it.rcpvision.emf.components.dsl.tests.inputs;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestInputs {
  public CharSequence emptyModule() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence moduleWithExtends() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty extends it.rcpvision.emf.components.dsl.tests.additional.MyTestGuiceModule {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence emptyLabelProvider() {
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
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence emptyPropertyDescriptionProvider() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("propertyDescriptionProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence emptyLabelSpecifications() {
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
    _builder.append("text {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("image {");
    _builder.newLine();
    _builder.append("\t\t\t");
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
  
  public CharSequence labelSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("labelProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library -> \'foo\' // constant");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer writer -> writer.getName() // explicit param");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Book -> title // implit \'it\' param");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Lendable -> \'copies: \' + copies");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Borrower -> { // complex block");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("val buffer = \'borrowed: \' + borrowed.map [");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("b | b.copies");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("buffer.toUpperCase");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("BookOnTape -> getTitle");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("image {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library -> \'library.jpeg\' // constant");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer writer -> ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (writer.name.nullOrEmpty) ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\"noname.gif\"");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new org.eclipse.swt.graphics.ImageData(\"writer.jpeg\")");
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
  
  public CharSequence propertyDescriptionSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("propertyDescriptionProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library:name -> \'Name\' // constant");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library:books -> \'Books\' // constant");
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
  
  public CharSequence featuresSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("featuresProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("features {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library -> name");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer -> firstName, lastName, books");
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
  
  public CharSequence formControlSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("formControlFactory {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("control {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library : name -> { }");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer : books -> ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("toolkit.createLabel(parent, ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("books.map[title].join(\", \"))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer : name -> { toolkit.createLabel(parent, \"\") }");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("target { observeText }");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer : firstName -> ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("toolkit.createLabel(parent, \"\")");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("target observeText(SWT::Modify)");
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
  
  public CharSequence viewerContentProviderSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("viewerContentProvider {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("children {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Library -> books + writers");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Writer writer -> writer.books");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Book -> author // implit \'it\' param");
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
  
  public CharSequence emptyViewsSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.empty {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("parts {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence nonEmptyViewsSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.views.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.test {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("parts {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("viewpart my.view.part {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewname \"My View\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewclass AbstractSaveableTreeView");
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
  
  public CharSequence multipleViewsSpecifications() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.examples.library.*");
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.views.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module my.test {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("parts {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("viewpart my.view.tree.part {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewname \"My Tree View\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewclass AbstractSaveableTreeView");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("viewpart my.view.form.part {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewname \"My Tree Form View\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewclass AbstractSaveableTreeFormView");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewcategory my.view.category");
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
