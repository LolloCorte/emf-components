package it.rcpvision.emf.components.examples.mail.rcp;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;


public class OpenViewAction extends Action {
	
	private final IWorkbenchWindow window;
	protected int instanceNum = 0;
	protected final String viewId;
	
	public OpenViewAction(IWorkbenchWindow window, String label, String viewId) {
		this.window = window;
		this.viewId = viewId;
        setText(label);
        // The id is used to refer to the action in a menu or toolbar
		setId(ICommandIds.CMD_OPEN);
        // Associate the action with a pre-defined command, to allow key bindings.
		setActionDefinitionId(ICommandIds.CMD_OPEN);
		setImageDescriptor(it.rcpvision.emf.components.examples.mail.rcp.Activator.getImageDescriptor("/icons/sample2.gif"));
	}
	
	public void run() {
		MessageDialog.openInformation(window.getShell(), "Open", "New Message Dialog!");
//		if(window != null) {	
//			try {
//				window.getActivePage().showView(viewId, Integer.toString(instanceNum++), IWorkbenchPage.VIEW_ACTIVATE);
//			} catch (PartInitException e) {
//				MessageDialog.openError(window.getShell(), "Error", "Error opening view:" + e.getMessage());
//			}
//		}
	}
}
