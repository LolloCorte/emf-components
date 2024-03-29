/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewer Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.ViewerContentProvider#getChildrenSpecifications <em>Children Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getViewerContentProvider()
 * @model
 * @generated
 */
public interface ViewerContentProvider extends EObject
{
  /**
   * Returns the value of the '<em><b>Children Specifications</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.dsl.model.LabelSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children Specifications</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getViewerContentProvider_ChildrenSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<LabelSpecification> getChildrenSpecifications();

} // ViewerContentProvider
