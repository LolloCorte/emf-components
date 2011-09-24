/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package my.impl;

import my.Container;
import my.Customer;
import my.Item;
import my.MyPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link my.impl.ContainerImpl#getListCustomer <em>List Customer</em>}</li>
 *   <li>{@link my.impl.ContainerImpl#getListItem <em>List Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends CDOObjectImpl implements Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyPackage.Literals.CONTAINER;
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
	@SuppressWarnings("unchecked")
	public EList<Customer> getListCustomer() {
		return (EList<Customer>)eGet(MyPackage.Literals.CONTAINER__LIST_CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Item> getListItem() {
		return (EList<Item>)eGet(MyPackage.Literals.CONTAINER__LIST_ITEM, true);
	}

} //ContainerImpl
