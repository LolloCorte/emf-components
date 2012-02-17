/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.ADDRESSABLE__ADDRESS;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.LIBRARY;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.LIBRARY__NAME;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.PERSON;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.PERSON__FIRST_NAME;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.PERSON__LAST_NAME;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.WRITER;
import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.WRITER__BOOKS;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.collect.Lists;

/**
 * @author bettini
 * 
 */
public class LibraryEStructuralFeaturesProvider extends
		EStructuralFeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.put(LIBRARY, Lists.<EStructuralFeature> newArrayList(LIBRARY__NAME,
				ADDRESSABLE__ADDRESS));
		map.put(PERSON, Lists.<EStructuralFeature> newArrayList(
				PERSON__FIRST_NAME, PERSON__LAST_NAME, ADDRESSABLE__ADDRESS));
		map.put(WRITER, Lists.<EStructuralFeature> newArrayList(
				PERSON__FIRST_NAME, PERSON__LAST_NAME, WRITER__BOOKS));
	}

}
