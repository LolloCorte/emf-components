/**
 * <copyright>
 * </copyright>
 *
 */
package it.rcpvision.emf.components.examples.fowlerdsl.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.examples.fowlerdsl.statemachine.Command#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.fowlerdsl.statemachine.Command#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.examples.fowlerdsl.statemachine.StatemachinePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.rcpvision.emf.components.examples.fowlerdsl.statemachine.StatemachinePackage#getCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.examples.fowlerdsl.statemachine.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see it.rcpvision.emf.components.examples.fowlerdsl.statemachine.StatemachinePackage#getCommand_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link it.rcpvision.emf.components.examples.fowlerdsl.statemachine.Command#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // Command
