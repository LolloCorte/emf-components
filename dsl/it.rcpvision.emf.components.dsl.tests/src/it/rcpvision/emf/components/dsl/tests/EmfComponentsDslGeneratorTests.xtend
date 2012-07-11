package it.rcpvision.emf.components.dsl.tests

import com.google.inject.Inject
import it.rcpvision.emf.components.dsl.EmfComponentsDslInjectorProvider
import it.rcpvision.emf.components.dsl.tests.util.CustomCompilationTestHelper
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EmfComponentsDslInjectorProvider))
class EmfComponentsDslGeneratorTests extends EmfComponentsDslAbstractTests {
 
	@Inject extension CustomCompilationTestHelper

	@Test
	def testEmptyModule() {
		inputs.emptyModule.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TestModule extends EmfComponentsGenericModule {
  public TestModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
''',
'''
package my.empty;

import com.google.inject.Injector;
import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;
import org.osgi.framework.Bundle;

public class TestExecutableExtensionFactory extends EmfComponentsExecutableExtensionFactory {
  @Override
  protected Bundle getBundle() {
    return my.empty.TestActivator.getDefault().getBundle();
  }
  
  @Override
  protected EmfComponentsGenericModule getModule() {
    return my.empty.TestActivator.getDefault().createModule();
  }
  
  @Override
  protected Injector getInjector() {
    return my.empty.TestActivator.getDefault().getInjector();
  }
}
''',
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.EmfComponentsAbstractActivator;
import org.osgi.framework.BundleContext;

public class TestActivator extends EmfComponentsAbstractActivator {
  public final static String PLUGIN_ID = "my.empty.Test";
  
  private static TestActivator plugin;
  
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }
  
  public void stop(final BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }
  
  public static TestActivator getDefault() {
    return plugin;
  }
  
  protected EmfComponentsGenericModule createModule() {
    return new my.empty.TestModule(getDefault());
  }
}
'''
		)
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input,
			CharSequence expectedModule, CharSequence expectedFactory,
			CharSequence expectedActivator
	) {
		input.compileAll [
			for (e : allGeneratedResources.entrySet) {
				if (e.key.endsWith("ExecutableExtensionFactory.java") && expectedFactory != null) {
					// check the expected Java code for the factory
					assertEquals(expectedFactory.toString, e.value.toString)
				} else if (e.key.endsWith("Module.java") && expectedModule != null) {
					// check the expected Java code for the module
					assertEquals(expectedModule.toString, e.value.toString)
				} else if (e.key.endsWith("Activator.java") && expectedActivator != null) {
					// check the expected Java code for the module
					assertEquals(expectedActivator.toString, e.value.toString)
				} else
					fail("unexpected generated code: " + e.value)
			}
			
			// this will issue Java generation
			compileToJava
		]
	}
}