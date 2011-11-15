/**
 * 
 */
package it.rcpvision.emf.components.tests.tables;

import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.views.EmfViewerManager;
import it.rcpvision.emf.components.views.TableViewerBuilder;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
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

	@Inject
	protected TableViewerBuilder tableViewerBuilder;

	@Inject
	protected ResourceLoader resourceLoader;

	@Inject
	protected EmfViewerManager emfViewerManager;

	private Composite composite;

	public LibraryTestTableView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceLoader.getResource(resourceSet,
				URI.createURI(resourceUri));

		Library library = (Library) resource.getContents().get(0);

		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("Library");
		
		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewerBuilder.buildTableViewer(tableViewer, library.eClass());

		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		emfViewerManager.initialize(tableViewer,
				Collections.singleton(library), new ArrayContentProvider(),
				null);
		
		Label lblNewLabel2 = new Label(composite, SWT.NONE);
		lblNewLabel2.setText("Books");
		
		TableViewer tableViewer2 = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewerBuilder.buildTableViewer(tableViewer2, EXTLibraryPackage.Literals.BOOK);
		
		Table table2 = tableViewer2.getTable();
		table2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		emfViewerManager.initialize(tableViewer2,
				library.getBooks(), new ArrayContentProvider(),
				null);
	}

	@Override
	public void setFocus() {
		composite.setFocus();
	}

}
