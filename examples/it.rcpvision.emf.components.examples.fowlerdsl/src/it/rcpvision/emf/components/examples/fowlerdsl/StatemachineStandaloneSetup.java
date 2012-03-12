
package it.rcpvision.emf.components.examples.fowlerdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StatemachineStandaloneSetup extends StatemachineStandaloneSetupGenerated{

	public static void doSetup() {
		new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

