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
''', null, null, null
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
  
  @Override
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
''', null, null
		)
	}

	@Test
	def testEmptyFeatureLabelProvider() {
		inputs.emptyFeatureLabelProvider.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import my.empty.ui.provider.FeatureLabelProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
    return FeatureLabelProviderGen.class;
  }
}
''',
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

public class FeatureLabelProviderGen extends FeatureLabelProvider {
}
''', null, null
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
''', null, null
		)
	}

	@Test
	def testLabelSpecifications() {
		inputs.labelSpecifications.assertCorrectJavaCodeGeneration(
null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.BookOnTape;
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
  
  public String text(final BookOnTape it) {
    String _title = it.getTitle();
    return _title;
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
''', null, null
		)
	}

	@Test
	def testFeatureLabelSpecifications() {
		inputs.featureLabelSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import my.empty.ui.provider.FeatureLabelProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
    return FeatureLabelProviderGen.class;
  }
}
''', null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class FeatureLabelProviderGen extends FeatureLabelProvider {
  public String text_Library_name(final EStructuralFeature it) {
    return "Name";
  }
  
  public String text_Library_books(final EStructuralFeature it) {
    return "Books";
  }
  
  public String text_Writer_lastName(final EStructuralFeature it) {
    String _name = it.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
}
''', null
		)
	}

	@Test
	def testFeatureSpecifications() {
		inputs.featureSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import my.empty.ui.provider.EStructuralFeaturesProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGenericModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends EStructuralFeaturesProvider> bindEStructuralFeaturesProvider() {
    return EStructuralFeaturesProviderGen.class;
  }
}
''', null, null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider.EClassToEStructuralFeatureAsStringsMap;

public class EStructuralFeaturesProviderGen extends EStructuralFeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.emf.components.examples.library.Library",
      "name");
    stringMap.mapTo("it.rcpvision.emf.components.examples.library.Writer",
      "firstName", "lastName", "books");
  }
}
'''
		)
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input,
			CharSequence expectedModule, CharSequence expectedLabelProvider, 
			CharSequence expectedFeatureLabelProvider,
			CharSequence expectedFeatureProvider) {
		input.compileAll [
			for (e : allGeneratedResources.entrySet) {
				if (e.key.endsWith("ModuleGen.java")) {
					// check the expected Java code for the module
					if (expectedModule != null)
						assertEqualsStrings(expectedModule, e.value)
				} else if (e.key.endsWith("FeatureLabelProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedFeatureLabelProvider != null)
						assertEqualsStrings(expectedFeatureLabelProvider, e.value)
				} else if (e.key.endsWith("EStructuralFeaturesProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedFeatureProvider != null)
						assertEqualsStrings(expectedFeatureProvider, e.value)
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