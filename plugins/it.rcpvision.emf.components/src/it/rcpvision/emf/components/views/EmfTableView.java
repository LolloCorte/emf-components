/**
 * 
 */
package it.rcpvision.emf.components.views;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import com.google.inject.Inject;

/**
 * A View that visualizes the list of elements of an emf selected resource (it
 * also acts as a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfTableView extends EmfAbstractView {

	@Inject
	protected TableViewerColumnBuilder tableViewerColumnBuilder;

	public EmfTableView() {
	}

	@Override
	protected StructuredViewer createViewer(Composite parent) {
		return new TableViewer(parent);
	}

	@Override
	protected void performUpdateOnSelection(EObject eObject) {
		// since we may have to change columns we create a new viewer
		// as suggested here:
		// http://www.eclipse.org/forums/index.php/mv/msg/172950/550897/#msg_550897
		TableViewer tableViewer = (TableViewer) getViewer();
		Table table = tableViewer.getTable();
		Composite parent = table.getParent();
		table.dispose();
		tableViewer = new TableViewer(parent);
		setViewer(tableViewer);

		// Create columns
		tableViewerColumnBuilder.buildTableViewer(tableViewer, eObject.eClass());
		// no label provider, since we use column label providers

		emfViewerManager.initialize(tableViewer,
				Collections.singleton(eObject), new ArrayContentProvider(),
				null);
		parent.layout(true, true); // You need to relayout
	}

}
