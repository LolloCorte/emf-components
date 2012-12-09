package it.rcpvision.emf.components.examples.firstexample.ui.provider;

import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PropertyDescriptionProviderGen extends PropertyDescriptionProvider {
  public String text_Book_author(final EStructuralFeature it) {
    return "Wrote by:";
  }
  
  public String text_Writer_name(final EStructuralFeature it) {
    return "Name:";
  }
}
