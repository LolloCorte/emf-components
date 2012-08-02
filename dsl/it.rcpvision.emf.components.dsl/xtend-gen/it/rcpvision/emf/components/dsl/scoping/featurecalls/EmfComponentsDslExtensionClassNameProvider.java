package it.rcpvision.emf.components.dsl.scoping.featurecalls;

import com.google.common.collect.Multimap;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;

@SuppressWarnings("all")
public class EmfComponentsDslExtensionClassNameProvider extends ExtensionClassNameProvider {
  public Multimap<Class<? extends Object>,Class<? extends Object>> simpleComputeExtensionClasses() {
    Multimap<Class<? extends Object>,Class<? extends Object>> _simpleComputeExtensionClasses = super.simpleComputeExtensionClasses();
    final Procedure1<Multimap<Class<? extends Object>,Class<? extends Object>>> _function = new Procedure1<Multimap<Class<? extends Object>,Class<? extends Object>>>() {
        public void apply(final Multimap<Class<? extends Object>,Class<? extends Object>> it) {
          it.put(Control.class, SWTObservables.class);
        }
      };
    Multimap<Class<? extends Object>,Class<? extends Object>> _doubleArrow = ObjectExtensions.<Multimap<Class<? extends Object>,Class<? extends Object>>>operator_doubleArrow(_simpleComputeExtensionClasses, _function);
    return _doubleArrow;
  }
}
