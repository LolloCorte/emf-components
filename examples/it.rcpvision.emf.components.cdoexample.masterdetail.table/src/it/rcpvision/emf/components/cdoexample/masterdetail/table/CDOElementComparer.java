package it.rcpvision.emf.components.cdoexample.masterdetail.table;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.jface.viewers.IElementComparer;

public class CDOElementComparer implements IElementComparer {

	@Override
	public boolean equals(Object a, Object b) {
		if (b instanceof CDOObject && a instanceof CDOObject) {
			return (((CDOObject)a).cdoID()).equals(((CDOObject)b).cdoID());
		}
		return false;
	}

	@Override
	public int hashCode(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

}
