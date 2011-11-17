/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * A View that visualizes the list of elements of an emf selected resource (it
 * also acts as a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfTableView extends EmfAbstractViewOnSelection {

	@Inject
	protected TableViewerBuilder tableViewerBuilder;

	@Inject
	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;

	@Inject
	protected EmfViewerManager emfViewerManager;

	protected Composite parent;

	protected ScrolledComposite scrolledComposite;

	public EmfTableView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		this.parent = parent;
		cleanView();
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		cleanView();

		Object selectedObject = getFirstSelectedElement(selection);
		if (selectedObject != null && selectedObject instanceof EObject) {
			EObject eObject = (EObject) selectedObject;

			Composite composite = new Composite(scrolledComposite, SWT.BORDER);
			scrolledComposite.setContent(composite);
			composite.setLayout(new GridLayout(1, false));
			composite.setLayoutData(new GridData(GridData.FILL_BOTH));

			TableViewer tableViewer = new TableViewer(composite, SWT.BORDER
					| SWT.FULL_SELECTION);

			tableViewerBuilder.buildAndFill(tableViewer, eObject,
					eObject.eClass());

			Table table = tableViewer.getTable();
			table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
					1));

			composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
			parent.layout(true, true);
		}
	}

	private void cleanView() {
		if (scrolledComposite != null)
			scrolledComposite.dispose();

		scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL
				| SWT.BORDER);
		scrolledComposite.setExpandHorizontal(true);
	}

	public void setFocus() {
	}

}
