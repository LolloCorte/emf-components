/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 IBM Corporation and others.
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
 * $Id: Library.java,v 1.7 2008/05/04 17:03:17 emerks Exp $
 */
package it.rcpvision.emf.components.examples.library;


import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getWriters <em>Writers</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getEmployees <em>Employees</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getBorrowers <em>Borrowers</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getStock <em>Stock</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getBranches <em>Branches</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getParentBranch <em>Parent Branch</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Library#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Addressable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.examples.library.Library#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Writers</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Writer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writers</em>' containment reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Writers()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="group='#people'"
   * @generated
   */
  EList<Writer> getWriters();

  /**
   * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Employee}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employees</em>' containment reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Employees()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="group='#people'"
   * @generated
   */
  EList<Employee> getEmployees();

  /**
   * Returns the value of the '<em><b>Borrowers</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Borrower}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Borrowers</em>' containment reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Borrowers()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="group='#people'"
   * @generated
   */
  EList<Borrower> getBorrowers();

  /**
   * Returns the value of the '<em><b>Stock</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Item}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stock</em>' containment reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Stock()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Item> getStock();

  /**
   * Returns the value of the '<em><b>Books</b></em>' reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Book}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Books</em>' reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Books()
   * @model transient="true" derived="true" ordered="false"
   * @generated
   */
  EList<Book> getBooks();

  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Library}.
   * It is bidirectional and its opposite is '{@link it.rcpvision.emf.components.examples.library.Library#getParentBranch <em>Parent Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_Branches()
   * @see it.rcpvision.emf.components.examples.library.Library#getParentBranch
   * @model opposite="parentBranch" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Library> getBranches();

  /**
   * Returns the value of the '<em><b>Parent Branch</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link it.rcpvision.emf.components.examples.library.Library#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Branch</em>' container reference.
   * @see #setParentBranch(Library)
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_ParentBranch()
   * @see it.rcpvision.emf.components.examples.library.Library#getBranches
   * @model opposite="branches" transient="false"
   * @generated
   */
  Library getParentBranch();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.examples.library.Library#getParentBranch <em>Parent Branch</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Branch</em>' container reference.
   * @see #getParentBranch()
   * @generated
   */
  void setParentBranch(Library value);

  /**
   * Returns the value of the '<em><b>People</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>People</em>' attribute list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLibrary_People()
   * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group'"
   * @generated
   */
  FeatureMap getPeople();

} // Library
