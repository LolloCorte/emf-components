/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.Module#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.Module#getLabelProvider <em>Label Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.Module#getFeatureLabelProvider <em>Feature Label Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.Module#getFeatureProvider <em>Feature Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Provider</em>' containment reference.
   * @see #setLabelProvider(LabelProvider)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule_LabelProvider()
   * @model containment="true"
   * @generated
   */
  LabelProvider getLabelProvider();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.Module#getLabelProvider <em>Label Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Provider</em>' containment reference.
   * @see #getLabelProvider()
   * @generated
   */
  void setLabelProvider(LabelProvider value);

  /**
   * Returns the value of the '<em><b>Feature Label Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Label Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Label Provider</em>' containment reference.
   * @see #setFeatureLabelProvider(FeatureLabelProvider)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule_FeatureLabelProvider()
   * @model containment="true"
   * @generated
   */
  FeatureLabelProvider getFeatureLabelProvider();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.Module#getFeatureLabelProvider <em>Feature Label Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Label Provider</em>' containment reference.
   * @see #getFeatureLabelProvider()
   * @generated
   */
  void setFeatureLabelProvider(FeatureLabelProvider value);

  /**
   * Returns the value of the '<em><b>Feature Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Provider</em>' containment reference.
   * @see #setFeatureProvider(FeatureProvider)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule_FeatureProvider()
   * @model containment="true"
   * @generated
   */
  FeatureProvider getFeatureProvider();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.Module#getFeatureProvider <em>Feature Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Provider</em>' containment reference.
   * @see #getFeatureProvider()
   * @generated
   */
  void setFeatureProvider(FeatureProvider value);

} // Module
