/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
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
	@Inject
	protected TableViewerBuilder tableViewerBuilder;

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
	
	public TableViewer createTableViewer(Composite parent, int style, Object content, EClass type){
		TableViewer tableViewer = new TableViewer(parent, style);
		ObservableListContentProvider contentProvider=new ObservableListContentProvider(); 
		tableViewerBuilder.buildAndFill(tableViewer, content, type, contentProvider);
		return tableViewer;
	}

	protected void update(TreeViewer treeViewer,
			AdapterFactoryEditingDomain editingDomain) {
		emfViewerManager.initialize(treeViewer, editingDomain);
	}

	protected void update(TreeViewer treeViewer, URI resourceURI) {
		emfViewerManager.initialize(treeViewer, resourceURI);
	}

}
