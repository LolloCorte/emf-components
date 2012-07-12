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
}
