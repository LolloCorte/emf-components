package it.rcpvision.emf.components.cdoexample.model.business;

import library.Author;
import library.Book;
import library.Library;
import library.LibraryFactory;

import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.junit.Before;
import org.junit.Test;

public class PopulateModel {
	
	@Test
	public void populateWriter() throws CommitException{
		CDOTransaction transaction=CommonBusiness.getSession().openTransaction();
		Library library=transaction.getObject(ModelBusiness.getOrCreateModel());
		Author author = LibraryFactory.eINSTANCE.createAuthor();
		author.setName("Ed Merks");
		library.getAuthors().add(author);
		transaction.commit();
	}

	@Test
	public void populateBook() throws CommitException{
		CDOTransaction transaction=CommonBusiness.getSession().openTransaction();
		Library library=transaction.getObject(ModelBusiness.getOrCreateModel());
		Book book = LibraryFactory.eINSTANCE.createBook();
		book.setTitle("Domain Specific Languages");
		library.getBooks().add(book);
		Author author = LibraryFactory.eINSTANCE.createAuthor();
		author.setName("Martin Fowler");
		book.getAuthors().add(author);
		library.getAuthors().add(author);
		transaction.commit();
	}

}
