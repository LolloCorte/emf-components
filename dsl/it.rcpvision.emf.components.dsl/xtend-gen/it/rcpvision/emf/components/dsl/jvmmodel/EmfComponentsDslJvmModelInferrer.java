package it.rcpvision.emf.components.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.dsl.jvmmodel.GeneratorUtils;
import it.rcpvision.emf.components.dsl.model.FeatureLabelProvider;
import it.rcpvision.emf.components.dsl.model.FeatureLabelSpecification;
import it.rcpvision.emf.components.dsl.model.FeatureProvider;
import it.rcpvision.emf.components.dsl.model.FeatureSpecification;
import it.rcpvision.emf.components.dsl.model.LabelProvider;
import it.rcpvision.emf.components.dsl.model.LabelSpecification;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider.EClassToEStructuralFeatureAsStringsMap;
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
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
    final JvmGenericType featureLabelProviderClass = this.inferFeatureLabelProvider(element, acceptor);
    final JvmGenericType featureProviderClass = this.inferFeatureProvider(element, acceptor);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(moduleClass);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EmfComponentsGenericModule.class);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
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
            JvmOperation _genBindMethod = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_labelProvider, labelProviderClass, CompositeLabelProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _genBindMethod);
          }
          boolean _notEquals_1 = (!Objects.equal(featureLabelProviderClass, null));
          if (_notEquals_1) {
            EList<JvmMember> _members_2 = it.getMembers();
            FeatureLabelProvider _featureLabelProvider = element.getFeatureLabelProvider();
            JvmOperation _genBindMethod_1 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_featureLabelProvider, featureLabelProviderClass, PropertyDescriptionProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _genBindMethod_1);
          }
          boolean _notEquals_2 = (!Objects.equal(featureProviderClass, null));
          if (_notEquals_2) {
            EList<JvmMember> _members_3 = it.getMembers();
            FeatureProvider _featureProvider = element.getFeatureProvider();
            JvmOperation _genBindMethod_2 = EmfComponentsDslJvmModelInferrer.this.genBindMethod(_featureProvider, featureProviderClass, EStructuralFeaturesProvider.class);
            EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _genBindMethod_2);
          }
        }
      };
    _accept.initializeLater(_function);
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
    String _plus = (_fullyQualifiedName + ".ExecutableExtensionFactory");
    return _plus;
  }
  
  public String labelProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".ui.provider.LabelProviderGen");
    return _plus;
  }
  
  public String featureLabelProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".ui.provider.FeatureLabelProviderGen");
    return _plus;
  }
  
  public String featureProviderQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + ".ui.provider.EStructuralFeaturesProviderGen");
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
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, CompositeLabelProvider.class);
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
  
  public JvmGenericType inferFeatureLabelProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    FeatureLabelProvider _featureLabelProvider = element.getFeatureLabelProvider();
    boolean _equals = Objects.equal(_featureLabelProvider, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        FeatureLabelProvider _featureLabelProvider_1 = element.getFeatureLabelProvider();
        String _featureLabelProviderQN = this.featureLabelProviderQN(element);
        final JvmGenericType featureLabelProviderClass = this._jvmTypesBuilder.toClass(_featureLabelProvider_1, _featureLabelProviderQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(featureLabelProviderClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, PropertyDescriptionProvider.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              FeatureLabelProvider _featureLabelProvider = element.getFeatureLabelProvider();
              EList<FeatureLabelSpecification> _labelSpecifications = _featureLabelProvider.getLabelSpecifications();
              final Procedure1<FeatureLabelSpecification> _function = new Procedure1<FeatureLabelSpecification>() {
                  public void apply(final FeatureLabelSpecification labelSpecification) {
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
                      JvmType _parameterType = labelSpecification.getParameterType();
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
              IterableExtensions.<FeatureLabelSpecification>forEach(_labelSpecifications, _function);
            }
          };
        _accept.initializeLater(_function);
        _xblockexpression = (featureLabelProviderClass);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public JvmGenericType inferFeatureProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    FeatureProvider _featureProvider = element.getFeatureProvider();
    boolean _equals = Objects.equal(_featureProvider, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        FeatureProvider _featureProvider_1 = element.getFeatureProvider();
        String _featureProviderQN = this.featureProviderQN(element);
        final JvmGenericType featureProviderClass = this._jvmTypesBuilder.toClass(_featureProvider_1, _featureProviderQN);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(featureProviderClass);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EStructuralFeaturesProvider.class);
              EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              EList<JvmMember> _members = it.getMembers();
              FeatureProvider _featureProvider = element.getFeatureProvider();
              JvmTypeReference _typeForName = EmfComponentsDslJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
              final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _annotation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    FeatureProvider _featureProvider = element.getFeatureProvider();
                    JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, 
                      EClassToEStructuralFeatureAsStringsMap.class);
                    JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(_featureProvider, "stringMap", _newTypeRef);
                    EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          ITreeAppendable _append = it.append("super.buildStringMap(stringMap);");
                          _append.newLine();
                          FeatureProvider _featureProvider = element.getFeatureProvider();
                          EList<FeatureSpecification> _featureSpecifications = _featureProvider.getFeatureSpecifications();
                          final Procedure1<FeatureSpecification> _function = new Procedure1<FeatureSpecification>() {
                              public void apply(final FeatureSpecification featureSpecification) {
                                ITreeAppendable _newLine = it.newLine();
                                StringConcatenation _builder = new StringConcatenation();
                                _builder.append("stringMap.mapTo(\"");
                                JvmType _parameterType = featureSpecification.getParameterType();
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
              JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(_featureProvider, "buildStringMap", _typeForName, _function);
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
