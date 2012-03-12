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
 * $Id: Borrower.java,v 1.4 2008/05/04 17:03:18 emerks Exp $
 */
package it.rcpvision.emf.components.examples.library;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Borrower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Borrower#getBorrowed <em>Borrowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getBorrower()
 * @model
 * @generated
 */
public interface Borrower extends Person
{
  /**
   * Returns the value of the '<em><b>Borrowed</b></em>' reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Lendable}.
   * It is bidirectional and its opposite is '{@link it.rcpvision.emf.components.examples.library.Lendable#getBorrowers <em>Borrowers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Borrowed</em>' reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getBorrower_Borrowed()
   * @see it.rcpvision.emf.components.examples.library.Lendable#getBorrowers
   * @model opposite="borrowers"
   * @generated
   */
  EList<Lendable> getBorrowed();

} // Borrower
