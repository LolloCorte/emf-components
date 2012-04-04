package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.resource.EditingDomainFactory;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public abstract class AbstractSaveableResourceView extends ViewPart implements ISaveablePart {


	@Inject
	protected EditingDomainFactory editingDomainFactory;
	
	private boolean dirty;
	
	protected AdapterFactoryEditingDomain editingDomain;
	
	protected abstract Resource getResource();

	protected void initializeEditingDomain() {
		editingDomain = editingDomainFactory.create();
		editingDomain.getCommandStack().addCommandStackListener(
			new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					getSite().getWorkbenchWindow().getShell().getDisplay().asyncExec(
							new Runnable() {
								public void run() {
									setDirty(true);
									firePropertyChange(PROP_DIRTY);
	
									// Try to select the affected objects.
									//
									Command mostRecentCommand = ((CommandStack) event
											.getSource())
											.getMostRecentCommand();
									customizePostCommandStackChanged(mostRecentCommand);
								}
								
							});
				}
			});
	}
	
	protected void customizePostCommandStackChanged(Command mostRecentCommand){
		//do nothing
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			if(validateModel()){
				getResource().save(null);	
				dirty = false;
				firePropertyChange(PROP_DIRTY);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected boolean validateModel() {
        for (EObject eObject : getResource().getContents()) {
            Diagnostic diagnostic = getCustomDiagnostician().validate(eObject);
            if (diagnostic.getSeverity() == Diagnostic.ERROR) {
                String errors = buildMessageString(diagnostic, Diagnostic.ERROR);
                MessageDialog.openError(null, "Validation Error", errors);
                return false;
            } else if (diagnostic.getSeverity() == Diagnostic.WARNING) {
                String warnings = buildMessageString(diagnostic, Diagnostic.ERROR);
                MessageDialog.openWarning(null, "Validation Warning", warnings);
            }
        }
        return true;
	}

	protected Diagnostician getCustomDiagnostician(){
	    return Diagnostician.INSTANCE;
	}

    protected String buildMessageString(Diagnostic diagnosticParent, int level) {
		String messages="";
		for (Diagnostic diagnostic : diagnosticParent.getChildren()) {
			messages=recoursiveAddMessage(messages,diagnostic,level);
		}
		return messages;
	}

	protected String recoursiveAddMessage(String messages, Diagnostic diagnostic,
			int level) {
		if(diagnostic.getChildren().size()==0){
			messages+="- "+diagnostic.getMessage() + "\n\n";
		}else{
			for (Diagnostic diagnosticChild : diagnostic.getChildren()) {
				messages=recoursiveAddMessage(messages,diagnosticChild,level);
			}	
		}
		return messages;
	}
	
	public boolean isDirty() {
		return dirty;
	}


	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}


}
