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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.EcoreUtil2;

public class «simpleName»TableView extends AbstractSaveableResourceTableView {

	//TODO the EObject must be the implemented type container
	private EObject container;

	@Override
	protected Object getContents(Resource resource) {
		//TODO the EObject must be the implemented type container
		container = (EObject) resource.getContents().get(0);
		//TODO the EObject must be the implemented type contained
		return EcoreUtil2.getAllContentsOfType(container, EObject.class);
	}

	@Override
	protected EClass getEClass() {
		//TODO the implemented Literal
		return null;
	}

	@Override
	protected URI createResourceURI() {
		return ContentsURILoader.getResourceUri();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		//TODO create implementation
	}
	
	@Override
	protected void customizePostCommandStackChanged(Command mostRecentCommand) {
		//TODO the EObject must be the implemented type contained
		tableViewer.setInput(EcoreUtil2.getAllContentsOfType(container, EObject.class));
		tableViewer.refresh();
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

}