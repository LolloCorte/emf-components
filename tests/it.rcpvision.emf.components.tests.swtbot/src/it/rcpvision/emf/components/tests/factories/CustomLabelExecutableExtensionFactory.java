/**
 * 
 */
package it.rcpvision.emf.components.tests.factories;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.tests.EmfComponentsTestsActivator;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;

import com.google.inject.Inject;

/**
 * Uses a custom label provider
 * 
 * @author bettini
 * 
 */
public class CustomLabelExecutableExtensionFactory extends
		EmfComponentsTestsExecutableExtensionFactory {

	public static class CustomLabelProvider extends ViewerLabelProvider {
		@Inject
		public CustomLabelProvider(AdapterFactoryLabelProvider delegate) {
			super(delegate);
		}

		@Override
		public String getText(Object element) {
			if (element instanceof XMLResource) {
				return super.getText(element);
			}
			return "TEST " + super.getText(element) + " ENDTEST";
		}
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return new EmfComponentsGuiceModule(EmfComponentsTestsActivator.getDefault()) {

			@Override
			public Class<? extends ILabelProvider> bindILabelProvider() {
				return CustomLabelProvider.class;
			}

		};
	}

}
