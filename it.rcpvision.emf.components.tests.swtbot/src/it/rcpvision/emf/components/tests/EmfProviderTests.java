package it.rcpvision.emf.components.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import it.rcpvision.emf.components.tests.factories.CustomLibraryExecutableExtensionFactory;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFeatureLabelProvider;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfProviderTests extends EmfFormEditorAbstractTests {

	protected static CustomLibraryExecutableExtensionFactory factory;

	@BeforeClass
	public static void initializeFactory() {
		factory = new CustomLibraryExecutableExtensionFactory();
	}

	@Test
	public void testLibraryFeatureLabelProvider() {
		FeatureLabelProvider featureLabelProvider = factory.getInjector()
				.getInstance(CustomLibraryFeatureLabelProvider.class);
		assertLabelForFeature(featureLabelProvider, "First name",
				EXTLibraryPackage.Literals.PERSON__FIRST_NAME);
		assertLabelForFeature(featureLabelProvider, "Last name",
				EXTLibraryPackage.Literals.PERSON__LAST_NAME);
	}

	@Test
	public void testLibraryFeatureLabelProviderForLabelWidget() {
		final FeatureLabelProvider featureLabelProvider = factory.getInjector()
				.getInstance(CustomLibraryFeatureLabelProvider.class);
		final SWTBotView view = openTestLibraryView(LIBRARY_EMF_VIEW);
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					// we need a non-null display and parent so we use
					// those in the view and in the tree
					FormToolkit formToolkit = createFormToolkit(view);
					featureLabelProvider.setFormToolkit(formToolkit);
					Label label = featureLabelProvider.getLabel(
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
	public void testLibraryBinding() {
		final EmfSwtBindingFactory bindingFactory = factory.getInjector()
				.getInstance(EmfSwtBindingFactory.class);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createURI("http:///My.extlibrary"));
		final Writer writer = EXTLibraryFactory.eINSTANCE.createWriter();
		resource.getContents().add(writer);
		final SWTBotView view = openTestLibraryView(LIBRARY_EMF_VIEW);
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					// we need a non-null display and parent so we use
					// those in the view and in the tree
					FormToolkit formToolkit = createFormToolkit(view);
					ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
							ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
					bindingFactory.init(adapterFactory, null, writer,
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

	protected void assertLabelForFeature(
			FeatureLabelProvider featureLabelProvider, String expected,
			EStructuralFeature feature) {
		String labelText = featureLabelProvider.getText(feature);
		assertEquals(expected, labelText);
	}

	protected FormToolkit createFormToolkit(final SWTBotView view) {
		return new FormToolkit(view.getWidget().getDisplay());
	}

	protected Composite createCompositeParent(final SWTBotView view) {
		return view.bot().tree().widget.getParent();
	}
}
