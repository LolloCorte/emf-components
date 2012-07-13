package it.rcpvision.emf.components.dsl.tests;

import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider;
import it.rcpvision.emf.components.dsl.tests.EmfComponentsDslAbstractTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = EmfComponentsDslInjectorProvider.class)
@SuppressWarnings("all")
public class EmfComponentsDslParserTests extends EmfComponentsDslAbstractTests {
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
}
