/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.*;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

/**
 * @author bettini
 * 
 */
public class LibraryEStructuralFeaturesAsStringsProvider extends
		EStructuralFeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(LIBRARY, LIBRARY__NAME, ADDRESSABLE__ADDRESS);
	}

	@Override
	protected void buildStringMap(
			EClassToEStructuralFeatureAsStringsMap stringMap) {
		super.buildStringMap(stringMap);
		stringMap.mapTo(PERSON.getInstanceClassName(), "firstName", "lastName",
				"address");
		stringMap.mapTo(WRITER.getInstanceClassName(), "firstName", "lastName",
				"books");

	}

}
