/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.EmfFeatureAccess;
import it.rcpvision.emf.components.dsl.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Feature Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.EmfFeatureAccessImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmfFeatureAccessImpl extends MinimalEObjectImpl.Container implements EmfFeatureAccess
{
  /**
   * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected JvmType parameterType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmfFeatureAccessImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.EMF_FEATURE_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getParameterType()
  {
    if (parameterType != null && parameterType.eIsProxy())
    {
      InternalEObject oldParameterType = (InternalEObject)parameterType;
      parameterType = (JvmType)eResolveProxy(oldParameterType);
      if (parameterType != oldParameterType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMF_FEATURE_ACCESS__PARAMETER_TYPE, oldParameterType, parameterType));
      }
    }
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetParameterType()
  {
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterType(JvmType newParameterType)
  {
    JvmType oldParameterType = parameterType;
    parameterType = newParameterType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMF_FEATURE_ACCESS__PARAMETER_TYPE, oldParameterType, parameterType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.EMF_FEATURE_ACCESS__PARAMETER_TYPE:
        if (resolve) return getParameterType();
        return basicGetParameterType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.EMF_FEATURE_ACCESS__PARAMETER_TYPE:
        setParameterType((JvmType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.EMF_FEATURE_ACCESS__PARAMETER_TYPE:
        setParameterType((JvmType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.EMF_FEATURE_ACCESS__PARAMETER_TYPE:
        return parameterType != null;
    }
    return super.eIsSet(featureID);
  }

} //EmfFeatureAccessImpl
