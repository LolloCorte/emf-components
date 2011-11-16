/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.ui.provider.EStructuralFeatureColumnProvider;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 * Sets the columns of a TableViewer according to an EClass
 * (adds a column for each feature of the EClass).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class TableViewerColumnBuilder {

	public void buildTableViewer(TableViewer tableViewer,
			EStructuralFeature feature) {
		EClassifier type = feature.getEType();
		if (type instanceof EClass) {
			EClass eClass = (EClass) type;
			buildTableViewer(tableViewer, eClass);
		}
	}

	/**
	 * @param tableViewer
	 * @param eClass
	 */
	public void buildTableViewer(TableViewer tableViewer, EClass eClass) {
		final Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		EList<EStructuralFeature> typeFeatures = eClass
				.getEAllStructuralFeatures();
		for (EStructuralFeature eStructuralFeature : typeFeatures) {
			buildTableViewerColumn(tableViewer, layout, eStructuralFeature);
		}
	}

	protected void buildTableViewerColumn(TableViewer tableViewer,
			TableLayout layout, EStructuralFeature eStructuralFeature) {
		TableViewerColumn viewerColumn = createTableViewerColumn(tableViewer,
				eStructuralFeature);
		TableColumn objectColumn = viewerColumn.getColumn();
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		objectColumn.setText(eStructuralFeature.getName());
		objectColumn.setResizable(true);
	}

	protected TableViewerColumn createTableViewerColumn(
			TableViewer tableViewer, final EStructuralFeature eStructuralFeature) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		tableViewerColumn.setLabelProvider(new EStructuralFeatureColumnProvider(eStructuralFeature));
		return tableViewerColumn;
	}
}
