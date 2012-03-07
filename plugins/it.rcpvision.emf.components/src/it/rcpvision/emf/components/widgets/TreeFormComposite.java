package it.rcpvision.emf.components.widgets;

import it.rcpvision.emf.components.factories.EmfDetailsFactory;
import it.rcpvision.emf.components.views.EmfViewerManager;
import it.rcpvision.emf.components.views.FormDetailComposite;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;

/**
 * A generic composite with a Tree and a Form with details of the
 * selected object in the tree.
 * 
 * @author Lorenzo Bettini, Francesco Guidieri
 *
 */
public class TreeFormComposite extends Composite {

	protected class SelectionChangedListener implements
			ISelectionChangedListener {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			EObject selectedObject = getFirstSelectedEObject(event.getSelection());
			if (selectedObject != null) {
				if (detailForm != null)
					detailForm.dispose();

				detailForm = emfDetailsFactory.createFormDetailComposite(
						detail, SWT.BORDER);
				detailForm.init(selectedObject);
				detail.layout(true);
			}
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
	}

	public TreeFormComposite(Composite parent, int style,
			EmfViewerManager emfViewerManager,
			EmfDetailsFactory emfDetailsFactory) {
		super(parent, style);
		setLayout(new FillLayout());
		this.emfViewerManager = emfViewerManager;
		this.emfDetailsFactory = emfDetailsFactory;

		SashForm sashForm = new SashForm(this, SWT.VERTICAL);
		GridLayoutFactory.fillDefaults().applyTo(sashForm);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(sashForm);

		pagebook = new PageBook(sashForm, SWT.BORDER);
		detail = new Composite(sashForm, SWT.BORDER);
		detail.setLayout(new FillLayout());
		viewer = createViewer(pagebook);
		viewer.addSelectionChangedListener(new SelectionChangedListener());
	}

	protected EmfViewerManager emfViewerManager;

	protected EmfDetailsFactory emfDetailsFactory;

	private StructuredViewer viewer;

	public StructuredViewer getViewer() {
		return viewer;
	}

	private PageBook pagebook;

	private Composite detail;

	protected FormDetailComposite detailForm;

	public void update(Object element) {
		if (element != null) {
			if (element instanceof IResource) {
				IResource resource = (IResource) element;
				URI uri = URI.createPlatformResourceURI(resource.getFullPath()
						.toString(), true);
				emfViewerManager.initialize(viewer, uri);
			} else if (element instanceof Resource) {
				Resource resource = (Resource) element;
				emfViewerManager.initialize(viewer, resource);
			} else if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				emfViewerManager.initialize(viewer, eObject);
			}
			pagebook.showPage(viewer.getControl());
		}

	}

	protected StructuredViewer createViewer(Composite parent) {
		return new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	}

}
