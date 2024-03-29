/**
 * 
 */
package it.rcpvision.emf.components.tests;

import static org.junit.Assert.assertEquals;
import it.rcpvision.emf.components.tests.factories.CustomLibraryExecutableExtensionFactory;

import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;

import com.google.inject.Injector;

/**
 * @author bettini
 * 
 */
public class EmfComponentsCustomLibraryAbstractTests extends
		EmfComponentsAbstractTests {

	protected Injector getInjector() {
		return EmfComponentsTestsActivator.getDefault().getInjector(
				CustomLibraryExecutableExtensionFactory.class);
	}

	protected void assertLabels(String expected, Object[] elements) {
		ILabelProvider labelProvider = getInjector().getInstance(
				ILabelProvider.class);
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < elements.length; i++) {
			buffer.append(labelProvider.getText(elements[i]) + "; ");
		}
		assertEquals(expected, buffer.toString());
	}

	protected void assertListLabels(String expected, List<?> elements) {
		ILabelProvider labelProvider = getInjector().getInstance(
				ILabelProvider.class);
		StringBuffer buffer = new StringBuffer();
		for (Object object : elements) {
			buffer.append(labelProvider.getText(object) + "; ");
		}
		assertEquals(expected, buffer.toString());
	}

}
