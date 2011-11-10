/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

/**
 * An abstract View that visualizes the emf selected resource (it also acts as a
 * selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public abstract class EmfAbstractView extends ViewPart {

	protected PageBook pagebook;

	protected TextViewer textviewer;

	protected StructuredViewer viewer;

	@Inject
	protected EmfViewerManager emfViewerManager;

	// the listener we register with the selection service
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart,
				ISelection selection) {
			// we ignore our own selections
			if (sourcepart != EmfAbstractView.this) {
				updateOnSelection(sourcepart, selection);
			}
		}
	};

	public EmfAbstractView() {
	}

	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.size() == 1) {
				Object element = ss.getFirstElement();
				if (element instanceof IResource) {
					IResource resource = (IResource) element;
					performUpdateOnSelection(resource);
					// viewer.expandAll();
					showEmfViewer();
					return;
				} else if (element instanceof Resource) {
					Resource resource = (Resource) element;
					performUpdateOnSelection(resource);
					showEmfViewer();
					return;
				} else if (element instanceof EObject) {
					EObject eObject = (EObject) element;
					performUpdateOnSelection(eObject);
					showEmfViewer();
					return;
				}
			}
		}

		showText();
	}

	/**
	 * @param eObject
	 */
	protected void performUpdateOnSelection(EObject eObject) {
		emfViewerManager.initialize(viewer, eObject);
	}

	/**
	 * @param resource
	 */
	protected void performUpdateOnSelection(Resource resource) {
		emfViewerManager.initialize(viewer, resource);
	}

	/**
	 * @param resource
	 */
	protected void performUpdateOnSelection(IResource resource) {
		URI uri = URI.createPlatformResourceURI(resource
				.getFullPath().toString(), true);
		emfViewerManager.initialize(viewer, uri);
	}

	@Override
	public void createPartControl(Composite parent) {
		// the PageBook allows simple switching between two viewers
		pagebook = new PageBook(parent, SWT.NONE);

		textviewer = new TextViewer(pagebook, SWT.H_SCROLL | SWT.V_SCROLL);
		textviewer.setEditable(false);
		textviewer.setDocument(new Document(
				"Select one XMI resource in the explorer"));

		viewer = createViewer();

		showText();

		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(listener);

		getSite().setSelectionProvider(viewer);
	}

	/**
	 * Subclasses should implement this.
	 * 
	 * @return
	 */
	protected abstract StructuredViewer createViewer();

	protected void showText() {
		pagebook.showPage(textviewer.getControl());
	}

	protected void showEmfViewer() {
		pagebook.showPage(viewer.getControl());
	}

	@Override
	public void setFocus() {
		pagebook.setFocus();
	}

	public void init(URI resourceURI) {
		emfViewerManager.initialize(viewer, resourceURI);
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is
		// disposed
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(listener);
		super.dispose();
	}
}
