/**
 * 
 */
package org.eclipse.emf.formeditor;

import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EditingDomainFactory {

	@Inject
	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;

	public AdapterFactoryEditingDomain create() {
		ComposedAdapterFactory adapterFactory = composedAdapterFactoryProvider
				.get();

		BasicCommandStack commandStack = new BasicCommandStack();

		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(
				adapterFactory, commandStack, new HashMap<Resource, Boolean>());

		editingDomain.getResourceSet().getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap());

		return editingDomain;
	}
}
