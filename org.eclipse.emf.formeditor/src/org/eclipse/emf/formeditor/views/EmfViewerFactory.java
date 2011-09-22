/**
 * 
 */
package org.eclipse.emf.formeditor.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import com.google.inject.Inject;

/**
 * Factory for viewers for EMF resources.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfViewerFactory {

	@Inject
	protected EmfViewerManager emfViewerManager;

	public TreeViewer createTreeViewer(Composite parent, int style,
			URI resourceURI) {
		TreeViewer treeViewer = new TreeViewer(parent, style);
		update(treeViewer, resourceURI);
		return treeViewer;
	}

	public TreeViewer createTreeViewer(Tree tree, URI resourceURI) {
		TreeViewer treeViewer = new TreeViewer(tree);
		update(treeViewer, resourceURI);
		return treeViewer;
	}

	public TreeViewer createTreeViewer(Composite parent, int style,
			AdapterFactoryEditingDomain editingDomain) {
		TreeViewer treeViewer = new TreeViewer(parent, style);
		update(treeViewer, editingDomain);
		return treeViewer;
	}

	public TreeViewer createTreeViewer(Tree tree,
			AdapterFactoryEditingDomain editingDomain) {
		TreeViewer treeViewer = new TreeViewer(tree);
		update(treeViewer, editingDomain);
		return treeViewer;
	}

	protected void update(TreeViewer treeViewer,
			AdapterFactoryEditingDomain editingDomain) {
		emfViewerManager.initialize(treeViewer, editingDomain);
	}

	protected void update(TreeViewer treeViewer, URI resourceURI) {
		emfViewerManager.initialize(treeViewer, resourceURI);
	}

}
