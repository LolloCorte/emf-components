/**
 * 
 */
package it.rcpvision.emf.components.outline;

import it.rcpvision.emf.components.editors.EmfAbstractEditor;
import it.rcpvision.emf.components.views.EmfViewerManager;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EmfEditorContentOutlinePage extends ContentOutlinePage {

	protected EmfAbstractEditor editor;

	@Inject
	protected Provider<EmfViewerManager> emfViewerManagerProvider;

	public EmfEditorContentOutlinePage(EmfAbstractEditor editor, Provider<EmfViewerManager> emfViewerManagerProvider) {
		this.editor = editor;
		this.emfViewerManagerProvider = emfViewerManagerProvider;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		TreeViewer contentOutlineViewer = getTreeViewer();
		editor.setContentOutlineViewer(contentOutlineViewer);

		// Set up the tree viewer.
		emfViewerManagerProvider.get().initialize(contentOutlineViewer, editor.getEditingDomain());
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
