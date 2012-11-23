package it.rcpvision.emf.components.dsl.validation;

import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.ViewSpecification;

import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class EmfComponentsDslJavaValidator extends
		AbstractEmfComponentsDslJavaValidator {

	public static final String NOT_I_VIEW_PART = "it.rcpvision.emf.components.dsl.NotIViewPart";

	@Inject
	private EmfComponentsDslTypeSystem typeSystem;

	@Check
	public void checkViewSpecification(ViewSpecification viewSpecification) {
		if (!typeSystem.isViewPart(viewSpecification.getType(),
				viewSpecification)) {
			error("Must be an IViewPart",
					ModelPackage.Literals.VIEW_SPECIFICATION__TYPE,
					NOT_I_VIEW_PART);
		}
	}
}
