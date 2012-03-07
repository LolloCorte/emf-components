/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.ui.provider.AdapterMapCellLabelProvider;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeatureColumnProvider;

import java.util.Set;

import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;

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

	public ILabelProvider createLabelProvider( ) {
		return createLabelProvider(new AdapterFactoryLabelProvider(composedAdapterFactoryProvider.get()));
	}
	
	public ILabelProvider createLabelProvider(IObservableMap[] observableMaps) {
		return createLabelProvider(new ObservableAdapterFactoryLabelProvider(composedAdapterFactoryProvider.get(), observableMaps));
	}
	
	public CellLabelProvider createColumnLabelProvider(EStructuralFeature eStructuralFeature) {
		EStructuralFeatureColumnProvider columnProvider = eStructuralFeatureColumnProviderProvider.get();
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
	
	public CellLabelProvider createColumnLabelProvider(EStructuralFeature eStructuralFeature, ObservableListContentProvider cp) {
		EStructuralFeatureColumnProvider columnProvider = eStructuralFeatureColumnProviderProvider.get();
		columnProvider.seteStructuralFeature(eStructuralFeature);
		
		IObservableMap observableMap= EMFProperties.value(eStructuralFeature).observeDetail(cp.getKnownElements());
		//IObservableMap[] observableMaps=new IObservableMap[]{observableMap};
		return new AdapterMapCellLabelProvider(observableMap, createLabelProvider());
		
	}
	
	private class ObservableAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider{

		MyEventManager eventManager=new MyEventManager();
		
		protected IObservableMap[] attributeMaps;
		
		private IMapChangeListener mapChangeListener = new IMapChangeListener() {
			public void handleMapChange(MapChangeEvent event) {
				Set affectedElements = event.diff.getChangedKeys();
				LabelProviderChangedEvent newEvent = new LabelProviderChangedEvent(
						ObservableAdapterFactoryLabelProvider.this, affectedElements
								.toArray());
				fireLabelProviderChanged(newEvent);
			}
		};
		
		protected void fireLabelProviderChanged(final LabelProviderChangedEvent event) {
			Object[] listeners = eventManager.getListeners();
			for (int i = 0; i < listeners.length; ++i) {
				final ILabelProviderListener l = (ILabelProviderListener) listeners[i];
				SafeRunnable.run(new SafeRunnable() {
					public void run() {
						l.labelProviderChanged(event);
					}
				});

			}
		}
		
		public ObservableAdapterFactoryLabelProvider(AdapterFactory adapterFactory, IObservableMap[] attributeMaps) {
			super(adapterFactory);
			System.arraycopy(attributeMaps, 0,
					this.attributeMaps = new IObservableMap[attributeMaps.length],
					0, attributeMaps.length);
			for (int i = 0; i < attributeMaps.length; i++) {
				attributeMaps[i].addMapChangeListener(mapChangeListener);
			}
		}
		
		public void dispose() {
			for (int i = 0; i < attributeMaps.length; i++) {
				attributeMaps[i].removeMapChangeListener(mapChangeListener);
			}
			super.dispose();
			this.attributeMaps = null;
			this.mapChangeListener = null;
		}
	}
	
	private static class MyEventManager {

		/**
		 * An empty array that can be returned from a call to
		 * {@link #getListeners()} when {@link #listenerList} is <code>null</code>.
		 */
		private static final Object[] EMPTY_ARRAY = new Object[0];

		/**
		 * A collection of objects listening to changes to this manager. This
		 * collection is <code>null</code> if there are no listeners.
		 */
		private transient ListenerList listenerList = null;

		/**
		 * Adds a listener to this manager that will be notified when this manager's
		 * state changes.
		 * 
		 * @param listener
		 *            The listener to be added; must not be <code>null</code>.
		 */
		protected synchronized final void addListenerObject(final Object listener) {
			if (listenerList == null) {
				listenerList = new ListenerList(ListenerList.IDENTITY);
			}

			listenerList.add(listener);
		}

		/**
		 * Clears all of the listeners from the listener list.
		 */
		protected synchronized final void clearListeners() {
			if (listenerList != null) {
				listenerList.clear();
			}
		}

		/**
		 * Returns the listeners attached to this event manager.
		 * 
		 * @return The listeners currently attached; may be empty, but never
		 *         <code>null</code>
		 */
		protected final Object[] getListeners() {
			final ListenerList list = listenerList;
			if (list == null) {
				return EMPTY_ARRAY;
			}

			return list.getListeners();
		}

		/**
		 * Whether one or more listeners are attached to the manager.
		 * 
		 * @return <code>true</code> if listeners are attached to the manager;
		 *         <code>false</code> otherwise.
		 */
		protected final boolean isListenerAttached() {
			return listenerList != null;
		}

		/**
		 * Removes a listener from this manager.
		 * 
		 * @param listener
		 *            The listener to be removed; must not be <code>null</code>.
		 */
		protected synchronized final void removeListenerObject(final Object listener) {
			if (listenerList != null) {
				listenerList.remove(listener);

				if (listenerList.isEmpty()) {
					listenerList = null;
				}
			}
		}
	}


}
