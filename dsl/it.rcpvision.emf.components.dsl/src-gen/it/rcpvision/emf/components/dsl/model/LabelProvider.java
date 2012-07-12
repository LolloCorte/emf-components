/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.LabelProvider#getLabelSpecifications <em>Label Specifications</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.LabelProvider#getImageSpecifications <em>Image Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getLabelProvider()
 * @model
 * @generated
 */
public interface LabelProvider extends EObject
{
  /**
   * Returns the value of the '<em><b>Label Specifications</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.dsl.model.LabelSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Specifications</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getLabelProvider_LabelSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<LabelSpecification> getLabelSpecifications();

  /**
   * Returns the value of the '<em><b>Image Specifications</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.dsl.model.LabelSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Specifications</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getLabelProvider_ImageSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<LabelSpecification> getImageSpecifications();

} // LabelProvider
