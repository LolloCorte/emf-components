/**
 * 
 */
package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;
import it.rcpvision.emf.components.ui.provider.JfaceProviderFactory;

import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EmfDetailsFactory {

	@Inject
	protected Provider<FormFeatureLabelProvider> featureLabelProviderProvider;

	@Inject
	protected Provider<EmfSwtBindingFactory> bindingFactoryProvider;

	@Inject
	protected Provider<EditingDomainFinder> editingDomainFinderProvider;
	
	@Inject
	protected Provider<JfaceProviderFactory> jfaceProviderFactoryProvider;

	@Inject
	public EmfDetailsFactory() {

	}

	public GenericDetailComposite createDetailsComposite(Composite parent,
			int style) {
		return new GenericDetailComposite(parent, style,
				featureLabelProviderProvider.get(), bindingFactoryProvider);
	}

	public FormDetailComposite createFormDetailComposite(Composite parent,
			int style) {
		return new FormDetailComposite(parent, style,
				featureLabelProviderProvider.get(), bindingFactoryProvider,
				editingDomainFinderProvider, jfaceProviderFactoryProvider);
	}

}
