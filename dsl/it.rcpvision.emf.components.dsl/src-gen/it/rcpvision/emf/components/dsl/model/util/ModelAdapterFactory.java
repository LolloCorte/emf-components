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
      public Adapter caseFeatureLabelProvider(FeatureLabelProvider object)
      {
        return createFeatureLabelProviderAdapter();
      }
      @Override
      public Adapter caseFeatureLabelSpecification(FeatureLabelSpecification object)
      {
        return createFeatureLabelSpecificationAdapter();
      }
      @Override
      public Adapter caseFeatureProvider(FeatureProvider object)
      {
        return createFeatureProviderAdapter();
      }
      @Override
      public Adapter caseFeatureSpecification(FeatureSpecification object)
      {
        return createFeatureSpecificationAdapter();
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
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelProvider <em>Feature Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelProvider
   * @generated
   */
  public Adapter createFeatureLabelProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification <em>Feature Label Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification
   * @generated
   */
  public Adapter createFeatureLabelSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.rcpvision.emf.components.dsl.model.FeatureProvider <em>Feature Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.rcpvision.emf.components.dsl.model.FeatureProvider
   * @generated
   */
  public Adapter createFeatureProviderAdapter()
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
