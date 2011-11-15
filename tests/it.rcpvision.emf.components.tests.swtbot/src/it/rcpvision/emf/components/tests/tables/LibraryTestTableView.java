/**
 * 
 */
package it.rcpvision.emf.components.tests.tables;

import java.util.Collections;

import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.views.EmfViewerManager;
import it.rcpvision.emf.components.views.TableViewerBuilder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

/**
 * EmfTreeView with hardcoded resource URI
 * 
 * @author bettini
 * 
 */
public class LibraryTestTableView extends ViewPart {

	public static final String resourceUri = "platform:/plugin/it.rcpvision.emf.components.tests.swtbot/models/My.extlibrary";

	protected TableViewer tableViewer;

	@Inject
	protected TableViewerBuilder tableViewerBuilder;

	@Inject
	protected ResourceLoader resourceLoader;

	@Inject
	protected EmfViewerManager emfViewerManager;

	public LibraryTestTableView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		tableViewer = new TableViewer(parent);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceLoader.getResource(resourceSet,
				URI.createURI(resourceUri));

		Library library = (Library) resource.getContents().get(0);

		tableViewerBuilder.buildTableViewer(tableViewer, library.eClass());

		emfViewerManager.initialize(tableViewer,
				Collections.singleton(library), new ArrayContentProvider(),
				null);
	}

	@Override
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

}
