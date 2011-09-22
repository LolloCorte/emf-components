/**
 * 
 */
package org.eclipse.emf.formeditor.ui.provider;

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
 * Provides labels for EStructuralFeatures
 * 
 * @author Lorenzo Bettini
 * 
 */
public class FeatureLabelProvider {

	protected FormToolkit formToolkit;

	private PolymorphicDispatcher.ErrorHandler<String> errorHandler = new PolymorphicDispatcher.NullErrorHandler<String>();
	
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

	public String getText(EStructuralFeature element) {
		String text = polymorphicGetText(element);
		if (text != null) {
			return text;
		}
		return defaultText(element);
	}

	private String polymorphicGetText(EStructuralFeature element) {
		PolymorphicDispatcher<String> dispatcher = new PolymorphicDispatcher<String>(
				Collections.singletonList(this), getTextPredicate(element),
				errorHandler) {
			@Override
			protected String handleNoSuchMethod(Object... params) {
				if (PolymorphicDispatcher.NullErrorHandler.class
						.equals(errorHandler.getClass()))
					return null;
				return super.handleNoSuchMethod(params);
			}
		};

		return dispatcher.invoke(element);
	}

	protected Predicate<Method> getTextPredicate(EStructuralFeature feature) {
		String methodName = "text_" + feature.getEContainingClass().getName()
				+ "_" + feature.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 1);
	}
	
	private Label polymorphicGetLabel(Composite parent, EStructuralFeature element) {
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

	protected String defaultText(EStructuralFeature element) {
		return element.getName();
	}

	public FormToolkit getFormToolkit() {
		return formToolkit;
	}

	public void setFormToolkit(FormToolkit formToolkit) {
		this.formToolkit = formToolkit;
	}

}
