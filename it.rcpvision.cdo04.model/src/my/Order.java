/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package my;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.Order#getDate <em>Date</em>}</li>
 *   <li>{@link my.Order#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link my.Order#getListOrderRow <em>List Order Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.MyPackage#getOrder()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Order extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see my.MyPackage#getOrder_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link my.Order#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Number</em>' attribute.
	 * @see #setOrderNumber(int)
	 * @see my.MyPackage#getOrder_OrderNumber()
	 * @model
	 * @generated
	 */
	int getOrderNumber();

	/**
	 * Sets the value of the '{@link my.Order#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number</em>' attribute.
	 * @see #getOrderNumber()
	 * @generated
	 */
	void setOrderNumber(int value);

	/**
	 * Returns the value of the '<em><b>List Order Row</b></em>' containment reference list.
	 * The list contents are of type {@link my.OrderRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Order Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Order Row</em>' containment reference list.
	 * @see my.MyPackage#getOrder_ListOrderRow()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderRow> getListOrderRow();

} // Order
