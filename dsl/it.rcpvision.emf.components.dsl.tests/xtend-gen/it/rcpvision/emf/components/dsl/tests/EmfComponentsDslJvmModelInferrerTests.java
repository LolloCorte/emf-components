package it.rcpvision.emf.components.dsl.tests;

import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider;
import it.rcpvision.emf.components.dsl.jvmmodel.EmfComponentsDslJvmModelInferrer;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.tests.EmfComponentsDslAbstractTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = EmfComponentsDslInjectorProvider.class)
@SuppressWarnings("all")
public class EmfComponentsDslJvmModelInferrerTests extends EmfComponentsDslAbstractTests {
  @Inject
  private EmfComponentsDslJvmModelInferrer inferrer;
  
  @Test
  public void testEmptyModule() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    this.parseAndAssertNoError(_emptyModule);
  }
  
  @Test
  public void testModuleName() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    Module _module = this.module(_emptyModule);
    String _moduleQN = this.inferrer.moduleQN(_module);
    this.assertEqualsStrings(_moduleQN, 
      "my.empty.TestModule");
  }
  
  @Test
  public void testExecutableExtensionFactoryName() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    Module _module = this.module(_emptyModule);
    String _executableExtensionFactoryQN = this.inferrer.executableExtensionFactoryQN(_module);
    this.assertEqualsStrings(_executableExtensionFactoryQN, 
      "my.empty.TestExecutableExtensionFactory");
  }
}
