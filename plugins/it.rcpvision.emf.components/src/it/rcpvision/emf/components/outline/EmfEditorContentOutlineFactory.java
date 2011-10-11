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

	public EmfEditorContentOutlinePage create(EmfAbstractEditor editor) {
		return new EmfEditorContentOutlinePage(editor, emfViewerManagerProvider);
	}
}
