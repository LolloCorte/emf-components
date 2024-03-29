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
 * $Id: CreateLibraryAction.java,v 1.2 2006/12/29 18:27:34 marcelop Exp $
 */
package it.rcpvision.emf.components.examples.library.actions;


import it.rcpvision.emf.components.examples.library.EXTLibraryFactory;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;


/**
 * The extended library example supports multi-rooted resources
 * and therefore this action allows the user to create a library
 * root on the resource.
 */
public class CreateLibraryAction extends StaticSelectionCommandAction
{

  /**
   * This constructs an instance of an action that creates a library
   */
  public CreateLibraryAction(IEditorPart editorPart, ISelection selection)
  {
    super(editorPart);
    configureAction(selection);
  }

  /*
   * @see org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
   *      java.util.Collection)
   */
  @Override
  protected Command createActionCommand(EditingDomain inputEditingDomain, Collection<?> collection)
  {

    return new AddLibraryCommand(
      inputEditingDomain,
      ((Resource)collection.toArray()[0]).getContents(),
      EXTLibraryFactory.eINSTANCE.createLibrary());
  }
}