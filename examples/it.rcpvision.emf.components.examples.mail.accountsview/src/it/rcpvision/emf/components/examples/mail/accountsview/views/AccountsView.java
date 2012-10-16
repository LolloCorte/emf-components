package it.rcpvision.emf.components.examples.mail.accountsview.views;

import it.rcpvision.emf.components.views.AbstractSaveableTreeFormView;

import org.eclipse.emf.common.util.URI;


/**
 * @author Lorenzo Bettini
 */

public class AccountsView extends AbstractSaveableTreeFormView {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "it.rcpvision.emf.components.examples.mail.accountsview.views.AccountsView";

	@Override
	protected URI createResourceURI() {
		System.out.println(System.getProperty("user.home"));
		return URI.createFileURI(System.getProperty("user.home")
				+ "/examples/mail/My.mail");
	}


}