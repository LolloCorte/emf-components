/**
 * 
 */
package it.rcpvision.emf.components.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Inject;

/**
 * A View that visualizes the list of elements of an emf selected resource (it
 * also acts as a selection provider).
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfFormView extends EmfAbstractViewOnSelection {

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	protected Composite parent;

	protected ScrolledComposite scrolledComposite;

	protected GenericDetailComposite genericComponent;
	
	private Composite main;

	private FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public EmfFormView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		this.parent = parent;
		
//		scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
//		formToolkit.adapt(scrolledComposite);
//		formToolkit.paintBordersFor(scrolledComposite);
//		scrolledComposite.setExpandHorizontal(true);
//		scrolledComposite.setExpandVertical(true);
		
		scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
//		formToolkit = new FormToolkit(parent.getDisplay());
		formToolkit.adapt(scrolledComposite);
		formToolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
//		GridLayout gl_parent = new GridLayout(1, false);
//		gl_parent.verticalSpacing = 0;
//		gl_parent.marginHeight = 0;
//		gl_parent.horizontalSpacing = 0;
//		parent.setLayout(gl_parent);
		main = formToolkit.createComposite(scrolledComposite, SWT.BORDER);
//		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//		main.setLayout(new GridLayout(1, false));
//		buttonsComposite = new ButtonsComposite(parent, SWT.NONE);
//		buttonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
//		formToolkit.adapt(buttonsComposite);
//		GridLayout gl_buttonsComposite = new GridLayout(3, false);
//		gl_buttonsComposite.marginLeft = 20;
//		buttonsComposite.setLayout(gl_buttonsComposite);
//		new Label(buttonsComposite, SWT.NONE);
		
		scrolledComposite.setContent(main);

		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		main.setLayout(new GridLayout(1, false));
		
		main.setSize(main.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		parent.layout(true, true);
		
//		scrolledComposite.setMinSize(main.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		//resetView();
		
		EObject eObject = getFirstSelectedEObject(selection);
		if (eObject != null) {
			if (genericComponent != null) {
				genericComponent.dispose();
			}
			
			genericComponent = emfDetailsFactory.createDetailsComposite(
					main, SWT.NONE);
			formToolkit.adapt(genericComponent);
			genericComponent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
			genericComponent.init(eObject);
			
			parent.layout(true, true);
			
//			Composite composite = formToolkit.createComposite(scrolledComposite, SWT.NONE);
//			formToolkit.paintBordersFor(composite);
			
//			Label lblNewLabel = formToolkit.createLabel(composite, "New Label", SWT.NONE);
//			lblNewLabel.setBounds(27, 46, 53, 13);
			
//			txtNewText = formToolkit.createText(composite, "New Text", SWT.NONE);
//			txtNewText.setBounds(119, 42, 52, 17);

//			genericComposite = emfDetailsFactory.createDetailsComposite(
//					scrolledComposite, SWT.BORDER);
//			
//			
//			formToolkit.adapt(genericComposite);
//			
//			genericComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//
//			genericComposite.init(eObject);
//
//			
//			scrolledComposite.setContent(composite);
//			scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
//			
//			composite.layout(true, true);
			
//			formToolkit.adapt(scrolledComposite);
//			formToolkit.paintBordersFor(scrolledComposite);
//			scrolledComposite.setExpandHorizontal(true);
//			scrolledComposite.setExpandVertical(true);
//			
//			
//			formToolkit.adapt(genericComposite);
//			genericComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//			
//			parent.layout(true, true);
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

//	private void resetView() {
//		if (scrolledComposite != null)
//			scrolledComposite.dispose();
//
//		scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL
//				| SWT.BORDER);
//		scrolledComposite.setExpandHorizontal(true);
//	}
//
//	public void setFocus() {
//		scrolledComposite.setFocus();
//	}

}
