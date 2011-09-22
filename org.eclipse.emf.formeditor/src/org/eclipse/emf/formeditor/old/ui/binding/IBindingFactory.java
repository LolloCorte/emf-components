package org.eclipse.emf.formeditor.old.ui.binding;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Control;

public interface IBindingFactory {

	Control create(EStructuralFeature feature);

	void dispose();

}
