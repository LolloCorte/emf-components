/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.ViewerFactory;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

/**
 * A View that visualizes the list of elements of an EObject (it also acts as a
 * selection provider), filtered by the specified type.
 * 
 * @author Lorenzo Bettini
 * 
 */
public abstract class AbstractOnSelectionTableView extends
		AbstractOnSelectionView {

	@Inject
	protected ViewerFactory viewerFactory;

	@Inject
	protected FeaturesProvider featuresProvider;

	protected Composite parent;

	protected TableViewer tableViewer;

	public AbstractOnSelectionTableView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		this.parent = parent;
		createTableViewer();
		getSite().setSelectionProvider(tableViewer);
		parent.layout(true, true);
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		if (tableViewer == null)
			return;
		EObject eObject = getFirstSelectedEObject(selection);
		tableViewer.setInput(null);
		if (eObject != null) {
			EStructuralFeature feature = getEStructuralFeature();

			if (!eObject.eClass().getEAllStructuralFeatures().contains(feature))
				return;

			Object value = eObject.eGet(feature);
			tableViewer.setInput(value);
		}
	}

	protected void createTableViewer() {
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent,
				SWT.V_SCROLL | SWT.BORDER);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		tableViewer = viewerFactory.createTableViewer(scrolledComposite,
				SWT.BORDER | SWT.FULL_SELECTION, null, getEClass());

		Table table = tableViewer.getTable();
		scrolledComposite.setContent(table);
		scrolledComposite.setMinSize(table
				.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	/**
	 * @return the {@link EStructuralFeature} to retrieve the values of the
	 *         selected {@link EObject} to show on the table
	 */
	protected abstract EStructuralFeature getEStructuralFeature();

	/**
	 * @return the {@link EClass} to build the table columns
	 */
	protected abstract EClass getEClass();
}
