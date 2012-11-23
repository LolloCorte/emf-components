/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.ViewSpecification;
import it.rcpvision.emf.components.dsl.model.ViewsSpecification;

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
 * An implementation of the model object '<em><b>Views Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ViewsSpecificationImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewsSpecificationImpl extends MinimalEObjectImpl.Container implements ViewsSpecification
{
  /**
   * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
  protected EList<ViewSpecification> views;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewsSpecificationImpl()
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
    return ModelPackage.Literals.VIEWS_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewSpecification> getViews()
  {
    if (views == null)
    {
      views = new EObjectContainmentEList<ViewSpecification>(ViewSpecification.class, this, ModelPackage.VIEWS_SPECIFICATION__VIEWS);
    }
    return views;
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
      case ModelPackage.VIEWS_SPECIFICATION__VIEWS:
        return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.VIEWS_SPECIFICATION__VIEWS:
        return getViews();
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
      case ModelPackage.VIEWS_SPECIFICATION__VIEWS:
        getViews().clear();
        getViews().addAll((Collection<? extends ViewSpecification>)newValue);
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
      case ModelPackage.VIEWS_SPECIFICATION__VIEWS:
        getViews().clear();
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
      case ModelPackage.VIEWS_SPECIFICATION__VIEWS:
        return views != null && !views.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ViewsSpecificationImpl
