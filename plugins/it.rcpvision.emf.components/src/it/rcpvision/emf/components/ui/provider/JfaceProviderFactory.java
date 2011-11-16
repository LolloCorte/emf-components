/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class JfaceProviderFactory {

	@Inject
	protected Provider<CompositeLabelProvider> compositeLabelProviderProvider;

	@Inject
	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;

	public IBaseLabelProvider createLabelProvider(
			ILabelProvider delegateLabelProvider) {
		CompositeLabelProvider compositeLabelProvider = compositeLabelProviderProvider
				.get();
		compositeLabelProvider.setDelegateLabelProvider(delegateLabelProvider);
		return compositeLabelProvider;
	}

	public IBaseLabelProvider createLabelProvider() {
		return createLabelProvider(new AdapterFactoryLabelProvider(
				composedAdapterFactoryProvider.get()));
	}
}
