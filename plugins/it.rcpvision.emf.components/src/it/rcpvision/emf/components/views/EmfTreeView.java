/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;

/**
 * A View that visualizes the tree of an emf selected resource (it also acts as
 * a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfTreeView extends EmfAbstractView {

	public EmfTreeView() {
	}

	@Override
	protected StructuredViewer createViewer() {
		return new TreeViewer(pagebook, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	}
}
