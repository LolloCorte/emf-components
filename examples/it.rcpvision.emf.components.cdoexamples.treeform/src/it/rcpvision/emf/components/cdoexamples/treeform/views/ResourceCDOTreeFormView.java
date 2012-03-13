package it.rcpvision.emf.components.cdoexamples.treeform.views;

import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.resource.ResourceLoader;
import it.rcpvision.emf.components.widgets.TreeFormComposite;
import library.Book;
import library.Library;
import library.LibraryFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class ResourceCDOTreeFormView extends ViewPart {

	@Inject
	protected EmfCompositeFactory emfCompositeFactory;

	@Inject
	protected ResourceLoader resourceLoader;

	protected TreeFormComposite treeFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		treeFormComposite = emfCompositeFactory.createTreeFormComposite(parent,
				SWT.BORDER);

		String uriStr = "cdo://localhost:2036/demo/myResource/";
		URI uri = URI.createURI(uriStr);
		
		Resource resource = resourceLoader.getResource(new ResourceSetImpl(), uri);
		initializeResource(resource);

		treeFormComposite.update(resource);
	}

	protected void initializeResource(Resource resource) {
		if (!resource.getContents().isEmpty())
			return;

		Library library = LibraryFactory.eINSTANCE.createLibrary();
		resource.getContents().add(library);
		Book book = LibraryFactory.eINSTANCE.createBook();
		library.getBooks().add(book);
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}

}
