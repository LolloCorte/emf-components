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
		// TODO Auto-generated method stub
		return null;
	}
	
}
'''

	def generateTableView(String projectName, String simpleName)
'''
package «projectName»;

import it.rcpvision.emf.components.views.AbstractSaveableResourceTableView;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

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
		// TODO Auto-generated method stub
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
   <extension
         point="org.eclipse.ui.perspectiveExtensions">
      <perspectiveExtension
            targetID="*">
         <view
               id="«qualifiedNameView»"
               minimized="false"
               ratio="100"
               relationship="stack"
               relative="org.eclipse.ui.editorss"
               visible="true">
         </view>
      </perspectiveExtension>
   </extension>
</plugin>
'''
}