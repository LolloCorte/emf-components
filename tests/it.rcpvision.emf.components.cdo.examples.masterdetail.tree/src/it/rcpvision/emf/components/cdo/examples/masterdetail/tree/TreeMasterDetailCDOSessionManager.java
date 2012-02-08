package it.rcpvision.emf.components.cdo.examples.masterdetail.tree;

import it.rcpvision.emf.components.cdo.CDOSessionManager;
import it.rcpvision.emf.components.cdo.examples.model.business.CommonBusiness;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class TreeMasterDetailCDOSessionManager extends CDOSessionManager {

	@Override
	public CDOSession getSession(EObject obj) {
		return CommonBusiness.getSession();
	}

	@Override
	public CDOResource getTransactionalResourceFor(EClass eReferenceType) {
		return CommonBusiness.getSession().openTransaction().getOrCreateResource("/");
	}

}