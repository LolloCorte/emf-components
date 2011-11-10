/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;

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
	protected TableViewerBuilder tableViewerBuilder;

	public EmfTableView() {
	}

	@Override
	protected StructuredViewer createViewer() {
		return new TableViewer(pagebook);
	}

	@Override
	protected void performUpdateOnSelection(EObject eObject) {
		tableViewerBuilder.buildTableViewer((TableViewer) viewer,
				eObject.eClass());
		super.performUpdateOnSelection(eObject);
	}

}
