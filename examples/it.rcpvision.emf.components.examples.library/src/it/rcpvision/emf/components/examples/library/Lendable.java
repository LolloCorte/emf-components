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
 * $Id: Lendable.java,v 1.4 2008/05/04 17:03:18 emerks Exp $
 */
package it.rcpvision.emf.components.examples.library;


import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lendable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Lendable#getCopies <em>Copies</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.library.Lendable#getBorrowers <em>Borrowers</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLendable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Lendable extends EObject
{
  /**
   * Returns the value of the '<em><b>Copies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copies</em>' attribute.
   * @see #setCopies(int)
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLendable_Copies()
   * @model required="true"
   * @generated
   */
  int getCopies();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.examples.library.Lendable#getCopies <em>Copies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copies</em>' attribute.
   * @see #getCopies()
   * @generated
   */
  void setCopies(int value);

  /**
   * Returns the value of the '<em><b>Borrowers</b></em>' reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Borrower}.
   * It is bidirectional and its opposite is '{@link it.rcpvision.emf.components.examples.library.Borrower#getBorrowed <em>Borrowed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Borrowers</em>' reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getLendable_Borrowers()
   * @see it.rcpvision.emf.components.examples.library.Borrower#getBorrowed
   * @model opposite="borrowed" ordered="false"
   * @generated
   */
  EList<Borrower> getBorrowers();

} // Lendable
