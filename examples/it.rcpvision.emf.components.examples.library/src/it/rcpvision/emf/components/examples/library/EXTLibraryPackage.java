/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EXTLibraryPackage.java,v 1.3 2008/05/01 18:31:58 davidms Exp $
 */
package it.rcpvision.emf.components.examples.library;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.rcpvision.emf.components.examples.library.EXTLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface EXTLibraryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "extlibrary"; //$NON-NLS-1$

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http:///it/rcpvision/emf/components/examples/library/extlibrary.ecore/0.1.0"; //$NON-NLS-1$

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "extlib"; //$NON-NLS-1$

  /**
   * The package content type ID.
   * <!-- begin-user-doc -->
   * @since 2.4
   * <!-- end-user-doc -->
   * @generated
   */
  String eCONTENT_TYPE = "emfComponentsLibrary"; //$NON-NLS-1$

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EXTLibraryPackage eINSTANCE = it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl.init();

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.ItemImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getItem()
   * @generated
   */
  int ITEM = 3;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__PUBLICATION_DATE = 0;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.CirculatingItemImpl <em>Circulating Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.CirculatingItemImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getCirculatingItem()
   * @generated
   */
  int CIRCULATING_ITEM = 5;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCULATING_ITEM__PUBLICATION_DATE = ITEM__PUBLICATION_DATE;

  /**
   * The feature id for the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCULATING_ITEM__COPIES = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCULATING_ITEM__BORROWERS = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Circulating Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCULATING_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.BookImpl <em>Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.BookImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBook()
   * @generated
   */
  int BOOK = 0;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__PUBLICATION_DATE = CIRCULATING_ITEM__PUBLICATION_DATE;

  /**
   * The feature id for the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__COPIES = CIRCULATING_ITEM__COPIES;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__BORROWERS = CIRCULATING_ITEM__BORROWERS;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__TITLE = CIRCULATING_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pages</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__PAGES = CIRCULATING_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__CATEGORY = CIRCULATING_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Author</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__AUTHOR = CIRCULATING_ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_FEATURE_COUNT = CIRCULATING_ITEM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.Addressable <em>Addressable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.Addressable
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getAddressable()
   * @generated
   */
  int ADDRESSABLE = 13;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESSABLE__ADDRESS = 0;

  /**
   * The number of structural features of the '<em>Addressable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESSABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.LibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.LibraryImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getLibrary()
   * @generated
   */
  int LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__ADDRESS = ADDRESSABLE__ADDRESS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__NAME = ADDRESSABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Writers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__WRITERS = ADDRESSABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Employees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__EMPLOYEES = ADDRESSABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__BORROWERS = ADDRESSABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Stock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__STOCK = ADDRESSABLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Books</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__BOOKS = ADDRESSABLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__BRANCHES = ADDRESSABLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Parent Branch</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__PARENT_BRANCH = ADDRESSABLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>People</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__PEOPLE = ADDRESSABLE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_FEATURE_COUNT = ADDRESSABLE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.PersonImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 11;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ADDRESS = ADDRESSABLE__ADDRESS;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FIRST_NAME = ADDRESSABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LAST_NAME = ADDRESSABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = ADDRESSABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.WriterImpl <em>Writer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.WriterImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getWriter()
   * @generated
   */
  int WRITER = 2;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITER__ADDRESS = PERSON__ADDRESS;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITER__FIRST_NAME = PERSON__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITER__LAST_NAME = PERSON__LAST_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITER__NAME = PERSON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Books</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITER__BOOKS = PERSON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Writer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.Lendable <em>Lendable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.Lendable
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getLendable()
   * @generated
   */
  int LENDABLE = 4;

  /**
   * The feature id for the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENDABLE__COPIES = 0;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENDABLE__BORROWERS = 1;

  /**
   * The number of structural features of the '<em>Lendable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENDABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.PeriodicalImpl <em>Periodical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.PeriodicalImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getPeriodical()
   * @generated
   */
  int PERIODICAL = 6;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODICAL__PUBLICATION_DATE = ITEM__PUBLICATION_DATE;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODICAL__TITLE = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Issues Per Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODICAL__ISSUES_PER_YEAR = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Periodical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODICAL_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.AudioVisualItemImpl <em>Audio Visual Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.AudioVisualItemImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getAudioVisualItem()
   * @generated
   */
  int AUDIO_VISUAL_ITEM = 7;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM__PUBLICATION_DATE = CIRCULATING_ITEM__PUBLICATION_DATE;

  /**
   * The feature id for the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM__COPIES = CIRCULATING_ITEM__COPIES;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM__BORROWERS = CIRCULATING_ITEM__BORROWERS;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM__TITLE = CIRCULATING_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Minutes Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM__MINUTES_LENGTH = CIRCULATING_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Damaged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM__DAMAGED = CIRCULATING_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Audio Visual Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_VISUAL_ITEM_FEATURE_COUNT = CIRCULATING_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.BookOnTapeImpl <em>Book On Tape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.BookOnTapeImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBookOnTape()
   * @generated
   */
  int BOOK_ON_TAPE = 8;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__PUBLICATION_DATE = AUDIO_VISUAL_ITEM__PUBLICATION_DATE;

  /**
   * The feature id for the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__COPIES = AUDIO_VISUAL_ITEM__COPIES;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__BORROWERS = AUDIO_VISUAL_ITEM__BORROWERS;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__TITLE = AUDIO_VISUAL_ITEM__TITLE;

  /**
   * The feature id for the '<em><b>Minutes Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__MINUTES_LENGTH = AUDIO_VISUAL_ITEM__MINUTES_LENGTH;

  /**
   * The feature id for the '<em><b>Damaged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__DAMAGED = AUDIO_VISUAL_ITEM__DAMAGED;

  /**
   * The feature id for the '<em><b>Reader</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__READER = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Author</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE__AUTHOR = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Book On Tape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ON_TAPE_FEATURE_COUNT = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.VideoCassetteImpl <em>Video Cassette</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.VideoCassetteImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getVideoCassette()
   * @generated
   */
  int VIDEO_CASSETTE = 9;

  /**
   * The feature id for the '<em><b>Publication Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__PUBLICATION_DATE = AUDIO_VISUAL_ITEM__PUBLICATION_DATE;

  /**
   * The feature id for the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__COPIES = AUDIO_VISUAL_ITEM__COPIES;

  /**
   * The feature id for the '<em><b>Borrowers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__BORROWERS = AUDIO_VISUAL_ITEM__BORROWERS;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__TITLE = AUDIO_VISUAL_ITEM__TITLE;

  /**
   * The feature id for the '<em><b>Minutes Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__MINUTES_LENGTH = AUDIO_VISUAL_ITEM__MINUTES_LENGTH;

  /**
   * The feature id for the '<em><b>Damaged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__DAMAGED = AUDIO_VISUAL_ITEM__DAMAGED;

  /**
   * The feature id for the '<em><b>Cast</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE__CAST = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Video Cassette</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_CASSETTE_FEATURE_COUNT = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.BorrowerImpl <em>Borrower</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.BorrowerImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBorrower()
   * @generated
   */
  int BORROWER = 10;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWER__ADDRESS = PERSON__ADDRESS;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWER__FIRST_NAME = PERSON__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWER__LAST_NAME = PERSON__LAST_NAME;

  /**
   * The feature id for the '<em><b>Borrowed</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWER__BORROWED = PERSON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Borrower</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.impl.EmployeeImpl <em>Employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.impl.EmployeeImpl
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getEmployee()
   * @generated
   */
  int EMPLOYEE = 12;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__ADDRESS = PERSON__ADDRESS;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__FIRST_NAME = PERSON__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__LAST_NAME = PERSON__LAST_NAME;

  /**
   * The feature id for the '<em><b>Manager</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__MANAGER = PERSON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.examples.library.BookCategory <em>Book Category</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.examples.library.BookCategory
   * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBookCategory()
   * @generated
   */
  int BOOK_CATEGORY = 14;

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Book <em>Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book</em>'.
   * @see it.rcpvision.emf.components.examples.library.Book
   * @generated
   */
  EClass getBook();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Book#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see it.rcpvision.emf.components.examples.library.Book#getTitle()
   * @see #getBook()
   * @generated
   */
  EAttribute getBook_Title();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Book#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pages</em>'.
   * @see it.rcpvision.emf.components.examples.library.Book#getPages()
   * @see #getBook()
   * @generated
   */
  EAttribute getBook_Pages();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Book#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see it.rcpvision.emf.components.examples.library.Book#getCategory()
   * @see #getBook()
   * @generated
   */
  EAttribute getBook_Category();

  /**
   * Returns the meta object for the reference '{@link it.rcpvision.emf.components.examples.library.Book#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Author</em>'.
   * @see it.rcpvision.emf.components.examples.library.Book#getAuthor()
   * @see #getBook()
   * @generated
   */
  EReference getBook_Author();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library
   * @generated
   */
  EClass getLibrary();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Library#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getName()
   * @see #getLibrary()
   * @generated
   */
  EAttribute getLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.examples.library.Library#getWriters <em>Writers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Writers</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getWriters()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Writers();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.examples.library.Library#getEmployees <em>Employees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Employees</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getEmployees()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Employees();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.examples.library.Library#getBorrowers <em>Borrowers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Borrowers</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getBorrowers()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Borrowers();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.examples.library.Library#getStock <em>Stock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stock</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getStock()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Stock();

  /**
   * Returns the meta object for the reference list '{@link it.rcpvision.emf.components.examples.library.Library#getBooks <em>Books</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Books</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getBooks()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Books();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.examples.library.Library#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getBranches()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Branches();

  /**
   * Returns the meta object for the container reference '{@link it.rcpvision.emf.components.examples.library.Library#getParentBranch <em>Parent Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Branch</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getParentBranch()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_ParentBranch();

  /**
   * Returns the meta object for the attribute list '{@link it.rcpvision.emf.components.examples.library.Library#getPeople <em>People</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>People</em>'.
   * @see it.rcpvision.emf.components.examples.library.Library#getPeople()
   * @see #getLibrary()
   * @generated
   */
  EAttribute getLibrary_People();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Writer <em>Writer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Writer</em>'.
   * @see it.rcpvision.emf.components.examples.library.Writer
   * @generated
   */
  EClass getWriter();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Writer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.rcpvision.emf.components.examples.library.Writer#getName()
   * @see #getWriter()
   * @generated
   */
  EAttribute getWriter_Name();

  /**
   * Returns the meta object for the reference list '{@link it.rcpvision.emf.components.examples.library.Writer#getBooks <em>Books</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Books</em>'.
   * @see it.rcpvision.emf.components.examples.library.Writer#getBooks()
   * @see #getWriter()
   * @generated
   */
  EReference getWriter_Books();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see it.rcpvision.emf.components.examples.library.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Item#getPublicationDate <em>Publication Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Publication Date</em>'.
   * @see it.rcpvision.emf.components.examples.library.Item#getPublicationDate()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_PublicationDate();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Lendable <em>Lendable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lendable</em>'.
   * @see it.rcpvision.emf.components.examples.library.Lendable
   * @generated
   */
  EClass getLendable();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Lendable#getCopies <em>Copies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copies</em>'.
   * @see it.rcpvision.emf.components.examples.library.Lendable#getCopies()
   * @see #getLendable()
   * @generated
   */
  EAttribute getLendable_Copies();

  /**
   * Returns the meta object for the reference list '{@link it.rcpvision.emf.components.examples.library.Lendable#getBorrowers <em>Borrowers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Borrowers</em>'.
   * @see it.rcpvision.emf.components.examples.library.Lendable#getBorrowers()
   * @see #getLendable()
   * @generated
   */
  EReference getLendable_Borrowers();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.CirculatingItem <em>Circulating Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Circulating Item</em>'.
   * @see it.rcpvision.emf.components.examples.library.CirculatingItem
   * @generated
   */
  EClass getCirculatingItem();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Periodical <em>Periodical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Periodical</em>'.
   * @see it.rcpvision.emf.components.examples.library.Periodical
   * @generated
   */
  EClass getPeriodical();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Periodical#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see it.rcpvision.emf.components.examples.library.Periodical#getTitle()
   * @see #getPeriodical()
   * @generated
   */
  EAttribute getPeriodical_Title();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Periodical#getIssuesPerYear <em>Issues Per Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issues Per Year</em>'.
   * @see it.rcpvision.emf.components.examples.library.Periodical#getIssuesPerYear()
   * @see #getPeriodical()
   * @generated
   */
  EAttribute getPeriodical_IssuesPerYear();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.AudioVisualItem <em>Audio Visual Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audio Visual Item</em>'.
   * @see it.rcpvision.emf.components.examples.library.AudioVisualItem
   * @generated
   */
  EClass getAudioVisualItem();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.AudioVisualItem#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see it.rcpvision.emf.components.examples.library.AudioVisualItem#getTitle()
   * @see #getAudioVisualItem()
   * @generated
   */
  EAttribute getAudioVisualItem_Title();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.AudioVisualItem#getMinutesLength <em>Minutes Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutes Length</em>'.
   * @see it.rcpvision.emf.components.examples.library.AudioVisualItem#getMinutesLength()
   * @see #getAudioVisualItem()
   * @generated
   */
  EAttribute getAudioVisualItem_MinutesLength();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.AudioVisualItem#isDamaged <em>Damaged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Damaged</em>'.
   * @see it.rcpvision.emf.components.examples.library.AudioVisualItem#isDamaged()
   * @see #getAudioVisualItem()
   * @generated
   */
  EAttribute getAudioVisualItem_Damaged();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.BookOnTape <em>Book On Tape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book On Tape</em>'.
   * @see it.rcpvision.emf.components.examples.library.BookOnTape
   * @generated
   */
  EClass getBookOnTape();

  /**
   * Returns the meta object for the reference '{@link it.rcpvision.emf.components.examples.library.BookOnTape#getReader <em>Reader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reader</em>'.
   * @see it.rcpvision.emf.components.examples.library.BookOnTape#getReader()
   * @see #getBookOnTape()
   * @generated
   */
  EReference getBookOnTape_Reader();

  /**
   * Returns the meta object for the reference '{@link it.rcpvision.emf.components.examples.library.BookOnTape#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Author</em>'.
   * @see it.rcpvision.emf.components.examples.library.BookOnTape#getAuthor()
   * @see #getBookOnTape()
   * @generated
   */
  EReference getBookOnTape_Author();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.VideoCassette <em>Video Cassette</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Cassette</em>'.
   * @see it.rcpvision.emf.components.examples.library.VideoCassette
   * @generated
   */
  EClass getVideoCassette();

  /**
   * Returns the meta object for the reference list '{@link it.rcpvision.emf.components.examples.library.VideoCassette#getCast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Cast</em>'.
   * @see it.rcpvision.emf.components.examples.library.VideoCassette#getCast()
   * @see #getVideoCassette()
   * @generated
   */
  EReference getVideoCassette_Cast();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Borrower <em>Borrower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Borrower</em>'.
   * @see it.rcpvision.emf.components.examples.library.Borrower
   * @generated
   */
  EClass getBorrower();

  /**
   * Returns the meta object for the reference list '{@link it.rcpvision.emf.components.examples.library.Borrower#getBorrowed <em>Borrowed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Borrowed</em>'.
   * @see it.rcpvision.emf.components.examples.library.Borrower#getBorrowed()
   * @see #getBorrower()
   * @generated
   */
  EReference getBorrower_Borrowed();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see it.rcpvision.emf.components.examples.library.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Person#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see it.rcpvision.emf.components.examples.library.Person#getFirstName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_FirstName();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Person#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see it.rcpvision.emf.components.examples.library.Person#getLastName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_LastName();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee</em>'.
   * @see it.rcpvision.emf.components.examples.library.Employee
   * @generated
   */
  EClass getEmployee();

  /**
   * Returns the meta object for the reference '{@link it.rcpvision.emf.components.examples.library.Employee#getManager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Manager</em>'.
   * @see it.rcpvision.emf.components.examples.library.Employee#getManager()
   * @see #getEmployee()
   * @generated
   */
  EReference getEmployee_Manager();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.examples.library.Addressable <em>Addressable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addressable</em>'.
   * @see it.rcpvision.emf.components.examples.library.Addressable
   * @generated
   */
  EClass getAddressable();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.examples.library.Addressable#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see it.rcpvision.emf.components.examples.library.Addressable#getAddress()
   * @see #getAddressable()
   * @generated
   */
  EAttribute getAddressable_Address();

  /**
   * Returns the meta object for enum '{@link it.rcpvision.emf.components.examples.library.BookCategory <em>Book Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Book Category</em>'.
   * @see it.rcpvision.emf.components.examples.library.BookCategory
   * @generated
   */
  EEnum getBookCategory();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EXTLibraryFactory getEXTLibraryFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.BookImpl <em>Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.BookImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBook()
     * @generated
     */
    EClass BOOK = eINSTANCE.getBook();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOK__PAGES = eINSTANCE.getBook_Pages();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOK__CATEGORY = eINSTANCE.getBook_Category();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK__AUTHOR = eINSTANCE.getBook_Author();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.LibraryImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getLibrary()
     * @generated
     */
    EClass LIBRARY = eINSTANCE.getLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Writers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__WRITERS = eINSTANCE.getLibrary_Writers();

    /**
     * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__EMPLOYEES = eINSTANCE.getLibrary_Employees();

    /**
     * The meta object literal for the '<em><b>Borrowers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__BORROWERS = eINSTANCE.getLibrary_Borrowers();

    /**
     * The meta object literal for the '<em><b>Stock</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__STOCK = eINSTANCE.getLibrary_Stock();

    /**
     * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__BRANCHES = eINSTANCE.getLibrary_Branches();

    /**
     * The meta object literal for the '<em><b>Parent Branch</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__PARENT_BRANCH = eINSTANCE.getLibrary_ParentBranch();

    /**
     * The meta object literal for the '<em><b>People</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY__PEOPLE = eINSTANCE.getLibrary_People();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.WriterImpl <em>Writer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.WriterImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getWriter()
     * @generated
     */
    EClass WRITER = eINSTANCE.getWriter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRITER__NAME = eINSTANCE.getWriter_Name();

    /**
     * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WRITER__BOOKS = eINSTANCE.getWriter_Books();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.ItemImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>Publication Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__PUBLICATION_DATE = eINSTANCE.getItem_PublicationDate();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.Lendable <em>Lendable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.Lendable
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getLendable()
     * @generated
     */
    EClass LENDABLE = eINSTANCE.getLendable();

    /**
     * The meta object literal for the '<em><b>Copies</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENDABLE__COPIES = eINSTANCE.getLendable_Copies();

    /**
     * The meta object literal for the '<em><b>Borrowers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENDABLE__BORROWERS = eINSTANCE.getLendable_Borrowers();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.CirculatingItemImpl <em>Circulating Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.CirculatingItemImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getCirculatingItem()
     * @generated
     */
    EClass CIRCULATING_ITEM = eINSTANCE.getCirculatingItem();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.PeriodicalImpl <em>Periodical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.PeriodicalImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getPeriodical()
     * @generated
     */
    EClass PERIODICAL = eINSTANCE.getPeriodical();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERIODICAL__TITLE = eINSTANCE.getPeriodical_Title();

    /**
     * The meta object literal for the '<em><b>Issues Per Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERIODICAL__ISSUES_PER_YEAR = eINSTANCE.getPeriodical_IssuesPerYear();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.AudioVisualItemImpl <em>Audio Visual Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.AudioVisualItemImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getAudioVisualItem()
     * @generated
     */
    EClass AUDIO_VISUAL_ITEM = eINSTANCE.getAudioVisualItem();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUDIO_VISUAL_ITEM__TITLE = eINSTANCE.getAudioVisualItem_Title();

    /**
     * The meta object literal for the '<em><b>Minutes Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUDIO_VISUAL_ITEM__MINUTES_LENGTH = eINSTANCE.getAudioVisualItem_MinutesLength();

    /**
     * The meta object literal for the '<em><b>Damaged</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUDIO_VISUAL_ITEM__DAMAGED = eINSTANCE.getAudioVisualItem_Damaged();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.BookOnTapeImpl <em>Book On Tape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.BookOnTapeImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBookOnTape()
     * @generated
     */
    EClass BOOK_ON_TAPE = eINSTANCE.getBookOnTape();

    /**
     * The meta object literal for the '<em><b>Reader</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK_ON_TAPE__READER = eINSTANCE.getBookOnTape_Reader();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK_ON_TAPE__AUTHOR = eINSTANCE.getBookOnTape_Author();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.VideoCassetteImpl <em>Video Cassette</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.VideoCassetteImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getVideoCassette()
     * @generated
     */
    EClass VIDEO_CASSETTE = eINSTANCE.getVideoCassette();

    /**
     * The meta object literal for the '<em><b>Cast</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_CASSETTE__CAST = eINSTANCE.getVideoCassette_Cast();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.BorrowerImpl <em>Borrower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.BorrowerImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBorrower()
     * @generated
     */
    EClass BORROWER = eINSTANCE.getBorrower();

    /**
     * The meta object literal for the '<em><b>Borrowed</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORROWER__BORROWED = eINSTANCE.getBorrower_Borrowed();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.PersonImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.impl.EmployeeImpl <em>Employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.impl.EmployeeImpl
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getEmployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getEmployee();

    /**
     * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPLOYEE__MANAGER = eINSTANCE.getEmployee_Manager();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.Addressable <em>Addressable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.Addressable
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getAddressable()
     * @generated
     */
    EClass ADDRESSABLE = eINSTANCE.getAddressable();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESSABLE__ADDRESS = eINSTANCE.getAddressable_Address();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.examples.library.BookCategory <em>Book Category</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.examples.library.BookCategory
     * @see it.rcpvision.emf.components.examples.library.impl.EXTLibraryPackageImpl#getBookCategory()
     * @generated
     */
    EEnum BOOK_CATEGORY = eINSTANCE.getBookCategory();

  }

} //EXTLibraryPackage
