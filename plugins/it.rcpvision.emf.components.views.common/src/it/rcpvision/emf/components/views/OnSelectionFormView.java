/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.FormFactory;
import it.rcpvision.emf.components.widgets.FormDetailComposite;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

/**
 * A View that visualizes the list of elements of an emf selected resource (it
 * also acts as a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class OnSelectionFormView extends AbstractOnSelectionView {

	@Inject
	protected FormFactory formFactory;

	protected Composite parent;

	protected FormDetailComposite formComposite;
	
	public OnSelectionFormView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		this.parent = parent;
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {

		EObject eObject = getFirstSelectedEObject(selection);
		if (eObject != null) {
			resetFormComposite();
			
			formComposite = formFactory.createFormDetailComposite(
					parent, SWT.NONE);
			formComposite.init(eObject);
			
			parent.layout(true, true);
		}
	}

	protected void resetFormComposite() {
		if (formComposite != null) {
			formComposite.dispose();
			parent.layout(true, true);
		}
	}

	@Override
	public void setFocus() {
		if (formComposite != null)
			formComposite.setFocus();
		else
			parent.setFocus();
	}

}
