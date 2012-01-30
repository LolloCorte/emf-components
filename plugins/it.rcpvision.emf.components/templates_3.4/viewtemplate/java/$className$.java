package $packageName$;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class $className$ extends ViewPart {
	
	public void createPartControl(Composite parent) {
		 		 Label label = new Label(parent, SWT.CENTER);
		 		 
%if importantMessage
		 		 String message = new String("$message$!!!");
%else
		 		 String message = new String("$message$");
%endif
		 		 label.setText(message);
		 }
	
	public void setFocus() {
	}
	
}