package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

public class OnSelectionTreeFormView extends AbstractOnSelectionView {

	@Inject
	protected TreeFormFactory treeFormFactory;

	protected TreeFormComposite treeFormDetailComposite;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		treeFormDetailComposite = treeFormFactory.createTreeFormMasterDetailComposite(parent,
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
