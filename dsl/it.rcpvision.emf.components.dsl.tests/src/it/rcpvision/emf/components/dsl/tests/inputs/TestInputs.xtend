package it.rcpvision.emf.components.dsl.tests.inputs

class TestInputs {
	
	def emptyModule() 
'''
import java.util.*

module my.empty {
	
}
'''

	def emptyLabelProvider() 
'''
import java.util.*

module my.empty {
	labelProvider {
		
	}
}
'''

	def emptyLabelSpecifications() 
'''
import java.util.*

module my.empty {
	labelProvider {
		labels {
			
		}
		images {
			
		}
	}
}
'''

	def labelSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	labelProvider {
		labels {
			Library -> 'foo' // constant
			Writer writer -> writer.name // explicit param
			Book -> title // implit 'it' param
			Lendable -> 'copies: ' + copies
			Borrower -> { // complex block
				val buffer = 'borrowed: ' + borrowed.map [
					b | b.copies
				]
				buffer.toUpperCase
			}
		}
		
		images {
			Library -> 'library.jpeg' // constant
			Writer writer -> 
				if (writer.name.nullOrEmpty) 
					"noname.gif"
				else
					new org.eclipse.swt.graphics.ImageData("writer.jpeg")
		}
	}
}
'''

	def featureLabelSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	featureLabelProvider {
		labels {
			Library:name -> 'foo' // constant
		}
	}
}
'''
}