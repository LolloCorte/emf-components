/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Feature Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.EmfFeatureAccess#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getEmfFeatureAccess()
 * @model
 * @generated
 */
public interface EmfFeatureAccess extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' reference.
   * @see #setParameterType(JvmType)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getEmfFeatureAccess_ParameterType()
   * @model
   * @generated
   */
  JvmType getParameterType();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.EmfFeatureAccess#getParameterType <em>Parameter Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' reference.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(JvmType value);

} // EmfFeatureAccess
