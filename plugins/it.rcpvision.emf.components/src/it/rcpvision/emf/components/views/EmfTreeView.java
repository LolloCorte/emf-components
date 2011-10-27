/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

/**
 * A View that visualizes the tree of an emf selected resource (it also acts as
 * a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfTreeView extends ViewPart {

	protected PageBook pagebook;

	protected TextViewer textviewer;

	protected TreeViewer emfTreeViewer;

	@Inject
	protected EmfViewerManager emfTreeViewerManager;

	// the listener we register with the selection service
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart,
				ISelection selection) {
			// we ignore our own selections
			if (sourcepart != EmfTreeView.this) {
				updateOnSelection(sourcepart, selection);
			}
		}
	};

	public EmfTreeView() {
	}

	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.size() == 1) {
				Object element = ss.getFirstElement();
				if (element instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) element;
					Object adapter = adaptable.getAdapter(IResource.class);
					if (adapter != null) {
						IResource resource = (IResource) adapter;
						URI uri = URI.createPlatformResourceURI(resource
								.getFullPath().toString(), true);
						emfTreeViewerManager.initialize(emfTreeViewer, uri);
						emfTreeViewer.expandAll();
						showEmfViewer();
						return;
					}
				}
			}
		}

		showText();
	}

	@Override
	public void createPartControl(Composite parent) {
		// the PageBook allows simple switching between two viewers
		pagebook = new PageBook(parent, SWT.NONE);

		textviewer = new TextViewer(pagebook, SWT.H_SCROLL | SWT.V_SCROLL);
		textviewer.setEditable(false);
		textviewer.setDocument(new Document(
				"Select one XMI resource in the explorer"));

		emfTreeViewer = new TreeViewer(pagebook, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);

		showText();

		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(listener);

		getSite().setSelectionProvider(emfTreeViewer);
	}

	protected void showText() {
		pagebook.showPage(textviewer.getControl());
	}

	protected void showEmfViewer() {
		pagebook.showPage(emfTreeViewer.getControl());
	}

	@Override
	public void setFocus() {
		pagebook.setFocus();
	}

	public void init(URI resourceURI) {
		emfTreeViewerManager.initialize(emfTreeViewer, resourceURI);
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is
		// disposed
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(listener);
		super.dispose();
	}
}
