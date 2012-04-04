package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

public abstract class AbstractSaveableResourceTableView extends
		AbstractSaveableResourceView {

	@Inject
	protected TableViewerBuilder tableViewerBuilder;

	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	private TableViewer tableViewer;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);

		tableViewerBuilder.buildAndFill(tableViewer,
				getContents(getResource()), getEClass());
	}

	protected abstract Object getContents(Resource resource);

	protected abstract EClass getEClass();

	@Override
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}


}
