package it.rcpvision.emf.components.widgets;

import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.ui.provider.FeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormPropertyDescriptionProvider;

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

public class FormDetailComposite extends Composite {

	protected FormPropertyDescriptionProvider formPropertyDescriptionProvider;

	protected FormFeatureControlFactory formFeatureControlFactory;

	protected EditingDomainFinder editingDomainFinder;

	protected FeaturesProvider eClassFeatureProvider;

	protected ILabelProvider labelProvider;

	private final Composite main;

	FormToolkit toolkit;

	private final ScrolledForm scrolledForm;

	public FormDetailComposite(Composite parent, int style,
			FormPropertyDescriptionProvider formPropertyDescriptionProvider,
			FormFeatureControlFactory formFeatureControlFactory,
			EditingDomainFinder editingDomainFinder,
			ILabelProvider labelProvider,
			FeaturesProvider eClassFeatureProvider) {
		super(parent, style);
		this.formPropertyDescriptionProvider = formPropertyDescriptionProvider;
		this.formFeatureControlFactory = formFeatureControlFactory;
		this.editingDomainFinder = editingDomainFinder;
		this.labelProvider = labelProvider;
		this.eClassFeatureProvider = eClassFeatureProvider;

		toolkit = new FormToolkit(parent.getDisplay());

		toolkit.adapt(this);
		//toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, false));

		scrolledForm = toolkit.createScrolledForm(this);
		// make sure that the form takes all the space
		scrolledForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		//toolkit.paintBordersFor(scrolledForm);
		scrolledForm.getBody().setLayout(new GridLayout(2, false));

		formPropertyDescriptionProvider.setFormToolkit(toolkit);

		main = scrolledForm.getBody();
	}

	public void init(EObject model) {
		List<EStructuralFeature> features = eClassFeatureProvider
				.getFeatures(model);

		scrolledForm.setText(labelProvider.getText(model));
		scrolledForm.setImage(labelProvider.getImage(model));

		formFeatureControlFactory.init(
				editingDomainFinder.getEditingDomainFor(model), model, main,
				toolkit);

		for (final EStructuralFeature feature : features) {
			// derived, unchangeable, container and containment features
			// ignored
			if (feature.isChangeable()
					&& !feature.isDerived()
					&& !(feature instanceof EReference && (((EReference) feature).isContainment() 
//							|| ((EReference) feature).isContainer()
							))) {

				formPropertyDescriptionProvider.getLabel(main, feature);

				formFeatureControlFactory.create(feature);
			}
		}

		//toolkit.paintBordersFor(main);

		this.layout();
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
	}

	public FormPropertyDescriptionProvider getFormFeatureLabelProvider() {
		return formPropertyDescriptionProvider;
	}

	public void setFormFeatureLabelProvider(
			FormPropertyDescriptionProvider formPropertyDescriptionProvider) {
		this.formPropertyDescriptionProvider = formPropertyDescriptionProvider;
	}

	public FormFeatureControlFactory getEmfSwtBindingFactory() {
		return formFeatureControlFactory;
	}

	public void setEmfSwtBindingFactory(
			FormFeatureControlFactory formFeatureControlFactory) {
		this.formFeatureControlFactory = formFeatureControlFactory;
	}

	public EditingDomainFinder getEditingDomainFinder() {
		return editingDomainFinder;
	}

	public void setEditingDomainFinder(EditingDomainFinder editingDomainFinder) {
		this.editingDomainFinder = editingDomainFinder;
	}

	public FeaturesProvider geteClassFeatureProvider() {
		return eClassFeatureProvider;
	}

	public void seteClassFeatureProvider(
			FeaturesProvider eClassFeatureProvider) {
		this.eClassFeatureProvider = eClassFeatureProvider;
	}

	public ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

}
