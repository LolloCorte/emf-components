/**
 * 
 */
package it.rcpvision.emf.components.tests.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import it.rcpvision.emf.components.examples.library.EXTLibraryPackage;
import it.rcpvision.emf.components.views.AbstractOnSelectionTableView;

/**
 * @author Lorenzo Bettini
 *
 */
public class TestOnSelectionLibraryBooksTableView extends
		AbstractOnSelectionTableView {

	@Override
	protected EStructuralFeature getEStructuralFeature() {
		return EXTLibraryPackage.Literals.LIBRARY__BOOKS;
	}

	@Override
	protected EClass getEClass() {
		return EXTLibraryPackage.Literals.BOOK;
	}

}
