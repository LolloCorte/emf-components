/**
 * 
 */
package it.rcpvision.emf.components.examples.mail.mailsview.views;

import org.eclipse.emf.ecore.EStructuralFeature;

import it.rcpvision.emf.components.examples.mail.MailPackage;
import it.rcpvision.emf.components.views.AbstractOnSelectionTableView;

/**
 * @author Lorenzo Bettini
 *
 */
public class MailsView extends AbstractOnSelectionTableView {

	@Override
	protected EStructuralFeature getEStructuralFeature() {
		return MailPackage.Literals.FOLDER__MAILS;
	}

}
