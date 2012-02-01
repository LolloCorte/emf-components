package it.rcpvision.emf.components.cdo;

import java.io.IOException;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;

import it.rcpvision.emf.components.views.EObjectManager;

public class CDOObjectManager extends EObjectManager {
	
	@Inject
	CDOSessionManager sessionManager;
	
	@Override
	public void doSave(Resource resource) {
		if (resource instanceof CDOResource) {
			CDOResource cdoResource = (CDOResource) resource;
			CDOView view=cdoResource.cdoView();
			CDOTransaction transaction=(CDOTransaction)view;
			
			//Qui abbiamo la transaction
			if(transaction.isDirty()){
				/*
				 * 1. Save the record, i.e. tx.commit()
				 * 2. Drop the changes, i.e. tx.rollback()
				 * 3. cancel the selection event
				 */
			}
			
		}
		super.doSave(resource);
	}

	@Override
	public void delete(EObject container, EReference eReference,EObject eObject) {
		try {
			EList<EObject> list=(EList)container.eGet(eReference);
			CDOResource cdoResource=sessionManager.getTransactionalResourceFor(eReference.getEReferenceType());
			cdoResource.getContents().remove(eObject);
			list.remove(eObject);
			cdoResource.save(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public EObject createNewChild(EObject container, EReference eReference) {
		EClass eClass=eReference.getEReferenceType();
		EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
		
		try {
			EList<EObject> list=(EList)container.eGet(eReference);
			CDOResource cdoResource=sessionManager.getTransactionalResourceFor(eReference.getEReferenceType());
			cdoResource.getContents().add(eObject);
			list.add(eObject);
			cdoResource.save(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eObject;	
	}
	
	
	@Override
	public EObject prepareModel(Object obj) {
		EObject eobj= super.prepareModel(obj);
		Resource resource=eobj.eResource();
		if (resource instanceof CDOResource) {
			CDOResource cdoResource = (CDOResource) resource;
			CDOView view=cdoResource.cdoView();
			if (view instanceof CDOTransaction){
				 return eobj;
		    }else{
		    	CDOSession session=sessionManager.getSession(eobj);
		    	if(session!=null){
			    	CDOTransaction transaction=sessionManager.getSession(eobj).openTransaction();
			    	CDOObject transObj=transaction.getObject((CDOObject)eobj);
			    	return transObj;
		    	}else{
		    		//TODO in realtà se la sessione non è inizializzata, la view dovrebbe essere readonly
		    		throw new RuntimeException("La sessione non è inizializzata!");
		    	}
		    }
		}
		throw new UnsupportedOperationException();
	}

}
