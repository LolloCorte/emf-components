/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.tests.EmfComponentsTestsActivator;
import it.rcpvision.emf.components.tests.binding.CustomLibraryBindingFactory;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFormFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryLabelProvider;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;


/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class CustomLibraryExecutableExtensionFactory extends
		EmfComponentsTestsExecutableExtensionFactory {

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsGenericModule(
				EmfComponentsTestsActivator.getDefault()) {

			@Override
			public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
				return CustomLibraryLabelProvider.class;
			}

			@Override
			public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
				return CustomLibraryFeatureLabelProvider.class;
			}
			
			@Override
			public Class<? extends FormFeatureLabelProvider> bindFormFeatureLabelProvider() {
				return CustomLibraryFormFeatureLabelProvider.class;
			}

			@Override
			public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
				return CustomLibraryBindingFactory.class;
			}

		};
	}

}
