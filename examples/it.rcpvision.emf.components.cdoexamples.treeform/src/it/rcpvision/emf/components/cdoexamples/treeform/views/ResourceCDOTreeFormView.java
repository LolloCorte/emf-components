package it.rcpvision.emf.components.cdoexamples.treeform.views;

import it.rcpvision.emf.components.cdoexample.model.business.ModelBusiness;
import it.rcpvision.emf.components.factories.EmfCompositeFactory;
import it.rcpvision.emf.components.widgets.TreeFormComposite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class ResourceCDOTreeFormView extends ViewPart {

	@Inject
	protected EmfCompositeFactory emfCompositeFactory;

	protected TreeFormComposite treeFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		treeFormComposite = emfCompositeFactory.createTreeFormComposite(parent,
				SWT.BORDER);

		treeFormComposite.update(ModelBusiness.getOrCreateModel());
	}

	@Override
	public void setFocus() {
		treeFormComposite.setFocus();
	}

}
