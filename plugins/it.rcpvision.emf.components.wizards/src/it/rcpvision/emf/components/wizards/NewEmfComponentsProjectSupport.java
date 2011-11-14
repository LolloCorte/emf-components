package it.rcpvision.emf.components.wizards;

import it.rcpvision.emf.components.wizards.gen.EmfComponentsProjectFilesGenerator;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.pde.core.project.IBundleProjectDescription;

/**
 * @author Lorenzo Bettini
 * 
 */
public class NewEmfComponentsProjectSupport {

	static EmfComponentsProjectFilesGenerator filesGenerator = new EmfComponentsProjectFilesGenerator();

	/**
	 * We need to: - create the default Eclipse project - add the java and
	 * plugin natures - create the folder structure
	 * 
	 * @param projectName
	 * @param location
	 * @param progressMonitor 
	 * @param natureId
	 * @return
	 */
	public static IProject createProject(String projectName, URI location, IProgressMonitor progressMonitor) {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);
		
		progressMonitor.beginTask("Creating project " + projectName, 10);
		//progressMonitor.subTask("Creating project " + projectName);

		String srcFolder = "src";
		String metaInfPath = "META-INF";
		String projectPackagePath = srcFolder + "/" + projectName.replaceAll("\\.", "/");

		IProject project = createBaseProject(projectName, location, new NullProgressMonitor());
		progressMonitor.worked(1);
		try {
			String[] paths = { srcFolder, projectPackagePath, metaInfPath }; //$NON-NLS-1$ //$NON-NLS-2$
			addToProjectStructure(project, paths);
			progressMonitor.worked(1);

			createProjectFile(project, projectPackagePath + "/Activator.java",
					filesGenerator.generateActivator(projectName).toString());
			progressMonitor.worked(1);
			createProjectFile(project, projectPackagePath + "/ExecutableExtensionFactory.java",
					filesGenerator.generateExecutableExtensionFactory(projectName).toString());
			progressMonitor.worked(1);
			createProjectFile(project, projectPackagePath + "/EmfComponentsGuiceModule.java",
					filesGenerator.generateModule(projectName).toString());
			progressMonitor.worked(1);

			createProjectFile(project, metaInfPath + "/MANIFEST.MF",
					filesGenerator.generateManifest(projectName).toString());
			progressMonitor.worked(1);
			createProjectFile(project, "/build.properties",
					filesGenerator.generateBuildProperties().toString());
			progressMonitor.worked(1);

			addNatures(project, new NullProgressMonitor());
			progressMonitor.worked(1);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}

		progressMonitor.done();
		
		return project;
	}

	/**
	 * @param project
	 * @param fileName
	 * @param contents
	 * @throws CoreException
	 */
	public static void createProjectFile(IProject project, String fileName,
			String contents) throws CoreException {
		IFile manifestFile = project.getFile(fileName);
		manifestFile.create(new ByteArrayInputStream(contents.getBytes()),
				true, null);
	}

	/**
	 * Just do the basics: create a basic project.
	 * 
	 * @param location
	 * @param projectName
	 * @param progressMonitor 
	 */
	private static IProject createBaseProject(String projectName, URI location, IProgressMonitor progressMonitor) {
		// it is acceptable to use the ResourcesPlugin class
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);

		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace()
					.newProjectDescription(newProject.getName());
			if (location != null
					&& ResourcesPlugin.getWorkspace().getRoot()
							.getLocationURI().equals(location)) {
				projectLocation = null;
			}

			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, new SubProgressMonitor(progressMonitor, 1));
				if (!newProject.isOpen()) {
					newProject.open(new SubProgressMonitor(progressMonitor, 1));
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		progressMonitor.done();

		return newProject;
	}

	private static void createFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}

	/**
	 * Create a folder structure with a parent root, overlay, and a few child
	 * folders.
	 * 
	 * @param newProject
	 * @param paths
	 * @throws CoreException
	 */
	private static void addToProjectStructure(IProject newProject,
			String[] paths) throws CoreException {
		for (String path : paths) {
			IFolder etcFolders = newProject.getFolder(path);
			createFolder(etcFolders);
		}
	}

	private static void addNatures(IProject project, IProgressMonitor progressMonitor) throws CoreException {
		List<IClasspathEntry> classpathEntries = new UniqueEList<IClasspathEntry>();
		
		IJavaProject javaProject = JavaCore.create(project);
        IProjectDescription projectDescription = project.getDescription();
        
		projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID,
				IBundleProjectDescription.PLUGIN_NATURE });

		IProgressMonitor monitor = null;
		project.setDescription(projectDescription, monitor);
		
		IPath projectPath = project.getFullPath();
		IPath javaSource = projectPath.append("src");
		
    	IClasspathEntry sourceClasspathEntry = JavaCore.newSourceEntry(javaSource);
        for (Iterator<IClasspathEntry> i = classpathEntries.iterator(); i.hasNext(); )
        {
          IClasspathEntry classpathEntry = i.next();
          if (classpathEntry.getPath().isPrefixOf(javaSource))
          {
            i.remove();
          }
        }
        classpathEntries.add(0, sourceClasspathEntry);

		classpathEntries.add(JavaRuntime.getDefaultJREContainerEntry());

		classpathEntries.add(JavaCore.newContainerEntry(new Path(
				"org.eclipse.pde.core.requiredPlugins")));

		javaProject
				.setRawClasspath(classpathEntries
						.toArray(new IClasspathEntry[classpathEntries.size()]),
						new SubProgressMonitor(progressMonitor, 1));
		
		progressMonitor.done();

        /*
        String[] prevNatures = description.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = JavaCore.NATURE_ID;
		description.setNatureIds(newNatures);

		IProgressMonitor monitor = null;
		project.setDescription(description, monitor);

		IJavaProject javaProject = JavaCore.create(project);
		Set<IClasspathEntry> classPathEntries = new HashSet<IClasspathEntry>();
		IClasspathEntry[] rawClasspath = javaProject.getRawClasspath();
		classPathEntries.addAll(Arrays.asList(rawClasspath));
		
		classPathEntries.add(JavaRuntime.getDefaultJREContainerEntry());

		/*
		IResource srcFolder;
		IPreferenceStore store= PreferenceConstants.getPreferenceStore();
		String sourceFolderName= store.getString(PreferenceConstants.SRCBIN_SRCNAME);
		if (store.getBoolean(PreferenceConstants.SRCBIN_FOLDERS_IN_NEWPROJ) && sourceFolderName.length() > 0) {
			srcFolder= javaProject.getProject().getFolder(sourceFolderName);
		} else {
			srcFolder= javaProject.getProject();
		}
		classPathEntries.add(JavaCore.newSourceEntry(srcFolder.getLocation()));
		
		javaProject
				.setRawClasspath(classPathEntries
						.toArray(new IClasspathEntry[classPathEntries.size()]),
						monitor);
				*/

	}

}
