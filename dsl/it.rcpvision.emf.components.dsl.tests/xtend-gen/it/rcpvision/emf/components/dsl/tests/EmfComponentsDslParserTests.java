package it.rcpvision.emf.components.dsl.tests;

import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider;
import it.rcpvision.emf.components.dsl.model.Model;
import it.rcpvision.emf.components.dsl.tests.EmfComponentsDslAbstractTests;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = EmfComponentsDslInjectorProvider.class)
@SuppressWarnings("all")
public class EmfComponentsDslParserTests extends EmfComponentsDslAbstractTests {
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @BeforeClass
  public static void setCRLF() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testEmptyModule() {
    CharSequence _emptyModule = this.inputs.emptyModule();
    this.parseAndAssertNoError(_emptyModule);
  }
  
  @Test
  public void testEmptyLabelProvider() {
    CharSequence _emptyLabelProvider = this.inputs.emptyLabelProvider();
    this.parseAndAssertNoError(_emptyLabelProvider);
  }
  
  @Test
  public void testEmptyLabelSpecifications() {
    CharSequence _emptyLabelSpecifications = this.inputs.emptyLabelSpecifications();
    this.parseAndAssertNoError(_emptyLabelSpecifications);
  }
  
  @Test
  public void testLabelSpecifications() {
    CharSequence _labelSpecifications = this.inputs.labelSpecifications();
    this.parseAndAssertNoError(_labelSpecifications);
  }
  
  @Test
  public void testDuplicateLabelSpecifications() {
    CharSequence _duplicateLabelSpecifications = this.inputsWithErrors.duplicateLabelSpecifications();
    this.parseAndAssertErrors(_duplicateLabelSpecifications);
  }
  
  @Test
  public void testFeatureLabelSpecifications() {
    CharSequence _featureLabelSpecifications = this.inputs.featureLabelSpecifications();
    this.parseAndAssertNoError(_featureLabelSpecifications);
  }
  
  @Test
  public void testWrongFeatureLabelSpecifications() {
    CharSequence _wrongFeatureLabelSpecifications = this.inputsWithErrors.wrongFeatureLabelSpecifications();
    final Model model = this.parseModel(_wrongFeatureLabelSpecifications);
    EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
    this._validationTestHelper.assertError(model, _xFeatureCall, 
      Diagnostic.LINKING_DIAGNOSTIC, 
      "newArrayList");
    EClass _xFeatureCall_1 = XbasePackage.eINSTANCE.getXFeatureCall();
    this._validationTestHelper.assertError(model, _xFeatureCall_1, 
      Diagnostic.LINKING_DIAGNOSTIC, 
      "getBooks");
  }
  
  @Test
  public void testFeatureSpecifications() {
    CharSequence _featureSpecifications = this.inputs.featureSpecifications();
    this.parseAndAssertNoError(_featureSpecifications);
  }
}
