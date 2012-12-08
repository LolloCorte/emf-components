package it.rcpvision.emf.components.tests;

import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.WRITER__NAME;
import static org.junit.Assert.assertEquals;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Francesco Guidieri
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsColumnLabelProviderTests extends
		EmfComponentsCustomLibraryAbstractTests {

	@Test
	public void testLabelProviderForAuthorName() {
		ColumnLabelProvider labelProvider = createLabelProvider(WRITER__NAME);

		Library library = createTestLibraryWithPeople();
		Writer writer = library.getWriters().get(0);

		assertEquals("Writer My Writer", labelProvider.getText(writer));
	}

	protected ColumnLabelProvider createLabelProvider(
			EStructuralFeature eStructuralFeature) {
		return getInjector().getInstance(JfaceProviderFactory.class)
				.createColumnLabelProvider(eStructuralFeature);
	}

	protected Library createTestLibraryWithPeople() {
		Library library = EXTLibraryFactory.eINSTANCE.createLibrary();
		library.setName("My Library");
		Writer writer = EXTLibraryFactory.eINSTANCE.createWriter();
		writer.setName("My Writer");
		library.getWriters().add(writer);
		return library;
	}
}
