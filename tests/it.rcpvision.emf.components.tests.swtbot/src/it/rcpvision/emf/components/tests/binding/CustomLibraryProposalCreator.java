/**
 * 
 */
package it.rcpvision.emf.components.tests.binding;

import it.rcpvision.emf.components.binding.ProposalCreator;
import it.rcpvision.emf.components.examples.library.Book;
import it.rcpvision.emf.components.examples.library.Borrower;
import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;
import it.rcpvision.emf.components.examples.library.Writer;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author Lorenzo Bettini
 * 
 */
public class CustomLibraryProposalCreator extends ProposalCreator {

	public List<? extends Object> proposals_Book_author(Book book) {
		List<Object> proposals = new LinkedList<Object>();
		Writer writer = EXTLibraryFactory.eINSTANCE.createWriter();
		writer.setFirstName("Fake");
		writer.setLastName("Writer");
		proposals.add(writer);
		writer = EXTLibraryFactory.eINSTANCE.createWriter();
		writer.setFirstName("Fake");
		writer.setLastName("Writer2");
		proposals.add(writer);
		return proposals;
	}

	public List<?> proposals_Borrower_borrowed(Borrower b,
			EStructuralFeature feature) {
		List<Object> proposals = defaultProposals(feature);

		Book fakeBook = EXTLibraryFactory.eINSTANCE.createBook();
		fakeBook.setTitle("Fake Book");
		proposals.add(fakeBook);

		return proposals;
	}
}
