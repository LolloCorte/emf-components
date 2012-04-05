package it.rcpvision.emf.components.widgets;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Composite;

public class StructuredViewerAwareComposite extends Composite implements IStructuredViewerAware {

    private StructuredViewer viewer;

    public StructuredViewerAwareComposite(Composite parent, int style) {
        super(parent, style);
    }

    @Override
    public void setViewer(StructuredViewer viewer) {
        this.viewer = viewer;
    }

    @Override
    public StructuredViewer getViewer() {
        return viewer;
    }

}
