package it.rcpvision.emf.components.examples.firstexample.ui.provider;

import com.google.common.base.Objects;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.Writer;

public class LabelProviderGen extends ViewerLabelProvider {
  public String text(final Book b) {
    String _title = b.getTitle();
    String _plus = ("\"" + _title);
    String _plus_1 = (_plus + "\"");
    String _xifexpression = null;
    Writer _author = b.getAuthor();
    boolean _notEquals = (!Objects.equal(_author, null));
    if (_notEquals) {
      Writer _author_1 = b.getAuthor();
      String _name = _author_1.getName();
      String _plus_2 = (" (by " + _name);
      String _plus_3 = (_plus_2 + ")");
      _xifexpression = _plus_3;
    } else {
      _xifexpression = "";
    }
    String _plus_4 = (_plus_1 + _xifexpression);
    return _plus_4;
  }
}
