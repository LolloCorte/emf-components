package it.rcpvision.emf.components.cdo.examples.rcp.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class OpenEditor extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		String uriStr = "cdo://localhost:2036/demo/res2/";
		URI uri = URI.createURI(uriStr);
		try {
			page.openEditor(new URIEditorInput(uri),
					"it.rcpvision.emf.components.cdo");
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		return null;
	}
}
