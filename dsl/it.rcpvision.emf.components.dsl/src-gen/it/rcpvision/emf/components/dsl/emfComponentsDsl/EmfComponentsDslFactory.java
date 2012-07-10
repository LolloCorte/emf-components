/**
 */
package it.rcpvision.emf.components.dsl.emfComponentsDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.rcpvision.emf.components.dsl.emfComponentsDsl.EmfComponentsDslPackage
 * @generated
 */
public interface EmfComponentsDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmfComponentsDslFactory eINSTANCE = it.rcpvision.emf.components.dsl.emfComponentsDsl.impl.EmfComponentsDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Greeting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greeting</em>'.
   * @generated
   */
  Greeting createGreeting();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmfComponentsDslPackage getEmfComponentsDslPackage();

} //EmfComponentsDslFactory
