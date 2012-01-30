package it.rcpvision.emf.components.cdo;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;

public abstract class ViewConfigurator {

	public abstract CDOSession getSession(EObject obj);
	
	public abstract EObject getContainer();
	
	public abstract IEMFListProperty getListProperty();

	public abstract Boolean isEditable();

}
