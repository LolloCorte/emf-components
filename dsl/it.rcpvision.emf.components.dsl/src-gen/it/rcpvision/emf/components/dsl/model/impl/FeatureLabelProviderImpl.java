/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.FeatureLabelProvider;
import it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification;
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
 * An implementation of the model object '<em><b>Feature Label Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.FeatureLabelProviderImpl#getLabelSpecifications <em>Label Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureLabelProviderImpl extends MinimalEObjectImpl.Container implements FeatureLabelProvider
{
  /**
   * The cached value of the '{@link #getLabelSpecifications() <em>Label Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelSpecifications()
   * @generated
   * @ordered
   */
  protected EList<FeatureLabelSpecification> labelSpecifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureLabelProviderImpl()
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
    return ModelPackage.Literals.FEATURE_LABEL_PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureLabelSpecification> getLabelSpecifications()
  {
    if (labelSpecifications == null)
    {
      labelSpecifications = new EObjectContainmentEList<FeatureLabelSpecification>(FeatureLabelSpecification.class, this, ModelPackage.FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS);
    }
    return labelSpecifications;
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
      case ModelPackage.FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS:
        return ((InternalEList<?>)getLabelSpecifications()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS:
        return getLabelSpecifications();
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
      case ModelPackage.FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS:
        getLabelSpecifications().clear();
        getLabelSpecifications().addAll((Collection<? extends FeatureLabelSpecification>)newValue);
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
      case ModelPackage.FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS:
        getLabelSpecifications().clear();
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
      case ModelPackage.FEATURE_LABEL_PROVIDER__LABEL_SPECIFICATIONS:
        return labelSpecifications != null && !labelSpecifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureLabelProviderImpl
