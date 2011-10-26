 package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GenericTableViewPart extends ViewPart implements ISelectionListener {

	private FormToolkit formToolkit;

	private Composite main;
	
	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	private GenericTableComposite genericComponent;

	private EStructuralFeature feature;
	
	@Override
	public void createPartControl(Composite parent) {
		formToolkit = new FormToolkit(parent.getDisplay());
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 0;
		gl_parent.marginHeight = 0;
		gl_parent.horizontalSpacing = 0;
		parent.setLayout(gl_parent);
//		Section sec = formToolkit.createSection(parent,
//				ExpandableComposite.TITLE_BAR);
//		sec.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//		sec.marginWidth = 10;
//		sec.marginHeight = 5;
//		sec.setText("Properties");
		main = formToolkit.createComposite(parent, SWT.BORDER);
		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		main.setLayout(new GridLayout(2, false));
		// TODO
		getSite().getPage().addSelectionListener((ISelectionListener) this);

	}
	
	

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			if (obj instanceof EObject) {
				EObject model = (EObject)obj;
				if (genericComponent != null) {
					genericComponent.dispose();
				}
				
				genericComponent = emfDetailsFactory.createTableComposite(
						main, SWT.NONE);
				formToolkit.adapt(genericComponent);
				
				
				genericComponent.init((EList) model.eGet(firstFeature(model.eClass())));
				main.layout(true);
			}
		}
	}

	private EStructuralFeature firstFeature(EClass eClass) {
		EList<EStructuralFeature> allStructuralFeatures = new BasicEList<EStructuralFeature>(eClass.getEAllStructuralFeatures());
		for (final EStructuralFeature feature : allStructuralFeatures) {
			// derived, unchangeable, container and containment features
			// ignored
			if (feature.isChangeable() && !feature.isDerived() && (feature instanceof EReference && ((EReference) feature).isMany())) {
				 return feature;
			}
		}
		return null;
	}



	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	

}
