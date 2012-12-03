/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.binding.FormControlFactory;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormPropertyDescriptionProvider;
import it.rcpvision.emf.components.widgets.FormDetailComposite;

import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class FormFactory {

	@Inject
	protected Provider<FormPropertyDescriptionProvider> featureLabelProviderProvider;

	@Inject
	protected Provider<FormControlFactory> bindingFactoryProvider;

	@Inject
	protected Provider<EditingDomainFinder> editingDomainFinderProvider;

	@Inject
	protected Provider<JfaceProviderFactory> jfaceProviderFactoryProvider;

	@Inject
	protected Provider<FeaturesProvider> eClassFeatureProviderProvider;

	@Inject
	public FormFactory() {

	}

	public FormDetailComposite createFormDetailComposite(Composite parent,
			int style) {
		return new FormDetailComposite(parent, style,
				featureLabelProviderProvider.get(),
				bindingFactoryProvider.get(),
				editingDomainFinderProvider.get(), jfaceProviderFactoryProvider
						.get().createLabelProvider(),
				eClassFeatureProviderProvider.get());
	}

}
