/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.service.EmfComponentsGenericModule;
import it.rcpvision.emf.components.tests.EmfComponentsTestsActivator;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class CustomLabelExecutableExtensionFactory extends
		EmfFormEditorTestsExecutableExtensionFactory {

	public static class CustomLabelProvider extends CompositeLabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof XMLResource) {
				return super.getText(element);
			}
			return "TEST " + super.getText(element) + " ENDTEST";
		}
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new EmfComponentsGenericModule(EmfComponentsTestsActivator.getDefault()) {

			@Override
			public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
				return CustomLabelProvider.class;
			}

		};
	}

}
