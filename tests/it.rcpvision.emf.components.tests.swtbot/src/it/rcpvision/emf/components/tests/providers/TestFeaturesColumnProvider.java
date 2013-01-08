/**
 * 
 */
package it.rcpvision.emf.components.tests.providers;

import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.AUDIO_VISUAL_ITEM;
import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.AUDIO_VISUAL_ITEM__DAMAGED;
import it.rcpvision.emf.components.examples.library.BookOnTape;
import it.rcpvision.emf.components.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import it.rcpvision.emf.components.ui.provider.FeaturesColumnProvider;

/**
 * @author bettini
 * 
 */
public class TestFeaturesColumnProvider extends FeaturesColumnProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(AUDIO_VISUAL_ITEM, AUDIO_VISUAL_ITEM__DAMAGED);
	}

	@Override
	protected void buildStringMap(
			EClassToEStructuralFeatureAsStringsMap stringMap) {
		super.buildStringMap(stringMap);
		stringMap.mapTo(BookOnTape.class.getName(), "reader");
	}
}
