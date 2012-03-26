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

public abstract class AbstractSaveableResourceTableView extends ViewPart implements ISaveablePart{

	@Inject
	protected TableViewerBuilder tableViewerBuilder;
	
	@Inject
	protected EditingDomainResourceLoader resourceLoader;
	
	@Inject
	protected EditingDomainFactory editingDomainFactory;

	private Resource resource;
	

	protected AdapterFactoryEditingDomain editingDomain;

	private TableViewer tableViewer;

	private boolean dirty;
	
	@Override
	public void createPartControl(Composite parent) {
		
		editingDomain = editingDomainFactory.create();
		URI uri = createResourceURI();
		getResource(uri);
		
		
		tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		
		tableViewerBuilder.buildAndFill(tableViewer, getContents(resource), getEClass());
		
		editingDomain.getCommandStack().addCommandStackListener(
				new CommandStackListener() {
					public void commandStackChanged(final EventObject event) {
						AbstractSaveableResourceTableView.this.getSite().getWorkbenchWindow().getShell().getDisplay().asyncExec(
								new Runnable() {

									public void run() {
										dirty = true;
										firePropertyChange(PROP_DIRTY);
									}
								});
					}
				});
								
	}

	private void getResource(URI uri) {
		
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
	}
	
	protected abstract Object getContents(Resource resource);
	
	protected abstract EClass getEClass();

	protected abstract URI createResourceURI();

	

	@Override
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}




	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			if(validateModel()){
				resource.save(null);	
				dirty = false;
				firePropertyChange(PROP_DIRTY);
			}
		} catch (IOException e) {
			//TODO Serious log
			e.printStackTrace();
		}
	}

	private boolean validateModel() {
		for (EObject eObject : resource.getContents()) {
			Diagnostic diagnostic=Diagnostician.INSTANCE.validate(eObject);
			if(diagnostic.getSeverity()==Diagnostic.ERROR){
				MessageDialog.openError(null, "Validation Error", diagnostic.getMessage());
				return false;
			}else if(diagnostic.getSeverity()==Diagnostic.WARNING){
				MessageDialog.openWarning(null, "Validation Warning", diagnostic.getMessage());
			}
		}
		return true;
	}



	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public boolean isDirty() {

		return dirty;
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
