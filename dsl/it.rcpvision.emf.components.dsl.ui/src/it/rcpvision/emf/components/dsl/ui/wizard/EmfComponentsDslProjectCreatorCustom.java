/**
 * 
 */
package it.rcpvision.emf.components.dsl.ui.wizard;

import it.rcpvision.emf.components.dsl.generator.EmfComponentsDslOutputConfigurationProvider;
import it.rcpvision.emf.components.views.EmfComponentsViewsActivator;
import it.rcpvision.emf.components.wizards.NewEmfComponentsProjectSupport;
import it.rcpvision.emf.components.wizards.gen.EmfComponentsProjectFilesGenerator;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * @author Lorenzo Bettini
 * 
 */
public class EmfComponentsDslProjectCreatorCustom extends
		EmfComponentsDslProjectCreator {
	static EmfComponentsDslNewProjectFiles filesGenerator = new EmfComponentsDslNewProjectFiles();

	static EmfComponentsProjectFilesGenerator projectFilesGenerator = new EmfComponentsProjectFilesGenerator();
	
	@Override
	protected List<String> getAllFolders() {
		return ImmutableList.of(SRC_ROOT,
				EmfComponentsDslOutputConfigurationProvider.EMFCOMPONENTS_GEN);
	}

	/**
	 * @return the names of the bundles that a new project requires. May not be
	 *         <code>null</code>
	 */
	protected List<String> getRequiredBundles() {
		return Lists.newArrayList(
				"org.eclipse.core.runtime",
				"org.eclipse.ui",
				EmfComponentsViewsActivator.PLUGIN_ID,
				"org.eclipse.xtext.xbase.lib");
		// don't add the components.dsl project dep
		// otherwise the plugin will depend on xtext stuff
		// which are not used by the generated code
		// DSL_GENERATOR_PROJECT_NAME);
	}
	
	@Override
	protected String getActivatorClassName() {
		return getProjectInfo().getProjectName()
				+ "."
				+ projectFilesGenerator.activatorName(
						getProjectInfo().getProjectName()).toString();
	}

	@Override
	protected void enhanceProject(final IProject project,
			final IProgressMonitor monitor) throws CoreException {
		String projectName = getProjectInfo().getProjectName();

		String srcFolder = "src";
		String projectPackagePath = srcFolder + "/"
				+ projectName.replaceAll("\\.", "/");

		String[] paths = { projectPackagePath };
		NewEmfComponentsProjectSupport.addToProjectStructure(project, paths,
				monitor);

		NewEmfComponentsProjectSupport.createActivator(project, projectName,
				projectPackagePath, monitor);
		NewEmfComponentsProjectSupport.createExecutableExtensionFactory(
				project, projectName, projectPackagePath, monitor);
		NewEmfComponentsProjectSupport.createModule(project, projectName,
				projectPackagePath, "EmfComponentsGuiceModuleGen", monitor);

		NewEmfComponentsProjectSupport.createProjectFile(project,
				projectPackagePath + "/module.emfcomponents", filesGenerator
						.exampleDslFile(projectName).toString(),
				NewEmfComponentsProjectSupport
						.createSubProgressMonitor(monitor));

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
}
