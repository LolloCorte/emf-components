package it.rcpvision.emf.components.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Injector;
import it.rcpvision.emf.components.EmfComponentsExecutableExtensionFactory;
import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.ui.EmfComponentsAbstractActivator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

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
    String _executableExtensionFactoryQN = this.executableExtensionFactoryQN(element);
    final JvmGenericType execExtFactoryClass = this._jvmTypesBuilder.toClass(element, _executableExtensionFactoryQN);
    String _activatorQN = this.activatorQN(element);
    final JvmGenericType activatorClass = this._jvmTypesBuilder.toClass(element, _activatorQN);
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
        }
      };
    _accept.initializeLater(_function);
    IPostIndexingInitializing<JvmGenericType> _accept_1 = acceptor.<JvmGenericType>accept(execExtFactoryClass);
    final Procedure1<JvmGenericType> _function_1 = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EmfComponentsExecutableExtensionFactory.class);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _newTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Bundle.class);
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _annotation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                it.setVisibility(JvmVisibility.PROTECTED);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      String _activatorQN = EmfComponentsDslJvmModelInferrer.this.activatorQN(element);
                      String _plus = ("return " + _activatorQN);
                      String _plus_1 = (_plus + ".getDefault().getBundle();");
                      it.append(_plus_1);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getBundle", _newTypeRef_1, _function);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          EList<JvmMember> _members_1 = it.getMembers();
          JvmTypeReference _newTypeRef_2 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EmfComponentsGenericModule.class);
          final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _annotation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                it.setVisibility(JvmVisibility.PROTECTED);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      String _activatorQN = EmfComponentsDslJvmModelInferrer.this.activatorQN(element);
                      String _plus = ("return " + _activatorQN);
                      String _plus_1 = (_plus + ".getDefault().createModule();");
                      it.append(_plus_1);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getModule", _newTypeRef_2, _function_1);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmTypeReference _newTypeRef_3 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Injector.class);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _annotation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                it.setVisibility(JvmVisibility.PROTECTED);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      String _activatorQN = EmfComponentsDslJvmModelInferrer.this.activatorQN(element);
                      String _plus = ("return " + _activatorQN);
                      String _plus_1 = (_plus + ".getDefault().getInjector();");
                      it.append(_plus_1);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_2 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getInjector", _newTypeRef_3, _function_2);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
        }
      };
    _accept_1.initializeLater(_function_1);
    IPostIndexingInitializing<JvmGenericType> _accept_2 = acceptor.<JvmGenericType>accept(activatorClass);
    final Procedure1<JvmGenericType> _function_2 = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EmfComponentsAbstractActivator.class);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _newTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
          final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                it.setVisibility(JvmVisibility.PUBLIC);
                it.setStatic(true);
                it.setFinal(true);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("\"");
                      QualifiedName _fullyQualifiedName = EmfComponentsDslJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(element);
                      _builder.append(_fullyQualifiedName, "");
                      _builder.append("\"");
                      it.append(_builder);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
              }
            };
          JvmField _field = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toField(it, "PLUGIN_ID", _newTypeRef_1, _function);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          EList<JvmMember> _members_1 = it.getMembers();
          JvmParameterizedTypeReference _createTypeRef = EmfComponentsDslJvmModelInferrer.this._typeReferences.createTypeRef(activatorClass);
          final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                it.setVisibility(JvmVisibility.PRIVATE);
                it.setStatic(true);
              }
            };
          JvmField _field_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toField(it, "plugin", _createTypeRef, _function_1);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmTypeReference _typeForName = EmfComponentsDslJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, BundleContext.class);
                JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, 
                  "context", _newTypeRef);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                EList<JvmTypeReference> _exceptions = it.getExceptions();
                JvmTypeReference _newTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Exception.class);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _newTypeRef_1);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("super.start(context);");
                      _builder.newLine();
                      _builder.append("plugin = this;");
                      it.append(_builder);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(it, "start", _typeForName, _function_2);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
          EList<JvmMember> _members_3 = it.getMembers();
          JvmTypeReference _typeForName_1 = EmfComponentsDslJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
          final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, BundleContext.class);
                JvmFormalParameter _parameter = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, 
                  "context", _newTypeRef);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                EList<JvmTypeReference> _exceptions = it.getExceptions();
                JvmTypeReference _newTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Exception.class);
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _newTypeRef_1);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("plugin = null;");
                      _builder.newLine();
                      _builder.append("super.stop(context);");
                      it.append(_builder);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_1 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(it, "stop", _typeForName_1, _function_3);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
          EList<JvmMember> _members_4 = it.getMembers();
          JvmParameterizedTypeReference _createTypeRef_1 = EmfComponentsDslJvmModelInferrer.this._typeReferences.createTypeRef(activatorClass);
          final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                it.setStatic(true);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      it.append("return plugin;");
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_2 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(it, "getDefault", _createTypeRef_1, _function_4);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_2);
          EList<JvmMember> _members_5 = it.getMembers();
          JvmTypeReference _newTypeRef_2 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, EmfComponentsGenericModule.class);
          final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                it.setVisibility(JvmVisibility.PROTECTED);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      String _moduleQN = EmfComponentsDslJvmModelInferrer.this.moduleQN(element);
                      String _plus = ("return new " + _moduleQN);
                      String _plus_1 = (_plus + "(getDefault());");
                      it.append(_plus_1);
                    }
                  };
                EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_3 = EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "createModule", _newTypeRef_2, _function_5);
          EmfComponentsDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_3);
        }
      };
    _accept_2.initializeLater(_function_2);
  }
  
  public String activatorQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + "Activator");
    return _plus;
  }
  
  public String moduleQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + "Module");
    return _plus;
  }
  
  public String executableExtensionFactoryQN(final Module element) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _plus = (_fullyQualifiedName + "ExecutableExtensionFactory");
    return _plus;
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
