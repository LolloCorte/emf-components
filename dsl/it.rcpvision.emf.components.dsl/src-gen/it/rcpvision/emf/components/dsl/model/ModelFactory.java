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
   * Returns a new object of class '<em>Property Description Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Description Provider</em>'.
   * @generated
   */
  PropertyDescriptionProvider createPropertyDescriptionProvider();

  /**
   * Returns a new object of class '<em>Property Description Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Description Specification</em>'.
   * @generated
   */
  PropertyDescriptionSpecification createPropertyDescriptionSpecification();

  /**
   * Returns a new object of class '<em>Features Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features Provider</em>'.
   * @generated
   */
  FeaturesProvider createFeaturesProvider();

  /**
   * Returns a new object of class '<em>Feature Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Specification</em>'.
   * @generated
   */
  FeatureSpecification createFeatureSpecification();

  /**
   * Returns a new object of class '<em>Form Feature Control Factory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Feature Control Factory</em>'.
   * @generated
   */
  FormFeatureControlFactory createFormFeatureControlFactory();

  /**
   * Returns a new object of class '<em>Form Feature Control Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Feature Control Specification</em>'.
   * @generated
   */
  FormFeatureControlSpecification createFormFeatureControlSpecification();

  /**
   * Returns a new object of class '<em>Viewer Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewer Content Provider</em>'.
   * @generated
   */
  ViewerContentProvider createViewerContentProvider();

  /**
   * Returns a new object of class '<em>Emf Feature Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emf Feature Access</em>'.
   * @generated
   */
  EmfFeatureAccess createEmfFeatureAccess();

  /**
   * Returns a new object of class '<em>Part Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part Specification</em>'.
   * @generated
   */
  PartSpecification createPartSpecification();

  /**
   * Returns a new object of class '<em>View Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Specification</em>'.
   * @generated
   */
  ViewSpecification createViewSpecification();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelPackage getModelPackage();

} //ModelFactory
