/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Views Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.ViewsSpecification#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getViewsSpecification()
 * @model
 * @generated
 */
public interface ViewsSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Views</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.dsl.model.ViewSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getViewsSpecification_Views()
   * @model containment="true"
   * @generated
   */
  EList<ViewSpecification> getViews();

} // ViewsSpecification
