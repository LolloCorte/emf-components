package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

public class EObjectManager {
	
	public void doSave(Resource resource) {
		try {
			resource.save(null);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public EObject prepareModel(Object obj) {
		return (EObject)obj;
	}

	public EObject createNewChild(EObject object, EReference eReference) {
		//TODO DA IMPLEMENTARE
		throw new UnsupportedOperationException();
	}

}
