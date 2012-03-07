package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.EmfDetailsFactory;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

public class TreeFormView extends EmfAbstractViewOnSelection {

	@Inject
	protected EmfViewerManager emfViewerManager;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	protected TreeFormComposite treeFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		treeFormComposite = new TreeFormComposite(parent, SWT.BORDER,
				emfViewerManager, emfDetailsFactory);
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
