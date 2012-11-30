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

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
''', null, null, null, null, null, null
		)
	}

	@Test
	def testEmptyLabelProvider() {
		inputs.emptyLabelProvider.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import my.empty.ui.provider.LabelProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ViewerLabelProvider> bindViewerLabelProvider() {
    return LabelProviderGen.class;
  }
}
''',
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;

public class LabelProviderGen extends ViewerLabelProvider {
}
''', null, null, null, null, null
		)
	}

	@Test
	def testEmptyPropertyDescriptionProvider() {
		inputs.emptyPropertyDescriptionProvider.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import my.empty.ui.provider.PropertyDescriptionProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
    return PropertyDescriptionProviderGen.class;
  }
}
''',
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

public class PropertyDescriptionProviderGen extends PropertyDescriptionProvider {
}
''', null, null, null, null, null
		)
	}

	@Test
	def testEmptyLabelSpecifications() {
		inputs.emptyLabelSpecifications.assertCorrectJavaCodeGeneration(
null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;

public class LabelProviderGen extends ViewerLabelProvider {
}
''', null, null, null, null, null
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
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class LabelProviderGen extends ViewerLabelProvider {
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
''', null, null, null, null, null
		)
	}

	@Test
	def testPropertyDescriptionSpecifications() {
		inputs.propertyDescriptionSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import my.empty.ui.provider.PropertyDescriptionProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
    return PropertyDescriptionProviderGen.class;
  }
}
''', null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class PropertyDescriptionProviderGen extends PropertyDescriptionProvider {
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
''', null, null, null, null
		)
	}

	@Test
	def testFeaturesSpecifications() {
		inputs.featuresSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import my.empty.ui.provider.FeaturesProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return FeaturesProviderGen.class;
  }
}
''', null, null,
'''
package my.empty.ui.provider;

import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider.EClassToEStructuralFeatureAsStringsMap;

public class FeaturesProviderGen extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.emf.components.examples.library.Library",
      "name");
    stringMap.mapTo("it.rcpvision.emf.components.examples.library.Writer",
      "firstName", "lastName", "books");
  }
}
''', null, null, null
		)
	}

	@Test
	def testFormFeatureControlSpecifications() {
		inputs.formFeatureControlSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import my.empty.binding.FormFeatureControlFactoryGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends FormFeatureControlFactory> bindFormFeatureControlFactory() {
    return FormFeatureControlFactoryGen.class;
  }
}
''', null, null, null,
'''
package my.empty.binding;

import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;
import java.util.List;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

public class FormFeatureControlFactoryGen extends FormFeatureControlFactory {
  public Control control_Library_name(final Library it) {
    return null;
  }
  
