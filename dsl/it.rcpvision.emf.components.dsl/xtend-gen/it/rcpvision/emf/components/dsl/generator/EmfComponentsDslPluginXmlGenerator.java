package it.rcpvision.emf.components.dsl.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import it.rcpvision.emf.components.dsl.jvmmodel.EmfComponentsDslJvmModelInferrer;
import it.rcpvision.emf.components.dsl.model.Module;
import it.rcpvision.emf.components.dsl.model.ViewSpecification;
import it.rcpvision.emf.components.dsl.model.ViewsSpecification;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class EmfComponentsDslPluginXmlGenerator implements IGenerator {
  @Inject
  private EmfComponentsDslJvmModelInferrer inferrer;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public CharSequence generatePluginXml(final Module module) {
    CharSequence _xblockexpression = null;
    {
      ViewsSpecification _views = module==null?(ViewsSpecification)null:module.getViews();
      final EList<ViewSpecification> viewSpecs = _views==null?(EList<ViewSpecification>)null:_views.getViews();
      CharSequence _xifexpression = null;
      boolean _or = false;
      boolean _equals = Objects.equal(viewSpecs, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _isEmpty = viewSpecs.isEmpty();
        _or = (_equals || _isEmpty);
      }
      if (_or) {
        StringConcatenation _builder = new StringConcatenation();
        return _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<extension");
        _builder_1.newLine();
        _builder_1.append("      ");
        _builder_1.append("point=\"org.eclipse.ui.views\">");
        _builder_1.newLine();
        _builder_1.append("    ");
        final Function1<ViewSpecification,CharSequence> _function = new Function1<ViewSpecification,CharSequence>() {
            public CharSequence apply(final ViewSpecification it) {
              CharSequence _generateViewExtensionPoint = EmfComponentsDslPluginXmlGenerator.this.generateViewExtensionPoint(it);
              return _generateViewExtensionPoint;
            }
          };
        List<CharSequence> _map = ListExtensions.<ViewSpecification, CharSequence>map(viewSpecs, _function);
        String _join = IterableExtensions.join(_map, "");
        _builder_1.append(_join, "    ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</extension>");
        _builder_1.newLine();
        CharSequence _generatePluginXml = this.generatePluginXml(_builder_1);
        _xifexpression = _generatePluginXml;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateViewExtensionPoint(final ViewSpecification viewSpecification) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<view");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("category=\"it.rcpvision.emf.components\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("class=\"");
    String _executableExtensionFactoryQN = this.inferrer.executableExtensionFactoryQN(viewSpecification);
    _builder.append(_executableExtensionFactoryQN, "      ");
    _builder.append(":");
    JvmTypeReference _type = viewSpecification.getType();
    String _identifier = _type.getIdentifier();
    _builder.append(_identifier, "      ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("id=\"");
    String _id = viewSpecification.getId();
    _builder.append(_id, "      ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("name=\"");
    String _viewName = viewSpecification.getViewName();
    _builder.append(_viewName, "      ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("restorable=\"true\">");
    _builder.newLine();
    _builder.append("</view>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatePluginXml(final CharSequence contents) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?eclipse version=\"3.4\"?>");
    _builder.newLine();
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(contents, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</plugin>");
    _builder.newLine();
    return _builder;
  }
}
