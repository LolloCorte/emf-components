/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Inject;

/**
 * A View that visualizes the list of elements of an emf selected resource (it
 * also acts as a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfFormView extends EmfAbstractViewOnSelection {

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	protected Composite parent;

	protected ScrolledComposite scrolledComposite;

	protected GenericDetailComposite detailFormComposite;

	public EmfFormView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		detailFormComposite = emfDetailsFactory.createDetailsComposite(
				parent, SWT.BORDER);
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		EObject eObject = getFirstSelectedEObject(selection);
		if (eObject != null) {
			detailFormComposite.init(eObject);
		}
	}

	private void resetView() {
		if (scrolledComposite != null)
			scrolledComposite.dispose();

		scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL
				| SWT.BORDER);
		scrolledComposite.setExpandHorizontal(true);
	}

	public void setFocus() {
		detailFormComposite.setFocus();
	}

}
