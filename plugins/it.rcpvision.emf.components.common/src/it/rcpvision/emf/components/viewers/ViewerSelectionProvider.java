/**
 * 
 */
package it.rcpvision.emf.components.viewers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;

/**
 * A utility class that bridges a {@link Viewer} and a
 * {@link ISelectionProvider}.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ViewerSelectionProvider implements ISelectionProvider {

	/**
	 * This keeps track of all the
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are
	 * listening.
	 */
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	protected Viewer viewer;

	public ViewerSelectionProvider(Viewer viewer) {
		super();
		this.viewer = viewer;
		this.viewer
				.addSelectionChangedListener(createSelectionChangedListener());
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	public ISelection getSelection() {
		return viewer.getSelection();
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	public void setSelection(ISelection selection) {
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}

	protected ISelectionChangedListener createSelectionChangedListener() {
		return new ISelectionChangedListener() {
			public void selectionChanged(
					SelectionChangedEvent selectionChangedEvent) {
				setSelection(selectionChangedEvent.getSelection());
			}
		};
	}
}
