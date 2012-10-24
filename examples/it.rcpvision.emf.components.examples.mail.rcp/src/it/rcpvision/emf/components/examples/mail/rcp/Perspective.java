package it.rcpvision.emf.components.examples.mail.rcp;

import it.rcpvision.emf.components.examples.mail.accountsview.views.AccountsView;
import it.rcpvision.emf.components.examples.mail.mailsview.views.MailsView;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "it.rcpvision.emf.components.examples.mail.rcp.perspective";

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		//layout.addStandaloneView(NavigationView.ID,  false, IPageLayout.LEFT, 0.25f, editorArea);
		layout.addStandaloneView(AccountsView.ID,  false, IPageLayout.LEFT, 0.25f, editorArea);
		
		layout.addStandaloneView(MailsView.ID,  false, IPageLayout.TOP, 0.25f, editorArea);
		
//		IFolderLayout folder = layout.createFolder("messages", IPageLayout.TOP, 0.5f, editorArea);
//		folder.addPlaceholder(View.ID + ":*");
//		folder.addView(View.ID);
		
		//layout.getViewLayout(NavigationView.ID).setCloseable(false);
		layout.getViewLayout(AccountsView.ID).setCloseable(false);
		layout.getViewLayout(MailsView.ID).setCloseable(false);
	}
}
