/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import it.rcpvision.emf.components.runtime.util.PolymorphicDispatcher;

import java.lang.reflect.Method;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Predicate;

/**
 * Provides labels for EStructuralFeatures
 * 
 * @author Lorenzo Bettini
 * 
 */
public class PropertyDescriptionProvider {

	private PolymorphicDispatcher.ErrorHandler<String> errorHandler = new PolymorphicDispatcher.NullErrorHandler<String>();

	public String getText(EStructuralFeature element) {
		String text = polymorphicGetText(element);
		if (text != null) {
			return text;
		}
		return defaultText(element);
	}

	protected String polymorphicGetText(EStructuralFeature element) {
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

	protected String defaultText(EStructuralFeature element) {
		return element.getName();
	}
}
