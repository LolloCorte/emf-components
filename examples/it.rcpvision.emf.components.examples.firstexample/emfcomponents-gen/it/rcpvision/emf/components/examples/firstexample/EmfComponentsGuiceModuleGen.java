package it.rcpvision.emf.components.examples.firstexample;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.examples.firstexample.ui.provider.FeaturesProviderGen;
import it.rcpvision.emf.components.examples.firstexample.ui.provider.LabelProviderGen;
import it.rcpvision.emf.components.examples.firstexample.ui.provider.PropertyDescriptionProviderGen;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * it.rcpvision.emf.components.examples.firstexample Emf Components Dsl Module file
 */
public class EmfComponentsGuiceModuleGen extends EmfComponentsGuiceModule {
  public EmfComponentsGuiceModuleGen(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ViewerLabelProvider> bindViewerLabelProvider() {
    return LabelProviderGen.class;
  }
  
  @Override
  public Class<? extends PropertyDescriptionProvider> bindPropertyDescriptionProvider() {
    return PropertyDescriptionProviderGen.class;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return FeaturesProviderGen.class;
  }
}
