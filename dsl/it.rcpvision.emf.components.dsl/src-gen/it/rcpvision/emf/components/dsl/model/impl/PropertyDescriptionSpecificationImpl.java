/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Description Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.PropertyDescriptionSpecificationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyDescriptionSpecificationImpl extends MinimalEObjectImpl.Container implements PropertyDescriptionSpecification
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
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected XExpression feature;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyDescriptionSpecificationImpl()
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
    return ModelPackage.Literals.PROPERTY_DESCRIPTION_SPECIFICATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE, oldParameterType, parameterType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE, oldParameterType, parameterType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeature(XExpression newFeature, NotificationChain msgs)
  {
    XExpression oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE, oldFeature, newFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(XExpression newFeature)
  {
    if (newFeature != feature)
    {
      NotificationChain msgs = null;
      if (feature != null)
        msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE, null, msgs);
      if (newFeature != null)
        msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE, null, msgs);
      msgs = basicSetFeature(newFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE, newFeature, newFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE:
        return basicSetFeature(null, msgs);
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE:
        if (resolve) return getParameterType();
        return basicGetParameterType();
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE:
        return getFeature();
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION:
        return getExpression();
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
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE:
        setParameterType((JvmType)newValue);
        return;
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE:
        setFeature((XExpression)newValue);
        return;
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION:
        setExpression((XExpression)newValue);
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
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE:
        setParameterType((JvmType)null);
        return;
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE:
        setFeature((XExpression)null);
        return;
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION:
        setExpression((XExpression)null);
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
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__PARAMETER_TYPE:
        return parameterType != null;
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__FEATURE:
        return feature != null;
      case ModelPackage.PROPERTY_DESCRIPTION_SPECIFICATION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyDescriptionSpecificationImpl
