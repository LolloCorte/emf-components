package it.rcpvision.emf.components.cdoexamples.treeform;

import static library.LibraryPackage.Literals.*;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

public class CDOExampleEStructuralFeatureProvider extends
		FeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(BOOK, BOOK__TITLE, BOOK__AUTHORS, BOOK__PAGES);
	}

}
