package it.rcpvision.emf.components.listeners;

import it.rcpvision.emf.components.editors.EmfFormEditor;

import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.PartInitException;

/**
 * This default implementation opens the Properties view upon doubleclick.
 * 
 * @author bettini
 *
 */
public class EmfViewerMouseAdapter extends MouseAdapter {
	/**
	 * 
	 */
	private EmfFormEditor emfFormEditor;

	public EmfFormEditor getEmfFormEditor() {
		return emfFormEditor;
	}

	public void setEmfFormEditor(EmfFormEditor emfFormEditor) {
		this.emfFormEditor = emfFormEditor;
	}

	@Override
	public void mouseDoubleClick(MouseEvent event) {
		if (event.button == 1) {
			try {
				getEmfFormEditor().getEditorSite().getPage()
						.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException exception) {
				EcoreEditorPlugin.INSTANCE.log(exception);
			}
		}
	}
}