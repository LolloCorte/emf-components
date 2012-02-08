package it.rcpvision.emf.components.cdoexample.masterdetail.tree;

import it.rcpvision.emf.components.cdoexample.model.business.ModelBusiness;
import it.rcpvision.emf.components.view.masterdetail.TreeViewConfigurator;

import java.util.HashMap;
import java.util.Map;

import library.Book;
import library.Library;
import library.LibraryPackage;
import library.util.LibraryAdapterFactory;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.keys.model.ContextModel;

public class TreeMasterDetailViewConfigurator extends TreeViewConfigurator {

	@Override
	public EObject getContainer() {
		return ModelBusiness.getOrCreateModel();
	}
	
	@Override
	public EReference getListFeature() {
		return LibraryPackage.Literals.LIBRARY__BOOKS;
	}
	
	@Override
	public IEMFListProperty getListProperty() {
		return EMFProperties.multiList(
				LibraryPackage.Literals.LIBRARY__BOOKS,
				LibraryPackage.Literals.BOOK__AUTHORS);
	}
	
	
	public boolean hasChildren(Object element){
		return (element instanceof Library &&((Library) element).getBooks().size() > 0)
			||(element instanceof Book && ((Book) element).getAuthors().size() > 0);
	}
	
	@Override
	public Boolean isEditable(){
		 return true;
	}

	@Override
	public AdapterFactory getCustomAdapterFactory() {
		// TODO Auto-generated method stub
		return new LibraryAdapterFactory();
	}

	

	@Override
	public IObservableMap[] getMapLabelProvider(IObservableSet set) {
		// TODO Auto-generated method stub
		 IObservableMap[] map=new IObservableMap [2];

		  map[0] = EMFProperties.value(
		    LibraryPackage.Literals.BOOK__TITLE
		  ).observeDetail(set);

		  map[1] = EMFProperties.value(
		      FeaturePath.fromList(
		    		  LibraryPackage.Literals.BOOK__AUTHORS,
		    		  LibraryPackage.Literals.AUTHOR__NAME)
		      ).observeDetail(set);

		  return map;
	}

	@Override
	public void handleRename(ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleDelete(ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleAddNew() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<IObservableMap[],String> getLabelAttributeMap(ObservableListTreeContentProvider cp) {
		Map<IObservableMap[],String> ret=new HashMap<IObservableMap[],String>();
		{
		    IObservableMap[] attributeMap = new IObservableMap [2];
		    attributeMap[0] = EMFProperties.value(
		    		  LibraryPackage.Literals.BOOK__TITLE
		    ).observeDetail(cp.getKnownElements());

		    attributeMap[1] = EMFProperties.value(
		      FeaturePath.fromList(
		    		  LibraryPackage.Literals.BOOK__AUTHORS, 
		    		  LibraryPackage.Literals.AUTHOR__NAME
		      )
		    ).observeDetail(cp.getKnownElements());
		    ret.put(attributeMap,"{0} - ({1})");
		  }

		  {
		    IObservableMap attributeMap = EMFProperties.value( 
		    		LibraryPackage.Literals.AUTHOR__NAME
		    ).observeDetail(cp.getKnownElements());
		    ret.put(new IObservableMap[]{attributeMap},"{0}");//{0,date,short}
		    
		  }

		  return ret;
	}


	
}