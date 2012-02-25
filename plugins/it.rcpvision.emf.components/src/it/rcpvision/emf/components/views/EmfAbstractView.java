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
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.PageBook;

import com.google.inject.Inject;

/**
 * An abstract View that visualizes the emf selected resource (it also acts as a
 * selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public abstract class EmfAbstractView extends EmfAbstractViewOnSelection {

	private PageBook pagebook;

	private TextViewer textviewer;

	private StructuredViewer viewer;

	@Inject
	protected EmfViewerManager emfViewerManager;

	public EmfAbstractView() {
	}

	public StructuredViewer getViewer() {
		return viewer;
	}

	/**
	 * Sets the viewer and makes the pagebook show it
	 * 
	 * @param viewer
	 */
	public void setViewer(StructuredViewer viewer) {
		this.viewer = viewer;
		pagebook.showPage(viewer.getControl());
	}

	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		Object element = getFirstSelectedElement(selection);
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
		URI uri = URI.createPlatformResourceURI(resource.getFullPath()
				.toString(), true);
		emfViewerManager.initialize(viewer, uri);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		// the PageBook allows simple switching between two viewers
		pagebook = new PageBook(parent, SWT.NONE);

		textviewer = new TextViewer(pagebook, SWT.H_SCROLL | SWT.V_SCROLL);
		textviewer.setEditable(false);
		textviewer
				.setDocument(new Document(
						"Select one XMI resource in the explorer or any EObject in a view"));

		viewer = createViewer(pagebook);

		showText();

		getSite().setSelectionProvider(viewer);
	}

	/**
	 * Subclasses should implement this.
	 * 
	 * @param parent
	 * @return
	 */
	protected abstract StructuredViewer createViewer(Composite parent);

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
}
