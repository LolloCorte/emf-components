/**
 */
package it.rcpvision.emf.components.dsl.model.util;

import it.rcpvision.emf.components.dsl.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelSwitch<Adapter> modelSwitch =
    new ModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseLabelProvider(LabelProvider object)
      {
        return createLabelProviderAdapter();
      }
      @Override
      public Adapter caseLabelSpecification(LabelSpecification object)
      {
        return createLabelSpecificationAdapter();
      }
      @Override
      public Adapter casePropertyDescriptionProvider(PropertyDescriptionProvider object)
      {
        return createPropertyDescriptionProviderAdapter();
      }
      @Override
      public Adapter casePropertyDescriptionSpecification(PropertyDescriptionSpecification object)
      {
        return createPropertyDescriptionSpecificationAdapter();
      }
      @Override
      public Adapter caseFeaturesProvider(FeaturesProvider object)
      {
        return createFeaturesProviderAdapter();
      }
      @Override
      public Adapter caseFeatureSpecification(FeatureSpecification object)
      {
        return createFeatureSpecificationAdapter();
      }
      @Override
      public Adapter caseFormFeatureControlFactory(FormFeatureControlFactory object)
      {
        return createFormFeatureControlFactoryAdapter();
      }
      @Override
      public Adapter caseFormFeatureControlSpecification(FormFeatureControlSpecification object)
      {
        return createFormFeatureControlSpecificationAdapter();
      }
      @Override
      public Adapter caseViewerContentProvider(ViewerContentProvider object)
      {
        return createViewerContentProviderAdapter();
      }
      @Override
      public Adapter caseEmfFeatureAccess(EmfFeatureAccess object)
      {
        return createEmfFeatureAccessAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.LabelProvider <em>Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.LabelProvider
   * @generated
   */
  public Adapter createLabelProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.LabelSpecification <em>Label Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.LabelSpecification
   * @generated
   */
  public Adapter createLabelSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider <em>Property Description Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider
   * @generated
   */
  public Adapter createPropertyDescriptionProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification <em>Property Description Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification
   * @generated
   */
  public Adapter createPropertyDescriptionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FeaturesProvider <em>Features Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FeaturesProvider
   * @generated
   */
  public Adapter createFeaturesProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FeatureSpecification <em>Feature Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FeatureSpecification
   * @generated
   */
  public Adapter createFeatureSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory <em>Form Feature Control Factory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory
   * @generated
   */
  public Adapter createFormFeatureControlFactoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification <em>Form Feature Control Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification
   * @generated
   */
  public Adapter createFormFeatureControlSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.ViewerContentProvider <em>Viewer Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.ViewerContentProvider
   * @generated
   */
  public Adapter createViewerContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.EmfFeatureAccess <em>Emf Feature Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.EmfFeatureAccess
   * @generated
   */
  public Adapter createEmfFeatureAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ModelAdapterFactory
