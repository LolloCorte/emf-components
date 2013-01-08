package it.rcpvision.emf.components.examples.firstexample.ui.provider;

import it.rcpvision.emf.components.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

public class FeaturesProviderGen extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Library",
      "name");
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Writer",
      "name", "address", "books");
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Book",
      "author", "title", "category");
  }
}
