package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

public class TreeFormView extends EmfAbstractViewOnSelection {

	@Inject
	protected EmfCompositeFactory emfCompositeFactory;

	protected TreeFormComposite treeFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		treeFormComposite = emfCompositeFactory.createTreeFormComposite(parent,
				SWT.BORDER);
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		treeFormComposite.update(getFirstSelectedElement(selection));
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}

}
