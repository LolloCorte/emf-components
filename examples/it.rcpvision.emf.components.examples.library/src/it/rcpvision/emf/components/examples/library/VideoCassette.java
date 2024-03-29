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
 * $Id: VideoCassette.java,v 1.5 2008/05/04 17:03:17 emerks Exp $
 */
package it.rcpvision.emf.components.examples.library;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Cassette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.examples.library.VideoCassette#getCast <em>Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getVideoCassette()
 * @model
 * @generated
 */
public interface VideoCassette extends AudioVisualItem
{
  /**
   * Returns the value of the '<em><b>Cast</b></em>' reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.examples.library.Person}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast</em>' reference list.
   * @see it.rcpvision.emf.components.examples.library.EXTLibraryPackage#getVideoCassette_Cast()
   * @model
   * @generated
   */
  EList<Person> getCast();

} // VideoCassette
