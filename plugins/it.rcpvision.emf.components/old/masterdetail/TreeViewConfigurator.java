package it.rcpvision.emf.components.view.masterdetail;

import it.rcpvision.emf.components.builders.GenericMapCellLabelProvider;

import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ViewerCell;

public abstract class TreeViewConfigurator {
	
	public abstract EObject getContainer();
	
	public abstract IEMFListProperty getListProperty();
	
	public abstract boolean hasChildren(Object element);

	public abstract Boolean isEditable();
	
	public abstract AdapterFactory getCustomAdapterFactory();
	
	public abstract IObservableMap[] getMapLabelProvider(IObservableSet set);
	
	public abstract EReference getListFeature();

	public abstract void handleRename(ISelection selection) ;

	public abstract void handleDelete(ISelection selection) ;

	public abstract void handleAddNew() ;

	public abstract Map<IObservableMap[],String> getLabelAttributeMap(ObservableListTreeContentProvider cp);

}
