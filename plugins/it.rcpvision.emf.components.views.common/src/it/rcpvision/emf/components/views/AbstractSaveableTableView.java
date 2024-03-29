package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.builders.TableViewerBuilder;
import it.rcpvision.emf.components.resource.ResourceLoader;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

public abstract class AbstractSaveableTableView extends AbstractSaveableView {

	@Inject
	protected TableViewerBuilder tableViewerBuilder;

	@Inject
	protected ResourceLoader resourceLoader;

	protected TableViewer tableViewer;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);

		tableViewerBuilder.buildAndFill(tableViewer,
				getContents(getResource()), getEClass());
		
		addContextMenu(tableViewer);
		
		getSite().setSelectionProvider(tableViewer);
	}

	/**
	 * @param resource
	 * @return the contents from the passed resource to be shown in the table
	 */
	protected abstract Object getContents(Resource resource);

	/**
	 * @return the {@link EClass} for objects to be shown in the table
	 */
	protected abstract EClass getEClass();

	@Override
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	public TableViewer getViewer() {
		return tableViewer;
	}

	@Override
	protected void mostRecentCommandAffectsResource(Command mostRecentCommand) {
		super.mostRecentCommandAffectsResource(mostRecentCommand);
		// for TableViewer the refresh does not seem to be automatic
		tableViewer.refresh();
	}
}
