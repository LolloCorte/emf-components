/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import static org.eclipse.emf.examples.extlibrary.EXTLibraryPackage.Literals.*;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

/**
 * @author bettini
 * 
 */
public class LibraryEStructuralFeaturesProvider extends
		EStructuralFeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(LIBRARY,
				LIBRARY__NAME, ADDRESSABLE__ADDRESS);
		map.mapTo(PERSON,
				PERSON__FIRST_NAME, PERSON__LAST_NAME,
				ADDRESSABLE__ADDRESS);
		map.mapTo(WRITER,
				PERSON__FIRST_NAME, PERSON__LAST_NAME,
				WRITER__BOOKS);
	}

}
