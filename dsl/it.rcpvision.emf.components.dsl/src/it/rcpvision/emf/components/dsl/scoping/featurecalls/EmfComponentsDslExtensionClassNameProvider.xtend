package it.rcpvision.emf.components.dsl.scoping.featurecalls

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider$ExtensionClassNameProvider
import org.eclipse.swt.widgets.Control
import org.eclipse.jface.databinding.swt.SWTObservables

class EmfComponentsDslExtensionClassNameProvider extends ExtensionClassNameProvider {

	override simpleComputeExtensionClasses() {
		super.simpleComputeExtensionClasses => [
			put(typeof(Control), typeof(SWTObservables))
		]
	}
}