package it.rcpvision.emf.components.cdo.example.masterdetail.table;

import it.rcpvision.emf.components.cdo.examples.model.business.ModelBusiness;
import it.rcpvision.emf.components.view.masterdetail.TableViewConfigurator;
import library.LibraryPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class TableMasterDetailViewConfigurator extends TableViewConfigurator {
	
	@Override
	public EObject getContainer() {
		return ModelBusiness.getOrCreateModel();
	}
	
	@Override
	public EReference getListFeature() {
		return LibraryPackage.Literals.LIBRARY__LIST_AUTHOR;
	}
	
	@Override
	public Boolean isEditable(){
		 return true;
	}
	
}