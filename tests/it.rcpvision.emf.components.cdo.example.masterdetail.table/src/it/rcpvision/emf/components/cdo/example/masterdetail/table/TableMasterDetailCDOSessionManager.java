package it.rcpvision.emf.components.cdo.example.masterdetail.table;

import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.cdo.examples.model.business.CommonBusiness;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class TableMasterDetailCDOSessionManager extends CDOSessionManager {
	
	@Override
	public CDOSession getSession(EObject obj) {
		return CommonBusiness.getSession();
	}
	
	//TODO TO BE REMOVED?
	@Override
	public CDOResource getTransactionalResourceFor(EClass eReferenceType) {
		return CommonBusiness.getSession().openTransaction().getOrCreateResource("/Auhtor");
	}
	
}