/**
 * 
 */
package it.rcpvision.emf.components.edit.ui.provider;

import it.rcpvision.emf.components.util.EmfComponentsUtil;
import it.rcpvision.emf.components.xtext.util.PolymorphicDispatcher;

import java.util.List;

import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Declarative ContentProvider
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ViewerContentProvider implements ITreeContentProvider {

	protected AdapterFactoryContentProvider delegateContentProvider;

	private PolymorphicDispatcher<Object> childrenDispatcher = PolymorphicDispatcher
			.createForSingleTarget("children", 1, 1, this);

	public AdapterFactoryContentProvider getDelegateContentProvider() {
		return delegateContentProvider;
	}

	public void setDelegateContentProvider(
			AdapterFactoryContentProvider delegateContentProvider) {
		this.delegateContentProvider = delegateContentProvider;
	}

	public void dispose() {
		delegateContentProvider.dispose();
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		delegateContentProvider.inputChanged(viewer, oldInput, newInput);
	}

	/**
	 * This implements {@link IStructuredItemContentProvider#getElements
	 * IStructuredItemContentProvider.getElements} by forwarding the call to
	 * {@link #getChildren getChildren}. It seems that you almost always want
	 * getElements and getChildren to return the same thing, so this makes that
	 * easy.
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public Object getParent(Object element) {
		return delegateContentProvider.getParent(element);
	}

	/**
	 * This implements {@link ITreeItemContentProvider#hasChildren
	 * ITreeItemContentProvider.hasChildren}. The default, non-optimized
	 * approach simply tests whether whether {@link #getChildren getChildren}
	 * returns any children.
	 */
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	/**
	 * The default implementation
	 * 
	 * @param o
	 * @return null
	 */
	public List<Object> children(Object o) {
		return null;
	}

	public Object[] getChildren(Object element) {
		Object children = childrenDispatcher.invoke(element);
		if (children != null) {
			return EmfComponentsUtil.ensureCollection(children).toArray();
		}
		return delegateContentProvider.getChildren(element);
	}
}
