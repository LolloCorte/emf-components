package it.rcpvision.emf.components.tests.utils

import org.eclipse.emf.ecore.EStructuralFeature
import java.util.List
import it.rcpvision.emf.components.examples.library.Book
import it.rcpvision.emf.components.examples.library.Writer
import it.rcpvision.emf.components.examples.library.Borrower

class EmfComponentsTestsUtils {
	
	def toStringNameBased(Iterable<EStructuralFeature> features) {
		features.map[ it.name ].join(", ")
	}

	def toStringRep(List<?> elements) {
		elements.map[stringRep].join(", ")
	}
	
	def dispatch stringRep(Object o) {
		o.toString
	}

	def dispatch stringRep(Book book) {
		"Book: " + book.title
	}

	def dispatch stringRep(Writer writer) {
		"Writer: " + writer.name
	}

	def dispatch stringRep(Borrower b) {
		"Borrower: " + b.firstName + 
			(if (b.lastName != null) " " + b.lastName else "")
	}
}