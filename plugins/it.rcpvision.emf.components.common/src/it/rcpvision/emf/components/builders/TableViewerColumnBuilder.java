/**
 * 
 */
package it.rcpvision.emf.components.builders;

import it.rcpvision.emf.components.factories.ColumnLabelProviderFactory;
import it.rcpvision.emf.components.ui.provider.FeaturesColumnProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.google.inject.Inject;

/**
 * Sets the columns of a TableViewer according to an EClass (adds a column for
 * each feature of the EClass).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class TableViewerColumnBuilder {

	private static final int DEFAULT_WEIGHT = 3;

	@Inject
	protected ColumnLabelProviderFactory columnLabelProviderFactory;

	@Inject
	protected PropertyDescriptionProvider propertyDescriptionProvider;

	@Inject
	protected FeaturesColumnProvider featuresProvider;

	public void buildTableViewer(TableViewer tableViewer, EClass eClass) {
		buildTableViewer(tableViewer, eClass, null);
	}

	/**
	 * @param tableViewer
	 * @param eClass
	 */
	public void buildTableViewer(TableViewer tableViewer, EClass eClass,
			IStructuredContentProvider contentProvider) {
		final Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		List<EStructuralFeature> typeFeatures = featuresProvider
				.getFeatures(eClass);
		int i=0;
		for (EStructuralFeature eStructuralFeature : typeFeatures) {
			int weight=DEFAULT_WEIGHT;
			if(featuresProvider.getWeights()!=null && featuresProvider.getWeights().size()>i){
				weight=featuresProvider.getWeights().get(i++);
			}
			buildTableViewerColumn(tableViewer, layout, eStructuralFeature,
					contentProvider,weight);
		}
	}
	
	protected TableViewerColumn buildTableViewerColumn(TableViewer tableViewer,
			TableLayout layout, EStructuralFeature eStructuralFeature,
			IStructuredContentProvider contentProvider) {
		return buildTableViewerColumn(tableViewer, layout, eStructuralFeature, contentProvider,DEFAULT_WEIGHT);
	}

	protected TableViewerColumn buildTableViewerColumn(TableViewer tableViewer,
			TableLayout layout, EStructuralFeature eStructuralFeature,
			IStructuredContentProvider contentProvider, int weight) {
		TableViewerColumn viewerColumn = createTableViewerColumn(tableViewer,
				eStructuralFeature, contentProvider);
		TableColumn objectColumn = viewerColumn.getColumn();
		layout.addColumnData(new ColumnWeightData(weight, 30, true));
		objectColumn.setText(propertyDescriptionProvider.getText(eStructuralFeature));
		objectColumn.setResizable(true);
		return viewerColumn;
	}

	protected TableViewerColumn createTableViewerColumn(
			TableViewer tableViewer, EStructuralFeature eStructuralFeature,
			IStructuredContentProvider contentProvider) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		if (contentProvider != null) {
			tableViewerColumn.setLabelProvider(columnLabelProviderFactory
					.createColumnLabelProvider(eStructuralFeature,
							contentProvider));
		} else {
			tableViewerColumn.setLabelProvider(columnLabelProviderFactory
					.createColumnLabelProvider(eStructuralFeature));
		}
		return tableViewerColumn;
	}
}
