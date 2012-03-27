package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public abstract class AbstractSaveableResourceTableView extends AbstractSaveableResourceView{

	@Inject
	protected TableViewerBuilder tableViewerBuilder;
	
	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	private Resource resource;

	private TableViewer tableViewer;

	
	@Override
	public void createPartControl(Composite parent) {
		
		initializeEditingDomain();
		
		URI uri = createResourceURI();
		loadResource(uri);
				
		tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		
		tableViewerBuilder.buildAndFill(tableViewer, getContents(resource), getEClass());

								
	}

	private void loadResource(URI uri) {
		
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
	}
	
	protected Resource getResource() {
		return resource;
	}

	protected abstract Object getContents(Resource resource);
	
	protected abstract EClass getEClass();

	protected abstract URI createResourceURI();

	

	@Override
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}


	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isSaveOnCloseNeeded() {
		// TODO Auto-generated method stub
		return false;
	}

}
