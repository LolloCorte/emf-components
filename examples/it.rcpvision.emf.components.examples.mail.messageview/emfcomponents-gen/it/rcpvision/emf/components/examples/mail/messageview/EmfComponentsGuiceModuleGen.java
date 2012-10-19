package it.rcpvision.emf.components.examples.mail.messageview;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.examples.mail.messageview.binding.FormFeatureControlFactoryGen;
import it.rcpvision.emf.components.examples.mail.messageview.ui.provider.FeaturesProviderGen;
import it.rcpvision.emf.components.examples.mail.messageview.ui.provider.LabelProviderGen;
import it.rcpvision.emf.components.examples.mail.messageview.ui.provider.PropertyDescriptionProviderGen;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * it.rcpvision.emf.components.examples.mail.messageview Emf Components Dsl Module file
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
  
  @Override
  public Class<? extends FormFeatureControlFactory> bindFormFeatureControlFactory() {
    return FormFeatureControlFactoryGen.class;
  }
}
