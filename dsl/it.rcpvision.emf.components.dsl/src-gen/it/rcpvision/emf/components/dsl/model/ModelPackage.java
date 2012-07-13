/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.rcpvision.emf.components.dsl.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rcpvision.it/emf/components/dsl/EmfComponentsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.ImportImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.ModuleImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getModule()
   * @generated
   */
  int MODULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Label Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__LABEL_PROVIDER = 1;

  /**
   * The feature id for the '<em><b>Feature Label Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FEATURE_LABEL_PROVIDER = 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.LabelProviderImpl <em>Label Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.LabelProviderImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getLabelProvider()
   * @generated
   */
  int LABEL_PROVIDER = 3;

  /**
   * The feature id for the '<em><b>Label Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROVIDER__LABEL_SPECIFICATIONS = 0;

  /**
   * The feature id for the '<em><b>Image Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROVIDER__IMAGE_SPECIFICATIONS = 1;

  /**
   * The number of structural features of the '<em>Label Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROVIDER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.LabelSpecificationImpl <em>Label Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.LabelSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getLabelSpecification()
   * @generated
   */
  int LABEL_SPECIFICATION = 4;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_SPECIFICATION__PARAMETER_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_SPECIFICATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_SPECIFICATION__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Label Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeatureLabelProviderImpl <em>Feature Label Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.FeatureLabelProviderImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeatureLabelProvider()
   * @generated
   */
  int FEATURE_LABEL_PROVIDER = 5;

  /**
   * The feature id for the '<em><b>Label Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Feature Label Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LABEL_PROVIDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeatureLabelSpecificationImpl <em>Feature Label Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.FeatureLabelSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeatureLabelSpecification()
   * @generated
   */
  int FEATURE_LABEL_SPECIFICATION = 6;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LABEL_SPECIFICATION__PARAMETER_TYPE = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LABEL_SPECIFICATION__FEATURE = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LABEL_SPECIFICATION__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Feature Label Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LABEL_SPECIFICATION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Model#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Model#getModule()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Module();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.dsl.model.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.dsl.model.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getLabelProvider <em>Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getLabelProvider()
   * @see #getModule()
   * @generated
   */
  EReference getModule_LabelProvider();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getFeatureLabelProvider <em>Feature Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Label Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getFeatureLabelProvider()
   * @see #getModule()
   * @generated
   */
  EReference getModule_FeatureLabelProvider();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.LabelProvider <em>Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelProvider
   * @generated
   */
  EClass getLabelProvider();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.LabelProvider#getLabelSpecifications <em>Label Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Label Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelProvider#getLabelSpecifications()
   * @see #getLabelProvider()
   * @generated
   */
  EReference getLabelProvider_LabelSpecifications();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.LabelProvider#getImageSpecifications <em>Image Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Image Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelProvider#getImageSpecifications()
   * @see #getLabelProvider()
   * @generated
   */
  EReference getLabelProvider_ImageSpecifications();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.LabelSpecification <em>Label Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelSpecification
   * @generated
   */
  EClass getLabelSpecification();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.LabelSpecification#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelSpecification#getParameterType()
   * @see #getLabelSpecification()
   * @generated
   */
  EReference getLabelSpecification_ParameterType();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.dsl.model.LabelSpecification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelSpecification#getName()
   * @see #getLabelSpecification()
   * @generated
   */
  EAttribute getLabelSpecification_Name();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.LabelSpecification#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.rcpvision.emf.components.dsl.model.LabelSpecification#getExpression()
   * @see #getLabelSpecification()
   * @generated
   */
  EReference getLabelSpecification_Expression();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelProvider <em>Feature Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Label Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelProvider
   * @generated
   */
  EClass getFeatureLabelProvider();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelProvider#getLabelSpecifications <em>Label Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Label Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelProvider#getLabelSpecifications()
   * @see #getFeatureLabelProvider()
   * @generated
   */
  EReference getFeatureLabelProvider_LabelSpecifications();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification <em>Feature Label Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Label Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification
   * @generated
   */
  EClass getFeatureLabelSpecification();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getParameterType()
   * @see #getFeatureLabelSpecification()
   * @generated
   */
  EReference getFeatureLabelSpecification_ParameterType();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getFeature()
   * @see #getFeatureLabelSpecification()
   * @generated
   */
  EReference getFeatureLabelSpecification_Feature();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification#getExpression()
   * @see #getFeatureLabelSpecification()
   * @generated
   */
  EReference getFeatureLabelSpecification_Expression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULE = eINSTANCE.getModel_Module();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.ImportImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.ModuleImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Label Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__LABEL_PROVIDER = eINSTANCE.getModule_LabelProvider();

    /**
     * The meta object literal for the '<em><b>Feature Label Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FEATURE_LABEL_PROVIDER = eINSTANCE.getModule_FeatureLabelProvider();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.LabelProviderImpl <em>Label Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.LabelProviderImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getLabelProvider()
     * @generated
     */
    EClass LABEL_PROVIDER = eINSTANCE.getLabelProvider();

    /**
     * The meta object literal for the '<em><b>Label Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_PROVIDER__LABEL_SPECIFICATIONS = eINSTANCE.getLabelProvider_LabelSpecifications();

    /**
     * The meta object literal for the '<em><b>Image Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_PROVIDER__IMAGE_SPECIFICATIONS = eINSTANCE.getLabelProvider_ImageSpecifications();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.LabelSpecificationImpl <em>Label Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.LabelSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getLabelSpecification()
     * @generated
     */
    EClass LABEL_SPECIFICATION = eINSTANCE.getLabelSpecification();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_SPECIFICATION__PARAMETER_TYPE = eINSTANCE.getLabelSpecification_ParameterType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_SPECIFICATION__NAME = eINSTANCE.getLabelSpecification_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_SPECIFICATION__EXPRESSION = eINSTANCE.getLabelSpecification_Expression();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeatureLabelProviderImpl <em>Feature Label Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.FeatureLabelProviderImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeatureLabelProvider()
     * @generated
     */
    EClass FEATURE_LABEL_PROVIDER = eINSTANCE.getFeatureLabelProvider();

    /**
     * The meta object literal for the '<em><b>Label Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS = eINSTANCE.getFeatureLabelProvider_LabelSpecifications();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeatureLabelSpecificationImpl <em>Feature Label Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.FeatureLabelSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeatureLabelSpecification()
     * @generated
     */
    EClass FEATURE_LABEL_SPECIFICATION = eINSTANCE.getFeatureLabelSpecification();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LABEL_SPECIFICATION__PARAMETER_TYPE = eINSTANCE.getFeatureLabelSpecification_ParameterType();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LABEL_SPECIFICATION__FEATURE = eINSTANCE.getFeatureLabelSpecification_Feature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LABEL_SPECIFICATION__EXPRESSION = eINSTANCE.getFeatureLabelSpecification_Expression();

  }

} //ModelPackage
