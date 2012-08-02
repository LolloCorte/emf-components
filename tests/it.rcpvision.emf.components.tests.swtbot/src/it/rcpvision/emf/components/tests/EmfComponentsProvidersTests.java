package it.rcpvision.emf.components.tests;

import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.LIBRARY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.EXTLibraryPackage;
import it.rcpvision.emf.components.examples.library.Writer;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFormFeatureLabelProvider;
import it.rcpvision.emf.components.tests.providers.LibraryEStructuralFeaturesAsStringsProvider;
import it.rcpvision.emf.components.tests.providers.LibraryEStructuralFeaturesProvider;
import it.rcpvision.emf.components.tests.providers.OrderedEStructuralFeaturesProvider;
import it.rcpvision.emf.components.tests.utils.EmfComponentsTestsUtils;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Lorenzo Bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsProvidersTests extends EmfComponentsCustomLibraryAbstractTests {

	protected EXTLibraryFactory libFactory = EXTLibraryFactory.eINSTANCE;

	protected EmfComponentsTestsUtils utils = new EmfComponentsTestsUtils();

	@Test
	public void testLibraryFeatureLabelProvider() {
		FormFeatureLabelFactory formFeatureLabelFactory = getInjector()
				.getInstance(CustomLibraryFormFeatureLabelProvider.class);
		assertLabelForFeature(formFeatureLabelFactory, "First name",
				EXTLibraryPackage.Literals.PERSON__FIRST_NAME);
		assertLabelForFeature(formFeatureLabelFactory, "Last name",
				EXTLibraryPackage.Literals.PERSON__LAST_NAME);
	}

	@Test
	public void testLibraryFeatureLabelProviderForLabelWidget() {
		final FormFeatureLabelFactory formFeatureLabelFactory = getInjector()
				.getInstance(CustomLibraryFormFeatureLabelProvider.class);
		final SWTBotView view = openTestView(LIBRARY_EMF_VIEW);
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					// we need a non-null display and parent so we use
					// those in the view and in the tree
					FormToolkit formToolkit = createFormToolkit(view);
					formFeatureLabelFactory.setFormToolkit(formToolkit);
					Label label = formFeatureLabelFactory.getLabel(
							createCompositeParent(view),
							EXTLibraryPackage.Literals.WRITER__NAME);
					assertEquals(
							formToolkit.getColors().getColor(IFormColors.TITLE),
							label.getBackground());
				} catch (Exception ex) {
					fail(ex.getMessage());
				}
			}
		});
		closeLibraryView(LIBRARY_EMF_VIEW);
	}

	@Test
	public void testFormFeatureControlFactoryMethodWithTwoParams() {
		final FormFeatureControlFactory bindingFactory = getInjector().getInstance(
				FormFeatureControlFactory.class);
		final Writer writer = createTestResourceAndWriter();
		final SWTBotView view = openTestView(LIBRARY_EMF_VIEW);
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					// we need a non-null display and parent so we use
					// those in the view and in the tree
					FormToolkit formToolkit = createFormToolkit(view);
					bindingFactory.init(null, writer,
							createCompositeParent(view), formToolkit);
					Control control = bindingFactory
							.create(EXTLibraryPackage.Literals.WRITER__NAME);
					assertEquals(
							formToolkit.getColors().getColor(IFormColors.TITLE),
							control.getBackground());
				} catch (Exception ex) {
					fail(ex.getMessage());
				}
			}
		});
		closeLibraryView(LIBRARY_EMF_VIEW);
	}

	@Test
	public void testFormFeatureControlFactoryMethodWithOneParam() {
		final FormFeatureControlFactory bindingFactory = getInjector().getInstance(
				FormFeatureControlFactory.class);
		final Writer writer = createTestResourceAndWriter();
		final SWTBotView view = openTestView(LIBRARY_EMF_VIEW);
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					// we need a non-null display and parent so we use
					// those in the view and in the tree
					FormToolkit formToolkit = createFormToolkit(view);
					bindingFactory.init(null, writer,
							createCompositeParent(view), formToolkit);
					Control control = bindingFactory
							.create(EXTLibraryPackage.Literals.WRITER__BOOKS);
					assertEquals("Test Book 1, Test Book 1",
							((Label)control).getText());
				} catch (Exception ex) {
					fail(ex.getMessage());
				}
			}
		});
		closeLibraryView(LIBRARY_EMF_VIEW);
	}
	
	protected Writer createTestResourceAndWriter() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createURI("http:///My.extlibrary"));
		final Writer writer = EXTLibraryFactory.eINSTANCE.createWriter();
		createTestBook(writer);
		createTestBook(writer);
		resource.getContents().add(writer);
		return writer;
	}

	protected void createTestBook(Writer writer) {
		Book book = EXTLibraryFactory.eINSTANCE.createBook();
		book.setTitle("Test Book 1");
		writer.getBooks().add(book);
	}

	@Test
	public void testEClassFeatureProviderGetAllFeatures() {
		EClass test = LIBRARY;
		assertFeatureNames(test.getEAllStructuralFeatures(),
				getInjector().getInstance(FeaturesProvider.class)
						.getFeatures(test));
	}

	@Test
	public void testEClassFeatureProviderOrdered() {
		EClass test = LIBRARY;
		assertFeatureNames(
				"address, books, borrowers, branches, employees, name, parentBranch, people, stock, writers",
				getInjector().getInstance(
						OrderedEStructuralFeaturesProvider.class).getFeatures(
						test));
	}

	@Test
	public void testEClassFeatureProviderPolymorphic() {
		FeaturesProvider provider = getInjector().getInstance(
				LibraryEStructuralFeaturesProvider.class);
		assertFeatureNames("name, address", provider.getFeatures(LIBRARY));
		assertFeatureNames("firstName, lastName, address",
				provider.getFeatures(EXTLibraryPackage.Literals.PERSON));
		assertFeatureNames("firstName, lastName, books",
				provider.getFeatures(EXTLibraryPackage.Literals.WRITER));
	}

	@Test
	public void testEClassFeatureProviderAsStringsPolymorphic() {
		FeaturesProvider provider = getInjector().getInstance(
				LibraryEStructuralFeaturesAsStringsProvider.class);
		assertFeatureNames("name, address", provider.getFeatures(LIBRARY));
		assertFeatureNames("firstName, lastName, address",
				provider.getFeatures(EXTLibraryPackage.Literals.PERSON));
		assertFeatureNames("firstName, lastName, books",
				provider.getFeatures(EXTLibraryPackage.Literals.WRITER));
	}

	protected void assertFeatureNames(Iterable<EStructuralFeature> expected,
			Iterable<EStructuralFeature> actual) {
		assertEquals(utils.toStringNameBased(expected),
				utils.toStringNameBased(actual));
	}

	protected void assertFeatureNames(String expected,
			Iterable<EStructuralFeature> actual) {
		assertEquals(expected, utils.toStringNameBased(actual));
	}

	protected void assertLabelForFeature(
			FormFeatureLabelFactory formFeatureLabelFactory, String expected,
			EStructuralFeature feature) {
		String labelText = formFeatureLabelFactory.getText(feature);
		assertEquals(expected, labelText);
	}

	protected FormToolkit createFormToolkit(final SWTBotView view) {
		return new FormToolkit(view.getWidget().getDisplay());
	}

	protected Composite createCompositeParent(final SWTBotView view) {
		return view.bot().tree().widget.getParent();
	}
}