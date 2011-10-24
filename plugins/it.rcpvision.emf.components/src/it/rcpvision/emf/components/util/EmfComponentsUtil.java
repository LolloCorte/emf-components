package it.rcpvision.emf.components.util;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;

/**
 * @author bettini
 * 
 */
public class EmfComponentsUtil {
	public static IStatusLineManager getStatusLineManager() {
		IWorkbenchPartSite site = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActivePart()
				.getSite();

		if (site instanceof IViewSite) {
			return getStatusLineManager(((IViewSite) site).getActionBars());
		} else if (site instanceof IEditorSite) {
			return getStatusLineManager(((IEditorSite) site).getActionBars());
		} else {
			return null;
		}
	}

	private static IStatusLineManager getStatusLineManager(IActionBars actionBars) {
		return actionBars.getStatusLineManager();
	}
}
