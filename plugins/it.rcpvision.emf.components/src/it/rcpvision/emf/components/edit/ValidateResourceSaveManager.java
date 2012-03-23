/**
 * 
 */
package it.rcpvision.emf.components.edit;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Executes validation before saving.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ValidateResourceSaveManager extends ResourceSaveManager {

	@Override
	protected boolean precondition(Resource resource) {
		return super.precondition(resource) && validateModel(resource);
	}

	protected boolean validateModel(Resource resource) {
		for (EObject eObject : resource.getContents()) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
			if (diagnostic.getSeverity() == Diagnostic.ERROR) {
				MessageDialog.openError(null, "Validation Error",
						diagnostic.getMessage());
				return false;
			} else if (diagnostic.getSeverity() == Diagnostic.WARNING) {
				MessageDialog.openWarning(null, "Validation Warning",
						diagnostic.getMessage());
			}
		}
		return true;
	}

}
