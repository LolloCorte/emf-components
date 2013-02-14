package it.rcpvision.emf.components.examples.mail.messageview.ui.provider;

import com.google.inject.Inject;
import it.rcpvision.emf.components.examples.mail.Mail;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

public class LabelProviderGen extends ViewerLabelProvider {
  @Inject
  public LabelProviderGen(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Mail it) {
    String _subject = it.getSubject();
    return _subject;
  }
  
  public Object image(final Mail it) {
    return "email.png";
  }
}
