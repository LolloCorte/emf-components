/**
 * 
 */
package org.eclipse.emf.formeditor.tests.factories;

import org.eclipse.emf.formeditor.service.EmfFormEditorGenericModule;
import org.eclipse.emf.formeditor.tests.EmfFormEditorTestsActivator;
import org.eclipse.emf.formeditor.tests.binding.CustomLibraryBindingFactory;
import org.eclipse.emf.formeditor.tests.labeling.CustomLibraryFeatureLabelProvider;
import org.eclipse.emf.formeditor.tests.labeling.CustomLibraryLabelProvider;
import org.eclipse.emf.formeditor.ui.binding.EmfSwtBindingFactory;
import org.eclipse.emf.formeditor.ui.provider.CompositeLabelProvider;
import org.eclipse.emf.formeditor.ui.provider.FeatureLabelProvider;

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
