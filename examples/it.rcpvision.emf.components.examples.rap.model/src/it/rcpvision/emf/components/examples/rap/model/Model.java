/**
 */
package it.rcpvision.emf.components.examples.rap.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.examples.rap.model.Model#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.rap.model.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.examples.rap.model.Model#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.examples.rap.model.ModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see it.rcpvision.emf.components.examples.rap.model.ModelPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.components.examples.rap.model.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link it.rcpvision.emf.components.examples.rap.model.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see it.rcpvision.emf.components.examples.rap.model.ModelPackage#getModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link it.rcpvision.emf.components.examples.rap.model.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see it.rcpvision.emf.components.examples.rap.model.ModelPackage#getModel_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Model
