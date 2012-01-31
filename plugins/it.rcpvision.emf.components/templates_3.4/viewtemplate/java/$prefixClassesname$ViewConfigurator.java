package $packageName$;

import it.rcpvision.emf.components.cdo.ViewConfigurator;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;

public class $prefixClassesname$ViewConfigurator extends ViewConfigurator {
	
	@Override
	public CDOSession getSession(EObject obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EObject getContainer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IEMFListProperty getListProperty() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean isEditable(){
%if editableView
		 return true;
%else
		 return false;
%endif
	}
	
}