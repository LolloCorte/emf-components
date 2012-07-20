/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.util.EmfSelectionHelper;
import it.rcpvision.emf.components.viewers.ViewerInitializer;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author bettini
 * 
 */
public class TreeFormFactory {

	@Inject
	protected Provider<EmfSelectionHelper> emfSelectionHelperProvider;

	@Inject
	protected ViewerInitializer viewerInitializer;

	@Inject
	protected FormFactory formFactory;

	@Inject
	public TreeFormFactory() {

	}

	public TreeFormComposite createTreeFormMasterDetailComposite(Composite parent, int style) {
		return new TreeFormComposite(parent, style, viewerInitializer,
				formFactory, emfSelectionHelperProvider.get());
	}
}
