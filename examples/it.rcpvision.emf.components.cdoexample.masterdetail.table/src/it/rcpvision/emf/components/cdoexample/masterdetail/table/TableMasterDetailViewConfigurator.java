package it.rcpvision.emf.components.cdoexample.masterdetail.table;

import it.rcpvision.emf.components.cdoexample.model.business.ModelBusiness;
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
		return LibraryPackage.Literals.LIBRARY__AUTHORS;
	}
	
	@Override
	public Boolean isEditable(){
		 return true;
	}
	
}