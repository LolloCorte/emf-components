package it.rcpvision.emf.components.widgets;

import org.eclipse.jface.viewers.StructuredViewer;

public interface IStructuredViewerAware {

    public void setViewer(StructuredViewer viewer);
    
    public StructuredViewer getViewer();

}
