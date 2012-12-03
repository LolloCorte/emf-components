/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Feature Control Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory#getControlSpecifications <em>Control Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFormFeatureControlFactory()
 * @model
 * @generated
 */
public interface FormFeatureControlFactory extends EObject
{
  /**
   * Returns the value of the '<em><b>Control Specifications</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Specifications</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFormFeatureControlFactory_ControlSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<FormFeatureControlSpecification> getControlSpecifications();

} // FormControlFactory
