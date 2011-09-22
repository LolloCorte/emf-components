/**
 * 
 */
package org.eclipse.emf.formeditor.views;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.formeditor.ui.binding.EmfSwtBindingFactory;
import org.eclipse.emf.formeditor.ui.provider.FeatureLabelProvider;
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
