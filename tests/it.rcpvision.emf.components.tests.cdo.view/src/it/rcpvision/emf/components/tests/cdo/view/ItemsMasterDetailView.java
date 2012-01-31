package it.rcpvision.emf.components.tests.cdo.view;

import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.views.EObjectManager;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.GenericDetailComposite;
import it.rcpvision.emf.components.views.GenericTableComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import my.Container;
import my.Customer;
import my.MyFactory;
import my.MyPackage;
import my.Order;
import my.util.MyAdapterFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.EcoreUtil2;

import com.google.inject.Inject;

public class ItemsMasterDetailView extends ViewPart implements ISaveablePart,ISaveablePart2{

	private FormToolkit formToolkit;

	private Composite master;
	private Composite detail;

	@Inject
	protected EObjectManager objectManager;
	
	@Inject
	protected EmfDetailsFactory emfDetailsFactory;
	
	protected GenericDetailComposite genericComponent;
	
	private boolean modified=false;
	
	private Resource modelResource;
	
	private List<GenericTableComposite> genericComponentList=new ArrayList<GenericTableComposite>();
	
	@Inject
	CDOSessionManager sessionManager;

	List list;

	private CDOSession session;
	
	private void initialize() {
		//Inizializzazione
		CDOView cdoView = sessionManager.getSession(null).openView();
		cdoView.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
		Resource resource = cdoView.getResource("/myResource");
		
		Container container=(Container) resource.getContents().get(0);
		IEMFListProperty listProp=EMFProperties.list(MyPackage.Literals.CONTAINER__LIST_ITEM);
		
		manageList(container,listProp);
		
	}

	private void manageList(EObject obj, IEMFListProperty listProp){
		
//		genericComponent.getViewer().
		GenericTableComposite genericComponent;
		genericComponentList.add(genericComponent= emfDetailsFactory.createTableComposite(master, SWT.NONE));
		formToolkit.adapt(genericComponent);
		genericComponent.init(obj,listProp);
		addSelectionListener(genericComponent.getViewer());
		master.layout(true);
	}
	

	
	private void addSelectionListener(TableViewer viewer) {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {		
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EObject obj=(EObject) ((IStructuredSelection)event.getSelection()).getFirstElement();
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
		model.eAdapters().add(new Adapter(){

			@Override
			public void notifyChanged(Notification notification) {
				modified=true;
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
		modelResource=model.eResource();
		
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
		
		initialize();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	

	@Override
	public void doSave(IProgressMonitor monitor) {
		objectManager.doSave(modelResource);
		modified=false;
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public void doSaveAs() {
		//
	}

	@Override
	public boolean isDirty() {
		return modified||(modelResource!=null?modelResource.isModified():false);
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
