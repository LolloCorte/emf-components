/**
 * 
 */
package it.rcpvision.emf.components.factories;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;

/**
 * @author Lorenzo Bettini
 * 
 */
public class ViewerContentProviderFactory {
	
	@Inject
	private Provider<ViewerContentProvider> viewerContentProviderProvider;

	public ViewerContentProvider create(
			AdapterFactoryContentProvider adapterFactoryContentProvider) {
		ViewerContentProvider o = viewerContentProviderProvider.get();
		o.setDelegateContentProvider(adapterFactoryContentProvider);
		return o;
	}

	public ViewerContentProvider create(AdapterFactory adapterFactory) {
		return create(new AdapterFactoryContentProvider(adapterFactory));
	}
}
