package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.ui.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;

import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.google.inject.Provider;

public class FormDetailComposite extends Composite {

	private ManagedForm managedForm;

	private ComposedAdapterFactory adapterFactory;

	protected FormFeatureLabelProvider formFeatureLabelProvider;

	protected Provider<EmfSwtBindingFactory> bindingFactoryProvider;

	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;
	
	private Composite main;
	
	FormToolkit toolkit;
	

	public FormDetailComposite(Composite parent, int style,
			FormFeatureLabelProvider formFeatureLabelProvider,
			Provider<EmfSwtBindingFactory> bindingFactoryProvider,
			Provider<ComposedAdapterFactory> composedAdapterFactoryProvider) {
		super(parent, style);
		this.formFeatureLabelProvider = formFeatureLabelProvider;
		this.bindingFactoryProvider = bindingFactoryProvider;
		this.composedAdapterFactoryProvider = composedAdapterFactoryProvider;
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, false));
		
		ScrolledForm scrldfrmNewScrolledform = toolkit.createScrolledForm(this);
		scrldfrmNewScrolledform.setText("My Form");
		scrldfrmNewScrolledform.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(scrldfrmNewScrolledform);
		scrldfrmNewScrolledform.getBody().setLayout(new GridLayout(2, false));
		
//		ScrolledForm form = new ScrolledForm(parent) {
//			@Override
//			public void reflow(boolean flushCache) {
//				super.reflow(flushCache);
//			}
//		};
//		form.setExpandHorizontal(true);
//		form.setExpandVertical(true);
//		form.setBackground(toolkit.getColors().getBackground());
//		form.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
//		form.setFont(JFaceResources.getHeaderFont());
//		toolkit.adapt(parent);

//		managedForm = new ManagedForm(toolkit, form);
//		managedForm.getForm().setText("Generic Editor");
//		managedForm.getToolkit().decorateFormHeading(managedForm.getForm().getForm());
//		managedForm.getForm().getForm().setToolBarVerticalAlignment(SWT.TOP);
		
		formFeatureLabelProvider.setFormToolkit(toolkit);
		
		main = scrldfrmNewScrolledform.getBody();
	}

	public void init(EObject model) {
		EClass eClass = model.eClass();
		EList<EStructuralFeature> allStructuralFeatures = new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
		Collections.sort(allStructuralFeatures,
				new EStructuralfeatureComparator());

//		main = managedForm.getToolkit().createComposite(this);
//		main.setLayout(new GridLayout(2, false));

		adapterFactory = composedAdapterFactoryProvider.get();

		// TODO EditingDomain
		EmfSwtBindingFactory factory = bindingFactoryProvider.get();
		factory.init(adapterFactory, null, model, main, toolkit);

		for (final EStructuralFeature feature : allStructuralFeatures) {
			// derived, unchangeable, container and containment features
			// ignored
			if (feature.isChangeable()
					&& !feature.isDerived()
					&& !(feature instanceof EReference && (((EReference) feature)
							.isContainment() || ((EReference) feature)
							.isContainer()))) {
				formFeatureLabelProvider.getLabel(main, feature);

				factory.create(feature);

			}
		}

//		setLayout(new GridLayout(2, false));
//		setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(main);
		
//		managedForm.getToolkit().paintBordersFor(main);
		
		this.layout();
		// getParent().pack();
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
	}

	private final static class EStructuralfeatureComparator implements
			Comparator<EStructuralFeature> {
		public int compare(EStructuralFeature o1, EStructuralFeature o2) {
			return nullSafe(o1).compareTo(nullSafe(o2));
		}

		/**
		 * @param o1
		 * @return
		 */
		private String nullSafe(EStructuralFeature o) {
			String name = o.getName();
			return name != null ? name : "";
		}
	}

}