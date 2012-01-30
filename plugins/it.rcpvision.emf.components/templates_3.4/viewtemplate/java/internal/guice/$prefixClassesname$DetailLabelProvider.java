package $packageName$.internal.guice;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

public class $prefixClassesname$DetailLabelProvider extends FeatureLabelProvider{
	
	/**
	 * 
	 * @param feature
	 * @return
	 */
	public String text_$prefixClassesname$_code(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return "Code: ";
	}
	
	/**
	 * 
	 * @param parent
	 * @param feature
	 * @return
	 */
	public Label label_$prefixClassesname$_description(Composite parent, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return new Label(parent, SWT.NONE);
	}

	
}
