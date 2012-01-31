package it.rcpvision.emf.components.cdo;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public abstract class ViewConfigurator {

	public abstract CDOSession getSession(EObject obj);
	
	public abstract EObject getContainer();
	
	public abstract EReference getListFeature();

	public abstract Boolean isEditable();

}
