/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
	
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public EmfFormView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		this.parent = parent;
		resetView();
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		resetView();
		
		EObject eObject = getFirstSelectedEObject(selection);
		if (eObject != null) {
			formToolkit.adapt(scrolledComposite);
			formToolkit.paintBordersFor(scrolledComposite);
			scrolledComposite.setExpandHorizontal(true);
			scrolledComposite.setExpandVertical(true);
			
			detailFormComposite = emfDetailsFactory.createDetailsComposite(
					scrolledComposite, SWT.BORDER);
			
			detailFormComposite.init(eObject);
			
			formToolkit.adapt(detailFormComposite);
			detailFormComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
			parent.layout(true, true);
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
		scrolledComposite.setFocus();
	}

}
