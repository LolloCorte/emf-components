/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelFactory eINSTANCE = it.rcpvision.emf.components.dsl.model.impl.ModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Label Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Provider</em>'.
   * @generated
   */
  LabelProvider createLabelProvider();

  /**
   * Returns a new object of class '<em>Label Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Specification</em>'.
   * @generated
   */
  LabelSpecification createLabelSpecification();

  /**
   * Returns a new object of class '<em>Feature Label Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Label Provider</em>'.
   * @generated
   */
  FeatureLabelProvider createFeatureLabelProvider();

  /**
   * Returns a new object of class '<em>Feature Label Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Label Specification</em>'.
   * @generated
   */
  FeatureLabelSpecification createFeatureLabelSpecification();

  /**
   * Returns a new object of class '<em>Feature Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Provider</em>'.
   * @generated
   */
  FeatureProvider createFeatureProvider();

  /**
   * Returns a new object of class '<em>Feature Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Specification</em>'.
   * @generated
   */
  FeatureSpecification createFeatureSpecification();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelPackage getModelPackage();

} //ModelFactory
