package it.rcpvision.emf.components.wizards.gen;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EmfComponentsViewFilesGenerator {
  public CharSequence generateTreeFormView(final String projectName, final String simpleName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(projectName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.views.AbstractSaveableTreeFormView;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(simpleName, "");
    _builder.append("TreeFormView extends AbstractSaveableTreeFormView {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected URI createResourceURI() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTableView(final String projectName, final String simpleName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(projectName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import it.rcpvision.emf.components.views.AbstractSaveableTableView;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EClass;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.resource.Resource;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(simpleName, "");
    _builder.append("TableView extends AbstractSaveableTableView {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Object getContents(Resource resource) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected EClass getEClass() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected URI createResourceURI() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatePluginXml(final String factoryClass, final String qualifiedNameView) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?eclipse version=\"3.4\"?>");
    _builder.newLine();
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<extension");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("point=\"org.eclipse.ui.views\">");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("<view");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("class=\"");
    _builder.append(factoryClass, "               ");
    _builder.append(":");
    _builder.append(qualifiedNameView, "               ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("id=\"");
    _builder.append(qualifiedNameView, "               ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("name=\"Form View\"");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("restorable=\"true\"/>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</extension>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<extension");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("point=\"org.eclipse.ui.perspectiveExtensions\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<perspectiveExtension");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("targetID=\"*\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<view");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("id=\"");
    _builder.append(qualifiedNameView, "               ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("minimized=\"false\"");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("ratio=\"100\"");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("relationship=\"stack\"");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("relative=\"org.eclipse.ui.editorss\"");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("visible=\"true\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</view>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</perspectiveExtension>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</extension>");
    _builder.newLine();
    _builder.append("</plugin>");
    _builder.newLine();
    return _builder;
  }
}
