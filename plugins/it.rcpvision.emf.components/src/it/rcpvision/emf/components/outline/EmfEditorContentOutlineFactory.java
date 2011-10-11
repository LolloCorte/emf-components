/**
 * 
 */
package it.rcpvision.emf.components.outline;

import com.google.inject.Inject;
import com.google.inject.Provider;

import it.rcpvision.emf.components.editors.EmfAbstractEditor;
import it.rcpvision.emf.components.views.EmfViewerManager;

/**
 * @author bettini
 * 
 */
public class EmfEditorContentOutlineFactory {

	@Inject
	protected Provider<EmfViewerManager> emfViewerManagerProvider;
	
	@Inject
	protected Provider<EmfEditorContentOutlinePage> outlinePageProvider;

	public EmfEditorContentOutlinePage create(EmfAbstractEditor editor) {
		EmfEditorContentOutlinePage outlinePage = outlinePageProvider.get();
		outlinePage.init(editor);
		return outlinePage;
	}
}
