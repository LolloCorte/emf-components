package it.rcpvision.emf.components.cdo.view;

import it.rcpvision.emf.components.cdo.ViewConfigurator;
import it.rcpvision.emf.components.views.EObjectManager;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.GenericDetailComposite;
import it.rcpvision.emf.components.views.GenericTableComposite;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFObservable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class MasterDetailView extends ViewPart implements ISaveablePart, ISaveablePart2 {

	private FormToolkit formToolkit;

	private Composite master;
	private Composite detail;

	@Inject
	protected EObjectManager objectManager;
	
	@Inject
	protected EmfDetailsFactory emfDetailsFactory;
	
	protected GenericDetailComposite genericComponent;
	
	private boolean modified = false;
	
	private Resource modelResource;
	
	private List<GenericTableComposite> genericComponentList = new ArrayList<GenericTableComposite>();
	
	@Inject
	ViewConfigurator viewConfigurator;

	List list;

	private CDOSession session;
	
	private void initialize() {
		//Inizializzazione
//		CDOView cdoView = sessionManager.getSession(null).openView();
//		cdoView.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
//		Resource resource = cdoView.getResource("/Customer");
		IEMFListProperty listProperty=EMFProperties.list(viewConfigurator.getListFeature());
		manageList(viewConfigurator.getContainer(), listProperty );
		
	}
	
	private void manageList(EObject obj, IEMFListProperty listProp) {
		
//		genericComponent.getViewer().
		GenericTableComposite genericComponent;
		genericComponentList.add(genericComponent = emfDetailsFactory.createTableComposite(master, SWT.NONE));
		formToolkit.adapt(genericComponent);
		genericComponent.init(obj, listProp);
		addSelectionListener(genericComponent.getViewer());
		master.layout(true);
	}
	
	private void addSelectionListener(TableViewer viewer) {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EObject obj = (EObject) ((IStructuredSelection) event.getSelection()).getFirstElement();
				manageDetail(obj);
			}

		});
	}

	protected void manageDetail(EObject obj) {

		EObject model = objectManager.prepareModel(obj);
		
		if (genericComponent != null) {
			genericComponent.dispose();
		}

		genericComponent = emfDetailsFactory.createDetailsComposite(
				detail, SWT.NONE);
		formToolkit.adapt(genericComponent);
		genericComponent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		model.eAdapters().add(new Adapter() {

			@Override
			public void notifyChanged(Notification notification) {
				modified = true;
				firePropertyChange(PROP_DIRTY);
			}

			@Override
			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setTarget(Notifier newTarget) {
			}

			@Override
			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
		modelResource = model.eResource();
		
		genericComponent.init(model);
		
		detail.layout(true);
		
	}
	
	@Override
	public void createPartControl(Composite parent) {
		formToolkit = new FormToolkit(parent.getDisplay());
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 0;
		gl_parent.marginHeight = 0;
		gl_parent.horizontalSpacing = 0;
		parent.setLayout(gl_parent);

		master = formToolkit.createComposite(parent, SWT.BORDER);
		master.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		master.setLayout(new GridLayout(2, false));
		
		detail = formToolkit.createComposite(parent, SWT.BORDER);
		detail.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		detail.setLayout(new GridLayout(2, false));
		
		if (viewConfigurator.isEditable()) {
			detail.setEnabled(true);
			createCommandButtons(parent);
		} else {
			detail.setEnabled(false);
		}
		
		initialize();
	}

	private void createCommandButtons(Composite parent) {
		Composite composite = formToolkit.createComposite(parent, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));
		Button buttonSave = formToolkit.createButton(composite, "Save", SWT.NONE);
		buttonSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doSave(new NullProgressMonitor());
			}
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		objectManager.doSave(modelResource);
		modified = false;
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public void doSaveAs() {
		//
	}

	@Override
	public boolean isDirty() {
		return modified || (modelResource != null ? modelResource.isModified() : false);
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveOnCloseNeeded() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int promptToSaveOnClose() {
		// TODO Auto-generated method stub
		return 0;
	}
}
