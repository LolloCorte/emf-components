/**
 * 
 */
package it.rcpvision.emf.components.wizards;

import java.net.URI;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * @author Lorenzo Bettini
 * 
 */
public class NewEmfComponentsProjectWizard extends Wizard implements INewWizard {

	protected static final String WIZARD_PAGE = "Emf Components Project Wizard";

	protected static final String WIZARD_NAME = "New Emf Components Project";

	private WizardNewProjectCreationPage _pageOne;

	/**
	 * 
	 */
	public NewEmfComponentsProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(WIZARD_PAGE);
		_pageOne.setTitle("Emf Component Project");
		_pageOne.setDescription("Create a plugin project for Emf Components.");

		addPage(_pageOne);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	    } // else location == null

	    NewEmfComponentsProjectSupport.createProject(name, location);

		return true;
	}

}
