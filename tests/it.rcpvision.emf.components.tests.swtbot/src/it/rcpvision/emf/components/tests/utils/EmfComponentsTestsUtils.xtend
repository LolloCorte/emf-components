package it.rcpvision.emf.components.tests.utils

import org.eclipse.emf.ecore.EStructuralFeature

class EmfComponentsTestsUtils {
	
	def toStringNameBased(Iterable<EStructuralFeature> features) {
		features.map[ it.name ].join(", ")
	}
}