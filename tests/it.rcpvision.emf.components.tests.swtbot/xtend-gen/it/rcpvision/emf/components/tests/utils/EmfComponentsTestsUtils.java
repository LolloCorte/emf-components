package it.rcpvision.emf.components.tests.utils;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EmfComponentsTestsUtils {
  public String toStringNameBased(final Iterable<EStructuralFeature> features) {
    final Function1<EStructuralFeature,String> _function = new Function1<EStructuralFeature,String>() {
        public String apply(final EStructuralFeature it) {
          String _name = it.getName();
          return _name;
        }
      };
    Iterable<String> _map = IterableExtensions.<EStructuralFeature, String>map(features, _function);
    String _join = IterableExtensions.join(_map, ", ");
    return _join;
  }
}
