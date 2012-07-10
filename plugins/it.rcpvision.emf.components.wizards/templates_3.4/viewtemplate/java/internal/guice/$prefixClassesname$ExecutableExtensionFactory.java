package $packageName$.internal.guice;

import $packageName$.Activator;
import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;

import org.osgi.framework.Bundle;

public class $prefixClassesname$ExecutableExtensionFactory extends
		EmfComponentsExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected EmfComponentsGenericModule getModule() {
		return new $prefixClassesname$Module(Activator.getDefault());
	}

}
