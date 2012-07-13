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
    this.assertEqualsStrings("my.empty.EmfComponentsGuiceModuleGen", _moduleQN);
  }
  
  @Test
  public void testExecutableExtensionFactoryName() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    Module _module = this.module(_emptyModule);
    String _executableExtensionFactoryQN = this.inferrer.executableExtensionFactoryQN(_module);
    this.assertEqualsStrings("my.empty.ExecutableExtensionFactory", _executableExtensionFactoryQN);
  }
  
  @Test
  public void testActivatorName() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    Module _module = this.module(_emptyModule);
    String _activatorQN = this.inferrer.activatorQN(_module);
    this.assertEqualsStrings("my.empty.Activator", _activatorQN);
  }
  
  @Test
  public void testLabelProviderName() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    Module _module = this.module(_emptyModule);
    String _labelProviderQN = this.inferrer.labelProviderQN(_module);
    this.assertEqualsStrings("my.empty.ui.provider.LabelProviderGen", _labelProviderQN);
  }
  
  @Test
  public void testFeatureLabelProviderName() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    Module _module = this.module(_emptyModule);
    String _featureLabelProviderQN = this.inferrer.featureLabelProviderQN(_module);
    this.assertEqualsStrings("my.empty.ui.provider.FeatureLabelProviderGen", _featureLabelProviderQN);
  }
}
