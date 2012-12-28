/**
 */
package it.rcpvision.emf.components.dsl.model.impl;

import it.rcpvision.emf.components.dsl.model.ExtendsClause;
import it.rcpvision.emf.components.dsl.model.FeaturesProvider;
import it.rcpvision.emf.components.dsl.model.FormControlFactory;
import it.rcpvision.emf.components.dsl.model.LabelProvider;
import it.rcpvision.emf.components.dsl.model.ModelPackage;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.model.PartSpecification;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider;
import it.rcpvision.emf.components.dsl.model.ViewerContentProvider;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getExtendsClause <em>Extends Clause</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getLabelProvider <em>Label Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getPropertyDescriptionProvider <em>Property Description Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getFeaturesProvider <em>Features Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getFormControlFactory <em>Form Control Factory</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getViewerContentProvider <em>Viewer Content Provider</em>}</li>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.impl.ModuleImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends WithExtendsClauseImpl implements Module
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
   * The cached value of the '{@link #getExtendsClause() <em>Extends Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsClause()
   * @generated
   * @ordered
   */
  protected ExtendsClause extendsClause;

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
   * The cached value of the '{@link #getFeaturesProvider() <em>Features Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeaturesProvider()
   * @generated
   * @ordered
   */
  protected FeaturesProvider featuresProvider;

  /**
   * The cached value of the '{@link #getFormControlFactory() <em>Form Control Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormControlFactory()
   * @generated
   * @ordered
   */
  protected FormControlFactory formControlFactory;

  /**
   * The cached value of the '{@link #getViewerContentProvider() <em>Viewer Content Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewerContentProvider()
   * @generated
   * @ordered
   */
  protected ViewerContentProvider viewerContentProvider;

  /**
   * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParts()
   * @generated
   * @ordered
   */
  protected EList<PartSpecification> parts;

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
  public ExtendsClause getExtendsClause()
  {
    return extendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtendsClause(ExtendsClause newExtendsClause, NotificationChain msgs)
  {
    ExtendsClause oldExtendsClause = extendsClause;
    extendsClause = newExtendsClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__EXTENDS_CLAUSE, oldExtendsClause, newExtendsClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendsClause(ExtendsClause newExtendsClause)
  {
    if (newExtendsClause != extendsClause)
    {
      NotificationChain msgs = null;
      if (extendsClause != null)
        msgs = ((InternalEObject)extendsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__EXTENDS_CLAUSE, null, msgs);
      if (newExtendsClause != null)
        msgs = ((InternalEObject)newExtendsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__EXTENDS_CLAUSE, null, msgs);
      msgs = basicSetExtendsClause(newExtendsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__EXTENDS_CLAUSE, newExtendsClause, newExtendsClause));
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
  public FeaturesProvider getFeaturesProvider()
  {
    return featuresProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeaturesProvider(FeaturesProvider newFeaturesProvider, NotificationChain msgs)
  {
    FeaturesProvider oldFeaturesProvider = featuresProvider;
    featuresProvider = newFeaturesProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__FEATURES_PROVIDER, oldFeaturesProvider, newFeaturesProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeaturesProvider(FeaturesProvider newFeaturesProvider)
  {
    if (newFeaturesProvider != featuresProvider)
    {
      NotificationChain msgs = null;
      if (featuresProvider != null)
        msgs = ((InternalEObject)featuresProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__FEATURES_PROVIDER, null, msgs);
      if (newFeaturesProvider != null)
        msgs = ((InternalEObject)newFeaturesProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__FEATURES_PROVIDER, null, msgs);
      msgs = basicSetFeaturesProvider(newFeaturesProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__FEATURES_PROVIDER, newFeaturesProvider, newFeaturesProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormControlFactory getFormControlFactory()
  {
    return formControlFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormControlFactory(FormControlFactory newFormControlFactory, NotificationChain msgs)
  {
    FormControlFactory oldFormControlFactory = formControlFactory;
    formControlFactory = newFormControlFactory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__FORM_CONTROL_FACTORY, oldFormControlFactory, newFormControlFactory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormControlFactory(FormControlFactory newFormControlFactory)
  {
    if (newFormControlFactory != formControlFactory)
    {
      NotificationChain msgs = null;
      if (formControlFactory != null)
        msgs = ((InternalEObject)formControlFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__FORM_CONTROL_FACTORY, null, msgs);
      if (newFormControlFactory != null)
        msgs = ((InternalEObject)newFormControlFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__FORM_CONTROL_FACTORY, null, msgs);
      msgs = basicSetFormControlFactory(newFormControlFactory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__FORM_CONTROL_FACTORY, newFormControlFactory, newFormControlFactory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewerContentProvider getViewerContentProvider()
  {
    return viewerContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetViewerContentProvider(ViewerContentProvider newViewerContentProvider, NotificationChain msgs)
  {
    ViewerContentProvider oldViewerContentProvider = viewerContentProvider;
    viewerContentProvider = newViewerContentProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER, oldViewerContentProvider, newViewerContentProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewerContentProvider(ViewerContentProvider newViewerContentProvider)
  {
    if (newViewerContentProvider != viewerContentProvider)
    {
      NotificationChain msgs = null;
      if (viewerContentProvider != null)
        msgs = ((InternalEObject)viewerContentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER, null, msgs);
      if (newViewerContentProvider != null)
        msgs = ((InternalEObject)newViewerContentProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER, null, msgs);
      msgs = basicSetViewerContentProvider(newViewerContentProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER, newViewerContentProvider, newViewerContentProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartSpecification> getParts()
  {
    if (parts == null)
    {
      parts = new EObjectContainmentEList<PartSpecification>(PartSpecification.class, this, ModelPackage.MODULE__PARTS);
    }
    return parts;
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
      case ModelPackage.MODULE__EXTENDS_CLAUSE:
        return basicSetExtendsClause(null, msgs);
      case ModelPackage.MODULE__LABEL_PROVIDER:
        return basicSetLabelProvider(null, msgs);
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        return basicSetPropertyDescriptionProvider(null, msgs);
      case ModelPackage.MODULE__FEATURES_PROVIDER:
        return basicSetFeaturesProvider(null, msgs);
      case ModelPackage.MODULE__FORM_CONTROL_FACTORY:
        return basicSetFormControlFactory(null, msgs);
      case ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER:
        return basicSetViewerContentProvider(null, msgs);
      case ModelPackage.MODULE__PARTS:
        return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.MODULE__EXTENDS_CLAUSE:
        return getExtendsClause();
      case ModelPackage.MODULE__LABEL_PROVIDER:
        return getLabelProvider();
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        return getPropertyDescriptionProvider();
      case ModelPackage.MODULE__FEATURES_PROVIDER:
        return getFeaturesProvider();
      case ModelPackage.MODULE__FORM_CONTROL_FACTORY:
        return getFormControlFactory();
      case ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER:
        return getViewerContentProvider();
      case ModelPackage.MODULE__PARTS:
        return getParts();
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
      case ModelPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.MODULE__EXTENDS_CLAUSE:
        setExtendsClause((ExtendsClause)newValue);
        return;
      case ModelPackage.MODULE__LABEL_PROVIDER:
        setLabelProvider((LabelProvider)newValue);
        return;
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        setPropertyDescriptionProvider((PropertyDescriptionProvider)newValue);
        return;
      case ModelPackage.MODULE__FEATURES_PROVIDER:
        setFeaturesProvider((FeaturesProvider)newValue);
        return;
      case ModelPackage.MODULE__FORM_CONTROL_FACTORY:
        setFormControlFactory((FormControlFactory)newValue);
        return;
      case ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER:
        setViewerContentProvider((ViewerContentProvider)newValue);
        return;
      case ModelPackage.MODULE__PARTS:
        getParts().clear();
        getParts().addAll((Collection<? extends PartSpecification>)newValue);
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
      case ModelPackage.MODULE__EXTENDS_CLAUSE:
        setExtendsClause((ExtendsClause)null);
        return;
      case ModelPackage.MODULE__LABEL_PROVIDER:
        setLabelProvider((LabelProvider)null);
        return;
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        setPropertyDescriptionProvider((PropertyDescriptionProvider)null);
        return;
      case ModelPackage.MODULE__FEATURES_PROVIDER:
        setFeaturesProvider((FeaturesProvider)null);
        return;
      case ModelPackage.MODULE__FORM_CONTROL_FACTORY:
        setFormControlFactory((FormControlFactory)null);
        return;
      case ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER:
        setViewerContentProvider((ViewerContentProvider)null);
        return;
      case ModelPackage.MODULE__PARTS:
        getParts().clear();
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
      case ModelPackage.MODULE__EXTENDS_CLAUSE:
        return extendsClause != null;
      case ModelPackage.MODULE__LABEL_PROVIDER:
        return labelProvider != null;
      case ModelPackage.MODULE__PROPERTY_DESCRIPTION_PROVIDER:
        return propertyDescriptionProvider != null;
      case ModelPackage.MODULE__FEATURES_PROVIDER:
        return featuresProvider != null;
      case ModelPackage.MODULE__FORM_CONTROL_FACTORY:
        return formControlFactory != null;
      case ModelPackage.MODULE__VIEWER_CONTENT_PROVIDER:
        return viewerContentProvider != null;
      case ModelPackage.MODULE__PARTS:
        return parts != null && !parts.isEmpty();
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
