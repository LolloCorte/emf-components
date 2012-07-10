/**
 */
package it.rcpvision.emf.components.dsl.emfComponentsDsl.impl;

import it.rcpvision.emf.components.dsl.emfComponentsDsl.*;

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
public class EmfComponentsDslFactoryImpl extends EFactoryImpl implements EmfComponentsDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmfComponentsDslFactory init()
  {
    try
    {
      EmfComponentsDslFactory theEmfComponentsDslFactory = (EmfComponentsDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.rcpvision.it/emf/components/dsl/EmfComponentsDsl"); 
      if (theEmfComponentsDslFactory != null)
      {
        return theEmfComponentsDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EmfComponentsDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfComponentsDslFactoryImpl()
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
      case EmfComponentsDslPackage.MODEL: return createModel();
      case EmfComponentsDslPackage.GREETING: return createGreeting();
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
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfComponentsDslPackage getEmfComponentsDslPackage()
  {
    return (EmfComponentsDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EmfComponentsDslPackage getPackage()
  {
    return EmfComponentsDslPackage.eINSTANCE;
  }

} //EmfComponentsDslFactoryImpl
