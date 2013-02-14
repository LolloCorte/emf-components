package it.rcpvision.emf.components.examples.mail.accountsview.edit.ui.provider;

import com.google.inject.Inject;
import it.rcpvision.emf.components.edit.ui.provider.ViewerContentProvider;
import it.rcpvision.emf.components.examples.mail.Folder;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

public class ViewerContentProviderGen extends ViewerContentProvider {
  @Inject
  public ViewerContentProviderGen(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object children(final Folder it) {
    EList<Folder> _subfolders = it.getSubfolders();
    return _subfolders;
  }
}
