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

	def emptyPropertyDescriptionProvider() 
'''
import java.util.*

module my.empty {
	propertyDescriptionProvider {
		
	}
}
'''

	def emptyLabelSpecifications() 
'''
import java.util.*

module my.empty {
	labelProvider {
		text {
			
		}
		image {
			
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
		text {
			Library -> 'foo' // constant
			Writer writer -> writer.getName() // explicit param
			Book -> title // implit 'it' param
			Lendable -> 'copies: ' + copies
			Borrower -> { // complex block
				val buffer = 'borrowed: ' + borrowed.map [
					b | b.copies
				]
				buffer.toUpperCase
			}
			BookOnTape -> getTitle
		}
		
		image {
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

	def propertyDescriptionSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	propertyDescriptionProvider {
		text {
			Library:name -> 'Name' // constant
			Library:books -> 'Books' // constant
			Writer:lastName -> name.toFirstUpper // the implicit param is an EStructuralFeature
		}
	}
}
'''

	def featuresSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	featuresProvider {
		features {
			Library -> name
			Writer -> firstName, lastName, books
		}
	}
}
'''

	def formFeatureControlSpecifications()
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	formFeatureControlFactory {
		control {
			Library : name -> { }
			Writer : books -> 
				toolkit.createLabel(parent, 
					books.map[title].join(", "))
			Writer : name -> { toolkit.createLabel(parent, "") }
				target { observeText }
			Writer : firstName -> 
				toolkit.createLabel(parent, "")
				target observeText(SWT::Modify)
		}
	}
}
'''

	def viewerContentProviderSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	viewerContentProvider {
		children {
			Library -> books + writers
			Writer writer -> writer.books
			Book -> author // implit 'it' param
		}
	}
}
'''

	def emptyViewsSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*

module my.empty {
	parts {
		
	}
}
'''

	def nonEmptyViewsSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*
import it.rcpvision.emf.components.views.*

module my.test {
	parts {
		viewpart my.view.part {
			viewname "My View"
			viewclass AbstractSaveableTreeView
		}
	}
}
'''

	def multipleViewsSpecifications() 
'''
import java.util.*
import it.rcpvision.emf.components.examples.library.*
import it.rcpvision.emf.components.views.*

module my.test {
	parts {
		viewpart my.view.tree.part {
			viewname "My Tree View"
			viewclass AbstractSaveableTreeView
		}
		viewpart my.view.form.part {
			viewname "My Tree Form View"
			viewclass AbstractSaveableTreeFormView
			viewcategory my.view.category
		}
	}
}
'''

}