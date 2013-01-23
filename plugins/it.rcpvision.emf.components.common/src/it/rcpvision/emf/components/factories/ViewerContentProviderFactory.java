/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Lorenzo Bettini
 * 
 */
public class ViewerContentProviderFactory {
	
	@Inject
	private Provider<ViewerContentProvider> viewerContentProviderProvider;

	public ViewerContentProvider create(AdapterFactory adapterFactory) {
		ViewerContentProvider o = viewerContentProviderProvider.get();
		o.setAdapterFactory(adapterFactory);
		return o;
	}
}
