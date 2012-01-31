package it.rcpvision.emf.components.wizard.masterdetail;

import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.ITemplateSection;
import org.eclipse.pde.ui.templates.NewPluginTemplateWizard;

public class TablePluginContentWizard extends NewPluginTemplateWizard {

	 protected IFieldData fData;
	 
	public void init(IFieldData data) {
	   super.init(data);
	   fData = data;
	   setWindowTitle("Simple View Wizard");      
	}

	public ITemplateSection[] createTemplateSections() {
	   return new ITemplateSection[] {new TableViewTemplateSection()};
	}

}