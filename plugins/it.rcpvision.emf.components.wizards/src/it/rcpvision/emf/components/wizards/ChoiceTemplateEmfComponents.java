package it.rcpvision.emf.components.wizards;

import org.eclipse.jdt.ui.wizards.NewElementWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;

public class ChoiceTemplateEmfComponents extends NewElementWizardPage {
    
    private int choice = 0;

    public ChoiceTemplateEmfComponents(String name) {
        super(name);
    }
    
    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        
        initializeDialogUnits(parent);
        
        PlatformUI.getWorkbench().getHelpSystem().setHelp(composite,
                IIDEHelpContextIds.NEW_PROJECT_WIZARD_PAGE);
        
        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        Button choiceTree = new Button(composite, SWT.RADIO);
        choiceTree.setText("Create a TreeFormView");
        choiceTree.setSelection(true);
        choiceTree.addSelectionListener(new SelectionAdapter() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                choice = 0;
            }
        });
        
        Button choiceTable = new Button(composite, SWT.RADIO);
        choiceTable.setText("Create a TableView");
        choiceTable.setSelection(false);
        choiceTable.addSelectionListener(new SelectionAdapter() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                choice = 1;
            }
        });

//        createProjectNameGroup(composite);
//        locationArea = new ProjectContentsLocationArea(getErrorReporter(), composite);
//        if(initialProjectFieldValue != null) {
//            locationArea.updateProjectName(initialProjectFieldValue);
//        }
        
//        // Scale the button based on the rest of the dialog
//        setButtonLayoutData(locationArea.getBrowseButton());
//        
//        setPageComplete(validatePage());
        // Show description on opening
        setErrorMessage(null);
        setMessage(null);
        setControl(composite);
        Dialog.applyDialogFont(composite);
    }
    
    public int getChoice() {
        return choice;
    }
    
}
