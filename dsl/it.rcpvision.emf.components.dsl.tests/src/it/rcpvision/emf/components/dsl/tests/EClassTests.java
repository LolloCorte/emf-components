package it.rcpvision.emf.components.dsl.tests;

import static org.junit.Assert.*;
import it.rcpvision.emf.components.examples.library.EXTLibraryPackage;
import it.rcpvision.emf.components.examples.library.Library;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;

public class EClassTests {

	@Test
	public void testEClass() {
		EClass c = EXTLibraryPackage.Literals.LIBRARY;
		assertEquals(Library.class, c.getInstanceClass());
		System.out.println(c);
	}

}
