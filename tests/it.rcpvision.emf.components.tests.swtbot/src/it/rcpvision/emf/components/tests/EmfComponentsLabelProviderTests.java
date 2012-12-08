package it.rcpvision.emf.components.tests;

import static org.junit.Assert.assertEquals;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.Writer;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;

import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author bettini
 * 
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EmfComponentsLabelProviderTests extends
		EmfComponentsCustomLibraryAbstractTests {

	@Test
	public void testFeatureMapEntryLabelProvider() {
		ILabelProvider labelProvider = createLabelProvider();

		Library library = createTestLibraryWithPeople();
		Entry person = library.getPeople().get(0);

		assertEquals("Writer My Writer", labelProvider.getText(person));
	}

	protected ILabelProvider createLabelProvider() {
		return getInjector().getInstance(JfaceProviderFactory.class)
				.createLabelProvider();
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
