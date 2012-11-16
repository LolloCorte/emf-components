/**
 * 
 */
package it.rcpvision.emf.components.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.util.EmfComponentsUtil;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import com.google.common.collect.Iterables;

/**
 * @author bettini
 * 
 */
public class EmfComponentsUtilTests {
	@Test
	public void testEnsureCollection() {
		assertNotNull(EmfComponentsUtil.ensureCollection(null));
		assertEquals(1, EmfComponentsUtil.ensureCollection(new Integer(0))
				.size());

		assertEquals(2, EmfComponentsUtil.ensureCollection(createIterable())
				.size());
	}

	protected Iterable<EObject> createIterable() {
		Library library = EXTLibraryFactory.eINSTANCE.createLibrary();
		library.getBooks().add(EXTLibraryFactory.eINSTANCE.createBook());
		library.getWriters().add(EXTLibraryFactory.eINSTANCE.createWriter());
		Iterable<EObject> iterable = Iterables.<EObject> concat(
				library.getBooks(), library.getWriters());
		return iterable;
	}
}
