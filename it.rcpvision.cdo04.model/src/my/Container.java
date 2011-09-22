/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package my;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.Container#getListCustomer <em>List Customer</em>}</li>
 *   <li>{@link my.Container#getListItem <em>List Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.MyPackage#getContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Container extends CDOObject {
	/**
	 * Returns the value of the '<em><b>List Customer</b></em>' containment reference list.
	 * The list contents are of type {@link my.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Customer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Customer</em>' containment reference list.
	 * @see my.MyPackage#getContainer_ListCustomer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getListCustomer();

	/**
	 * Returns the value of the '<em><b>List Item</b></em>' containment reference list.
	 * The list contents are of type {@link my.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Item</em>' containment reference list.
	 * @see my.MyPackage#getContainer_ListItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getListItem();

} // Container
