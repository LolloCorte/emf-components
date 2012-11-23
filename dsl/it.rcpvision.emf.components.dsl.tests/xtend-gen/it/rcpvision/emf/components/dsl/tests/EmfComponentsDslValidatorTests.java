package it.rcpvision.emf.components.dsl.tests;

import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider;
import it.rcpvision.emf.components.dsl.model.Model;
import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.tests.EmfComponentsDslAbstractTests;
import it.rcpvision.emf.components.dsl.validation.EmfComponentsDslJavaValidator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = EmfComponentsDslInjectorProvider.class)
@SuppressWarnings("all")
public class EmfComponentsDslValidatorTests extends EmfComponentsDslAbstractTests {
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testNonEmptyViewsSpecifications() {
    CharSequence _viewSpecificationIsNotIViewPart = this.inputsWithErrors.viewSpecificationIsNotIViewPart();
    Model _parseModel = this.parseModel(_viewSpecificationIsNotIViewPart);
    EClass _viewSpecification = ModelPackage.eINSTANCE.getViewSpecification();
    this._validationTestHelper.assertError(_parseModel, _viewSpecification, 
      EmfComponentsDslJavaValidator.NOT_I_VIEW_PART, 
      "Must be an IViewPart");
  }
}
