/**
 * 
 */
package it.rcpvision.emf.components.editors.outline;

import it.rcpvision.emf.components.editors.EmfAbstractEditor;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import com.google.inject.Inject;

/**
 * @author bettini
 * 
 */
public class EmfEditorContentOutlinePage extends ContentOutlinePage {

	protected EmfAbstractEditor editor;

	@Inject
	protected ViewerInitializer viewerInitializer;

	public void init(EmfAbstractEditor editor) {
		this.editor = editor;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		TreeViewer contentOutlineViewer = getTreeViewer();
		editor.setContentOutlineViewer(contentOutlineViewer);

		// Set up the tree viewer.
		viewerInitializer.initialize(contentOutlineViewer,
				editor.getEditingDomain());
		// Make sure our popups work.
		editor.createContextMenuFor(contentOutlineViewer);
		// select the root
		editor.setSelectionOnRoot(contentOutlineViewer);
	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		editor.getActionBarContributor().shareGlobalActions(this,
				pageSite.getActionBars());
	}

	@Override
	public TreeViewer getTreeViewer() {
		return super.getTreeViewer();
	}

}
