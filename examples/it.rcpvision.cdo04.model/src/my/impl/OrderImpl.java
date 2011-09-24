/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package my.impl;

import java.util.Date;

import my.MyPackage;
import my.Order;
import my.OrderRow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link my.impl.OrderImpl#getDate <em>Date</em>}</li>
 *   <li>{@link my.impl.OrderImpl#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link my.impl.OrderImpl#getListOrderRow <em>List Order Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends CDOObjectImpl implements Order {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eGet(MyPackage.Literals.ORDER__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eSet(MyPackage.Literals.ORDER__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrderNumber() {
		return (Integer)eGet(MyPackage.Literals.ORDER__ORDER_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderNumber(int newOrderNumber) {
		eSet(MyPackage.Literals.ORDER__ORDER_NUMBER, newOrderNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrderRow> getListOrderRow() {
		return (EList<OrderRow>)eGet(MyPackage.Literals.ORDER__LIST_ORDER_ROW, true);
	}

} //OrderImpl
