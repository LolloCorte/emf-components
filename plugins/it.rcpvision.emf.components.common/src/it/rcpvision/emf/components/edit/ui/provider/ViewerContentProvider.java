/**
 * 
 */
package it.rcpvision.emf.components.edit.ui.provider;

import it.rcpvision.emf.components.runtime.util.PolymorphicDispatcher;
import it.rcpvision.emf.components.util.EmfComponentsUtil;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import com.google.inject.Inject;

/**
 * Declarative ContentProvider based on {@link AdapterFactoryContentProvider}.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ViewerContentProvider extends AdapterFactoryContentProvider {

	@Inject
	public ViewerContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	private PolymorphicDispatcher<Object> childrenDispatcher = PolymorphicDispatcher
			.createForSingleTarget("children", 1, 1, this);

//	/**
//	 * This implements {@link IStructuredItemContentProvider#getElements
//	 * IStructuredItemContentProvider.getElements} by forwarding the call to
//	 * {@link #getChildren getChildren}. It seems that you almost always want
//	 * getElements and getChildren to return the same thing, so this makes that
//	 * easy.
//	 */
//	public Object[] getElements(Object inputElement) {
//		return getChildren(inputElement);
//	}

	/**
	 * This implements {@link ITreeItemContentProvider#hasChildren
	 * ITreeItemContentProvider.hasChildren}. The default, non-optimized
	 * approach simply tests whether whether {@link #getChildren getChildren}
	 * returns any children.
	 */
	public boolean hasChildren(Object element) {
		// Lorenzo: ugly hack
		// if the super method is not invoked the tree is not
		// refreshed correctly
		super.hasChildren(element); // ignore it.
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

	@Override
	public Object[] getChildren(Object element) {
		Object children = childrenDispatcher.invoke(element);
		if (children != null) {
			return EmfComponentsUtil.ensureCollection(children).toArray();
		}
		return super.getChildren(element);
	}
}
