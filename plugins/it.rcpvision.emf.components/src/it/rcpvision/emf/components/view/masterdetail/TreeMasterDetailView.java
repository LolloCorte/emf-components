package it.rcpvision.emf.components.view.masterdetail;

import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.menus.StructuredViewerContextMenuCreator;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.views.EObjectManager;
import it.rcpvision.emf.components.views.EmfDetailsFactory;
import it.rcpvision.emf.components.views.EmfViewerFactory;
import it.rcpvision.emf.components.views.EmfViewerManager;
import it.rcpvision.emf.components.views.GenericDetailComposite;
import it.rcpvision.emf.components.views.GenericMapTreeCellLabelProvider;
import it.rcpvision.emf.components.views.GenericTableComposite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class TreeMasterDetailView extends ViewPart implements ISaveablePart, ISaveablePart2,IMenuListener {

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
	TreeViewConfigurator treeViewConfigurator;
	
	private GenericTableComposite genericTable;

	private Adapter modelAdapter;

	private EObject model;

	private ComposedAdapterFactory adapterFactory;

	private AdapterFactoryEditingDomain editingDomain;
	
	@Inject
	protected EmfViewerFactory emfTreeViewerFactory;
	
	@Inject
	protected Provider<EmfViewerMouseAdapter> emfViewerMouseAdapterProvider;
	
	@Inject
	protected StructuredViewerContextMenuCreator structuredViewerContextMenuCreator;

	private TreeViewer viewer;

	private boolean fEnabled=true;
	
	@Inject
	protected EmfViewerManager emfViewerManager;
	
	@Inject
	protected EditingDomainFactory editingDomainFactory;

	
	private void initialize() {
		editingDomain=editingDomainFactory.create();
		
		viewer=emfTreeViewerFactory.createTreeViewer(master, SWT.BORDER, editingDomain);
		
	  ObservableListTreeContentProvider cp = 
	    new ObservableListTreeContentProvider(new TreeFactoryImpl(), 
	      new TreeStructureAdvisorImpl());
	  viewer.setContentProvider(cp);
		  
	  IObservableSet set = cp.getKnownElements();
	  
	  //Option 1 - Label provider customized via 'update' method
//	  viewer.setLabelProvider(new TreeLabelProviderImpl(treeViewConfigurator.getMapLabelProvider(set)));
	  
	  //Option 2 - Generic label provider with ObservableMap
//	  List<IObservableMap> attributeMaps=new ArrayList<IObservableMap>();
//	  for (IObservableMap[] iObservableArray : treeViewConfigurator.getLabelAttributeMap(cp).keySet()) {
//		for (int i = 0; i < iObservableArray.length; i++) {
//			attributeMaps.add(iObservableArray[i]);
//		}
//	  }
//	  viewer.setLabelProvider(new GenericMapTreeCellLabelProvider(attributeMaps.toArray(new IObservableMap[attributeMaps.size()]),
//			  treeViewConfigurator.getLabelAttributeMap(cp)));
	  
	  //Option 3 - AdapterFactory with EMF standards
//	  emfViewerManager.initialize(viewer, treeViewConfigurator.getContainer(),adapterFactory);
	  
	  viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	  
		createContextMenuFor(viewer);	
		
		master.layout(true);
		try{
			IEMFListProperty listProperty=EMFProperties.list(treeViewConfigurator.getListFeature());
			viewer.setInput(listProperty.observe(treeViewConfigurator.getContainer()));
		}catch (Exception e) {
			e.printStackTrace();
		}
		addSelectionListener(viewer);
	}
	
	public void createContextMenuFor(StructuredViewer viewer) {
		MenuManager menuManager = structuredViewerContextMenuCreator.createContextMenuFor(viewer, this, editingDomain);
		menuManager.addMenuListener(this);
		
		EmfViewerMouseAdapter listener = getEmfViewerMouseAdapter();
		viewer.getControl().addMouseListener(listener);
	}

	protected EmfViewerMouseAdapter getEmfViewerMouseAdapter() {
		return emfViewerMouseAdapterProvider.get();
	}
	
	public void setSelectionOnRoot(StructuredViewer viewer) {
		if (!editingDomain.getResourceSet().getResources().isEmpty()) {
			// Select the root object in the view.
			viewer.setSelection(new StructuredSelection(editingDomain
					.getResourceSet().getResources().get(0)), true);
		}
	}
	
	protected void updateActionBarContributor() {
		if (!editingDomain.getResourceSet().getResources().isEmpty()) {
			for (Iterator<EObject> i = editingDomain.getResourceSet()
					.getResources().get(0).getAllContents(); i.hasNext();) {
				EObject eObject = i.next();
				if (eObject instanceof ETypeParameter
						|| eObject instanceof EGenericType
						&& !((EGenericType) eObject).getETypeArguments()
								.isEmpty()) {
//					((EcoreActionBarContributor) getActionBarContributor())
//							.showGenerics(true);
					break;
				}
			}
		}
	}
	

	
	private void editorDirtyStateChanged() {
		firePropertyChange(PROP_DIRTY);
	}
	
	private void addSelectionListener(Viewer viewer) {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EObject obj = (EObject) ((IStructuredSelection) event.getSelection()).getFirstElement();
				if(obj!=null){
					manageDetail(obj);
					selectionChangedGen(event);
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
				editorDirtyStateChanged();
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
		
		if (treeViewConfigurator.isEditable()) {
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
	
	private class TreeFactoryImpl implements IObservableFactory {

		public IObservable createObservable(final Object target) {
			if (target instanceof IObservableList) {
				return (IObservable) target;
			} else if (target instanceof Project) {
				return treeViewConfigurator.getListProperty().observe(target);
			}

			return null;
		}
	}

	private class TreeStructureAdvisorImpl extends TreeStructureAdvisor {
		
		@Override
		public Object getParent(Object element) {
			if (element instanceof Project) {
				return ((Project) element).getParent();
			}

			return null;
		}

		@Override
		public Boolean hasChildren(Object element) {
			if (treeViewConfigurator.hasChildren(element)) {
				return Boolean.TRUE;
			}
			return super.hasChildren(element);
		}
	}
	
	
	private class TreeLabelProviderImpl extends StyledCellLabelProvider {
		private IMapChangeListener mapChangeListener = new IMapChangeListener() {
			public void handleMapChange(MapChangeEvent event) {
				Set<?> affectedElements = event.diff.getChangedKeys();
				if (!affectedElements.isEmpty()) {
					LabelProviderChangedEvent newEvent = new LabelProviderChangedEvent(
							TreeLabelProviderImpl.this,
							affectedElements.toArray());
					fireLabelProviderChanged(newEvent);
				}
			}
		};

		public TreeLabelProviderImpl(IObservableMap... attributeMaps) {
			for (int i = 0; i < attributeMaps.length; i++) {
				attributeMaps[i].addMapChangeListener(mapChangeListener);
			}
		}

		@Override
		public String getToolTipText(Object element) {
			return "#dummy#";
		}

		@Override
		public void update(ViewerCell cell) {
			treeViewConfigurator.update(cell);
		}
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager)
	  {
	    addDeleteAcion(menuManager);
	    MenuManager submenuManager = null;

	    submenuManager = new MenuManager(EcoreEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
	    populateManager(submenuManager, createChildActions, null);
	    menuManager.add( submenuManager);
	  }

	  protected SelectionChangedEvent lastSelectionChangedEvent;
	  
	  
	  public void selectionChangedGen(SelectionChangedEvent event)
	  {
		  lastSelectionChangedEvent = event;
	    // Remove any menu items for old selection.
	    //
	    if (createChildMenuManager != null)
	    {
	      depopulateManager(createChildMenuManager, createChildActions);
	    }
	    
	    Collection<?> newChildDescriptors = null;

	    ISelection selection = event.getSelection();
	    if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1)
	    {
	      Object object = ((IStructuredSelection)selection).getFirstElement();

	      newChildDescriptors = editingDomain.getNewChildDescriptors(object, null);
	    }

	    // Generate actions for selection; populate and redraw the menus.
	    //
	    createChildActions = generateCreateChildActions(newChildDescriptors, selection);

	    if (createChildMenuManager != null)
	    {
	      populateManager(createChildMenuManager, createChildActions, null);
	      createChildMenuManager.update(true);
	    }
	  
	   }
	    
	    protected IMenuManager createChildMenuManager;
	    protected Collection<IAction> createChildActions;
	    
	    protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions)
	    {
	      if (actions != null)
	      {
	        IContributionItem[] items = manager.getItems();
	        for (int i = 0; i < items.length; i++)
	        {
	          // Look into SubContributionItems
	          //
	          IContributionItem contributionItem = items[i];
	          while (contributionItem instanceof SubContributionItem)
	          {
	            contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
	          }

	          // Delete the ActionContributionItems with matching action.
	          //
	          if (contributionItem instanceof ActionContributionItem)
	          {
	            IAction action = ((ActionContributionItem)contributionItem).getAction();
	            if (actions.contains(action))
	            {
	              manager.remove(contributionItem);
	            }
	          }
	        }
	      }
	    }
	    protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID)
	    {
	      if (actions != null)
	      {
	        for (IAction action : actions)
	        {
	          if (contributionID != null)
	          {
	            manager.insertBefore(contributionID, action);
	          }
	          else
	          {
	            manager.add(action);
	          }
	        }
	      }
	    }

	//EditingDomainActionBarContributor
	private void addDeleteAcion(IMenuManager menuManager) {
	    DeleteAction deleteAction = createDeleteAction();
	    menuManager.add(new ActionContributionItem(deleteAction));
		
	}

	protected DeleteAction createDeleteAction() {
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
	    DeleteAction deleteAction = new DeleteAction(false);
	    deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		return deleteAction;
	}

	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection)
	  {
	    Collection<IAction> actions = new ArrayList<IAction>();
	    if (descriptors != null)
	    {
	      for (Object descriptor : descriptors)
	      {
//	        if (!showGenericsAction.isChecked() && descriptor instanceof CommandParameter)
//	        {
//	          Object feature = ((CommandParameter)descriptor).getFeature();
//	          if (isGenericFeature(feature))
//	          {
//	            continue;
//	          }
//	        }
	        actions.add(new CreateChildAction(TreeMasterDetailView.this.getViewSite().getPart(), selection, descriptor));
	      }
	    }
	    return actions;
	  }
	
}
