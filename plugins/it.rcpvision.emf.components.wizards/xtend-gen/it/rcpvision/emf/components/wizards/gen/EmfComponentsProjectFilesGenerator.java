package it.rcpvision.emf.components.wizards.gen;

import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EmfComponentsProjectFilesGenerator {
  public StringConcatenation generateManifest(final String projectName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Manifest-Version: 1.0");
    _builder.newLine();
    _builder.append("Bundle-ManifestVersion: 2");
    _builder.newLine();
    _builder.append("Bundle-Name: ");
    _builder.append(projectName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-SymbolicName: ");
    _builder.append(projectName, "");
    _builder.append(";singleton:=true");
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-Version: 1.0.0.qualifier");
    _builder.newLine();
    _builder.append("Bundle-Activator: ");
    _builder.append(projectName, "");
    _builder.append(".Activator");
    _builder.newLineIfNotEmpty();
    _builder.append("Require-Bundle: org.eclipse.ui,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.core.runtime,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("it.rcpvision.emf.components");
    _builder.newLine();
    _builder.append("Bundle-ActivationPolicy: lazy");
    _builder.newLine();
    _builder.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.6");
    _builder.newLine();
    return _builder;
  }
}
