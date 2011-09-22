/**
 * 
 */
package org.eclipse.emf.formeditor.handlers;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;

/**
 * @author bettini
 * 
 */
public class ContentOutlineSelectionHandler {
	protected TreeViewer selectionViewer;

	public TreeViewer getSelectionViewer() {
		return selectionViewer;
	}

	public void setSelectionViewer(TreeViewer selectionViewer) {
		this.selectionViewer = selectionViewer;
	}

	public void handleContentOutlineSelection(ISelection selection) {
		if (selectionViewer != null && !selection.isEmpty()
				&& selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection)
					.iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();

				ArrayList<Object> selectionList = new ArrayList<Object>();
				selectionList.add(selectedElement);
				while (selectedElements.hasNext()) {
					selectionList.add(selectedElements.next());
				}

				// Set the selection to the widget.
				//
				selectionViewer.setSelection(new StructuredSelection(
						selectionList));
			}
		}
	}
}
