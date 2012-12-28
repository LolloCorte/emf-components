package it.rcpvision.emf.components.dsl.validation;

import it.rcpvision.emf.components.dsl.model.EmfFeatureAccess;
import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.model.ViewSpecification;

import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class EmfComponentsDslJavaValidator extends
		AbstractEmfComponentsDslJavaValidator {

	public static final String NOT_I_VIEW_PART = "it.rcpvision.emf.components.dsl.NotIViewPart";

	public static final String NOT_EOBJECT = "it.rcpvision.emf.components.dsl.NotEObject";

	public static final String NOT_EMFCOMPONENTS_MODULE = "it.rcpvision.emf.components.dsl.NotEmfComponentsGuiceModule";

	@Inject
	private EmfComponentsDslTypeSystem typeSystem;

	@Check
	public void checkViewSpecification(ViewSpecification viewSpecification) {
		if (viewSpecification.getType() != null
				&& !typeSystem.isViewPart(viewSpecification.getType(),
						viewSpecification)) {
			error("Must be an IViewPart",
					ModelPackage.Literals.VIEW_SPECIFICATION__TYPE,
					NOT_I_VIEW_PART);
		}
	}

	@Check
	public void checkEmfFeatureAccess(EmfFeatureAccess emfFeatureAccess) {
		if (emfFeatureAccess.getParameterType() != null
				&& !typeSystem.isEObject(emfFeatureAccess.getParameterType(),
						emfFeatureAccess)) {
			error("Must be an EObject derived class",
					ModelPackage.Literals.EMF_FEATURE_ACCESS__PARAMETER_TYPE,
					NOT_EOBJECT);
		}
	}

	@Check
	public void checkModuleExtends(Module module) {
		if (module.getExtendsClause() != null
				&& module.getExtendsClause().getSuperType() != null
				&& !typeSystem.isEmfComponentsGuiceModule(module
						.getExtendsClause().getSuperType(), module)) {
			error("Must be an EmfComponentsGuiceModule derived class",
					module.getExtendsClause(),
					ModelPackage.Literals.EXTENDS_CLAUSE__SUPER_TYPE,
					NOT_EMFCOMPONENTS_MODULE);
		}
	}
}
