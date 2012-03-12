package it.rcpvision.emf.components.examples.library;

import static it.rcpvision.emf.components.examples.library.EXTLibraryPackage.Literals.*;

import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

public class CustomEStructuralFeaturesProvider extends
		EStructuralFeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(LIBRARY,
				LIBRARY__NAME,
				ADDRESSABLE__ADDRESS);
		map.mapTo(PERSON,
				PERSON__FIRST_NAME,
				PERSON__LAST_NAME,
				ADDRESSABLE__ADDRESS);
		map.mapTo(WRITER,
				PERSON__FIRST_NAME,
				PERSON__LAST_NAME,
				WRITER__BOOKS);
	}
}
