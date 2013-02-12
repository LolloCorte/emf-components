package it.rcpvision.emf.components.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.dsl.jvmmodel.GeneratorUtils;
import it.rcpvision.emf.components.dsl.model.ExtendsClause;
import it.rcpvision.emf.components.dsl.model.FeatureSpecification;
import it.rcpvision.emf.components.dsl.model.FeaturesProvider;
import it.rcpvision.emf.components.dsl.model.FormControlFactory;
import it.rcpvision.emf.components.dsl.model.FormControlSpecification;
import it.rcpvision.emf.components.dsl.model.LabelProvider;
import it.rcpvision.emf.components.dsl.model.LabelSpecification;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.model.PartSpecification;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionProvider;
import it.rcpvision.emf.components.dsl.model.PropertyDescriptionSpecification;
import it.rcpvision.emf.components.dsl.model.ProposalCreator;
import it.rcpvision.emf.components.dsl.model.ProposalSpecification;
import it.rcpvision.emf.components.dsl.model.ViewerContentProvider;
import it.rcpvision.emf.components.generator.common.EmfComponentsProjectFilesGenerator;
import it.rcpvision.emf.components.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import java.util.Arrays;
import java.util.List;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class EmfComponentsDslJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private TypesFactory _typesFactory;
  
  @Inject
  private GeneratorUtils _generatorUtils;
  
  @Inject
  private EmfComponentsProjectFilesGenerator projectFilesGenerator;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final Module element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = element.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      return;
    }
    String _moduleQN = this.moduleQN(element);
    final JvmGenericType moduleClass = this._jvmTypesBuilder.toClass(element, _moduleQN);
    final JvmGenericType labelProviderClass = this.inferLabelProvider(element, acceptor);
    final JvmGenericType propertyDescriptionProviderClass = this.inferPropertyDescriptionProvider(element, acceptor);
    final JvmGenericType featureProviderClass = this.inferFeatureProvider(element, acceptor);
    final JvmGenericType formControlFactoryClass = this.inferFormControlFactory(element, acceptor);
    final JvmGenericType viewerContentProviderClass = this.inferViewerContentProvider(element, acceptor);
    final JvmGenericType proposalCreatorClass = this.inferProposalCreator(element, acceptor);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(moduleClass);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EmfComponentsDslJvmModelInferrer.this.setSuperClassType(moduleClass, element, EmfComponentsGuiceModule.class);
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
              public void apply(final JvmConstructor it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, AbstractUIPlugin.class);
                JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "plugin", _newTypeRef);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      it.append("super(plugin);");
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmConstructor _constructor = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toConstructor(element, _function);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
          boolean _notEquals = (!Objects.equal(labelProviderClass, null));
          if (_notEquals) {
            EList<JvmMember> _members_1 = it.getMembers();
            LabelProvider _labelProvider = element.getLabelProvider();
            JvmOperation _genBindMethod = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_labelProvider, labelProviderClass, ViewerLabelProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _genBindMethod);
          }
          boolean _notEquals_1 = (!Objects.equal(propertyDescriptionProviderClass, null));
          if (_notEquals_1) {
            EList<JvmMember> _members_2 = it.getMembers();
            PropertyDescriptionProvider _propertyDescriptionProvider = element.getPropertyDescriptionProvider();
            JvmOperation _genBindMethod_1 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_propertyDescriptionProvider, propertyDescriptionProviderClass, it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _genBindMethod_1);
          }
          boolean _notEquals_2 = (!Objects.equal(featureProviderClass, null));
          if (_notEquals_2) {
            EList<JvmMember> _members_3 = it.getMembers();
            FeaturesProvider _featuresProvider = element.getFeaturesProvider();
            JvmOperation _genBindMethod_2 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_featuresProvider, featureProviderClass, it.rcpvision.emf.components.ui.provider.FeaturesProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _genBindMethod_2);
          }
          boolean _notEquals_3 = (!Objects.equal(formControlFactoryClass, null));
          if (_notEquals_3) {
            EList<JvmMember> _members_4 = it.getMembers();
            FormControlFactory _formControlFactory = element.getFormControlFactory();
            JvmOperation _genBindMethod_3 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_formControlFactory, formControlFactoryClass, it.rcpvision.emf.components.binding.FormControlFactory.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _genBindMethod_3);
          }
          boolean _notEquals_4 = (!Objects.equal(viewerContentProviderClass, null));
          if (_notEquals_4) {
            EList<JvmMember> _members_5 = it.getMembers();
            ViewerContentProvider _viewerContentProvider = element.getViewerContentProvider();
            JvmOperation _genBindMethod_4 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_viewerContentProvider, viewerContentProviderClass, it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _genBindMethod_4);
          }
          boolean _notEquals_5 = (!Objects.equal(proposalCreatorClass, null));
          if (_notEquals_5) {
            EList<JvmMember> _members_6 = it.getMembers();
            ProposalCreator _proposalCreator = element.getProposalCreator();
            JvmOperation _genBindMethod_5 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_proposalCreator, proposalCreatorClass, it.rcpvision.emf.components.binding.ProposalCreator.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _genBindMethod_5);
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  public boolean setSuperClassType(final JvmGenericType e, final Module dslElement, final Class<? extends Object> defaultSuperClass) {
    boolean _xifexpression = false;
    ExtendsClause _extendsClause = dslElement.getExtendsClause();
    boolean _notEquals = (!Objects.equal(_extendsClause, null));
    if (_notEquals) {
      EList<JvmTypeReference> _superTypes = e.getSuperTypes();
      ExtendsClause _extendsClause_1 = dslElement.getExtendsClause();
      JvmTypeReference _superType = _extendsClause_1.getSuperType();
      JvmTypeReference _cloneWithProxies = this._jvmTypesBuilder.cloneWithProxies(_superType);
      boolean _add = this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
      _xifexpression = _add;
    } else {
      EList<JvmTypeReference> _superTypes_1 = e.getSuperTypes();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(e, defaultSuperClass);
      boolean _add_1 = this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _newTypeRef);
      _xifexpression = _add_1;
    }
    return _xifexpression;
  }
  
  public String activatorQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".Activator");
    return _plus;
  }
  
  public String moduleQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".EmfComponentsGuiceModuleGen");
    return _plus;
  }
  
  public String executableExtensionFactoryQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _string = _fullyQualifiedName.toString();
    String _plus = (_string + ".");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _string_1 = _fullyQualifiedName_1.toString();
    CharSequence _extFactoryName = this.projectFilesGenerator.extFactoryName(_string_1);
    String _plus_1 = (_plus + _extFactoryName);
    return _plus_1;
  }
  
  public String executableExtensionFactoryQN(final PartSpecification element) {
    Module _containerOfType = EcoreUtil2.<Module>getContainerOfType(element, Module.class);
    String _executableExtensionFactoryQN = this.executableExtensionFactoryQN(_containerOfType);
    return _executableExtensionFactoryQN;
  }
  
  public String labelProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".ui.provider.LabelProviderGen");
    return _plus;
  }
  
  public String propertyDescriptionProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".ui.provider.PropertyDescriptionProviderGen");
    return _plus;
  }
  
  public String featuresProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".ui.provider.FeaturesProviderGen");
    return _plus;
  }
  
  public String formFeatureControlFactoryQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".binding.FormFeatureControlFactoryGen");
    return _plus;
  }
  
  public String viewerContentProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".edit.ui.provider.ViewerContentProviderGen");
    return _plus;
  }
  
  public String proposalCreatorQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".binding.ProposalCreatorGen");
    return _plus;
  }
  
  public JvmGenericType inferLabelProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    LabelProvider _labelProvider = element.getLabelProvider();
    boolean _equals = Objects.equal(_labelProvider, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        LabelProvider _labelProvider_1 = element.getLabelProvider();
        String _labelProviderQN = this.labelProviderQN(element);
        final JvmGenericType labelProviderClass = this._jvmTypesBuilder.toClass(_labelProvider_1, _labelProviderQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(labelProviderClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, ViewerLabelProvider.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              LabelProvider _labelProvider = element.getLabelProvider();
              EList<LabelSpecification> _labelSpecifications = _labelProvider.getLabelSpecifications();
              final Procedure1<LabelSpecification> _function = new Procedure1<LabelSpecification>() {
                  public void apply(final LabelSpecification labelSpecification) {
                    EList<JvmMember> _members = it.getMembers();
                    JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
                    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          EList<JvmFormalParameter> _parameters = it.getParameters();
                          String _xifexpression = null;
                          String _name = labelSpecification.getName();
                          boolean _notEquals = (!Objects.equal(_name, null));
                          if (_notEquals) {
                            String _name_1 = labelSpecification.getName();
                            _xifexpression = _name_1;
                          } else {
                            _xifexpression = "it";
                          }
                          JvmTypeReference _parameterType = labelSpecification.getParameterType();
                          JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(labelSpecification, _xifexpression, _parameterType);
                          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                          XExpression _expression = labelSpecification.getExpression();
                          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                        }
                      };
                    JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(labelSpecification, "text", _newTypeRef, _function);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
                  }
                };
              IterableExtensions.<LabelSpecification>forEach(_labelSpecifications, _function);
              LabelProvider _labelProvider_1 = element.getLabelProvider();
              EList<LabelSpecification> _imageSpecifications = _labelProvider_1.getImageSpecifications();
              final Procedure1<LabelSpecification> _function_1 = new Procedure1<LabelSpecification>() {
                  public void apply(final LabelSpecification imageSpecification) {
                    EList<JvmMember> _members = it.getMembers();
                    JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Object.class);
                    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          EList<JvmFormalParameter> _parameters = it.getParameters();
                          String _xifexpression = null;
                          String _name = imageSpecification.getName();
                          boolean _notEquals = (!Objects.equal(_name, null));
                          if (_notEquals) {
                            String _name_1 = imageSpecification.getName();
                            _xifexpression = _name_1;
                          } else {
                            _xifexpression = "it";
                          }
                          JvmTypeReference _parameterType = imageSpecification.getParameterType();
                          JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(imageSpecification, _xifexpression, _parameterType);
                          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                          XExpression _expression = imageSpecification.getExpression();
                          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                        }
                      };
                    JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(imageSpecification, "image", _newTypeRef, _function);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
                  }
                };
              IterableExtensions.<LabelSpecification>forEach(_imageSpecifications, _function_1);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (labelProviderClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmGenericType inferPropertyDescriptionProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    PropertyDescriptionProvider _propertyDescriptionProvider = element.getPropertyDescriptionProvider();
    boolean _equals = Objects.equal(_propertyDescriptionProvider, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        PropertyDescriptionProvider _propertyDescriptionProvider_1 = element.getPropertyDescriptionProvider();
        String _propertyDescriptionProviderQN = this.propertyDescriptionProviderQN(element);
        final JvmGenericType propertyDescriptionProviderClass = this._jvmTypesBuilder.toClass(_propertyDescriptionProvider_1, _propertyDescriptionProviderQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(propertyDescriptionProviderClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              PropertyDescriptionProvider _propertyDescriptionProvider = element.getPropertyDescriptionProvider();
              EList<PropertyDescriptionSpecification> _labelSpecifications = _propertyDescriptionProvider.getLabelSpecifications();
              final Procedure1<PropertyDescriptionSpecification> _function = new Procedure1<PropertyDescriptionSpecification>() {
                  public void apply(final PropertyDescriptionSpecification labelSpecification) {
                    boolean _and = false;
                    XExpression _feature = labelSpecification.getFeature();
                    boolean _notEquals = (!Objects.equal(_feature, null));
                    if (!_notEquals) {
                      _and = false;
                    } else {
                      XExpression _feature_1 = labelSpecification.getFeature();
                      JvmIdentifiableElement _feature_2 = ((XFeatureCall) _feature_1).getFeature();
                      boolean _notEquals_1 = (!Objects.equal(_feature_2, null));
                      _and = (_notEquals && _notEquals_1);
                    }
                    if (_and) {
                      EList<JvmMember> _members = it.getMembers();
                      XExpression _expression = labelSpecification.getExpression();
                      JvmTypeReference _parameterType = labelSpecification.getParameterType();
                      String _simpleName = _parameterType.getSimpleName();
                      String _plus = ("text_" + _simpleName);
                      String _plus_1 = (_plus + "_");
                      XExpression _feature_3 = labelSpecification.getFeature();
                      JvmIdentifiableElement _feature_4 = ((XFeatureCall) _feature_3).getFeature();
                      String _simpleName_1 = _feature_4.getSimpleName();
                      String _propertyNameForGetterSetterMethod = EmfComponentsDslJvmModelInferrer.this._generatorUtils.getPropertyNameForGetterSetterMethod(_simpleName_1);
                      String _plus_2 = (_plus_1 + _propertyNameForGetterSetterMethod);
                      JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
                      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                          public void apply(final JvmOperation it) {
                            EList<JvmFormalParameter> _parameters = it.getParameters();
                            JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EStructuralFeature.class);
                            JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(labelSpecification, 
                              "it", _newTypeRef);
                            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                            XExpression _expression = labelSpecification.getExpression();
                            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                          }
                        };
                      JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(_expression, _plus_2, _newTypeRef, _function);
                      EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
                    }
                  }
                };
              IterableExtensions.<PropertyDescriptionSpecification>forEach(_labelSpecifications, _function);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (propertyDescriptionProviderClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmGenericType inferFeatureProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    FeaturesProvider _featuresProvider = element.getFeaturesProvider();
    boolean _equals = Objects.equal(_featuresProvider, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        FeaturesProvider _featuresProvider_1 = element.getFeaturesProvider();
        String _featuresProviderQN = this.featuresProviderQN(element);
        final JvmGenericType featureProviderClass = this._jvmTypesBuilder.toClass(_featuresProvider_1, _featuresProviderQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(featureProviderClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, it.rcpvision.emf.components.ui.provider.FeaturesProvider.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              FeaturesProvider _featuresProvider = element.getFeaturesProvider();
              String _documentation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(_featuresProvider);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              EList<JvmMember> _members = it.getMembers();
              FeaturesProvider _featuresProvider_1 = element.getFeaturesProvider();
              JvmTypeReference _typeForName = EmfComponentsDslJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
              final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _annotation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    FeaturesProvider _featuresProvider = element.getFeaturesProvider();
                    JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, 
                      EClassToEStructuralFeatureAsStringsMap.class);
                    JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(_featuresProvider, "stringMap", _newTypeRef);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          ITreeAppendable _append = it.append("super.buildStringMap(stringMap);");
                          _append.newLine();
                          FeaturesProvider _featuresProvider = element.getFeaturesProvider();
                          EList<FeatureSpecification> _featureSpecifications = _featuresProvider.getFeatureSpecifications();
                          final Procedure1<FeatureSpecification> _function = new Procedure1<FeatureSpecification>() {
                              public void apply(final FeatureSpecification featureSpecification) {
                                ITreeAppendable _newLine = it.newLine();
                                StringConcatenation _builder = new StringConcatenation();
                                _builder.append("stringMap.mapTo(\"");
                                JvmTypeReference _parameterType = featureSpecification.getParameterType();
                                String _identifier = _parameterType.getIdentifier();
                                _builder.append(_identifier, "");
                                _builder.append("\",");
                                ITreeAppendable _append = _newLine.append(_builder);
                                ITreeAppendable _increaseIndentation = _append.increaseIndentation();
                                _increaseIndentation.newLine();
                                EList<XExpression> _features = featureSpecification.getFeatures();
                                final Function1<XExpression,String> _function = new Function1<XExpression,String>() {
                                    public String apply(final XExpression feature) {
                                      JvmIdentifiableElement _feature = ((XFeatureCall) feature).getFeature();
                                      String _simpleName = _feature.getSimpleName();
                                      String _propertyNameForGetterSetterMethod = EmfComponentsDslJvmModelInferrer.this._generatorUtils.getPropertyNameForGetterSetterMethod(_simpleName);
                                      String _plus = ("\"" + _propertyNameForGetterSetterMethod);
                                      String _plus_1 = (_plus + "\"");
                                      return _plus_1;
                                    }
                                  };
                                final List<String> fs = ListExtensions.<XExpression, String>map(_features, _function);
                                String _join = IterableExtensions.join(fs, ", ");
                                it.append(_join);
                                ITreeAppendable _append_1 = it.append(");");
                                _append_1.decreaseIndentation();
                              }
                            };
                          IterableExtensions.<FeatureSpecification>forEach(_featureSpecifications, _function);
                        }
                      };
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(_featuresProvider_1, "buildStringMap", _typeForName, _function);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (featureProviderClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmGenericType inferFormControlFactory(final Module e, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    FormControlFactory _formControlFactory = e.getFormControlFactory();
    boolean _equals = Objects.equal(_formControlFactory, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        FormControlFactory _formControlFactory_1 = e.getFormControlFactory();
        String _formFeatureControlFactoryQN = this.formFeatureControlFactoryQN(e);
        final JvmGenericType formFeatureControlFactoryClass = this._jvmTypesBuilder.toClass(_formControlFactory_1, _formFeatureControlFactoryQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(formFeatureControlFactoryClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(e, it.rcpvision.emf.components.binding.FormControlFactory.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              FormControlFactory _formControlFactory = e.getFormControlFactory();
              String _documentation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(_formControlFactory);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              FormControlFactory _formControlFactory_1 = e.getFormControlFactory();
              EList<FormControlSpecification> _controlSpecifications = _formControlFactory_1.getControlSpecifications();
              final Procedure1<FormControlSpecification> _function = new Procedure1<FormControlSpecification>() {
                  public void apply(final FormControlSpecification spec) {
                    boolean _and = false;
                    XExpression _feature = spec.getFeature();
                    boolean _notEquals = (!Objects.equal(_feature, null));
                    if (!_notEquals) {
                      _and = false;
                    } else {
                      XExpression _feature_1 = spec.getFeature();
                      JvmIdentifiableElement _feature_2 = ((XFeatureCall) _feature_1).getFeature();
                      boolean _notEquals_1 = (!Objects.equal(_feature_2, null));
                      _and = (_notEquals && _notEquals_1);
                    }
                    if (_and) {
                      XExpression _target = spec.getTarget();
                      boolean _equals = Objects.equal(_target, null);
                      if (_equals) {
                        EList<JvmMember> _members = it.getMembers();
                        XExpression _expression = spec.getExpression();
                        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                            public void apply(final JvmOperation it) {
                              EList<JvmFormalParameter> _parameters = it.getParameters();
                              JvmTypeReference _parameterType = spec.getParameterType();
                              JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                                "it", _parameterType);
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                              XExpression _expression = spec.getExpression();
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                            }
                          };
                        JvmOperation _control_EClass_EStructuralFeature = EmfComponentsDslJvmModelInferrer.this.control_EClass_EStructuralFeature(spec, _expression, _function);
                        EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _control_EClass_EStructuralFeature);
                      } else {
                        final String createControlMethodName = EmfComponentsDslJvmModelInferrer.this.methodNameForFormFeatureSpecification(spec, "createControl_");
                        final String createTargetMethodName = EmfComponentsDslJvmModelInferrer.this.methodNameForFormFeatureSpecification(spec, "createTarget_");
                        EList<JvmMember> _members_1 = it.getMembers();
                        XExpression _expression_1 = spec.getExpression();
                        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                            public void apply(final JvmOperation it) {
                              EList<JvmFormalParameter> _parameters = it.getParameters();
                              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(e, DataBindingContext.class);
                              JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                                "dataBindingContext", _newTypeRef);
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                              JvmTypeReference _newTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(e, IObservableValue.class);
                              JvmFormalParameter _parameter_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                                "observableValue", _newTypeRef_1);
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                                  public void apply(final ITreeAppendable it) {
                                    JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(spec, Control.class);
                                    JvmType _type = _newTypeRef.getType();
                                    it.append(_type);
                                    StringConcatenation _builder = new StringConcatenation();
                                    _builder.append(" ");
                                    _builder.append("control = ");
                                    _builder.append(createControlMethodName, " ");
                                    _builder.append("();");
                                    ITreeAppendable _append = it.append(_builder);
                                    _append.newLine();
                                    StringConcatenation _builder_1 = new StringConcatenation();
                                    _builder_1.append("dataBindingContext.bindValue(");
                                    _builder_1.newLine();
                                    _builder_1.append("\t");
                                    _builder_1.append(createTargetMethodName, "	");
                                    _builder_1.append("(control),");
                                    _builder_1.newLineIfNotEmpty();
                                    _builder_1.append("\t");
                                    _builder_1.append("observableValue);");
                                    ITreeAppendable _append_1 = it.append(_builder_1);
                                    _append_1.newLine();
                                    StringConcatenation _builder_2 = new StringConcatenation();
                                    _builder_2.append("return control;");
                                    it.append(_builder_2);
                                  }
                                };
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                            }
                          };
                        JvmOperation _control_EClass_EStructuralFeature_1 = EmfComponentsDslJvmModelInferrer.this.control_EClass_EStructuralFeature(spec, _expression_1, _function_1);
                        EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _control_EClass_EStructuralFeature_1);
                        EList<JvmMember> _members_2 = it.getMembers();
                        JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(spec, Control.class);
                        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                            public void apply(final JvmOperation it) {
                              it.setVisibility(JvmVisibility.PROTECTED);
                              XExpression _expression = spec.getExpression();
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                            }
                          };
                        JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(spec, createControlMethodName, _newTypeRef, _function_2);
                        EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
                        EList<JvmMember> _members_3 = it.getMembers();
                        JvmTypeReference _newTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(spec, IObservableValue.class);
                        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                            public void apply(final JvmOperation it) {
                              it.setVisibility(JvmVisibility.PROTECTED);
                              EList<JvmFormalParameter> _parameters = it.getParameters();
                              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(e, Control.class);
                              JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                                "it", _newTypeRef);
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                              XExpression _target = spec.getTarget();
                              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _target);
                            }
                          };
                        JvmOperation _method_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(spec, createTargetMethodName, _newTypeRef_1, _function_3);
                        EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
                      }
                    }
                  }
                };
              IterableExtensions.<FormControlSpecification>forEach(_controlSpecifications, _function);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (formFeatureControlFactoryClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmGenericType inferViewerContentProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    ViewerContentProvider _viewerContentProvider = element.getViewerContentProvider();
    boolean _equals = Objects.equal(_viewerContentProvider, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        ViewerContentProvider _viewerContentProvider_1 = element.getViewerContentProvider();
        String _viewerContentProviderQN = this.viewerContentProviderQN(element);
        final JvmGenericType viewerContentProviderClass = this._jvmTypesBuilder.toClass(_viewerContentProvider_1, _viewerContentProviderQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(viewerContentProviderClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              ViewerContentProvider _viewerContentProvider = element.getViewerContentProvider();
              EList<LabelSpecification> _childrenSpecifications = _viewerContentProvider.getChildrenSpecifications();
              final Procedure1<LabelSpecification> _function = new Procedure1<LabelSpecification>() {
                  public void apply(final LabelSpecification specification) {
                    EList<JvmMember> _members = it.getMembers();
                    JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Object.class);
                    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          EList<JvmFormalParameter> _parameters = it.getParameters();
                          String _xifexpression = null;
                          String _name = specification.getName();
                          boolean _notEquals = (!Objects.equal(_name, null));
                          if (_notEquals) {
                            String _name_1 = specification.getName();
                            _xifexpression = _name_1;
                          } else {
                            _xifexpression = "it";
                          }
                          JvmTypeReference _parameterType = specification.getParameterType();
                          JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(specification, _xifexpression, _parameterType);
                          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                          XExpression _expression = specification.getExpression();
                          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                        }
                      };
                    JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(specification, "children", _newTypeRef, _function);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
                  }
                };
              IterableExtensions.<LabelSpecification>forEach(_childrenSpecifications, _function);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (viewerContentProviderClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmGenericType inferProposalCreator(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    ProposalCreator _proposalCreator = element.getProposalCreator();
    boolean _equals = Objects.equal(_proposalCreator, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        ProposalCreator _proposalCreator_1 = element.getProposalCreator();
        String _proposalCreatorQN = this.proposalCreatorQN(element);
        final JvmGenericType proposalCreatorClass = this._jvmTypesBuilder.toClass(_proposalCreator_1, _proposalCreatorQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(proposalCreatorClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, it.rcpvision.emf.components.binding.ProposalCreator.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              ProposalCreator _proposalCreator = element.getProposalCreator();
              EList<ProposalSpecification> _proposalsSpecifications = _proposalCreator.getProposalsSpecifications();
              final Procedure1<ProposalSpecification> _function = new Procedure1<ProposalSpecification>() {
                  public void apply(final ProposalSpecification spec) {
                    boolean _and = false;
                    XExpression _feature = spec.getFeature();
                    boolean _notEquals = (!Objects.equal(_feature, null));
                    if (!_notEquals) {
                      _and = false;
                    } else {
                      XExpression _feature_1 = spec.getFeature();
                      JvmIdentifiableElement _feature_2 = ((XFeatureCall) _feature_1).getFeature();
                      boolean _notEquals_1 = (!Objects.equal(_feature_2, null));
                      _and = (_notEquals && _notEquals_1);
                    }
                    if (_and) {
                      EList<JvmMember> _members = it.getMembers();
                      XExpression _expression = spec.getExpression();
                      JvmTypeReference _parameterType = spec.getParameterType();
                      String _simpleName = _parameterType.getSimpleName();
                      String _plus = ("proposals_" + _simpleName);
                      String _plus_1 = (_plus + "_");
                      XExpression _feature_3 = spec.getFeature();
                      JvmIdentifiableElement _feature_4 = ((XFeatureCall) _feature_3).getFeature();
                      String _simpleName_1 = _feature_4.getSimpleName();
                      String _propertyNameForGetterSetterMethod = EmfComponentsDslJvmModelInferrer.this._generatorUtils.getPropertyNameForGetterSetterMethod(_simpleName_1);
                      String _plus_2 = (_plus_1 + _propertyNameForGetterSetterMethod);
                      JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, List.class);
                      JvmType _type = _newTypeRef.getType();
                      JvmWildcardTypeReference _wildCard = EmfComponentsDslJvmModelInferrer.this._typeReferences.wildCard();
                      JvmParameterizedTypeReference _createTypeRef = EmfComponentsDslJvmModelInferrer.this._typeReferences.createTypeRef(_type, _wildCard);
                      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                          public void apply(final JvmOperation it) {
                            EList<JvmFormalParameter> _parameters = it.getParameters();
                            JvmTypeReference _parameterType = spec.getParameterType();
                            JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                              "it", _parameterType);
                            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                            JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(spec, EStructuralFeature.class);
                            JvmFormalParameter _parameter_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                              "feature", _newTypeRef);
                            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                            XExpression _expression = spec.getExpression();
                            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                          }
                        };
                      JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(_expression, _plus_2, _createTypeRef, _function);
                      EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
                    }
                  }
                };
              IterableExtensions.<ProposalSpecification>forEach(_proposalsSpecifications, _function);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (proposalCreatorClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmOperation control_EClass_EStructuralFeature(final FormControlSpecification spec, final XExpression exp, final Procedure1<? super JvmOperation> init) {
    String _methodNameForFormFeatureSpecification = this.methodNameForFormFeatureSpecification(spec, "control_");
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(spec, Control.class);
    JvmOperation _method = this._jvmTypesBuilder.toMethod(exp, _methodNameForFormFeatureSpecification, _newTypeRef, init);
    return _method;
  }
  
  public String methodNameForFormFeatureSpecification(final FormControlSpecification spec, final String prefix) {
    JvmTypeReference _parameterType = spec.getParameterType();
    String _simpleName = _parameterType.getSimpleName();
    String _plus = (prefix + _simpleName);
    String _plus_1 = (_plus + "_");
    XExpression _feature = spec.getFeature();
    JvmIdentifiableElement _feature_1 = ((XFeatureCall) _feature).getFeature();
    String _simpleName_1 = _feature_1.getSimpleName();
    String _propertyNameForGetterSetterMethod = this._generatorUtils.getPropertyNameForGetterSetterMethod(_simpleName_1);
    String _plus_2 = (_plus_1 + _propertyNameForGetterSetterMethod);
    return _plus_2;
  }
  
  public JvmOperation genBindMethod(final EObject element, final JvmGenericType type, final Class<? extends Object> clazz) {
    JvmOperation _xblockexpression = null;
    {
      final JvmWildcardTypeReference wildCard = this._typesFactory.createJvmWildcardTypeReference();
      final JvmUpperBound upperBound = this._typesFactory.createJvmUpperBound();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(element, clazz);
      upperBound.setTypeReference(_newTypeRef);
      EList<JvmTypeConstraint> _constraints = wildCard.getConstraints();
      this._jvmTypesBuilder.<JvmUpperBound>operator_add(_constraints, upperBound);
      String _simpleName = clazz.getSimpleName();
      String _plus = ("bind" + _simpleName);
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(element, Class.class, wildCard);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.append("return ");
                  it.append(type);
                  it.append(".class;");
                }
              };
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(element, _plus, _newTypeRef_1, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Module) {
      _infer((Module)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
