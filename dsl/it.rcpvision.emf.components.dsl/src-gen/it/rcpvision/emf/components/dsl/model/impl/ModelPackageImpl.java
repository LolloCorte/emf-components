/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.EmfFeatureAccess;
import it.rcpvision.emf.components.dsl.model.FeatureSpecification;
import it.rcpvision.emf.components.dsl.model.FeaturesProvider;
import it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory;
import it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification;
import it.rcpvision.emf.components.dsl.model.Import;
import it.rcpvision.emf.components.dsl.model.LabelProvider;
import it.rcpvision.emf.components.dsl.model.LabelSpecification;
import it.rcpvision.emf.components.dsl.model.Model;
import it.rcpvision.emf.components.dsl.model.ModelFactory;
import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification;
import it.rcpvision.emf.components.dsl.model.ViewSpecification;
import it.rcpvision.emf.components.dsl.model.ViewerContentProvider;
import it.rcpvision.emf.components.dsl.model.ViewsSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDescriptionProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDescriptionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featuresProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formFeatureControlFactoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formFeatureControlSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewerContentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emfFeatureAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewsSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewSpecificationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModelPackageImpl()
  {
    super(eNS_URI, ModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ModelPackage init()
  {
    if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

    // Obtain or create and register package
    ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theModelPackage.createPackageContents();

    // Initialize created meta-data
    theModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
    return theModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Imports()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Module()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_LabelProvider()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_PropertyDescriptionProvider()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_FeaturesProvider()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_FormFeatureControlFactory()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_ViewerContentProvider()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Views()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelProvider()
  {
    return labelProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProvider_LabelSpecifications()
  {
    return (EReference)labelProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProvider_ImageSpecifications()
  {
    return (EReference)labelProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelSpecification()
  {
    return labelSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelSpecification_ParameterType()
  {
    return (EReference)labelSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelSpecification_Name()
  {
    return (EAttribute)labelSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelSpecification_Expression()
  {
    return (EReference)labelSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDescriptionProvider()
  {
    return propertyDescriptionProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDescriptionProvider_LabelSpecifications()
  {
    return (EReference)propertyDescriptionProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDescriptionSpecification()
  {
    return propertyDescriptionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDescriptionSpecification_Feature()
  {
    return (EReference)propertyDescriptionSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDescriptionSpecification_Expression()
  {
    return (EReference)propertyDescriptionSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeaturesProvider()
  {
    return featuresProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeaturesProvider_FeatureSpecifications()
  {
    return (EReference)featuresProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureSpecification()
  {
    return featureSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureSpecification_Features()
  {
    return (EReference)featureSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormFeatureControlFactory()
  {
    return formFeatureControlFactoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFeatureControlFactory_ControlSpecifications()
  {
    return (EReference)formFeatureControlFactoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormFeatureControlSpecification()
  {
    return formFeatureControlSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFeatureControlSpecification_Feature()
  {
    return (EReference)formFeatureControlSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFeatureControlSpecification_Expression()
  {
    return (EReference)formFeatureControlSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFeatureControlSpecification_Target()
  {
    return (EReference)formFeatureControlSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewerContentProvider()
  {
    return viewerContentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewerContentProvider_ChildrenSpecifications()
  {
    return (EReference)viewerContentProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmfFeatureAccess()
  {
    return emfFeatureAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmfFeatureAccess_ParameterType()
  {
    return (EReference)emfFeatureAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewsSpecification()
  {
    return viewsSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewsSpecification_Views()
  {
    return (EReference)viewsSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewSpecification()
  {
    return viewSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewSpecification_Type()
  {
    return (EReference)viewSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactory getModelFactory()
  {
    return (ModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__IMPORTS);
    createEReference(modelEClass, MODEL__MODULE);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__LABEL_PROVIDER);
    createEReference(moduleEClass, MODULE__PROPERTY_DESCRIPTION_PROVIDER);
    createEReference(moduleEClass, MODULE__FEATURES_PROVIDER);
    createEReference(moduleEClass, MODULE__FORM_FEATURE_CONTROL_FACTORY);
    createEReference(moduleEClass, MODULE__VIEWER_CONTENT_PROVIDER);
    createEReference(moduleEClass, MODULE__VIEWS);

    labelProviderEClass = createEClass(LABEL_PROVIDER);
    createEReference(labelProviderEClass, LABEL_PROVIDER__LABEL_SPECIFICATIONS);
    createEReference(labelProviderEClass, LABEL_PROVIDER__IMAGE_SPECIFICATIONS);

    labelSpecificationEClass = createEClass(LABEL_SPECIFICATION);
    createEReference(labelSpecificationEClass, LABEL_SPECIFICATION__PARAMETER_TYPE);
    createEAttribute(labelSpecificationEClass, LABEL_SPECIFICATION__NAME);
    createEReference(labelSpecificationEClass, LABEL_SPECIFICATION__EXPRESSION);

    propertyDescriptionProviderEClass = createEClass(PROPERTY_DESCRIPTION_PROVIDER);
    createEReference(propertyDescriptionProviderEClass, PROPERTY_DESCRIPTION_PROVIDER__LABEL_SPECIFICATIONS);

    propertyDescriptionSpecificationEClass = createEClass(PROPERTY_DESCRIPTION_SPECIFICATION);
    createEReference(propertyDescriptionSpecificationEClass, PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE);
    createEReference(propertyDescriptionSpecificationEClass, PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION);

    featuresProviderEClass = createEClass(FEATURES_PROVIDER);
    createEReference(featuresProviderEClass, FEATURES_PROVIDER__FEATURE_SPECIFICATIONS);

    featureSpecificationEClass = createEClass(FEATURE_SPECIFICATION);
    createEReference(featureSpecificationEClass, FEATURE_SPECIFICATION__FEATURES);

    formFeatureControlFactoryEClass = createEClass(FORM_FEATURE_CONTROL_FACTORY);
    createEReference(formFeatureControlFactoryEClass, FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS);

    formFeatureControlSpecificationEClass = createEClass(FORM_FEATURE_CONTROL_SPECIFICATION);
    createEReference(formFeatureControlSpecificationEClass, FORM_FEATURE_CONTROL_SPECIFICATION__FEATURE);
    createEReference(formFeatureControlSpecificationEClass, FORM_FEATURE_CONTROL_SPECIFICATION__EXPRESSION);
    createEReference(formFeatureControlSpecificationEClass, FORM_FEATURE_CONTROL_SPECIFICATION__TARGET);

    viewerContentProviderEClass = createEClass(VIEWER_CONTENT_PROVIDER);
    createEReference(viewerContentProviderEClass, VIEWER_CONTENT_PROVIDER__CHILDREN_SPECIFICATIONS);

    emfFeatureAccessEClass = createEClass(EMF_FEATURE_ACCESS);
    createEReference(emfFeatureAccessEClass, EMF_FEATURE_ACCESS__PARAMETER_TYPE);

    viewsSpecificationEClass = createEClass(VIEWS_SPECIFICATION);
    createEReference(viewsSpecificationEClass, VIEWS_SPECIFICATION__VIEWS);

    viewSpecificationEClass = createEClass(VIEW_SPECIFICATION);
    createEReference(viewSpecificationEClass, VIEW_SPECIFICATION__TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    propertyDescriptionSpecificationEClass.getESuperTypes().add(this.getEmfFeatureAccess());
    featureSpecificationEClass.getESuperTypes().add(this.getEmfFeatureAccess());
    formFeatureControlSpecificationEClass.getESuperTypes().add(this.getEmfFeatureAccess());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Module(), this.getModule(), null, "module", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_LabelProvider(), this.getLabelProvider(), null, "labelProvider", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_PropertyDescriptionProvider(), this.getPropertyDescriptionProvider(), null, "propertyDescriptionProvider", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_FeaturesProvider(), this.getFeaturesProvider(), null, "featuresProvider", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_FormFeatureControlFactory(), this.getFormFeatureControlFactory(), null, "formFeatureControlFactory", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_ViewerContentProvider(), this.getViewerContentProvider(), null, "viewerContentProvider", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Views(), this.getViewsSpecification(), null, "views", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelProviderEClass, LabelProvider.class, "LabelProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabelProvider_LabelSpecifications(), this.getLabelSpecification(), null, "labelSpecifications", null, 0, -1, LabelProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLabelProvider_ImageSpecifications(), this.getLabelSpecification(), null, "imageSpecifications", null, 0, -1, LabelProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelSpecificationEClass, LabelSpecification.class, "LabelSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabelSpecification_ParameterType(), theTypesPackage.getJvmTypeReference(), null, "parameterType", null, 0, 1, LabelSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabelSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, LabelSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLabelSpecification_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, LabelSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDescriptionProviderEClass, PropertyDescriptionProvider.class, "PropertyDescriptionProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDescriptionProvider_LabelSpecifications(), this.getPropertyDescriptionSpecification(), null, "labelSpecifications", null, 0, -1, PropertyDescriptionProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDescriptionSpecificationEClass, PropertyDescriptionSpecification.class, "PropertyDescriptionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDescriptionSpecification_Feature(), theXbasePackage.getXExpression(), null, "feature", null, 0, 1, PropertyDescriptionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDescriptionSpecification_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, PropertyDescriptionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featuresProviderEClass, FeaturesProvider.class, "FeaturesProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeaturesProvider_FeatureSpecifications(), this.getFeatureSpecification(), null, "featureSpecifications", null, 0, -1, FeaturesProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureSpecificationEClass, FeatureSpecification.class, "FeatureSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureSpecification_Features(), theXbasePackage.getXExpression(), null, "features", null, 0, -1, FeatureSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formFeatureControlFactoryEClass, FormFeatureControlFactory.class, "FormFeatureControlFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormFeatureControlFactory_ControlSpecifications(), this.getFormFeatureControlSpecification(), null, "controlSpecifications", null, 0, -1, FormFeatureControlFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formFeatureControlSpecificationEClass, FormFeatureControlSpecification.class, "FormFeatureControlSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormFeatureControlSpecification_Feature(), theXbasePackage.getXExpression(), null, "feature", null, 0, 1, FormFeatureControlSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormFeatureControlSpecification_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, FormFeatureControlSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormFeatureControlSpecification_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, FormFeatureControlSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewerContentProviderEClass, ViewerContentProvider.class, "ViewerContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewerContentProvider_ChildrenSpecifications(), this.getLabelSpecification(), null, "childrenSpecifications", null, 0, -1, ViewerContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emfFeatureAccessEClass, EmfFeatureAccess.class, "EmfFeatureAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmfFeatureAccess_ParameterType(), theTypesPackage.getJvmTypeReference(), null, "parameterType", null, 0, 1, EmfFeatureAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewsSpecificationEClass, ViewsSpecification.class, "ViewsSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewsSpecification_Views(), this.getViewSpecification(), null, "views", null, 0, -1, ViewsSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewSpecificationEClass, ViewSpecification.class, "ViewSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewSpecification_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, ViewSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ModelPackageImpl
