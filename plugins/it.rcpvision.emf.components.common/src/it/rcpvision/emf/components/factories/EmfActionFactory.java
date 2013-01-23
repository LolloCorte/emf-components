/**
 * 
 */
package it.rcpvision.emf.components.factories;

import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;

/**
 * @author Lorenzo Bettini
 * 
 */
public class EmfActionFactory {

	public DeleteAction createDeleteAction() {
		return new DeleteAction(true);
	}

	public CutAction createCutAction() {
		return new CutAction();
	}

	public CopyAction createCopyAction() {
		return new CopyAction();
	}

	public PasteAction createPasteAction() {
		return new PasteAction();
	}

	public UndoAction createUndoAction() {
		return new UndoAction();
	}

	public RedoAction createRedoAction() {
		return new RedoAction();
	}

	public LoadResourceAction createLoadResourceAction() {
		return new LoadResourceAction();
	}

	public ControlAction createControlAction() {
		return new ControlAction();
	}

	public ValidateAction createValidateAction() {
		return new ValidateAction();
	}
}
