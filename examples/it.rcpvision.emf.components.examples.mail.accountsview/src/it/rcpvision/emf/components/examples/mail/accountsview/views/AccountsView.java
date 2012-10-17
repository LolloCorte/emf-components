package it.rcpvision.emf.components.examples.mail.accountsview.views;

import java.io.IOException;

import it.rcpvision.emf.components.views.AbstractSaveableTreeView;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;


/**
 * @author Lorenzo Bettini
 */
public class AccountsView extends AbstractSaveableTreeView {

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

	@Override
	protected void mostRecentCommandAffectsResource(Command mostRecentCommand) {
		try {
			getResource().save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}