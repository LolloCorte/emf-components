/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.FeatureProvider;
import it.rcpvision.emf.components.dsl.model.LabelProvider;
import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getLabelProvider <em>Label Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getPropertyDescriptionProvider <em>Property Description Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getFeatureProvider <em>Feature Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabelProvider() <em>Label Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelProvider()
   * @generated
   * @ordered
   */
  protected LabelProvider labelProvider;

  /**
   * The cached value of the '{@link #getPropertyDescriptionProvider() <em>Property Description Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyDescriptionProvider()
   * @generated
   * @ordered
   */
  protected PropertyDescriptionProvider propertyDescriptionProvider;

  /**
   * The cached value of the '{@link #getFeatureProvider() <em>Feature Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureProvider()
   * @generated
   * @ordered
   */
  protected FeatureProvider featureProvider;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return ModelPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelProvider getLabelProvider()
  {
    return labelProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabelProvider(LabelProvider newLabelProvider, NotificationChain msgs)
  {
    LabelProvider oldLabelProvider = labelProvider;
    labelProvider = newLabelProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__LABEL_PROVIDER, oldLabelProvider, newLabelProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelProvider(LabelProvider newLabelProvider)
  {
    if (newLabelProvider != labelProvider)
    {
      NotificationChain msgs = null;
      if (labelProvider != null)
        msgs = ((InternalEObject)labelProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__LABEL_PROVIDER, null, msgs);
      if (newLabelProvider != null)
        msgs = ((InternalEObject)newLabelProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__LABEL_PROVIDER, null, msgs);
      msgs = basicSetLabelProvider(newLabelProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__LABEL_PROVIDER, newLabelProvider, newLabelProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDescriptionProvider getPropertyDescriptionProvider()
  {
    return propertyDescriptionProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyDescriptionProvider(PropertyDescriptionProvider newPropertyDescriptionProvider, NotificationChain msgs)
  {
    PropertyDescriptionProvider oldPropertyDescriptionProvider = propertyDescriptionProvider;
    propertyDescriptionProvider = newPropertyDescriptionProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER, oldPropertyDescriptionProvider, newPropertyDescriptionProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyDescriptionProvider(PropertyDescriptionProvider newPropertyDescriptionProvider)
  {
    if (newPropertyDescriptionProvider != propertyDescriptionProvider)
    {
      NotificationChain msgs = null;
      if (propertyDescriptionProvider != null)
        msgs = ((InternalEObject)propertyDescriptionProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER, null, msgs);
      if (newPropertyDescriptionProvider != null)
        msgs = ((InternalEObject)newPropertyDescriptionProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER, null, msgs);
      msgs = basicSetPropertyDescriptionProvider(newPropertyDescriptionProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER, newPropertyDescriptionProvider, newPropertyDescriptionProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureProvider getFeatureProvider()
  {
    return featureProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureProvider(FeatureProvider newFeatureProvider, NotificationChain msgs)
  {
    FeatureProvider oldFeatureProvider = featureProvider;
    featureProvider = newFeatureProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__FEATURE_PROVIDER, oldFeatureProvider, newFeatureProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureProvider(FeatureProvider newFeatureProvider)
  {
    if (newFeatureProvider != featureProvider)
    {
      NotificationChain msgs = null;
      if (featureProvider != null)
        msgs = ((InternalEObject)featureProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__FEATURE_PROVIDER, null, msgs);
      if (newFeatureProvider != null)
        msgs = ((InternalEObject)newFeatureProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__FEATURE_PROVIDER, null, msgs);
      msgs = basicSetFeatureProvider(newFeatureProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__FEATURE_PROVIDER, newFeatureProvider, newFeatureProvider));
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
      case ModelPackage.MODULE__LABEL_PROVIDER:
        return basicSetLabelProvider(null, msgs);
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        return basicSetPropertyDescriptionProvider(null, msgs);
      case ModelPackage.MODULE__FEATURE_PROVIDER:
        return basicSetFeatureProvider(null, msgs);
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
      case ModelPackage.MODULE__NAME:
        return getName();
      case ModelPackage.MODULE__LABEL_PROVIDER:
        return getLabelProvider();
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        return getPropertyDescriptionProvider();
      case ModelPackage.MODULE__FEATURE_PROVIDER:
        return getFeatureProvider();
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
      case ModelPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.MODULE__LABEL_PROVIDER:
        setLabelProvider((LabelProvider)newValue);
        return;
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        setPropertyDescriptionProvider((PropertyDescriptionProvider)newValue);
        return;
      case ModelPackage.MODULE__FEATURE_PROVIDER:
        setFeatureProvider((FeatureProvider)newValue);
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
      case ModelPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.MODULE__LABEL_PROVIDER:
        setLabelProvider((LabelProvider)null);
        return;
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        setPropertyDescriptionProvider((PropertyDescriptionProvider)null);
        return;
      case ModelPackage.MODULE__FEATURE_PROVIDER:
        setFeatureProvider((FeatureProvider)null);
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
      case ModelPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.MODULE__LABEL_PROVIDER:
        return labelProvider != null;
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        return propertyDescriptionProvider != null;
      case ModelPackage.MODULE__FEATURE_PROVIDER:
        return featureProvider != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
