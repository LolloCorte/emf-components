package it.rcpvision.emf.components.widgets;

import it.rcpvision.emf.components.factories.FormFactory;
import it.rcpvision.emf.components.util.EmfSelectionHelper;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;

/**
 * A generic composite with a Tree and a Form with details of the selected
 * object in the tree.
 * 
 * @author Lorenzo Bettini, Francesco Guidieri
 * 
 */
public class TreeFormComposite extends Composite implements IViewerProvider {

	protected class SelectionChangedListener implements
			ISelectionChangedListener {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			EObject selectedObject = emfSelectionHelper
					.getFirstSelectedEObject(event.getSelection());

			eObjectSelectionChanged(selectedObject);
		}

	}

	protected ViewerInitializer viewerInitializer;

	protected FormFactory formFactory;

	protected EmfSelectionHelper emfSelectionHelper;

	private final StructuredViewer viewer;

	private final PageBook pagebook;

	private final Composite detail;

	protected FormDetailComposite detailForm;

	public TreeFormComposite(Composite parent, int style,
			ViewerInitializer viewerInitializer,
			FormFactory formFactory,
			EmfSelectionHelper emfSelectionHelper) {
		super(parent, style);
		setLayout(new FillLayout());
		this.viewerInitializer = viewerInitializer;
		this.formFactory = formFactory;
		this.emfSelectionHelper = emfSelectionHelper;

		SashForm sashForm = new SashForm(this, SWT.VERTICAL);
		//GridLayoutFactory.fillDefaults().applyTo(sashForm);
		//GridDataFactory.fillDefaults().grab(true, true).applyTo(sashForm);

		pagebook = new PageBook(sashForm, SWT.BORDER);
		detail = new Composite(sashForm, SWT.BORDER);
		detail.setLayout(new FillLayout());
		viewer = createViewer(pagebook);
		viewer.addSelectionChangedListener(new SelectionChangedListener());
	}

	public StructuredViewer getViewer() {
		return viewer;
	}

	public void update(Object element) {
		if (element != null) {
//			if (element instanceof IResource) {
//				IResource resource = (IResource) element;
//				URI uri = URI.createPlatformResourceURI(resource.getFullPath()
//						.toString(), true);
//				viewerInitializer.initialize(viewer, uri);
//			} else 
			if (element instanceof Resource) {
				Resource resource = (Resource) element;
				viewerInitializer.initialize(viewer, resource);
			} else if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				viewerInitializer.initialize(viewer, eObject);
			}
			pagebook.showPage(viewer.getControl());
		}

	}

	protected StructuredViewer createViewer(Composite parent) {
		return new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	}

	protected void eObjectSelectionChanged(EObject selectedObject) {
		if (detailForm != null)
			detailForm.dispose();

		if (selectedObject != null) {
			detailForm = createFormDetailComposite();
			detailForm.init(selectedObject);
			detail.layout(true);
		}
	}

	protected FormDetailComposite createFormDetailComposite() {
		return formFactory.createFormDetailComposite(detail,
				SWT.BORDER);
	}

}
