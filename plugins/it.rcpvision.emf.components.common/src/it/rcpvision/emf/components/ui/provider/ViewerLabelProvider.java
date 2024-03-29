/**
 * 
 */
package it.rcpvision.emf.components.ui.provider;

import it.rcpvision.emf.components.runtime.ui.IImageHelper;
import it.rcpvision.emf.components.runtime.util.PolymorphicDispatcher;

import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.google.inject.Inject;

/**
 * @author bettini
 * 
 */
public class ViewerLabelProvider implements ILabelProvider {

	@Inject
	private IImageHelper imageHelper;

	private PolymorphicDispatcher<String> textDispatcher = PolymorphicDispatcher
			.createForSingleTarget("text", 1, 1, this);

	private PolymorphicDispatcher<Object> imageDispatcher = PolymorphicDispatcher
			.createForSingleTarget("image", 1, 1, this);

	protected ILabelProvider delegateLabelProvider;
	
	@Inject
	public ViewerLabelProvider(AdapterFactoryLabelProvider delegate) {
		delegateLabelProvider = delegate;
	}

	public String getText(Object element) {
		if (element == null)
			return "";
		
		String text = textDispatcher.invoke(element);
		if (text != null) {
			return text;
		}
		return getDelegateText(element);
	}

	protected String getDelegateText(Object element) {
		return delegateLabelProvider.getText(element);
	}

	public Image getImage(Object element) {
		if (element == null)
			return null;
		
		Object imageObject = imageDispatcher.invoke(element);
		if (imageObject != null) {
			Image image = convertToImage(imageObject);
			if (image != null)
				return image;
		}
		return getDelegateImage(element);
	}

	/**
	 * @param imageDescription
	 *            a {@link String}, an {@link ImageDescriptor} or an
	 *            {@link Image}
	 * @return the {@link Image} associated with the description or
	 *         <code>null</code>
	 */
	protected Image convertToImage(Object imageDescription) {
		if (imageDescription instanceof Image) {
			return (Image) imageDescription;
		} else if (imageDescription instanceof ImageDescriptor) {
			return imageHelper.getImage((ImageDescriptor) imageDescription);
		} else if (imageDescription instanceof String) {
			return imageHelper.getImage((String) imageDescription);
		}
		return null;
	}

	protected Image getDelegateImage(Object element) {
		return delegateLabelProvider.getImage(element);
	}

	public void addListener(ILabelProviderListener listener) {
		delegateLabelProvider.addListener(listener);
	}

	public void dispose() {
		delegateLabelProvider.dispose();
	}

	public boolean isLabelProperty(Object element, String property) {
		return delegateLabelProvider.isLabelProperty(element, property);
	}

	public void removeListener(ILabelProviderListener listener) {
		delegateLabelProvider.removeListener(listener);
	}

	public ILabelProvider getDelegateLabelProvider() {
		return delegateLabelProvider;
	}

	public void setDelegateLabelProvider(ILabelProvider delegateLabelProvider) {
		this.delegateLabelProvider = delegateLabelProvider;
	}

	public String text(Object element) {
		return null;
	}

	public Object image(Object element) {
		return null;
	}

	/**
	 * Custom implementation for {@link Entry} that uses the entry.getValue()
	 * @param entry
	 * @return
	 */
	public String text(Entry entry) {
		return getText(entry.getValue());
	}

	/**
	 * Custom implementation for {@link Entry} that uses the entry.getValue()
	 * @param entry
	 * @return
	 */
	public Object image(Entry entry) {
		return getImage(entry.getValue());
	}
}
