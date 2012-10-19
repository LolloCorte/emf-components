package it.rcpvision.emf.components.examples.mail.messageview.ui.provider;

import it.rcpvision.emf.components.examples.mail.Mail;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;

public class LabelProviderGen extends ViewerLabelProvider {
  public String text(final Mail it) {
    String _subject = it.getSubject();
    return _subject;
  }
  
  public Object image(final Mail it) {
    return "email.png";
  }
}
