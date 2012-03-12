package it.rcpvision.emf.components.examples.fowlerdsl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractStatemachineJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(it.rcpvision.emf.components.examples.fowlerdsl.statemachine.StatemachinePackage.eINSTANCE);
		return result;
	}

}
