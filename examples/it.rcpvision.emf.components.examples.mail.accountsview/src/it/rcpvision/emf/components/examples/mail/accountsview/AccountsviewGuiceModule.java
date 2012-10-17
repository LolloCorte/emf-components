package it.rcpvision.emf.components.examples.mail.accountsview;

import it.rcpvision.emf.components.examples.mail.accountsview.custom.MailEmptyResourceInitializer;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;

import org.eclipse.ui.plugin.AbstractUIPlugin;


public class AccountsviewGuiceModule extends EmfComponentsGuiceModuleGen {

	public AccountsviewGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends EmptyResourceInitializer> bindEmptyResourceInitializer() {
		return MailEmptyResourceInitializer.class;
	}
}
