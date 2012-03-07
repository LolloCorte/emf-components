package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ILabelProvider;
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

	protected Provider<JfaceProviderFactory> jfaceProviderFactoryProvider;

	protected Provider<EStructuralFeaturesProvider> eClassFeatureProviderProvider;

	private Composite main;

	FormToolkit toolkit;

	private ScrolledForm scrolledForm;

	public FormDetailComposite(Composite parent, int style,
			FormFeatureLabelProvider formFeatureLabelProvider,
			Provider<EmfSwtBindingFactory> bindingFactoryProvider,
			Provider<EditingDomainFinder> editingDomainFinderProvider,
			Provider<JfaceProviderFactory> jfaceProviderFactoryProvider,
			Provider<EStructuralFeaturesProvider> eClassFeatureProviderProvider) {
		super(parent, style);
		this.formFeatureLabelProvider = formFeatureLabelProvider;
		this.bindingFactoryProvider = bindingFactoryProvider;
		this.editingDomainFinderProvider = editingDomainFinderProvider;
		this.jfaceProviderFactoryProvider = jfaceProviderFactoryProvider;
		this.eClassFeatureProviderProvider = eClassFeatureProviderProvider;

		toolkit = new FormToolkit(parent.getDisplay());

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, false));

		scrolledForm = toolkit.createScrolledForm(this);
		// make sure that the form takes all the space
		scrolledForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		toolkit.paintBordersFor(scrolledForm);
		scrolledForm.getBody().setLayout(new GridLayout(2, false));

		formFeatureLabelProvider.setFormToolkit(toolkit);

		main = scrolledForm.getBody();
	}

	public void init(EObject model) {
		List<EStructuralFeature> features = eClassFeatureProviderProvider.get()
				.getFeatures(model);

		ILabelProvider labelProvider = jfaceProviderFactoryProvider.get()
				.createLabelProvider();
		scrolledForm.setText(labelProvider.getText(model));
		scrolledForm.setImage(labelProvider.getImage(model));

		EmfSwtBindingFactory factory = bindingFactoryProvider.get();
		factory.init(
				editingDomainFinderProvider.get().getEditingDomainFor(model),
				model, main, toolkit);

		for (final EStructuralFeature feature : features) {
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

}
