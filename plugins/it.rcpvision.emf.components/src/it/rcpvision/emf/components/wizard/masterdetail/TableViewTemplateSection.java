package it.rcpvision.emf.components.wizard.masterdetail;

import it.rcpvision.emf.components.EmfComponentsActivator;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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

public class TableViewTemplateSection extends OptionTemplateSection {
	
	public TableViewTemplateSection() {
		setPageCount(1);
		createOptions();
	}
	
	private static final String PATH_ABSTRACT_DISPATCHER_PREFIX = "it.rcpvision.countervision.ui.cusomer.internal.guice.DemoExecutableExtensionFactory:";
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
		page.setDescription("Creates a Table Master Detail view");
		wizard.addPage(page);
		markPagesAdded();
	}
	
	private void createOptions() {
		addOption(KEY_PACKAGE_NAME, "Package", "packageName", 0);
		addOption(KEY_CLASS_NAME, "Class Name ", "ClassName", 0);
		addOption(KEY_VIEW_NAME, "View Name", "viewName", 0);
		addOption(KEY_MESSAGE_NAME, "Message", "message", 0);
		addOption(KEY_IMP_MESSAGE_NAME, "Important?", false, 0);
	}
	
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		IPluginBase plugin = model.getPluginBase();
		IPluginModelFactory factory = model.getPluginFactory();
		
		IPluginExtension extensionView = createExtensionView(factory);

		IPluginExtension extensionMenu = createExtensionMenu(factory);
		
		plugin.add(extensionView);
		plugin.add(extensionMenu);
	}
	
	private IPluginExtension createExtensionMenu(IPluginModelFactory factory)
			throws CoreException {
		IPluginExtension extensionMenu = createExtension("org.eclipse.ui.menus", true);

		IPluginElement elementMenu = factory.createElement(extensionMenu);
		elementMenu.setName("menuContribution");
		elementMenu.setAttribute("locationURI", "menu:org.eclipse.ui.main.menu");
		elementMenu.setAttribute("allPopups", "false");
		
		IPluginElement elementSubMenu = factory.createElement(elementMenu);
		elementSubMenu.setName("command");
		elementSubMenu.setAttribute("commandId", "org.eclipse.ui.views.showView");
		elementSubMenu.setAttribute("label", getStringOption(KEY_VIEW_NAME));
		elementSubMenu.setAttribute("tooltip", "Open the Master Detail");
		elementSubMenu.setAttribute("style", "push");
		
		IPluginElement elementSubMenuParameter = factory.createElement(elementSubMenu);
		elementSubMenuParameter.setName("parameter");
		elementSubMenuParameter.setAttribute("name", "org.eclipse.ui.views.showView.viewId");
		String viewId = getStringOption(KEY_PACKAGE_NAME) + "." + getStringOption(KEY_CLASS_NAME);
		elementSubMenuParameter.setAttribute("value", viewId);
		
		extensionMenu.add(elementMenu);
		elementMenu.add(elementSubMenu);
		elementSubMenu.add(elementSubMenuParameter);

		return extensionMenu;
	}
	
	private IPluginExtension createExtensionView(IPluginModelFactory factory)
			throws CoreException {
		IPluginExtension extensionView = createExtension("org.eclipse.ui.views", true);

		IPluginElement elementView = factory.createElement(extensionView);
		elementView.setName("view");
		String viewId = getStringOption(KEY_PACKAGE_NAME) + "." + getStringOption(KEY_CLASS_NAME);
		elementView.setAttribute("id", viewId);
		elementView.setAttribute("name", getStringOption(KEY_VIEW_NAME));

		String fullClassName = PATH_ABSTRACT_DISPATCHER_PREFIX + viewId;
		elementView.setAttribute("class", fullClassName);
		elementView.setAttribute("icon", "icons/sample.gif");
		
		extensionView.add(elementView);

		return extensionView;
	}
	
	@Override
	public IPluginReference[] getDependencies(String schemaVersion) {
		List<IPluginReference> result = new ArrayList<IPluginReference>();
		result.addAll(Arrays.asList(super.getDependencies(schemaVersion)));
		result.add(new PluginReference("org.eclipse.core.runtime", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.emf.cdo", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.emf.cdo.net4j", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.net4j.tcp", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.xtext", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.ui.forms", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("it.rcpvision.emf.components", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("it.rcpvision.emf.components.cdo", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.core.databinding.property", null, 0)); //$NON-NLS-1$
		return result.toArray(new IPluginReference[result.size()]);
	}
	
}
