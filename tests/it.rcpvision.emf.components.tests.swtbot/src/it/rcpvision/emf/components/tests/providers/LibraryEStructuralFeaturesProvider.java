/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.*;
import org.eclipse.emf.examples.extlibrary.*;

import com.google.common.collect.Lists;

/**
 * @author bettini
 * 
 */
public class LibraryEStructuralFeaturesProvider extends EStructuralFeaturesProvider {

	protected List<EStructuralFeature> featuresFor(Library library) {
		return Lists.<EStructuralFeature> newArrayList(LIBRARY__NAME,
				ADDRESSABLE__ADDRESS);
	}

	protected List<EStructuralFeature> featuresFor(Person person) {
		return Lists.<EStructuralFeature> newArrayList(PERSON__FIRST_NAME,
				PERSON__LAST_NAME, ADDRESSABLE__ADDRESS);
	}

	protected List<EStructuralFeature> featuresFor(Writer writer) {
		return Lists.<EStructuralFeature> newArrayList(PERSON__FIRST_NAME,
				PERSON__LAST_NAME, WRITER__BOOKS);
	}

}
