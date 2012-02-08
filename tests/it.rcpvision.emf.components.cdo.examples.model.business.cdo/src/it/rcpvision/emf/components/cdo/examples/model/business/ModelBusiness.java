package it.rcpvision.emf.components.cdo.examples.model.business;

import library.Library;
import library.LibraryFactory;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;

public class ModelBusiness {
	static Library model;
	
	public synchronized static Library getOrCreateModel() {
		load();
		try{
			if(model==null){
				model=create();	
			}
		}catch (CommitException e) {
			e.printStackTrace();
		}
		return model;
	}

	public static Library load() {
		CDOView view=CommonBusiness.session.openView();
		CDOResource resource = view.getResource("/Library");
		view.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
		if(!resource.getContents().isEmpty()){
			return (Library) resource.getContents().get(0);
		}
		return null;
	}

	
	public static Library create() throws CommitException {
		CDOTransaction transaction=CommonBusiness.session.openTransaction();
		CDOResource resource = transaction.getOrCreateResource("/Library");
		Library model=LibraryFactory.eINSTANCE.createLibrary();
		resource.getContents().add(model);
		transaction.commit();
		return model;
	}
	
}
