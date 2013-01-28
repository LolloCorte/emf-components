/**
 * 
 */
package it.rcpvision.emf.components.editors.outline;

import it.rcpvision.emf.components.editors.EmfAbstractEditor;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EmfEditorContentOutlineFactory {

	@Inject
	protected Provider<ViewerInitializer> emfViewerManagerProvider;
	
	@Inject
	protected Provider<EmfEditorContentOutlinePage> outlinePageProvider;

	public EmfEditorContentOutlinePage create(EmfAbstractEditor editor) {
		EmfEditorContentOutlinePage outlinePage = outlinePageProvider.get();
		outlinePage.init(editor);
		return outlinePage;
	}
}
