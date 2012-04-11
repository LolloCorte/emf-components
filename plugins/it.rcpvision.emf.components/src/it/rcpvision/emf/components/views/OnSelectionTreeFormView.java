package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.widgets.TreeFormMasterDetailComposite;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

public class OnSelectionTreeFormView extends OnSelectionAbstractView {

	@Inject
	protected EmfCompositeFactory emfCompositeFactory;

	protected TreeFormMasterDetailComposite treeFormDetailComposite;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		treeFormDetailComposite = emfCompositeFactory.createTreeFormDetailComposite(parent,
				SWT.BORDER);
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		treeFormDetailComposite.update(getFirstSelectedElement(selection));
	}

	@Override
	public void setFocus() {
		treeFormDetailComposite.setFocus();
	}

}
