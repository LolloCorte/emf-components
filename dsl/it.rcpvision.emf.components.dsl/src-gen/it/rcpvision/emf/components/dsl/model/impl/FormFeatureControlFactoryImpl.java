/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.FormFeatureControlFactory;
import it.rcpvision.emf.components.dsl.model.FormFeatureControlSpecification;
import it.rcpvision.emf.components.dsl.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Feature Control Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.FormFeatureControlFactoryImpl#getControlSpecifications <em>Control Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormFeatureControlFactoryImpl extends MinimalEObjectImpl.Container implements FormFeatureControlFactory
{
  /**
   * The cached value of the '{@link #getControlSpecifications() <em>Control Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlSpecifications()
   * @generated
   * @ordered
   */
  protected EList<FormFeatureControlSpecification> controlSpecifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormFeatureControlFactoryImpl()
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
    return ModelPackage.Literals.FORM_FEATURE_CONTROL_FACTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormFeatureControlSpecification> getControlSpecifications()
  {
    if (controlSpecifications == null)
    {
      controlSpecifications = new EObjectContainmentEList<FormFeatureControlSpecification>(FormFeatureControlSpecification.class, this, ModelPackage.FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS);
    }
    return controlSpecifications;
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
      case ModelPackage.FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS:
        return ((InternalEList<?>)getControlSpecifications()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS:
        return getControlSpecifications();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS:
        getControlSpecifications().clear();
        getControlSpecifications().addAll((Collection<? extends FormFeatureControlSpecification>)newValue);
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
      case ModelPackage.FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS:
        getControlSpecifications().clear();
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
      case ModelPackage.FORM_FEATURE_CONTROL_FACTORY__CONTROL_SPECIFICATIONS:
        return controlSpecifications != null && !controlSpecifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FormFeatureControlFactoryImpl
