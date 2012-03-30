package it.rcpvision.emf.components.widgets;

import it.rcpvision.emf.components.binding.EmfSwtBindingFactory;
import it.rcpvision.emf.components.edit.EditingDomainFinder;
import it.rcpvision.emf.components.factories.JfaceProviderFactory;
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider;
import it.rcpvision.emf.components.ui.provider.FormFeatureLabelProvider;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Provider;

public class SelectionViewerAwareComposite extends Composite implements ISelectionViewerAware {

    private StructuredViewer viewer;

    public SelectionViewerAwareComposite(Composite parent, int style) {
        super(parent, style);
    }

    @Override
    public void setViewer(StructuredViewer viewer) {
        this.viewer = viewer;
    }

    public StructuredViewer getViewer() {
        return viewer;
    }

}
