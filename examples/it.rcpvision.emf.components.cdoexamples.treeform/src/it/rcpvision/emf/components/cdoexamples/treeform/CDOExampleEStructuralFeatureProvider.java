package it.rcpvision.emf.components.cdoexamples.treeform;

import static library.LibraryPackage.Literals.*;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;

public class CDOExampleEStructuralFeatureProvider extends
		EStructuralFeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(BOOK, BOOK__TITLE, BOOK__AUTHORS, BOOK__PAGES);
	}

}
