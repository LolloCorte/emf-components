/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Composite;

/**
 * A View that visualizes the list of elements of an emf selected resource (it also acts as
 * a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfListView extends StructuredViewerAbstractView {

	public EmfListView() {
	}

	@Override
	protected StructuredViewer createViewer(Composite parent) {
		return new ListViewer(parent);
	}
}
