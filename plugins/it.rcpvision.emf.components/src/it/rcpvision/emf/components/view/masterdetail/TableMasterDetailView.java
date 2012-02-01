package it.rcpvision.emf.components.view.masterdetail;

import it.rcpvision.emf.components.views.EObjectManager;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.GenericDetailComposite;
import it.rcpvision.emf.components.views.GenericTableComposite;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class TableMasterDetailView extends ViewPart implements ISaveablePart, ISaveablePart2 {

	private FormToolkit formToolkit;

	private Composite master;
	private Composite detail;

	@Inject
	protected EObjectManager objectManager;
	
	@Inject
	protected EmfDetailsFactory emfDetailsFactory;
	
	private GenericDetailComposite genericComponent;
	
	private boolean modified = false;
	
	private Resource modelResource;
	
	private List<GenericTableComposite> genericComponentList = new ArrayList<GenericTableComposite>();
	
	@Inject
	ViewConfigurator viewConfigurator;
	
	private GenericTableComposite genericTable;

	private Adapter modelAdapter;

	private EObject model;

	
	private void initialize() {
		//Inizializzazione
//		CDOView cdoView = sessionManager.getSession(null).openView();
//		cdoView.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
//		Resource resource = cdoView.getResource("/Customer");
		IEMFListProperty listProperty=EMFProperties.list(viewConfigurator.getListFeature());
		manageList(viewConfigurator.getContainer(), listProperty );
		
	}
	
	private void manageList(EObject obj, IEMFListProperty listProp) {
		genericComponentList.add(genericTable = emfDetailsFactory.createTableComposite(master, SWT.NONE));
		formToolkit.adapt(genericTable);
		genericTable.init(obj, listProp);
		addSelectionListener(genericTable.getViewer());
		master.layout(true);
	}
	
	private void addSelectionListener(TableViewer viewer) {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EObject obj = (EObject) ((IStructuredSelection) event.getSelection()).getFirstElement();
				if(obj!=null){
					manageDetail(obj);
				}
			}

		});
	}
	
	private void disposeGenericDetail(EObject obj) {
		if (genericComponent != null) {
			model.eAdapters().remove(modelAdapter);
			genericComponent.dispose();
		}
	}

	

	protected void manageDetail(EObject obj) {
		disposeGenericDetail(obj);
		
		model = objectManager.prepareModel(obj);

		genericComponent = emfDetailsFactory.createDetailsComposite(detail, SWT.NONE);
		formToolkit.adapt(genericComponent);
		genericComponent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		model.eAdapters().add(modelAdapter=new Adapter() {

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

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		GridLayoutFactory.fillDefaults().applyTo(sashForm);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(sashForm);

		master = formToolkit.createComposite(sashForm, SWT.BORDER);
		master.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		master.setLayout(new GridLayout(2, false));
		
		detail = formToolkit.createComposite(sashForm, SWT.BORDER);
		detail.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		detail.setLayout(new GridLayout(2, false));
		
		if (viewConfigurator.isEditable()) {
			detail.setEnabled(true);
			createCommandButtons(sashForm);
			sashForm.setWeights(new int[] { 70, 20, 10 });
		} else {
			detail.setEnabled(false);
			sashForm.setWeights(new int[] { 75, 25 });
		}
		
		initialize();
	}

	private void createCommandButtons(Composite parent) {
		Composite composite = formToolkit.createComposite(parent, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		composite.setLayout(new RowLayout());
		Button buttonInsert = formToolkit.createButton(composite, "Insert", SWT.NONE);
		buttonInsert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EObject eObject=objectManager.createNewChild(viewConfigurator.getContainer(),viewConfigurator.getListFeature());
				genericTable.getViewer().setSelection(new StructuredSelection(eObject));
				modified = true;
				firePropertyChange(PROP_DIRTY);
			}
		});
		Button buttonSave = formToolkit.createButton(composite, "Save", SWT.NONE);
		buttonSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doSave(new NullProgressMonitor());
			}
		});
		Button buttonDelete = formToolkit.createButton(composite, "Delete", SWT.NONE);
		buttonDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selection=genericTable.getViewer().getSelection();
				if(selection !=null && !selection.isEmpty() && selection instanceof IStructuredSelection){
					if(MessageDialog.openConfirm(TableMasterDetailView.this.getViewSite().getShell(), "Cancellazione", "Sei sicuro di voler eliminare l'elemento selezionato?")){
						EObject eObject=(EObject) ((IStructuredSelection)selection).getFirstElement();
						disposeGenericDetail(eObject);
						objectManager.delete(viewConfigurator.getContainer(),viewConfigurator.getListFeature(),eObject);
						modified = false;
						firePropertyChange(PROP_DIRTY);
					}
				}else{
					MessageDialog.openInformation(TableMasterDetailView.this.getViewSite().getShell(), "Cancellazione", "Selezionare l'elemento da eliminare");
				}
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
