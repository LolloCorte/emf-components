package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GenericTableComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Table table;
//	private FormFeatureLabelProvider formFeatureLabelProvider;
//	private Provider<EmfSwtBindingFactory> bindingFactoryProvider;
//	private Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;
	private ResourceSet resourceSet;
	private ComposedAdapterFactory adapterFactory;
	private FormToolkit formToolkit;
	private TableViewer viewer;
	private ObservableListContentProvider cp;
	private EmfViewerFactory emfViewerFactory;

	public GenericTableComposite(Composite parent, int style, EmfViewerFactory emfViewerFactory, Object content, EClass type) { //FormFeatureLabelProvider formFeatureLabelProvider, Provider<EmfSwtBindingFactory> bindingFactoryProvider, Provider<ComposedAdapterFactory> composedAdapterFactoryProvider
		super(parent, style);
		this.emfViewerFactory=emfViewerFactory;
//		this.featureLabelProvider = formFeatureLabelProvider;
//		this.bindingFactoryProvider = bindingFactoryProvider;
//		this.composedAdapterFactoryProvider = composedAdapterFactoryProvider;
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FillLayout(SWT.HORIZONTAL));

		
		createViewer(parent, content, type);
	}

	private void createViewer(Composite parent, Object content, EClass type) {
//		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
//				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
//		
//		final Table table = viewer.getTable();
//		table.setHeaderVisible(true);
//		table.setLinesVisible(true);
//
//		viewer.setContentProvider(cp=new ObservableListContentProvider());
		
		viewer=emfViewerFactory.createTableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER, content, type);
		
		
		// Layout the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);
	}

	public TableViewer getViewer() {
		return viewer;
	}

	private void createColumn(String title, int bound,final EStructuralFeature feature) {
		IObservableMap observableMap=EMFProperties.value(feature).observeDetail(cp.getKnownElements());

		TableViewerColumn col = createTableViewerColumn(title, bound, 0);
//		col.setLabelProvider(new ColumnLabelProvider() {
//			@Override
//			public String getText(Object element) {
//				EObject p = (EObject) element;
//				return p.eGet(feature)!=null?p.eGet(feature).toString():"";
//			}
//		});
		col.setLabelProvider(new GenericMapCellLabelProvider("{0}", observableMap));

	}

	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;

	}

	
/**
	 * Passing the focus request to the viewer's control.
 * @return 
	 */

	public boolean setFocus() {
		return viewer.getControl().setFocus();
	}
	
//	public void init(EObject container, IEMFListProperty listProp) {
//		init(listProp.observe(container));
//	}

//	public void init(List list) {
//
//		if (list.size() == 0)
//			return;
//		
//		EObject model=(EObject)list.get(0);
//		ResourceSet rs = model.eResource().getResourceSet();
//
//		EClass eClass = model.eClass();
//		EList<EStructuralFeature> allStructuralFeatures = new BasicEList<EStructuralFeature>(eClass.getEAllStructuralFeatures());
//		Collections.sort(allStructuralFeatures, new EStructuralfeatureComparator());
//
//		this.resourceSet = rs;
//		adapterFactory = composedAdapterFactoryProvider.get();
//
//		formToolkit = new FormToolkit(getParent().getDisplay());
//		formFeatureLabelProvider.setFormToolkit(formToolkit);
//
//		// TODO EditingDomain
//		EmfSwtBindingFactory factory = bindingFactoryProvider.get();
//		factory.init(adapterFactory, null, model, this, formToolkit);
//
//		for (final EStructuralFeature feature : allStructuralFeatures) {
//			// derived, unchangeable, container and containment features
//			// ignored
//			if (feature.isChangeable() && !feature.isDerived() && !(feature instanceof EReference && (((EReference) feature).isContainment() || ((EReference) feature).isContainer()))) {
//				 createColumn(feature.getName(), 100, feature);
//			}
//		}
//
//		setLayout(new GridLayout(2, false));
//		// TODO che fa?
//		formToolkit.paintBordersFor(this);
//		this.layout();
//		// getParent().pack();
//		
//		getViewer().setInput(list);
//	}

	private final static class EStructuralfeatureComparator implements Comparator<EStructuralFeature> {
		public int compare(EStructuralFeature o1, EStructuralFeature o2) {
			return nullSafe(o1).compareTo(nullSafe(o2));
		}

		/**
		 * @param o1
		 * @return
		 */
		private String nullSafe(EStructuralFeature o) {
			String name = o.getName();
			return name != null ? name : "";
		}
	}
	
	@Override
	public void dispose() {
		viewer.getControl().dispose();
		super.dispose();
	}
}
