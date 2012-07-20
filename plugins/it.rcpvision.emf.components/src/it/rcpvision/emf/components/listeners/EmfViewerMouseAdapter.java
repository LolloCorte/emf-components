package it.rcpvision.emf.components.listeners;

import it.rcpvision.emf.components.EmfComponentsActivator;

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * This default implementation opens the Properties view upon doubleclick.
 * 
 * @author bettini
 *
 */
public class EmfViewerMouseAdapter extends MouseAdapter {

	@Override
	public void mouseDoubleClick(MouseEvent event) {
		if (event.button == 1) {
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
						.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException exception) {
				EmfComponentsActivator.log(exception);
			}
		}
	}
}