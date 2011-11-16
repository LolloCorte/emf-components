/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

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

	public IBaseLabelProvider createLabelProvider(ILabelProvider delegateLabelProvider) {
		CompositeLabelProvider compositeLabelProvider = compositeLabelProviderProvider
				.get();
		compositeLabelProvider.setDelegateLabelProvider(delegateLabelProvider);
		return compositeLabelProvider;
	}
}
