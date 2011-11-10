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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 * @author bettini
 *
 */
public class TableViewerBuilder {

	public void buildTableViewer(TableViewer tableViewer, EStructuralFeature feature) {
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
		EList<EStructuralFeature> typeFeatures = eClass.getEAllStructuralFeatures();
		for (EStructuralFeature eStructuralFeature : typeFeatures) {
			buildTableViewerColumn(tableViewer, eStructuralFeature);
		}
	}

	protected void buildTableViewerColumn(TableViewer tableViewer,
			EStructuralFeature eStructuralFeature) {
		Table table = tableViewer.getTable();
        TableLayout layout = new TableLayout();
        table.setLayout(layout);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        TableColumn objectColumn = new TableColumn(table, SWT.NONE);
        layout.addColumnData(new ColumnWeightData(3, 100, true));
        objectColumn.setText(eStructuralFeature.getName());
        objectColumn.setResizable(true);
	}
}
