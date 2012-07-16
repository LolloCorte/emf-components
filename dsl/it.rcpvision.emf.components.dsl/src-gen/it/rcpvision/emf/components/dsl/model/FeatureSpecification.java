/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureSpecification()
 * @model
 * @generated
 */
public interface FeatureSpecification extends EObject
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
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureSpecification_ParameterType()
   * @model
   * @generated
   */
  JvmType getParameterType();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification#getParameterType <em>Parameter Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' reference.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(JvmType value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureSpecification_Features()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getFeatures();

} // FeatureSpecification
