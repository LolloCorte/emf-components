/**
 * 
 */
package it.rcpvision.emf.components.tests.tables;

import it.rcpvision.emf.components.builders.TableViewerBuilder;
import it.rcpvision.emf.components.examples.library.EXTLibraryPackage;
import it.rcpvision.emf.components.examples.library.Library;
import it.rcpvision.emf.components.examples.library.VideoCassette;
import it.rcpvision.emf.components.resource.ResourceLoader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.EcoreUtil2;

import com.google.inject.Inject;

/**
 * OnSelectionTreeView with hardcoded resource URI
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

	private Composite composite;

	public LibraryTestTableView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceLoader.getResource(resourceSet,
				URI.createURI(resourceUri));

		Library library = (Library) resource.getContents().get(0);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent,
				SWT.V_SCROLL | SWT.BORDER);
		scrolledComposite.setExpandHorizontal(true);

		composite = new Composite(scrolledComposite, SWT.BORDER);
		scrolledComposite.setContent(composite);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		buildTable("Library", library, library.eClass());
		buildTable("Books", library.getBooks(), EXTLibraryPackage.Literals.BOOK);
		buildTable("Writers", library.getWriters(),
				EXTLibraryPackage.Literals.WRITER);
		buildTable("Videos",
				EcoreUtil2.getAllContentsOfType(library, VideoCassette.class),
				EXTLibraryPackage.Literals.VIDEO_CASSETTE);
		
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		composite.layout(true);
	}

	/**
	 * @param object
	 */
	protected void buildTable(String label, Object object, EClass eClass) {
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText(label);

		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER
				| SWT.FULL_SELECTION);
		
		tableViewerBuilder.buildAndFill(tableViewer, object, eClass);

		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	}

	@Override
	public void setFocus() {
		composite.setFocus();
	}

}
