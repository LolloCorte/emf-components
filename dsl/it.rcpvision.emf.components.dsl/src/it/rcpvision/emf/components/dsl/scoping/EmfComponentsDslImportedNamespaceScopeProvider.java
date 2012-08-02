/**
 * 
 */
package it.rcpvision.emf.components.dsl.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;

/**
 * @author Lorenzo Bettini
 *
 */
@SuppressWarnings("restriction")
public class EmfComponentsDslImportedNamespaceScopeProvider extends
		XbaseImportedNamespaceScopeProvider {

	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> implicitImports = new ArrayList<ImportNormalizer>(super.getImplicitImports(ignoreCase));
		implicitImports.add(new ImportNormalizer(QualifiedName.create("org","eclipse","swt"), true, ignoreCase));
		return implicitImports;
	}
}
