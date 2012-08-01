package $packageName$.internal.guice;

import $packageName$.Activator;
import it.rcpvision.emf.components.EmfComponentsExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;

import org.osgi.framework.Bundle;

public class $prefixClassesname$ExecutableExtensionFactory extends
		EmfComponentsExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGuiceModule getModule() {
		return new $prefixClassesname$Module(Activator.getDefault());
	}

}
