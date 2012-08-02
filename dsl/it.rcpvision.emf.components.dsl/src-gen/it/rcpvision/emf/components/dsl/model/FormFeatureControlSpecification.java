/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Feature Control Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFormFeatureControlSpecification()
 * @model
 * @generated
 */
public interface FormFeatureControlSpecification extends EmfFeatureAccess
{
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
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFormFeatureControlSpecification_Feature()
   * @model containment="true"
   * @generated
   */
  XExpression getFeature();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getFeature <em>Feature</em>}' containment reference.
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
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFormFeatureControlSpecification_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(XExpression)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFormFeatureControlSpecification_Target()
   * @model containment="true"
   * @generated
   */
  XExpression getTarget();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(XExpression value);

} // FormFeatureControlSpecification
