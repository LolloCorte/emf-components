package it.rcpvision.emf.components.view.masterdetail;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public abstract class ViewConfigurator {
	
	public abstract EObject getContainer();
	
	public abstract EReference getListFeature();

	public abstract Boolean isEditable();

}
