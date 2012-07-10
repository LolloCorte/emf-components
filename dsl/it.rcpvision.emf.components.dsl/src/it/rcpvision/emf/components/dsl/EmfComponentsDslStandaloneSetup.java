
package it.rcpvision.emf.components.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EmfComponentsDslStandaloneSetup extends EmfComponentsDslStandaloneSetupGenerated{

	public static void doSetup() {
		new EmfComponentsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

