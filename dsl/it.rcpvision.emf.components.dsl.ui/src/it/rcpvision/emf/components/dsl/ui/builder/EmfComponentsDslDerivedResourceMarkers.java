/**
 * 
 */
package it.rcpvision.emf.components.dsl.ui.builder;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.builder.DerivedResourceMarkers;

/**
 * Custom implementation to deal with the "hack" to generate in the
 * project root folder: in that output configuration we use "src" and then
 * when generating we use "src/..", thus, when seraching for derived
 * resource markers, we must make sure that, instead of searching in "src"
 * we search in the root folder.
 * 
 * @author Lorenzo Bettini
 *
 */
public class EmfComponentsDslDerivedResourceMarkers extends
		DerivedResourceMarkers {

	@Override
	public Iterable<IMarker> findDerivedResourceMarkers(IResource file,
			String generatorId) throws CoreException {
		IResource resource = file;
		
		String location = file.getLocation().toString();
		if (location.endsWith("/src")) {
			// we won't find derived resources in src:
			// we'll find them in the parent folder
			resource = file.getParent();
		}
		
		return super.findDerivedResourceMarkers(resource, generatorId);
	}
}
