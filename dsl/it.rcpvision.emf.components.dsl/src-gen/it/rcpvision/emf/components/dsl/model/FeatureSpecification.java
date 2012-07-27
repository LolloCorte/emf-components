/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getFeatureSpecification()
 * @model
 * @generated
 */
public interface FeatureSpecification extends EmfFeatureAccess
{
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
