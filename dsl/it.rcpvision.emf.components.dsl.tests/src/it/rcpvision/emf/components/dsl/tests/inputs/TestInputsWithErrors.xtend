package it.rcpvision.emf.components.dsl.tests.inputs

class TestInputsWithErrors {
	
	def duplicateLabelSpecifications() 
'''
import java.util.*

module my.empty {
	labelProvider {
		text {
			
		}
		image {
			
		}
		text {
		}
	}
}
'''

	def wrongPropertyDescriptionSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	propertyDescriptionProvider {
		text {
			Item:publicationDate -> 'Publication Date'
			Library:newArrayList(1) -> 'Name' // static method, wrong
			Library:getBooks -> 'Books' // don't use get methods
			Writer:lastName -> name.toFirstUpper // the implicit param is an EStructuralFeature
		}
	}
}
'''

	def viewSpecificationIsNotIViewPart() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	viewparts {
		viewpart my.view.part {
			viewname "My View"
			viewclass Library // not an IViewPart!
		}
	}
}
'''
}