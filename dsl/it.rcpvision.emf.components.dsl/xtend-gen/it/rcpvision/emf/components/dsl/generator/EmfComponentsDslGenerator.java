package it.rcpvision.emf.components.dsl.generator;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

/**
 * This generator calls the standard JvmModelGenerator and
 * the generator for plugin.xml_gen
 */
@SuppressWarnings("all")
public class EmfComponentsDslGenerator implements IGenerator {
  @Inject
  private JvmModelGenerator jvmModelGenerator;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(input, fsa);
  }
}
