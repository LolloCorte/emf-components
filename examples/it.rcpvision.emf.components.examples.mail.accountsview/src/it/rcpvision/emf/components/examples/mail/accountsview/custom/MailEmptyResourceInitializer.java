/**
 * 
 */
package it.rcpvision.emf.components.examples.mail.accountsview.custom;

import org.eclipse.emf.ecore.resource.Resource;

import it.rcpvision.emf.components.examples.mail.Account;
import it.rcpvision.emf.components.examples.mail.Folder;
import it.rcpvision.emf.components.examples.mail.Mail;
import it.rcpvision.emf.components.examples.mail.MailFactory;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;

/**
 * @author Lorenzo Bettini
 * 
 */
public class MailEmptyResourceInitializer extends EmptyResourceInitializer {

	@Override
	public void initialize(Resource resource) {
		super.initialize(resource);

		Account account = createAccount("Lorenzo", "lorenzo@foobar");
		resource.getContents().add(account);
		createDefaultFolders(account);

		account = createAccount("Lorenzo2", "lorenzo2@foobar");
		resource.getContents().add(account);
		createDefaultFolders(account);

		account = createAccount("Lorenzo3", "lorenzo3@foobar");
		resource.getContents().add(account);
		createDefaultFolders(account);
	}

	protected Account createAccount(String name, String email) {
		Account account = MailFactory.eINSTANCE.createAccount();
		account.setName(name);
		account.setEmail(email);
		return account;
	}

	protected void createDefaultFolders(Account account) {
		Folder folder = createFolder(account, "Inbox");
		createMail(folder);
		createMail(folder);

		createFolder(account, "Sent");
		createFolder(account, "Trash");
		
		createFolder(account, "myfolder");
		folder = createFolder(account, "myfolder2");
		createSubFolder(folder, "sub1");
		createSubFolder(folder, "sub2");
	}

	protected Folder createFolder(Account account, String name) {
		Folder folder = MailFactory.eINSTANCE.createFolder();
		folder.setName(name);
		account.getFolders().add(folder);
		return folder;
	}

	protected Folder createSubFolder(Folder parent, String name) {
		Folder folder = MailFactory.eINSTANCE.createFolder();
		folder.setName(name);
		parent.getSubfolders().add(folder);
		return folder;
	}

	protected void createMail(Folder folder) {
		Mail mail = MailFactory.eINSTANCE.createMail();
		mail.setFrom("foo@foobar");
		mail.setSubject("Test subject");
		mail.getRecipients().add("dest@foobar");
		mail.setMessage("This is a test message.\nCheers!");
		folder.getMails().add(mail);
	}
}
