package it.rcpvision.emf.components.tests

import org.junit.Test

import static it.rcpvision.emf.components.examples.library.EXTLibraryFactory.*
import it.rcpvision.emf.components.ecore.FeatureNamePath
import it.rcpvision.emf.components.ecore.FeatureResolver
import java.util.List
import org.eclipse.emf.ecore.EStructuralFeature
import static extension org.junit.Assert.*
import org.eclipse.emf.ecore.EClass
import it.rcpvision.emf.components.examples.library.EXTLibraryPackage

class FeatureResolverTest {
	
	FeatureResolver resolver = new FeatureResolver;
	
	@Test def void testResolver1() {
		val paths = newArrayList(
			new FeatureNamePath("title"),
			new FeatureNamePath("author",
				newArrayList(
					new FeatureNamePath("firstName"),
					new FeatureNamePath("lastName")
				)
			)
		)
		EXTLibraryPackage::eINSTANCE.book.
			assertFeatureList(paths, "title, firstName, lastName")
	}

	@Test def void testResolver2() {
		val paths = newArrayList(
			new FeatureNamePath("title"),
			new FeatureNamePath("minutesLength"),
			new FeatureNamePath("reader",
				newArrayList(
					new FeatureNamePath("firstName"),
					new FeatureNamePath("lastName")
				)
			),
			new FeatureNamePath("author",
				newArrayList(
					new FeatureNamePath("name"),
					new FeatureNamePath("books")
				)
			)
		)
		EXTLibraryPackage::eINSTANCE.bookOnTape.
			assertFeatureList(paths, "title, minutesLength, firstName, lastName, name, books")
	}

	@Test def void testResolver3() {
		// Employee:manager is an Employee
		val paths = newArrayList(
			new FeatureNamePath("firstName"),
			new FeatureNamePath("lastName"),
			new FeatureNamePath("manager",
				newArrayList(
					new FeatureNamePath("firstName"),
					new FeatureNamePath("lastName"),
					new FeatureNamePath("manager",
						newArrayList(
							new FeatureNamePath("firstName"),
							new FeatureNamePath("lastName")
						)
					)
				)
			)
		)
		EXTLibraryPackage::eINSTANCE.employee.
			assertFeatureList(paths, "firstName, lastName, firstName, lastName, firstName, lastName")
	}
	
	def createModel() {
		eINSTANCE.createLibrary => [
			val writer = eINSTANCE.createWriter => [
				firstName = "Test"
				lastName = "Writer"
			]
			val writer2 = eINSTANCE.createWriter => [
				firstName = "Test2"
				lastName = "Writer2"
			]
			writers += writer
			writers += writer2
			books += eINSTANCE.createBook => [
				title = "Test Book"
				author = writer
			]
			
			stock += eINSTANCE.createBookOnTape => [
				reader = writer
				author = writer2
			]
			
			val employee1 = eINSTANCE.createEmployee => [
				firstName = "E"
				lastName = "1"
			]
			val employee2 = eINSTANCE.createEmployee => [
				firstName = "E"
				lastName = "2"
				manager = employee1
			]
			employees += employee1
			employees += employee2
		]
	}
	
	def assertFeatureList(EClass eClass, List<FeatureNamePath> paths, CharSequence expected) {
		resolver.getFeatures(eClass, paths).assertFeatureList(expected)
	}
	
	
	def assertFeatureList(List<EStructuralFeature> features, CharSequence expected) {
		expected.toString.assertEquals(features.map[name].join(", "))
	}
}