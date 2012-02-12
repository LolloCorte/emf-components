/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import java.lang.reflect.Method;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.common.base.Predicate;

/**
 * Provides labels for EStructuralFeatures for FormToolkit. With respect to the
 * superclass {@link FeatureLabelProvider} you can also specify the Label,
 * besides its text.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class FormFeatureLabelProvider extends FeatureLabelProvider {

	protected FormToolkit formToolkit;

	private PolymorphicDispatcher.ErrorHandler<Label> errorLabelHandler = new PolymorphicDispatcher.NullErrorHandler<Label>();

	public Label getLabel(Composite parent, EStructuralFeature element) {
		Label lab = polymorphicGetLabel(parent, element);
		if (lab != null)
			return lab;
		return defaultLabel(parent, element);
	}

	protected Label defaultLabel(Composite parent, EStructuralFeature element) {
		Label lab = formToolkit.createLabel(parent, getText(element));
		lab.setLayoutData(new GridData());
		return lab;
	}

	protected Label polymorphicGetLabel(Composite parent,
			EStructuralFeature element) {
		PolymorphicDispatcher<Label> dispatcher = new PolymorphicDispatcher<Label>(
				Collections.singletonList(this), getLabelPredicate(element),
				errorLabelHandler) {
			@Override
			protected Label handleNoSuchMethod(Object... params) {
				if (PolymorphicDispatcher.NullErrorHandler.class
						.equals(errorLabelHandler.getClass()))
					return null;
				return super.handleNoSuchMethod(params);
			}
		};

		return dispatcher.invoke(parent, element);
	}

	protected Predicate<Method> getLabelPredicate(EStructuralFeature feature) {
		String methodName = "label_" + feature.getEContainingClass().getName()
				+ "_" + feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 2);
	}

	public FormToolkit getFormToolkit() {
		return formToolkit;
	}

	public void setFormToolkit(FormToolkit formToolkit) {
		this.formToolkit = formToolkit;
	}

}
