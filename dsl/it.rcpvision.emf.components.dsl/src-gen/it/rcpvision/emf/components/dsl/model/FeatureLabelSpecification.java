/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Label Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureLabelSpecification()
 * @model
 * @generated
 */
public interface FeatureLabelSpecification extends EObject
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
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureLabelSpecification_ParameterType()
   * @model
   * @generated
   */
  JvmType getParameterType();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getParameterType <em>Parameter Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' reference.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(JvmType value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(XExpression)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureLabelSpecification_Feature()
   * @model containment="true"
   * @generated
   */
  XExpression getFeature();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(XExpression value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureLabelSpecification_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // FeatureLabelSpecification
