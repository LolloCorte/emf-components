/**
 * 
 */
package it.rcpvision.emf.components.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
	
	protected static final String WIZARD_CHOICE_PAGE = "Emf Components Project Wizard Template";

	protected static final String WIZARD_NAME = "New Emf Components Project";

	private WizardNewProjectCreationPage _pageOne;
	
    private ChoiceTemplateEmfComponents _pageTwo;

	/**
	 * 
	 */
	public NewEmfComponentsProjectWizard() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(WIZARD_PAGE);
		_pageOne.setTitle("Emf Component Project");
		_pageOne.setDescription("Create a plugin project for Emf Components.");
		
		_pageTwo = new ChoiceTemplateEmfComponents(WIZARD_CHOICE_PAGE);
        _pageTwo.setTitle("View type choice");
        _pageTwo.setDescription("Choose a View type.");

		addPage(_pageOne);
		addPage(_pageTwo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		final String name = _pageOne.getProjectName();
		URI _location = null;
		if (!_pageOne.useDefaults()) {
			_location = _pageOne.getLocationURI();
		} // else location == null
		final URI location = _location;

		IRunnableWithProgress op = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				NewEmfComponentsProjectSupport.createProject(name, location, _pageTwo.getChoice(),
						monitor);
			}
		};

		try {
			getContainer().run(true, false, op);
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}

		return true;
	}

}
