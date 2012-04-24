package it.rcpvision.emf.components.wizards.gen

class EmfComponentsViewFilesGenerator {

	def generateTreeFormView(String projectName, String simpleName)
'''
package «projectName»;

import it.rcpvision.emf.components.views.AbstractSaveableResourceTreeFormView;

import org.eclipse.emf.common.util.URI;

public class «simpleName»TreeFormView extends AbstractSaveableResourceTreeFormView {

	@Override
	protected URI createResourceURI() {
		return ContentsURILoader.getResourceUri();
	}
	
}
'''

	def generateTableView(String projectName, String simpleName)
'''
package «projectName»;

import it.rcpvision.emf.components.views.AbstractSaveableResourceTableView;

import org.eclipse.emf.common.util.URI;

public class «simpleName»TableView extends AbstractSaveableResourceTableView {

	@Override
	protected Object getContents(Resource resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EClass getEClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected URI createResourceURI() {
		return ContentsURILoader.getResourceUri();
	}
}
'''

	def generateContentsURILoader(String projectName)
'''
package «projectName»;

import org.eclipse.emf.common.util.URI;

public class ContentsURILoader {
	
	public static URI getResourceUri() {
		//TODO needs to be implemented
		return null;
	}
	
}
'''

	def generatePluginXml(String factoryClass, String qualifiedNameView)
'''
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
   <extension
         point="org.eclipse.ui.views">
           <view
               class="«factoryClass»:«qualifiedNameView»"
               id="«qualifiedNameView»"
               name="Form View"
               restorable="true"/>
   </extension>
</plugin>

'''
}