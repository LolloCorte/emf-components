package org.eclipse.emf.formeditor.views;

import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.formeditor.ui.binding.EmfSwtBindingFactory;
import org.eclipse.emf.formeditor.ui.provider.FeatureLabelProvider;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Provider;

public class GenericComposite extends Composite {

	private FormToolkit formToolkit;

	private ComposedAdapterFactory adapterFactory;

	private ResourceSet resourceSet;

	protected FeatureLabelProvider featureLabelProvider;
	
	protected Provider<EmfSwtBindingFactory> bindingFactoryProvider;
	
	protected Provider<ComposedAdapterFactory> composedAdapterFactoryProvider;
	
	public GenericComposite(Composite parent, int style,
			FeatureLabelProvider featureLabelProvider,
			Provider<EmfSwtBindingFactory> bindingFactoryProvider,
			Provider<ComposedAdapterFactory> composedAdapterFactoryProvider) {
		super(parent, style);
		this.featureLabelProvider = featureLabelProvider;
		this.bindingFactoryProvider = bindingFactoryProvider;
		this.composedAdapterFactoryProvider = composedAdapterFactoryProvider;
	}

	public void init(ResourceSet rs, EObject model) {

		EClass eClass = model.eClass();
		EList<EStructuralFeature> allStructuralFeatures = new BasicEList<EStructuralFeature>(
				eClass.getEAllStructuralFeatures());
		Collections.sort(allStructuralFeatures,
				new EStructuralfeatureComparator());

		this.resourceSet = rs;
		adapterFactory = composedAdapterFactoryProvider.get();
		
		formToolkit = new FormToolkit(getParent().getDisplay());
		featureLabelProvider.setFormToolkit(formToolkit);

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
				featureLabelProvider.getLabel(this, feature);

				// createLabel(editor.getExtendedReflectiveItemProvider().getTextForFeature(feature));

				final Control contr = factory.create(feature);

				// contr.setMenu(menu);
				// contr.addFocusListener(new FocusAdapter() {
				// @Override
				// public void focusGained(org.eclipse.swt.events.FocusEvent e)
				// {
				// // FIXME hook ecore's action contributor or create
				// // an own
				// if (contr instanceof Text) {
				// TextActionHandler textHandlerh = new
				// TextActionHandler(actionBars);
				// Text t = (Text) contr;
				// textHandlerh.addText(t);
				//
				// textHandlerh.setCopyAction(ecoreCopy);
				// textHandlerh.setCutAction(ecoreCut);
				// textHandlerh.setPasteAction(ecorePaste);
				// textHandlerh.setDeleteAction(ecoreDelete);
				// actionBars.updateActionBars();
				//
				// }
				// setSelection(new StructuredSelection(feature));
				// }
				//
				// @Override
				// public void focusLost(FocusEvent e) {
				// actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
				// ecoreCopy);
				// actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
				// ecoreCut);
				// actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
				// ecoreDelete);
				// actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
				// ecorePaste);
				// }
				// });
			}
		}

		setLayout(new GridLayout(2, false));
		// TODO che fa?
		formToolkit.paintBordersFor(this);
		this.layout();
//		getParent().pack();
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
