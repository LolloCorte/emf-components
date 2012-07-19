package it.rcpvision.emf.components.cdoexamples.treeform.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.swt.widgets.Composite;

import it.rcpvision.emf.components.views.AbstractSaveableTreeFormView;

public class CDOExampleSaveableResourceCDOTreeFormView extends
		AbstractSaveableTreeFormView {

	@Override
	protected URI createResourceURI() {
		String uriStr = "cdo://localhost:2036/demo/myResource/";
		return URI.createURI(uriStr);
	}

	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		treeFormMasterDetailComposite.getViewer().addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				System.out.println("doubleClickListener");
			}
		});
	}
}