  public Control control_Writer_books(final Writer it) {
    FormToolkit _toolkit = this.getToolkit();
    Composite _parent = this.getParent();
    EList<Book> _books = it.getBooks();
    final Function1<Book,String> _function = new Function1<Book,String>() {
        public String apply(final Book it) {
          String _title = it.getTitle();
          return _title;
        }
      };
    List<String> _map = ListExtensions.<Book, String>map(_books, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Label _createLabel = _toolkit.createLabel(_parent, _join);
    return _createLabel;
  }
  
  public Control control_Writer_name(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_Writer_name();
    dataBindingContext.bindValue(
    	createTarget_Writer_name(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_Writer_name() {
    FormToolkit _toolkit = this.getToolkit();
    Composite _parent = this.getParent();
    Label _createLabel = _toolkit.createLabel(_parent, "");
    return _createLabel;
  }
  
  protected IObservableValue createTarget_Writer_name(final Control it) {
    ISWTObservableValue _observeText = SWTObservables.observeText(it);
    return _observeText;
  }
  
  public Control control_Writer_firstName(final DataBindingContext dataBindingContext, final IObservableValue observableValue) {
    Control control = createControl_Writer_firstName();
    dataBindingContext.bindValue(
    	createTarget_Writer_firstName(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_Writer_firstName() {
    FormToolkit _toolkit = this.getToolkit();
    Composite _parent = this.getParent();
    Label _createLabel = _toolkit.createLabel(_parent, "");
    return _createLabel;
  }
  
  protected IObservableValue createTarget_Writer_firstName(final Control it) {
    ISWTObservableValue _observeText = SWTObservables.observeText(it, SWT.Modify);
    return _observeText;
  }
}
''', null, null
		)
	}

	@Test
	def testViewerContentProviderSpecifications() {
		inputs.viewerContentProviderSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.empty;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;
import my.empty.edit.ui.provider.ViewerContentProviderGen;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ViewerContentProvider> bindViewerContentProvider() {
    return ViewerContentProviderGen.class;
  }
}
''', null, null, null, null,
'''
package my.empty.edit.ui.provider;

import com.google.common.collect.Iterables;
import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;
import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class ViewerContentProviderGen extends ViewerContentProvider {
  public Object children(final Library it) {
    EList<Book> _books = it.getBooks();
    EList<Writer> _writers = it.getWriters();
    Iterable<EObject> _plus = Iterables.<EObject>concat(_books, _writers);
    return _plus;
  }
  
  public Object children(final Writer writer) {
    EList<Book> _books = writer.getBooks();
    return _books;
  }
  
  public Object children(final Book it) {
    Writer _author = it.getAuthor();
    return _author;
  }
}
''', null
		)
	}

	@Test
	def testViewsSpecifications() {
		inputs.multipleViewsSpecifications.assertCorrectJavaCodeGeneration(
'''
package my.test;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
''', null, null, null, null, null,
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
	<extension
	      point="org.eclipse.ui.views">
	    <view
	          category="it.rcpvision.emf.components"
	          class="my.test.TestExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeView"
	          id="my.view.tree.part"
	          name="My Tree View"
	          restorable="true">
	    </view>
	    <view
	          category="my.view.category"
	          class="my.test.TestExecutableExtensionFactory:it.rcpvision.emf.components.views.AbstractSaveableTreeFormView"
	          id="my.view.form.part"
	          name="My Tree Form View"
	          restorable="true">
	    </view>
	</extension>
</plugin>
'''
		)
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input,
			CharSequence expectedModule, CharSequence expectedLabelProvider, 
			CharSequence expectedPropertyDescriptionProvider,
			CharSequence expectedFeatureProvider,
			CharSequence expectedFormFeatureControlFactory,
			CharSequence expectedViewerContentProvider,
			CharSequence expectedPluginXmlGen) {
		input.compileAll [
			for (e : allGeneratedResources.entrySet) {
				if (e.key.endsWith("ModuleGen.java")) {
					// check the expected Java code for the module
					if (expectedModule != null)
						assertEqualsStrings(expectedModule, e.value)
				} else if (e.key.endsWith("PropertyDescriptionProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedPropertyDescriptionProvider != null)
						assertEqualsStrings(expectedPropertyDescriptionProvider, e.value)
				} else if (e.key.endsWith("FeaturesProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedFeatureProvider != null)
						assertEqualsStrings(expectedFeatureProvider, e.value)
				} else if (e.key.endsWith("LabelProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedLabelProvider != null)
						assertEqualsStrings(expectedLabelProvider, e.value)
				} else if (e.key.endsWith("FormFeatureControlFactoryGen.java")) {
					// check the expected Java code for the module
					if (expectedFormFeatureControlFactory != null)
						assertEqualsStrings(expectedFormFeatureControlFactory, e.value)
				} else if (e.key.endsWith("ViewerContentProviderGen.java")) {
					// check the expected Java code for the module
					if (expectedViewerContentProvider != null)
						assertEqualsStrings(expectedViewerContentProvider, e.value)
				} else if (e.key.endsWith(".xml.emfcomponents_gen")) {
					// check the expected Java code for the module
					if (expectedPluginXmlGen != null)
						assertEqualsStrings(expectedPluginXmlGen, e.value)
				} else
					fail("unexpected generated code: " + e.value)
			}
			
			// this will issue Java generation
			compileToJava
		]
	}
}