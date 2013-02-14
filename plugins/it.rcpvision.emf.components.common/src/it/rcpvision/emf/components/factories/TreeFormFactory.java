/**
 * 
 */
package it.rcpvision.emf.components.factories;

import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.MembersInjector;

/**
 * @author bettini
 * 
 */
public class TreeFormFactory {

	@Inject
	protected MembersInjector<TreeFormComposite> treeFormCompositeMembersInjector;

	@Inject
	public TreeFormFactory() {

	}

	public TreeFormComposite createTreeFormMasterDetailComposite(
			Composite parent, int style) {
		TreeFormComposite treeFormComposite = new TreeFormComposite(parent,
				style);
		treeFormCompositeMembersInjector.injectMembers(treeFormComposite);
		return treeFormComposite;
	}
}
