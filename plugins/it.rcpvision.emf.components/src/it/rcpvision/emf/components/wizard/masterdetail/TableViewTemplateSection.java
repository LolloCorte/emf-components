package it.rcpvision.emf.components.wizard.masterdetail;

import it.rcpvision.emf.components.EmfComponentsActivator;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.ui.IHelpContextIds;
import org.eclipse.pde.ui.templates.OptionTemplateSection;
import org.eclipse.pde.ui.templates.PluginReference;

public class TableViewTemplateSection extends OptionTemplateSection  {

	public TableViewTemplateSection(){
		setPageCount(1);
	    createOptions();	
	}
	
	private static final String KEY_PACKAGE_NAME = "packageName";
	private static final String KEY_CLASS_NAME = "className";
	private static final String KEY_VIEW_NAME = "viewName";
	private static final String KEY_MESSAGE_NAME = "message";
	private static final String KEY_IMP_MESSAGE_NAME = "importantMessage";
	
	@Override
	public String getUsedExtensionPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getTemplateLocation() {
		// TODO Auto-generated method stub
		return super.getTemplateLocation();
	}
	
	@Override
	public String[] getNewFiles() {
		 return new String[] { "icons/" };
	}

	@Override
	public String getSectionId() {
		return "viewtemplate";
	}

	@Override
	protected URL getInstallURL() {
		return EmfComponentsActivator.getDefault().getBundle().getEntry("/");
	}

	@Override
	protected ResourceBundle getPluginResourceBundle() {
		return Platform.getResourceBundle(EmfComponentsActivator.getDefault().getBundle());
	}
	
	public void addPages(Wizard wizard) {
		 WizardPage page = createPage(0, IHelpContextIds.TEMPLATE_INTRO);
		 page.setTitle("Table Master Detail Template");
		 page.setDescription("Creates a Table Master  Detail view");
		 wizard.addPage(page);
		 markPagesAdded();
	}
	
	private void createOptions() {
		 addOption(KEY_PACKAGE_NAME, "Package", "test", 0);
		 addOption(KEY_CLASS_NAME, "Class Name ", "SimpleView", 0);
		 addOption(KEY_VIEW_NAME, "View Name", "SimpleView", 0);
		 addOption(KEY_MESSAGE_NAME, "Message", "Hello World", 0);
		 addOption(KEY_IMP_MESSAGE_NAME, "Important?", false, 0);
	}
	
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		 IPluginBase plugin = model.getPluginBase();
		 IPluginModelFactory factory = model.getPluginFactory();
		 		 
		 // org.eclipse.core.runtime.applications
		 IPluginExtension extension =  createExtension("org.eclipse.ui.views", true);
		 
		 IPluginElement element = factory.createElement(extension);
		 element.setName("view");
		 element.setAttribute("id", getStringOption(KEY_CLASS_NAME));
		 element.setAttribute("name", getStringOption(KEY_VIEW_NAME));
		 element.setAttribute("icon", "icons/sample.gif");
		 
		 String fullClassName = 
		 		 getStringOption(KEY_PACKAGE_NAME) +"."+getStringOption(KEY_CLASS_NAME);
		 
		 element.setAttribute("class", fullClassName);
		 extension.add(element);
		 
		 plugin.add(extension);
	} 
	
	@Override
	public IPluginReference[] getDependencies(String schemaVersion) {
		List<IPluginReference> result = new ArrayList<IPluginReference>();
		result.add(new PluginReference("org.eclipse.ui", null, 0));
		result.add(new PluginReference("org.eclipse.core.resources", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.ui.navigator", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.ui.navigator.resources", null, 0)); //$NON-NLS-1$
		return (IPluginReference[]) result.toArray(new IPluginReference[result.size()]);
	}

	
	
}
