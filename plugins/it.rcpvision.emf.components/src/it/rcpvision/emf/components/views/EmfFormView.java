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

		this.parent = parent;
		resetView();
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		EObject eObject = getFirstSelectedEObject(selection);
		if (eObject != null) {
			if (detailFormComposite == null) {
				resetView();

				Composite composite = new Composite(scrolledComposite,
						SWT.BORDER);
				scrolledComposite.setContent(composite);
				composite.setLayout(new GridLayout(1, false));
				composite.setLayoutData(new GridData(GridData.FILL_BOTH));

				detailFormComposite = emfDetailsFactory.createDetailsComposite(
						composite, SWT.BORDER);

				composite.setSize(composite.computeSize(SWT.DEFAULT,
						SWT.DEFAULT));
				parent.layout(true, true);
			}

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
		scrolledComposite.setFocus();
	}

}
