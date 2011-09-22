/**
 * 
 */
package org.eclipse.emf.formeditor.tests.factories;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.formeditor.service.EmfFormEditorGenericModule;
import org.eclipse.emf.formeditor.tests.EmfFormEditorTestsActivator;
import org.eclipse.emf.formeditor.ui.provider.CompositeLabelProvider;

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
	protected EmfFormEditorGenericModule getModule() {
		return new EmfFormEditorGenericModule(EmfFormEditorTestsActivator.getDefault()) {

			@Override
			public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
				return CustomLabelProvider.class;
			}

		};
	}

}
