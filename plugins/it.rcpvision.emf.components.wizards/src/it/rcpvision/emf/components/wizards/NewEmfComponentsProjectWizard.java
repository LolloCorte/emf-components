/**
 * 
 */
package it.rcpvision.emf.components.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * @author Lorenzo Bettini
 */
public class NewEmfComponentsProjectWizard extends Wizard implements INewWizard {
    
//public class NewEmfComponentsProjectWizard extends NewPluginProjectFromTemplateWizard {
    
    protected static final String WIZARD_PAGE = "Emf Components Project Wizard";
    
    protected static final String WIZARD_NAME = "New Emf Components Project";
    
    private WizardNewProjectCreationPage _pageOne;
    
    private ChoiceTemplateEmfComponents _pageTwo;

    private final JavaProject javaProject = null;

    /**
     * 
     */
    public NewEmfComponentsProjectWizard() {
        super();
    }
    
    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
//        setNeedsProgressMonitor(true);
//        setWindowTitle(WIZARD_NAME);
//        Object selectionElement = selection.getFirstElement();
//        if (selectionElement instanceof JavaElement) {
//            JavaElement javaElement = (JavaElement) selectionElement;
//            javaProject = (JavaProject) javaElement.getJavaProject();
//        }

    }
    
    @Override
    public void addPages() {
        super.addPages();
        
        _pageOne = new WizardNewProjectCreationPage(WIZARD_PAGE);
        _pageOne.setTitle("Emf Component Project");
        _pageOne.setDescription("Create a plugin project for Emf Components.");
        
        _pageTwo = new ChoiceTemplateEmfComponents("Pippo");
        _pageTwo.setTitle("View type choosing.");
        _pageTwo.setDescription("Choose a View type.");
        
//        if (javaProject != null) {
//            PackageFragmentRoot root;
//            try {
//                root = (PackageFragmentRoot) javaProject.getAllPackageFragmentRoots()[0];
//                _pageThree.setPackageFragmentRoot(root, true);
//                _pageThree.setPackageFragment(root.createPackageFragment(javaProject.getElementName().concat(".views"), true, null), true);
//                String nameProject = _pageOne.getProjectName();
////                _pageThree.setPackageFragmentRoot(nameProject.concat("/src"), true);
////                _pageThree.setPackageFragment(root.createPackageFragment(javaProject.getElementName().concat(".views"), true, null), true);
//            } catch (JavaModelException e) {
//                e.printStackTrace();
//            }
//        }
        
        addPage(_pageOne);
        addPage(_pageTwo);
        
    }
    
    /*
     * (non-Javadoc)
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
