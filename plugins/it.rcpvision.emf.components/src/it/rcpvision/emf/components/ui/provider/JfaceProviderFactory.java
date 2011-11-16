/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
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
	
	@Inject
	protected Provider<EStructuralFeatureColumnProvider> eStructuralFeatureColumnProviderProvider;

	public ILabelProvider createLabelProvider(
			ILabelProvider delegateLabelProvider) {
		CompositeLabelProvider compositeLabelProvider = compositeLabelProviderProvider
				.get();
		compositeLabelProvider.setDelegateLabelProvider(delegateLabelProvider);
		return compositeLabelProvider;
	}

	public ILabelProvider createLabelProvider() {
		return createLabelProvider(new AdapterFactoryLabelProvider(
				composedAdapterFactoryProvider.get()));
	}
	
	public ColumnLabelProvider createColumnLabelProvider(EStructuralFeature eStructuralFeature) {
		EStructuralFeatureColumnProvider columnProvider = eStructuralFeatureColumnProviderProvider.get();
		columnProvider.seteStructuralFeature(eStructuralFeature);
		columnProvider.setLabelProvider(createLabelProvider());
		return columnProvider;
	}
}
