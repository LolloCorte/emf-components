/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.service.EmfFormEditorGenericModule;
import it.rcpvision.emf.components.tests.EmfFormEditorTestsActivator;
import it.rcpvision.emf.components.tests.binding.CustomLibraryBindingFactory;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryFeatureLabelProvider;
import it.rcpvision.emf.components.tests.labeling.CustomLibraryLabelProvider;
import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.FeatureLabelProvider;


/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class CustomLibraryExecutableExtensionFactory extends
		EmfFormEditorTestsExecutableExtensionFactory {

	@Override
	protected EmfFormEditorGenericModule getModule() {
		return new EmfFormEditorGenericModule(
				EmfFormEditorTestsActivator.getDefault()) {

			@Override
			public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
				return CustomLibraryLabelProvider.class;
			}

			@Override
			public Class<? extends FeatureLabelProvider> bindFeatureLabelProvider() {
				return CustomLibraryFeatureLabelProvider.class;
			}

			@Override
			public Class<? extends EmfSwtBindingFactory> bindEmfSwtBindingFactory() {
				return CustomLibraryBindingFactory.class;
			}

		};
	}

}
