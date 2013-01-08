package it.rcpvision.emf.components.examples.mail.mailsview.ui.provider;

import it.rcpvision.emf.components.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;

public class FeaturesProviderGen extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.emf.components.examples.mail.Mail",
      "subject", "from");
  }
}
