/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.*;
import it.rcpvision.emf.components.examples.library.Periodical;
import it.rcpvision.emf.components.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

/**
 * @author bettini
 * 
 */
public class TestFeaturesProvider extends FeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(LENDABLE, LENDABLE__COPIES);
	}

	@Override
	protected void buildStringMap(
			EClassToEStructuralFeatureAsStringsMap stringMap) {
		super.buildStringMap(stringMap);
		stringMap.mapTo(Periodical.class.getName(), "title");
	}
}
