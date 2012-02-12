/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

/**
 * An abstract View that reacts on selection (it should show something related
 * to an emf resource or object).
 * 
 * @author Lorenzo Bettini
 * 
 */
public abstract class EmfAbstractViewOnSelection extends ViewPart {

	// the listener we register with the selection service
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart,
				ISelection selection) {
			// we ignore our own selections
			if (sourcepart != EmfAbstractViewOnSelection.this) {
				updateOnSelection(sourcepart, selection);
			}
		}
	};

	protected abstract void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection);

	@Override
	public void createPartControl(Composite parent) {
		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(listener);
	}

	protected Object getFirstSelectedElement(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			return ss.getFirstElement();
		}
		return null;
	}

	protected EObject getFirstSelectedEObject(ISelection selection) {
		Object selected = getFirstSelectedElement(selection);
		if (selected instanceof EObject) {
			return (EObject) selected;
		}
		return null;
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is
		// disposed
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(listener);
		super.dispose();
	}
}
