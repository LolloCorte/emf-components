/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 * @author bettini
 * 
 */
public class TableViewerBuilder {

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

		TableColumn[] columns = tableViewer.getTable().getColumns();

		for (TableColumn column : columns) {
			column.dispose();
		}

		tableViewer.setInput(null);

		tableViewer.refresh();

		// Layout the viewer
		/*
		 * GridData gridData = new GridData(); gridData.verticalAlignment =
		 * GridData.FILL; gridData.horizontalSpan = 2;
		 * gridData.grabExcessHorizontalSpace = true;
		 * gridData.grabExcessVerticalSpace = true; gridData.horizontalAlignment
		 * = GridData.FILL; tableViewer.getControl().setLayoutData(gridData);
		 */

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
		TableColumn objectColumn = new TableColumn(tableViewer.getTable(),
				SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		objectColumn.setText(eStructuralFeature.getName());
		objectColumn.setResizable(true);
		/*
		 * final TableViewerColumn viewerColumn = new TableViewerColumn(
		 * tableViewer, SWT.NONE); final TableColumn column =
		 * viewerColumn.getColumn();
		 * column.setText(eStructuralFeature.getName());
		 * column.setResizable(true); column.setMoveable(true);
		 */
	}
}
