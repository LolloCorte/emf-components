/**
 * 
 */
package it.rcpvision.emf.components.guice;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import com.google.inject.Provider;

/**
 * @author Lorenzo Bettini
 * 
 */
public class ComposedAdapterFactoryProvider implements
		Provider<ComposedAdapterFactory> {

	public ComposedAdapterFactory get() {
		// Create an adapter factory that yields item providers.
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		return adapterFactory;
	}

}
