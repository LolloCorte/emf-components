package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.edit.EditingDomainFinder;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.google.inject.Provider;

public class FormDetailComposite extends Composite {

	protected FormFeatureLabelProvider formFeatureLabelProvider;

	protected Provider<EmfSwtBindingFactory> bindingFactoryProvider;

	protected Provider<EditingDomainFinder> editingDomainFinderProvider;

	private Composite main;

	FormToolkit toolkit;

	public FormDetailComposite(Composite parent, int style,
			FormFeatureLabelProvider formFeatureLabelProvider,
			Provider<EmfSwtBindingFactory> bindingFactoryProvider,
			Provider<EditingDomainFinder> editingDomainFinderProvider) {
		super(parent, style);
		this.formFeatureLabelProvider = formFeatureLabelProvider;
		this.bindingFactoryProvider = bindingFactoryProvider;
		this.editingDomainFinderProvider = editingDomainFinderProvider;

		toolkit = new FormToolkit(parent.getDisplay());

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, false));

		ScrolledForm scrolledForm = toolkit.createScrolledForm(this);
		scrolledForm.setText("My Form");
		// make sure that the form takes all the space
		scrolledForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		toolkit.paintBordersFor(scrolledForm);
		scrolledForm.getBody().setLayout(new GridLayout(2, false));

		formFeatureLabelProvider.setFormToolkit(toolkit);

		main = scrolledForm.getBody();
	}

	public void init(EObject model) {
		EClass eClass = model.eClass();
		EList<EStructuralFeature> allStructuralFeatures = new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
		Collections.sort(allStructuralFeatures,
				new EStructuralfeatureComparator());

		EmfSwtBindingFactory factory = bindingFactoryProvider.get();
		factory.init(editingDomainFinderProvider.get()
				.getEditingDomainFor(model), model, main, toolkit);

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

		toolkit.paintBordersFor(main);

		this.layout();
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

		private String nullSafe(EStructuralFeature o) {
			String name = o.getName();
			return name != null ? name : "";
		}
	}

}
