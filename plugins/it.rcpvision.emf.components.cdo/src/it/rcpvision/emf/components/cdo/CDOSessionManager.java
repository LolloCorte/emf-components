package it.rcpvision.emf.components.cdo;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public abstract class CDOSessionManager {

	public abstract CDOSession getSession(EObject obj);

	public abstract CDOResource getTransactionalResourceFor(EClass eReferenceType);
	
}
