package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.editors.EmfActionBarContributor;
import it.rcpvision.emf.components.factories.TreeFormFactory;
import it.rcpvision.emf.components.viewers.ViewerInitializer;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

public abstract class AbstractSaveableTreeFormView extends AbstractSaveableView
		implements IMenuListener, IViewerProvider {

	@Inject
	protected TreeFormFactory treeFormFactory;

	@Inject
	protected ViewerInitializer viewerInitializer;

	@Inject
	protected EmfActionBarContributor actionBarContributor;

	protected TreeFormComposite treeFormComposite;

	protected Object getContents(Resource resource) {
		return resource;
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		treeFormComposite = treeFormFactory
				.createTreeFormMasterDetailComposite(parent, SWT.BORDER);

		treeFormComposite.update(getContents(getResource()));

		viewerInitializer.addContextMenu(treeFormComposite.getViewer(),
				actionBarContributor, editingDomain, this, this);
	}

	@Override
	protected void customizePostCommandStackChanged(Command mostRecentCommand) {
		if (mostRecentCommand != null
				&& mostRecentCommand instanceof CreateChildCommand) {
			setSelectionToViewer(mostRecentCommand.getAffectedObjects());
		}
	}

	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// Try to select the items in the current content viewer of
					// the editor.
					//
					if (treeFormComposite.getViewer() != null) {
						treeFormComposite.getViewer()
								.setSelection(
										new StructuredSelection(
												theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		actionBarContributor.menuAboutToShow(menuManager);
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}

	public StructuredViewer getViewer() {
		return treeFormComposite.getViewer();
	}

}
