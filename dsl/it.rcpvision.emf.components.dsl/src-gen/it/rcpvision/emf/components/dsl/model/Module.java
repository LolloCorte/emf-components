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
 *   <li>{@link it.rcpvision.emf.components.dsl.model.Module#getPropertyDescriptionProvider <em>Property Description Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.Module#getFeaturesProvider <em>Features Provider</em>}</li>
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
   * Returns the value of the '<em><b>Property Description Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Description Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Description Provider</em>' containment reference.
   * @see #setPropertyDescriptionProvider(PropertyDescriptionProvider)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule_PropertyDescriptionProvider()
   * @model containment="true"
   * @generated
   */
  PropertyDescriptionProvider getPropertyDescriptionProvider();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.Module#getPropertyDescriptionProvider <em>Property Description Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Description Provider</em>' containment reference.
   * @see #getPropertyDescriptionProvider()
   * @generated
   */
  void setPropertyDescriptionProvider(PropertyDescriptionProvider value);

  /**
   * Returns the value of the '<em><b>Features Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Provider</em>' containment reference.
   * @see #setFeaturesProvider(FeaturesProvider)
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getModule_FeaturesProvider()
   * @model containment="true"
   * @generated
   */
  FeaturesProvider getFeaturesProvider();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.dsl.model.Module#getFeaturesProvider <em>Features Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features Provider</em>' containment reference.
   * @see #getFeaturesProvider()
   * @generated
   */
  void setFeaturesProvider(FeaturesProvider value);

} // Module
