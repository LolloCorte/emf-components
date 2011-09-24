/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EmfDetailsFactory {

	@Inject
	protected Provider<FeatureLabelProvider> featureLabelProviderProvider;

	@Inject
	protected Provider<EmfSwtBindingFactory> bindingFactoryProvider;

	@Inject
	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;

	@Inject
	public EmfDetailsFactory() {

	}

	public GenericComposite createDetailsComposite(Composite parent, int style) {
		return new GenericComposite(parent, style,
				featureLabelProviderProvider.get(), bindingFactoryProvider,
				composedAdapterFactoryProvider);
	}
}
