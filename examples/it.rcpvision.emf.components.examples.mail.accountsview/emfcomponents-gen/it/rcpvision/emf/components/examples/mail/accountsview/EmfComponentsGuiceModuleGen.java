package it.rcpvision.emf.components.examples.mail.accountsview;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.examples.mail.accountsview.ui.provider.LabelProviderGen;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * it.rcpvision.emf.components.examples.mail.accountsview Emf Components Dsl Module file
 */
public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ViewerLabelProvider> bindViewerLabelProvider() {
    return LabelProviderGen.class;
  }
}
