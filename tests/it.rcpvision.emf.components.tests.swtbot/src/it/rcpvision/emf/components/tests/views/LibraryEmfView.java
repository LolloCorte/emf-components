/**
 * 
 */
package it.rcpvision.emf.components.tests.views;

import it.rcpvision.emf.components.views.OnSelectionTreeView;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Composite;

/**
 * OnSelectionTreeView with hardcoded resource URI
 * 
 * @author bettini
 * 
 */
public class LibraryEmfView extends OnSelectionTreeView {

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
