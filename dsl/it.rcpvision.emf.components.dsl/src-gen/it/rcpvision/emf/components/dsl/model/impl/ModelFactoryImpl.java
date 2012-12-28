/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelFactory init()
  {
    try
    {
      ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.rcpvision.it/emf/components/dsl/EmfComponentsDsl"); 
      if (theModelFactory != null)
      {
        return theModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelPackage.MODEL: return createModel();
      case ModelPackage.IMPORT: return createImport();
      case ModelPackage.MODULE: return createModule();
      case ModelPackage.EXTENDS_CLAUSE: return createExtendsClause();
      case ModelPackage.LABEL_PROVIDER: return createLabelProvider();
      case ModelPackage.LABEL_SPECIFICATION: return createLabelSpecification();
      case ModelPackage.PROPERTY_DESCRIPTION_PROVIDER: return createPropertyDescriptionProvider();
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION: return createPropertyDescriptionSpecification();
      case ModelPackage.FEATURES_PROVIDER: return createFeaturesProvider();
      case ModelPackage.FEATURE_SPECIFICATION: return createFeatureSpecification();
      case ModelPackage.FORM_CONTROL_FACTORY: return createFormControlFactory();
      case ModelPackage.FORM_CONTROL_SPECIFICATION: return createFormControlSpecification();
      case ModelPackage.VIEWER_CONTENT_PROVIDER: return createViewerContentProvider();
      case ModelPackage.EMF_FEATURE_ACCESS: return createEmfFeatureAccess();
      case ModelPackage.WITH_EXTENDS_CLAUSE: return createWithExtendsClause();
      case ModelPackage.PART_SPECIFICATION: return createPartSpecification();
      case ModelPackage.VIEW_SPECIFICATION: return createViewSpecification();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsClause createExtendsClause()
  {
    ExtendsClauseImpl extendsClause = new ExtendsClauseImpl();
    return extendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelProvider createLabelProvider()
  {
    LabelProviderImpl labelProvider = new LabelProviderImpl();
    return labelProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelSpecification createLabelSpecification()
  {
    LabelSpecificationImpl labelSpecification = new LabelSpecificationImpl();
    return labelSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDescriptionProvider createPropertyDescriptionProvider()
  {
    PropertyDescriptionProviderImpl propertyDescriptionProvider = new PropertyDescriptionProviderImpl();
    return propertyDescriptionProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDescriptionSpecification createPropertyDescriptionSpecification()
  {
    PropertyDescriptionSpecificationImpl propertyDescriptionSpecification = new PropertyDescriptionSpecificationImpl();
    return propertyDescriptionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturesProvider createFeaturesProvider()
  {
    FeaturesProviderImpl featuresProvider = new FeaturesProviderImpl();
    return featuresProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureSpecification createFeatureSpecification()
  {
    FeatureSpecificationImpl featureSpecification = new FeatureSpecificationImpl();
    return featureSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormControlFactory createFormControlFactory()
  {
    FormControlFactoryImpl formControlFactory = new FormControlFactoryImpl();
    return formControlFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormControlSpecification createFormControlSpecification()
  {
    FormControlSpecificationImpl formControlSpecification = new FormControlSpecificationImpl();
    return formControlSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewerContentProvider createViewerContentProvider()
  {
    ViewerContentProviderImpl viewerContentProvider = new ViewerContentProviderImpl();
    return viewerContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfFeatureAccess createEmfFeatureAccess()
  {
    EmfFeatureAccessImpl emfFeatureAccess = new EmfFeatureAccessImpl();
    return emfFeatureAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithExtendsClause createWithExtendsClause()
  {
    WithExtendsClauseImpl withExtendsClause = new WithExtendsClauseImpl();
    return withExtendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartSpecification createPartSpecification()
  {
    PartSpecificationImpl partSpecification = new PartSpecificationImpl();
    return partSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewSpecification createViewSpecification()
  {
    ViewSpecificationImpl viewSpecification = new ViewSpecificationImpl();
    return viewSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPackage getModelPackage()
  {
    return (ModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelPackage getPackage()
  {
    return ModelPackage.eINSTANCE;
  }

} //ModelFactoryImpl
