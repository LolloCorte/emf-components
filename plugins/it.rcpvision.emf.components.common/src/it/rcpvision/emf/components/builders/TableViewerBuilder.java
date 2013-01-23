/**
 * 
 */
package it.rcpvision.emf.components.builders;

import it.rcpvision.emf.components.util.EmfComponentsUtil;
import it.rcpvision.emf.components.viewers.ViewerInitializer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 * 
 */
public class TableViewerBuilder {

	@Inject
	protected TableViewerColumnBuilder columnBuilder;

	@Inject
	protected ViewerInitializer viewerInitializer;

	public void buildAndFill(TableViewer tableViewer, Object contents,
			EClass eClass) {
		buildAndFill(tableViewer, contents, eClass, new ArrayContentProvider());
	}

	public void buildAndFill(TableViewer tableViewer, Object contents,
			EClass eClass, IStructuredContentProvider contentProvider) {
		buildAndFill(tableViewer, contents, eClass, contentProvider, null);
	}

	public void buildAndFill(TableViewer tableViewer, Object contents,
			EClass eClass, IStructuredContentProvider contentProvider,
			IBaseLabelProvider labelProvider) {
		columnBuilder.buildTableViewer(tableViewer, eClass, contentProvider);
		viewerInitializer.initialize(tableViewer,
				EmfComponentsUtil.ensureCollection(contents), contentProvider,
				labelProvider);
	}

}
