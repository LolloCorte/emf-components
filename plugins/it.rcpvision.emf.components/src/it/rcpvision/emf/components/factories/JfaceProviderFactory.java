/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.ui.provider.AdapterMapCellLabelProvider;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeatureColumnProvider;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;

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

	public CellLabelProvider createColumnLabelProvider(
			EStructuralFeature eStructuralFeature) {
		EStructuralFeatureColumnProvider columnProvider = eStructuralFeatureColumnProviderProvider
				.get();
		columnProvider.seteStructuralFeature(eStructuralFeature);

		columnProvider.setLabelProvider(createLabelProvider());
		return columnProvider;
	}

	public CellLabelProvider createColumnLabelProvider(
			EStructuralFeature eStructuralFeature,
			IStructuredContentProvider contentProvider) {
		if (contentProvider instanceof ObservableListContentProvider) {
			return createColumnLabelProvider(eStructuralFeature,
					(ObservableListContentProvider) contentProvider);
		} else {
			return createColumnLabelProvider(eStructuralFeature);
		}
	}

	public CellLabelProvider createColumnLabelProvider(
			EStructuralFeature eStructuralFeature,
			ObservableListContentProvider cp) {
		EStructuralFeatureColumnProvider columnProvider = eStructuralFeatureColumnProviderProvider
				.get();
		columnProvider.seteStructuralFeature(eStructuralFeature);

		IObservableMap observableMap = EMFProperties.value(eStructuralFeature)
				.observeDetail(cp.getKnownElements());
		// IObservableMap[] observableMaps=new IObservableMap[]{observableMap};
		return new AdapterMapCellLabelProvider(observableMap,
				createLabelProvider());
	}

}
