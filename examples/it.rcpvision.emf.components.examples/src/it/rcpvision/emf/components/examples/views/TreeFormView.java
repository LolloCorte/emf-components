package it.rcpvision.emf.components.examples.views;

import it.rcpvision.emf.components.views.EmfAbstractViewOnSelection;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
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
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.PageBook;

import com.google.inject.Inject;

public class TreeFormView extends EmfAbstractViewOnSelection {

	protected class SelectionChangedListener implements
			ISelectionChangedListener {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			EObject object = getFirstSelectedEObject(event.getSelection());
			if (object != null) {
				if (detailForm != null)
					detailForm.dispose();
				
				detailForm = emfDetailsFactory
						.createFormDetailComposite(detail, SWT.BORDER);
				detailForm.init(object);
				detail.layout(true);
			}
		}
	}

	@Inject
	protected EmfViewerManager emfViewerManager;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	private StructuredViewer treeViewer;
	private PageBook pagebook;
	private Composite detail;

	protected FormDetailComposite detailForm;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		GridLayoutFactory.fillDefaults().applyTo(sashForm);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(sashForm);
		
		pagebook = new PageBook(sashForm, SWT.BORDER);
		detail = new Composite(sashForm, SWT.BORDER);
		detail.setLayout(new FillLayout());
		treeViewer = createViewer(pagebook);
		treeViewer.addSelectionChangedListener(new SelectionChangedListener());
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		Object element = getFirstSelectedElement(selection);

		if (element != null) {
			if (element instanceof IResource) {
				IResource resource = (IResource) element;
				URI uri = URI.createPlatformResourceURI(resource.getFullPath()
						.toString(), true);
				emfViewerManager.initialize(treeViewer, uri);
			} else if (element instanceof Resource) {
				Resource resource = (Resource) element;
				emfViewerManager.initialize(treeViewer, resource);
			} else if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				emfViewerManager.initialize(treeViewer, eObject);
			}
			pagebook.showPage(treeViewer.getControl());
		}

	}

	protected StructuredViewer createViewer(Composite parent) {
		return new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
