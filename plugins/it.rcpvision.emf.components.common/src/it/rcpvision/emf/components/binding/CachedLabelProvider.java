/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package it.rcpvision.emf.components.binding;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * Cached Label Provider.
 * 
 * @author Dennis H�bner - Initial contribution and API
 */
public class CachedLabelProvider implements ILabelProvider {

	private final Map<Object, Image> imageCache = new HashMap<Object, Image>();
	private final Map<Object, String> textCache = new HashMap<Object, String>();

	private final ILabelProvider delegate;

	/**
	 * Creates a new CachedLabelProvider which stores Images and Text in an internal cache.<br>
	 * Values are fetched from given delegate {@link ILabelProvider}.
	 */
	public CachedLabelProvider(final ILabelProvider delegate) {
		this.delegate = delegate;
	}

	public Image getImage(Object element) {
		if (!imageCache.containsKey(element)) {
			imageCache.put(element, delegate.getImage(element));
		}
		return imageCache.get(element);
	}

	public String getText(Object element) {
		if (!textCache.containsKey(element)) {
			textCache.put(element, delegate.getText(element));
		}
		return textCache.get(element);
	}

	public void dispose() {
		imageCache.clear();
		textCache.clear();
		delegate.dispose();
	}

	public boolean isLabelProperty(Object element, String property) {
		return delegate.isLabelProperty(element, property);
	}

	public void addListener(ILabelProviderListener listener) {
		delegate.addListener(listener);
	}

	public void removeListener(ILabelProviderListener listener) {
		delegate.removeListener(listener);
	}

}
