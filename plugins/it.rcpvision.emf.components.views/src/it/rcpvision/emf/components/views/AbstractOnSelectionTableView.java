/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.ViewerFactory;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

/**
 * A View that visualizes the list of elements of an EObject (it
 * also acts as a selection provider), filtered by the specified type.
 * 
 * @author Lorenzo Bettini
 * 
 */
public abstract class AbstractOnSelectionTableView extends OnSelectionAbstractView {

	@Inject
	protected ViewerFactory viewerFactory;

	@Inject
	protected FeaturesProvider featuresProvider;

	protected Composite parent;

	protected ScrolledComposite scrolledComposite;

	public AbstractOnSelectionTableView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		this.parent = parent;
		resetView();
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		resetView();

		EObject eObject = getFirstSelectedEObject(selection);
		if (eObject != null) {
			EStructuralFeature feature = getEStructuralFeature();
			
			if (!eObject.eClass().getEAllStructuralFeatures().contains(feature))
				return;
			
			Object value = eObject.eGet(feature);
			if (value == null)
				return;
			
			EClassifier type = feature.getEType();
			if (type instanceof EClass) {
				Composite composite = new Composite(scrolledComposite, SWT.BORDER);
				scrolledComposite.setContent(composite);
				composite.setLayout(new GridLayout(1, false));
				composite.setLayoutData(new GridData(GridData.FILL_BOTH));

				EClass eClass = (EClass) type;
				buildTable(value, eClass,
						composite, feature.getName());
				
				composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
				parent.layout(true, true);
			}
		}
	}

	/**
	 * @param object
	 *            the contents to show in the table
	 * @param eClass
	 *            the EClass of the contents (that is, the EClass of the object
	 *            if the contents is a single object, or the EClass of the
	 *            objects in the list, if the contents is a list)
	 * @param composite
	 * @param label
	 */
	protected void buildTable(Object object, EClass eClass,
			Composite composite, String label) {
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText(label);

		TableViewer tableViewer = viewerFactory.createTableViewer(composite,
				SWT.BORDER | SWT.FULL_SELECTION, object, eClass);

		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	}

	private void resetView() {
		if (scrolledComposite != null)
			scrolledComposite.dispose();

		scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL
				| SWT.BORDER);
		scrolledComposite.setExpandHorizontal(true);
	}

	public void setFocus() {
		scrolledComposite.setFocus();
	}

	/**
	 * @return the {@link EStructuralFeature} to retrieve the values
	 * of the selected {@link EObject} to show on the table
	 */
	protected abstract EStructuralFeature getEStructuralFeature();
}
