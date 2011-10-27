/**
 * 
 */
package it.rcpvision.emf.components.tests.cdo.app.views;

import it.rcpvision.emf.components.views.EmfTreeView;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Composite;

/**
 * EmfTreeView with hardcoded resource URI
 * 
 * @author bettini
 * 
 */
public class LibraryEmfView extends EmfTreeView {

	public static final String resourceUri = "platform:/plugin/it.rcpvision.emf.components.tests.swtbot/models/My.extlibrary";

	public LibraryEmfView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		showEmfViewer();
		init(URI.createURI(resourceUri));
	}

}
