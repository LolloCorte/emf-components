/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
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

	public GenericDetailComposite createDetailsComposite(Composite parent, int style) {
		return new GenericDetailComposite(parent, style,
				featureLabelProviderProvider.get(), bindingFactoryProvider,
				composedAdapterFactoryProvider);
	}
	
	
	public GenericTableComposite createTableComposite(Composite parent, int style) {
		return new GenericTableComposite(parent, style,
				featureLabelProviderProvider.get(), bindingFactoryProvider,
				composedAdapterFactoryProvider);
	}
}
