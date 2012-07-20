package it.rcpvision.emf.components.widgets;

import it.rcpvision.emf.components.binding.FormFeatureControlFactory;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelFactory;

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

	protected FormFeatureLabelFactory formFeatureLabelFactory;

	protected FormFeatureControlFactory formFeatureControlFactory;

	protected EditingDomainFinder editingDomainFinder;

	protected EStructuralFeaturesProvider eClassFeatureProvider;

	protected ILabelProvider labelProvider;

	private final Composite main;

	FormToolkit toolkit;

	private final ScrolledForm scrolledForm;

	public FormDetailComposite(Composite parent, int style,
			FormFeatureLabelFactory formFeatureLabelFactory,
			FormFeatureControlFactory formFeatureControlFactory,
			EditingDomainFinder editingDomainFinder,
			ILabelProvider labelProvider,
			EStructuralFeaturesProvider eClassFeatureProvider) {
		super(parent, style);
		this.formFeatureLabelFactory = formFeatureLabelFactory;
		this.formFeatureControlFactory = formFeatureControlFactory;
		this.editingDomainFinder = editingDomainFinder;
		this.labelProvider = labelProvider;
		this.eClassFeatureProvider = eClassFeatureProvider;

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

		formFeatureLabelFactory.setFormToolkit(toolkit);

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

				formFeatureLabelFactory.getLabel(main, feature);

				formFeatureControlFactory.create(feature);
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

	public FormFeatureLabelFactory getFormFeatureLabelProvider() {
		return formFeatureLabelFactory;
	}

	public void setFormFeatureLabelProvider(
			FormFeatureLabelFactory formFeatureLabelFactory) {
		this.formFeatureLabelFactory = formFeatureLabelFactory;
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

	public EStructuralFeaturesProvider geteClassFeatureProvider() {
		return eClassFeatureProvider;
	}

	public void seteClassFeatureProvider(
			EStructuralFeaturesProvider eClassFeatureProvider) {
		this.eClassFeatureProvider = eClassFeatureProvider;
	}

	public ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

}
