/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package my;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.Address#getVia <em>Via</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.MyPackage#getAddress()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Address extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Via</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Via</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via</em>' attribute.
	 * @see #setVia(String)
	 * @see my.MyPackage#getAddress_Via()
	 * @model
	 * @generated
	 */
	String getVia();

	/**
	 * Sets the value of the '{@link my.Address#getVia <em>Via</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via</em>' attribute.
	 * @see #getVia()
	 * @generated
	 */
	void setVia(String value);

} // Address
