/**
 * 
 */
package it.rcpvision.emf.components.dsl.ui.wizard;

import it.rcpvision.emf.components.dsl.generator.EmfComponentsDslOutputConfigurationProvider;
import it.rcpvision.emf.components.wizards.NewEmfComponentsProjectSupport;

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
		return Lists.newArrayList("com.ibm.icu", "org.eclipse.xtext",
				"org.eclipse.xtext.generator", DSL_GENERATOR_PROJECT_NAME);
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
