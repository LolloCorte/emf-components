package it.rcpvision.emf.components.listeners;

import it.rcpvision.emf.components.editors.EmfAbstractEditor;

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
	private EmfAbstractEditor emfTreeEditor;

	public EmfAbstractEditor getEmfFormEditor() {
		return emfTreeEditor;
	}

	public void setEmfFormEditor(EmfAbstractEditor emfTreeEditor) {
		this.emfTreeEditor = emfTreeEditor;
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