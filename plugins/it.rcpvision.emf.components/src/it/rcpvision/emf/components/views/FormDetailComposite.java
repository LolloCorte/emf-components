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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Provider;

public class FormDetailComposite extends Composite {

	private FormToolkit formToolkit;

	private ComposedAdapterFactory adapterFactory;

	protected FormFeatureLabelProvider formFeatureLabelProvider;

	protected Provider<EmfSwtBindingFactory> bindingFactoryProvider;

	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;

	public FormDetailComposite(Composite parent, int style,
			FormFeatureLabelProvider formFeatureLabelProvider,
			Provider<EmfSwtBindingFactory> bindingFactoryProvider,
			Provider<ComposedAdapterFactory> composedAdapterFactoryProvider) {
		super(parent, style);
		this.formFeatureLabelProvider = formFeatureLabelProvider;
		this.bindingFactoryProvider = bindingFactoryProvider;
		this.composedAdapterFactoryProvider = composedAdapterFactoryProvider;
	}

	public void init(EObject model) {
		EClass eClass = model.eClass();
		EList<EStructuralFeature> allStructuralFeatures = new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
		Collections.sort(allStructuralFeatures,
				new EStructuralfeatureComparator());

		adapterFactory = composedAdapterFactoryProvider.get();

		formToolkit = new FormToolkit(getParent().getDisplay());
		formFeatureLabelProvider.setFormToolkit(formToolkit);

		// TODO EditingDomain
		EmfSwtBindingFactory factory = bindingFactoryProvider.get();
		factory.init(adapterFactory, null, model, this, formToolkit);

		for (final EStructuralFeature feature : allStructuralFeatures) {
			// derived, unchangeable, container and containment features
			// ignored
			if (feature.isChangeable()
					&& !feature.isDerived()
					&& !(feature instanceof EReference && (((EReference) feature)
							.isContainment() || ((EReference) feature)
							.isContainer()))) {
				formFeatureLabelProvider.getLabel(this, feature);

				factory.create(feature);

			}
		}

		setLayout(new GridLayout(2, false));
		setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(this);
		this.layout();
		// getParent().pack();
	}

	@Override
	public void dispose() {
		super.dispose();
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
