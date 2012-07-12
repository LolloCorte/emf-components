package it.rcpvision.emf.components.dsl.tests.inputs

class TestInputsWithErrors {
	
	def duplicateLabelSpecifications() 
'''
import java.util.*

module my.empty {
	labelProvider {
		labels {
			
		}
		images {
			
		}
		labels {
		}
	}
}
'''

}