package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.edit.ResourceSaveManager;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public abstract class AbstractSaveableResourceView extends ViewPart implements
		ISaveablePart, IEditingDomainProvider {
	@Inject
	protected EditingDomainFactory editingDomainFactory;

	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	@Inject
	protected ResourceSaveManager resourceSaveManager;

	private Resource resource;

	private boolean dirty;

	protected AdapterFactoryEditingDomain editingDomain;

	@Override
	public void createPartControl(Composite parent) {
		initializeEditingDomain();

		URI uri = createResourceURI();
		loadResource(uri);
	}

	protected abstract URI createResourceURI();

	private void loadResource(URI uri) {
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
	}

	protected void initializeEditingDomain() {
		editingDomain = editingDomainFactory.create();
		editingDomain.getCommandStack().addCommandStackListener(
				new CommandStackListener() {
					public void commandStackChanged(final EventObject event) {
						getSite().getWorkbenchWindow().getShell().getDisplay()
								.asyncExec(new Runnable() {
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

	protected void customizePostCommandStackChanged(Command mostRecentCommand) {
		// do nothing
	}

	protected Resource getResource() {
		return resource;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			if (resourceSaveManager.save(resource)) {
				dirty = false;
				firePropertyChange(PROP_DIRTY);
			}
		} catch (IOException e) {
			// TODO Serious log
			e.printStackTrace();
		}
	}

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	public void doSaveAs() {
	}

	public boolean isSaveAsAllowed() {
		return false;
	}

	public boolean isSaveOnCloseNeeded() {
		return false;
	}

}
