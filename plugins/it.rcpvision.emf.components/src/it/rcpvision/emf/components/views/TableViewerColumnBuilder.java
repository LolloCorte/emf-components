/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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

	@Inject
	protected JfaceProviderFactory jfaceProviderFactory;

	@Inject
	protected FeatureLabelProvider featureLabelProvider;

	@Inject
	protected EStructuralFeaturesProvider featuresProvider;

	public void buildTableViewer(TableViewer tableViewer,
			EStructuralFeature feature) {
		EClassifier type = feature.getEType();
		if (type instanceof EClass) {
			EClass eClass = (EClass) type;
			buildTableViewer(tableViewer, eClass);
		}
	}

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
		for (EStructuralFeature eStructuralFeature : typeFeatures) {
			buildTableViewerColumn(tableViewer, layout, eStructuralFeature,
					contentProvider);
		}
	}

	protected TableViewerColumn buildTableViewerColumn(TableViewer tableViewer,
			TableLayout layout, EStructuralFeature eStructuralFeature,
			IStructuredContentProvider contentProvider) {
		TableViewerColumn viewerColumn = createTableViewerColumn(tableViewer,
				eStructuralFeature, contentProvider);
		TableColumn objectColumn = viewerColumn.getColumn();
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		objectColumn.setText(featureLabelProvider.getText(eStructuralFeature));
		objectColumn.setResizable(true);
		return viewerColumn;
	}

	protected TableViewerColumn createTableViewerColumn(
			TableViewer tableViewer, EStructuralFeature eStructuralFeature,
			IStructuredContentProvider contentProvider) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		if (contentProvider != null) {
			tableViewerColumn.setLabelProvider(jfaceProviderFactory
					.createColumnLabelProvider(eStructuralFeature,
							contentProvider));
		} else {
			tableViewerColumn.setLabelProvider(jfaceProviderFactory
					.createColumnLabelProvider(eStructuralFeature));
		}
		return tableViewerColumn;
	}
}
