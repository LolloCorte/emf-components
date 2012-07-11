package it.rcpvision.emf.components.dsl.tests;

import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider;
import it.rcpvision.emf.components.dsl.model.Model;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.tests.inputs.TestInputs;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = EmfComponentsDslInjectorProvider.class)
@SuppressWarnings("all")
public class EmfComponentsDslAbstractTests {
  @Inject
  protected TestInputs inputs;
  
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  public Model parseAndAssertNoError(final CharSequence s) {
    try {
      Model _xblockexpression = null;
      {
        Model ts = this._parseHelper.parse(s);
        this._validationTestHelper.assertNoErrors(ts);
        _xblockexpression = (ts);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Module module(final CharSequence s) {
    Model _parseAndAssertNoError = this.parseAndAssertNoError(s);
    Module _module = _parseAndAssertNoError.getModule();
    return _module;
  }
  
  public void assertEqualsStrings(final Object o1, final Object o2) {
    String _plus = ("" + o1);
    String _plus_1 = ("" + o2);
    Assert.assertEquals(_plus, _plus_1);
  }
}
