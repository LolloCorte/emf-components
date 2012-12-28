/**
 * 
 */
package it.rcpvision.emf.components.dsl.tests.additional;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;

/**
 * @author Lorenzo Bettini
 *
 */
public class MyTestGuiceModule extends EmfComponentsGuiceModule {

	public MyTestGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

}
