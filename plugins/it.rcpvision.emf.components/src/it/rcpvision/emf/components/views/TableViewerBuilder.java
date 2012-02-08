/**
 * 
 */
package it.rcpvision.emf.components.views;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
	protected EmfViewerManager emfViewerManager;

	public void buildAndFill(TableViewer tableViewer, Object contents,
			EClass eClass) {
		buildAndFill(tableViewer, contents, eClass, new ArrayContentProvider());
	}

	public void buildAndFill(TableViewer tableViewer, Object contents,
			EClass eClass, IStructuredContentProvider contentProvider) {
		columnBuilder.buildTableViewer(tableViewer, eClass);
		emfViewerManager.initialize(tableViewer, ensureCollection(contents),
				contentProvider, null);
	}

	protected Collection<?> ensureCollection(Object contents) {
		if (contents instanceof Collection<?>)
			return (Collection<?>) contents;
		else
			return Collections.singleton(contents);
	}
}
