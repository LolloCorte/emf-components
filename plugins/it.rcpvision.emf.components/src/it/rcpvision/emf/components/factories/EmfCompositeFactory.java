/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.util.EmfSelectionHelper;
import it.rcpvision.emf.components.views.ViewerInitializer;
import it.rcpvision.emf.components.widgets.TreeFormDetailComposite;

import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class EmfCompositeFactory {

	@Inject
	protected Provider<EmfSelectionHelper> emfSelectionHelperProvider;

	@Inject
	protected ViewerInitializer viewerInitializer;

	@Inject
	protected EmfFormCompositeFactory emfFormCompositeFactory;

	@Inject
	public EmfCompositeFactory() {

	}

	public TreeFormDetailComposite createTreeFormDetailComposite(Composite parent, int style) {
		return new TreeFormDetailComposite(parent, style, viewerInitializer,
				emfFormCompositeFactory, emfSelectionHelperProvider.get());
	}
}
