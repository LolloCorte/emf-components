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

public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
''', null
		)
	}

	@Test
	def testEmptyLabelProvider() {
		inputs.emptyLabelProvider.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import my.empty.ui.provider.LabelProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
    return LabelProviderGen.class;
  }
}
''',
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

public class LabelProviderGen extends CompositeLabelProvider {
}
'''
		)
	}

	@Test
	def testEmptyLabelSpecifications() {
		inputs.emptyLabelSpecifications.assertCorrectJavaCodeGeneration(
null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

public class LabelProviderGen extends CompositeLabelProvider {
}
'''
		)
	}

	@Test
	def testLabelSpecifications() {
		inputs.labelSpecifications.assertCorrectJavaCodeGeneration(
null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Borrower;
import it.rcpvision.emf.components.examples.library.Lendable;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class LabelProviderGen extends CompositeLabelProvider {
  public String text(final Library it) {
    return "foo";
  }
  
  public String text(final Writer writer) {
    String _name = writer.getName();
    return _name;
  }
  
  public String text(final Book it) {
    String _title = it.getTitle();
    return _title;
  }
  
  public String text(final Lendable it) {
    int _copies = it.getCopies();
    String _plus = ("copies: " + Integer.valueOf(_copies));
    return _plus;
  }
  
  public String text(final Borrower it) {
    String _xblockexpression = null;
    {
      EList<Lendable> _borrowed = it.getBorrowed();
      final Function1<Lendable,Integer> _function = new Function1<Lendable,Integer>() {
          public Integer apply(final Lendable b) {
            int _copies = b.getCopies();
            return Integer.valueOf(_copies);
          }
        };
      List<Integer> _map = ListExtensions.<Lendable, Integer>map(_borrowed, _function);
      final String buffer = ("borrowed: " + _map);
      String _upperCase = buffer.toUpperCase();
      _xblockexpression = (_upperCase);
    }
    return _xblockexpression;
  }
  
  public Object image(final Library it) {
    return "library.jpeg";
  }
  
  public Object image(final Writer writer) {
    Object _xifexpression = null;
    String _name = writer.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    if (_isNullOrEmpty) {
      _xifexpression = "noname.gif";
    } else {
      ImageData _imageData = new ImageData("writer.jpeg");
      _xifexpression = _imageData;
    }
    return _xifexpression;
  }
}
'''
		)
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input,
			CharSequence expectedModule, CharSequence expectedLabelProvider) {
		input.compileAll [
			for (e : allGeneratedResources.entrySet) {
				if (e.key.endsWith("ModuleGen.java")) {
					// check the expected Java code for the module
					if (expectedModule != null)
						assertEqualsStrings(expectedModule, e.value)
				} else if (e.key.endsWith("LabelProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedLabelProvider != null)
						assertEqualsStrings(expectedLabelProvider, e.value)
				} else
					fail("unexpected generated code: " + e.value)
			}
			
			// this will issue Java generation
			compileToJava
		]
	}
}