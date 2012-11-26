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
   * The feature id for the '<em><b>Property Description Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PROPERTY_DESCRIPTION_PROVIDER = 2;

  /**
   * The feature id for the '<em><b>Features Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FEATURES_PROVIDER = 3;

  /**
   * The feature id for the '<em><b>Form Feature Control Factory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FORM_FEATURE_CONTROL_FACTORY = 4;

  /**
   * The feature id for the '<em><b>Viewer Content Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__VIEWER_CONTENT_PROVIDER = 5;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__VIEWS = 6;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 7;

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
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionProviderImpl <em>Property Description Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionProviderImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getPropertyDescriptionProvider()
   * @generated
   */
  int PROPERTY_DESCRIPTION_PROVIDER = 5;

  /**
   * The feature id for the '<em><b>Label Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DESCRIPTION_PROVIDER__LABEL_SPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Property Description Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DESCRIPTION_PROVIDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.EmfFeatureAccessImpl <em>Emf Feature Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.EmfFeatureAccessImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getEmfFeatureAccess()
   * @generated
   */
  int EMF_FEATURE_ACCESS = 12;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_FEATURE_ACCESS__PARAMETER_TYPE = 0;

  /**
   * The number of structural features of the '<em>Emf Feature Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_FEATURE_ACCESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl <em>Property Description Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getPropertyDescriptionSpecification()
   * @generated
   */
  int PROPERTY_DESCRIPTION_SPECIFICATION = 6;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE = EMF_FEATURE_ACCESS__PARAMETER_TYPE;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE = EMF_FEATURE_ACCESS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION = EMF_FEATURE_ACCESS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Description Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DESCRIPTION_SPECIFICATION_FEATURE_COUNT = EMF_FEATURE_ACCESS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeaturesProviderImpl <em>Features Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.FeaturesProviderImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeaturesProvider()
   * @generated
   */
  int FEATURES_PROVIDER = 7;

  /**
   * The feature id for the '<em><b>Feature Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_PROVIDER__FEATURE_SPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Features Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_PROVIDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeatureSpecificationImpl <em>Feature Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.FeatureSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeatureSpecification()
   * @generated
   */
  int FEATURE_SPECIFICATION = 8;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SPECIFICATION__PARAMETER_TYPE = EMF_FEATURE_ACCESS__PARAMETER_TYPE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SPECIFICATION__FEATURES = EMF_FEATURE_ACCESS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SPECIFICATION_FEATURE_COUNT = EMF_FEATURE_ACCESS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlFactoryImpl <em>Form Feature Control Factory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlFactoryImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFormFeatureControlFactory()
   * @generated
   */
  int FORM_FEATURE_CONTROL_FACTORY = 9;

  /**
   * The feature id for the '<em><b>Control Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Form Feature Control Factory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_FACTORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlSpecificationImpl <em>Form Feature Control Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFormFeatureControlSpecification()
   * @generated
   */
  int FORM_FEATURE_CONTROL_SPECIFICATION = 10;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_SPECIFICATION__PARAMETER_TYPE = EMF_FEATURE_ACCESS__PARAMETER_TYPE;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_SPECIFICATION__FEATURE = EMF_FEATURE_ACCESS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_SPECIFICATION__EXPRESSION = EMF_FEATURE_ACCESS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_SPECIFICATION__TARGET = EMF_FEATURE_ACCESS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Form Feature Control Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_CONTROL_SPECIFICATION_FEATURE_COUNT = EMF_FEATURE_ACCESS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.ViewerContentProviderImpl <em>Viewer Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.ViewerContentProviderImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getViewerContentProvider()
   * @generated
   */
  int VIEWER_CONTENT_PROVIDER = 11;

  /**
   * The feature id for the '<em><b>Children Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWER_CONTENT_PROVIDER__CHILDREN_SPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Viewer Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWER_CONTENT_PROVIDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.ViewsSpecificationImpl <em>Views Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.ViewsSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getViewsSpecification()
   * @generated
   */
  int VIEWS_SPECIFICATION = 13;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS_SPECIFICATION__VIEWS = 0;

  /**
   * The number of structural features of the '<em>Views Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWS_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.rcpvision.emf.components.dsl.model.impl.ViewSpecificationImpl <em>View Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.rcpvision.emf.components.dsl.model.impl.ViewSpecificationImpl
   * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getViewSpecification()
   * @generated
   */
  int VIEW_SPECIFICATION = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SPECIFICATION__ID = 0;

  /**
   * The feature id for the '<em><b>View Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SPECIFICATION__VIEW_NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SPECIFICATION__TYPE = 2;

  /**
   * The number of structural features of the '<em>View Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SPECIFICATION_FEATURE_COUNT = 3;


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
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getPropertyDescriptionProvider <em>Property Description Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Description Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getPropertyDescriptionProvider()
   * @see #getModule()
   * @generated
   */
  EReference getModule_PropertyDescriptionProvider();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getFeaturesProvider <em>Features Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getFeaturesProvider()
   * @see #getModule()
   * @generated
   */
  EReference getModule_FeaturesProvider();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getFormFeatureControlFactory <em>Form Feature Control Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Form Feature Control Factory</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getFormFeatureControlFactory()
   * @see #getModule()
   * @generated
   */
  EReference getModule_FormFeatureControlFactory();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getViewerContentProvider <em>Viewer Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Viewer Content Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getViewerContentProvider()
   * @see #getModule()
   * @generated
   */
  EReference getModule_ViewerContentProvider();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.Module#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Views</em>'.
   * @see it.rcpvision.emf.components.dsl.model.Module#getViews()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Views();

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
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider <em>Property Description Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Description Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider
   * @generated
   */
  EClass getPropertyDescriptionProvider();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider#getLabelSpecifications <em>Label Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Label Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider#getLabelSpecifications()
   * @see #getPropertyDescriptionProvider()
   * @generated
   */
  EReference getPropertyDescriptionProvider_LabelSpecifications();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification <em>Property Description Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Description Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification
   * @generated
   */
  EClass getPropertyDescriptionSpecification();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification#getFeature()
   * @see #getPropertyDescriptionSpecification()
   * @generated
   */
  EReference getPropertyDescriptionSpecification_Feature();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification#getExpression()
   * @see #getPropertyDescriptionSpecification()
   * @generated
   */
  EReference getPropertyDescriptionSpecification_Expression();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.FeaturesProvider <em>Features Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Features Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeaturesProvider
   * @generated
   */
  EClass getFeaturesProvider();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.FeaturesProvider#getFeatureSpecifications <em>Feature Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeaturesProvider#getFeatureSpecifications()
   * @see #getFeaturesProvider()
   * @generated
   */
  EReference getFeaturesProvider_FeatureSpecifications();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification <em>Feature Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureSpecification
   * @generated
   */
  EClass getFeatureSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FeatureSpecification#getFeatures()
   * @see #getFeatureSpecification()
   * @generated
   */
  EReference getFeatureSpecification_Features();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory <em>Form Feature Control Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Feature Control Factory</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory
   * @generated
   */
  EClass getFormFeatureControlFactory();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory#getControlSpecifications <em>Control Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Control Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory#getControlSpecifications()
   * @see #getFormFeatureControlFactory()
   * @generated
   */
  EReference getFormFeatureControlFactory_ControlSpecifications();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification <em>Form Feature Control Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Feature Control Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification
   * @generated
   */
  EClass getFormFeatureControlSpecification();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getFeature()
   * @see #getFormFeatureControlSpecification()
   * @generated
   */
  EReference getFormFeatureControlSpecification_Feature();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getExpression()
   * @see #getFormFeatureControlSpecification()
   * @generated
   */
  EReference getFormFeatureControlSpecification_Expression();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification#getTarget()
   * @see #getFormFeatureControlSpecification()
   * @generated
   */
  EReference getFormFeatureControlSpecification_Target();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.ViewerContentProvider <em>Viewer Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viewer Content Provider</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewerContentProvider
   * @generated
   */
  EClass getViewerContentProvider();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.ViewerContentProvider#getChildrenSpecifications <em>Children Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children Specifications</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewerContentProvider#getChildrenSpecifications()
   * @see #getViewerContentProvider()
   * @generated
   */
  EReference getViewerContentProvider_ChildrenSpecifications();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.EmfFeatureAccess <em>Emf Feature Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emf Feature Access</em>'.
   * @see it.rcpvision.emf.components.dsl.model.EmfFeatureAccess
   * @generated
   */
  EClass getEmfFeatureAccess();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.EmfFeatureAccess#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see it.rcpvision.emf.components.dsl.model.EmfFeatureAccess#getParameterType()
   * @see #getEmfFeatureAccess()
   * @generated
   */
  EReference getEmfFeatureAccess_ParameterType();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.ViewsSpecification <em>Views Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Views Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewsSpecification
   * @generated
   */
  EClass getViewsSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link it.rcpvision.emf.components.dsl.model.ViewsSpecification#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewsSpecification#getViews()
   * @see #getViewsSpecification()
   * @generated
   */
  EReference getViewsSpecification_Views();

  /**
   * Returns the meta object for class '{@link it.rcpvision.emf.components.dsl.model.ViewSpecification <em>View Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Specification</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewSpecification
   * @generated
   */
  EClass getViewSpecification();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.dsl.model.ViewSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewSpecification#getId()
   * @see #getViewSpecification()
   * @generated
   */
  EAttribute getViewSpecification_Id();

  /**
   * Returns the meta object for the attribute '{@link it.rcpvision.emf.components.dsl.model.ViewSpecification#getViewName <em>View Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View Name</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewSpecification#getViewName()
   * @see #getViewSpecification()
   * @generated
   */
  EAttribute getViewSpecification_ViewName();

  /**
   * Returns the meta object for the containment reference '{@link it.rcpvision.emf.components.dsl.model.ViewSpecification#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see it.rcpvision.emf.components.dsl.model.ViewSpecification#getType()
   * @see #getViewSpecification()
   * @generated
   */
  EReference getViewSpecification_Type();

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
     * The meta object literal for the '<em><b>Property Description Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PROPERTY_DESCRIPTION_PROVIDER = eINSTANCE.getModule_PropertyDescriptionProvider();

    /**
     * The meta object literal for the '<em><b>Features Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FEATURES_PROVIDER = eINSTANCE.getModule_FeaturesProvider();

    /**
     * The meta object literal for the '<em><b>Form Feature Control Factory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FORM_FEATURE_CONTROL_FACTORY = eINSTANCE.getModule_FormFeatureControlFactory();

    /**
     * The meta object literal for the '<em><b>Viewer Content Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__VIEWER_CONTENT_PROVIDER = eINSTANCE.getModule_ViewerContentProvider();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__VIEWS = eINSTANCE.getModule_Views();

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
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionProviderImpl <em>Property Description Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionProviderImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getPropertyDescriptionProvider()
     * @generated
     */
    EClass PROPERTY_DESCRIPTION_PROVIDER = eINSTANCE.getPropertyDescriptionProvider();

    /**
     * The meta object literal for the '<em><b>Label Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DESCRIPTION_PROVIDER__LABEL_SPECIFICATIONS = eINSTANCE.getPropertyDescriptionProvider_LabelSpecifications();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl <em>Property Description Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getPropertyDescriptionSpecification()
     * @generated
     */
    EClass PROPERTY_DESCRIPTION_SPECIFICATION = eINSTANCE.getPropertyDescriptionSpecification();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE = eINSTANCE.getPropertyDescriptionSpecification_Feature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION = eINSTANCE.getPropertyDescriptionSpecification_Expression();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeaturesProviderImpl <em>Features Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.FeaturesProviderImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeaturesProvider()
     * @generated
     */
    EClass FEATURES_PROVIDER = eINSTANCE.getFeaturesProvider();

    /**
     * The meta object literal for the '<em><b>Feature Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURES_PROVIDER__FEATURE_SPECIFICATIONS = eINSTANCE.getFeaturesProvider_FeatureSpecifications();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.FeatureSpecificationImpl <em>Feature Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.FeatureSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFeatureSpecification()
     * @generated
     */
    EClass FEATURE_SPECIFICATION = eINSTANCE.getFeatureSpecification();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_SPECIFICATION__FEATURES = eINSTANCE.getFeatureSpecification_Features();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlFactoryImpl <em>Form Feature Control Factory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlFactoryImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFormFeatureControlFactory()
     * @generated
     */
    EClass FORM_FEATURE_CONTROL_FACTORY = eINSTANCE.getFormFeatureControlFactory();

    /**
     * The meta object literal for the '<em><b>Control Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS = eINSTANCE.getFormFeatureControlFactory_ControlSpecifications();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlSpecificationImpl <em>Form Feature Control Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getFormFeatureControlSpecification()
     * @generated
     */
    EClass FORM_FEATURE_CONTROL_SPECIFICATION = eINSTANCE.getFormFeatureControlSpecification();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FEATURE_CONTROL_SPECIFICATION__FEATURE = eINSTANCE.getFormFeatureControlSpecification_Feature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FEATURE_CONTROL_SPECIFICATION__EXPRESSION = eINSTANCE.getFormFeatureControlSpecification_Expression();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FEATURE_CONTROL_SPECIFICATION__TARGET = eINSTANCE.getFormFeatureControlSpecification_Target();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.ViewerContentProviderImpl <em>Viewer Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.ViewerContentProviderImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getViewerContentProvider()
     * @generated
     */
    EClass VIEWER_CONTENT_PROVIDER = eINSTANCE.getViewerContentProvider();

    /**
     * The meta object literal for the '<em><b>Children Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWER_CONTENT_PROVIDER__CHILDREN_SPECIFICATIONS = eINSTANCE.getViewerContentProvider_ChildrenSpecifications();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.EmfFeatureAccessImpl <em>Emf Feature Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.EmfFeatureAccessImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getEmfFeatureAccess()
     * @generated
     */
    EClass EMF_FEATURE_ACCESS = eINSTANCE.getEmfFeatureAccess();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMF_FEATURE_ACCESS__PARAMETER_TYPE = eINSTANCE.getEmfFeatureAccess_ParameterType();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.ViewsSpecificationImpl <em>Views Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.ViewsSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getViewsSpecification()
     * @generated
     */
    EClass VIEWS_SPECIFICATION = eINSTANCE.getViewsSpecification();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWS_SPECIFICATION__VIEWS = eINSTANCE.getViewsSpecification_Views();

    /**
     * The meta object literal for the '{@link it.rcpvision.emf.components.dsl.model.impl.ViewSpecificationImpl <em>View Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.rcpvision.emf.components.dsl.model.impl.ViewSpecificationImpl
     * @see it.rcpvision.emf.components.dsl.model.impl.ModelPackageImpl#getViewSpecification()
     * @generated
     */
    EClass VIEW_SPECIFICATION = eINSTANCE.getViewSpecification();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_SPECIFICATION__ID = eINSTANCE.getViewSpecification_Id();

    /**
     * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_SPECIFICATION__VIEW_NAME = eINSTANCE.getViewSpecification_ViewName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SPECIFICATION__TYPE = eINSTANCE.getViewSpecification_Type();

  }

} //ModelPackage
