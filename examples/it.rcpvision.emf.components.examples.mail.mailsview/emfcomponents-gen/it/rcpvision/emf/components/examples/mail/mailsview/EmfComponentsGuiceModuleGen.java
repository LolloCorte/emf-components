package it.rcpvision.emf.components.examples.mail.mailsview;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.examples.mail.mailsview.ui.provider.FeaturesProviderGen;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * it.rcpvision.emf.components.examples.mail.mailsview Emf Components Dsl Module file
 */
public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return FeaturesProviderGen.class;
  }
}
