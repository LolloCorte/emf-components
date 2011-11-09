/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredViewer;

/**
 * A View that visualizes the list of elements of an emf selected resource (it also acts as
 * a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfListView extends EmfAbstractView {

	public EmfListView() {
	}

	@Override
	protected StructuredViewer createViewer() {
		return new ListViewer(pagebook);
	}
}
