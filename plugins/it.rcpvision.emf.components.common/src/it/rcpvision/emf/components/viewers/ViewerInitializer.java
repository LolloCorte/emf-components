/**
 * 
 */
package it.rcpvision.emf.components.viewers;

import it.rcpvision.emf.components.edit.actionbar.WorkbenchActionBarContributor;
import it.rcpvision.emf.components.edit.actionbar.TreeActionBarContributor;
import it.rcpvision.emf.components.menus.ViewerContextMenuFactory;
import it.rcpvision.emf.components.resource.ResourceLoader;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Manager for viewers for EMF resources.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ViewerInitializer {

	@Inject
	protected ResourceLoader resourceLoader;

	@Inject
	protected Provider<AdapterFactoryEditingDomain> editingDomainProvider;

	@Inject
	protected Provider<AdapterFactory> adapterFactoryProvider;

	@Inject
	protected ViewerContextMenuFactory viewerContextMenuFactory;

	@Inject
	protected Provider<IContentProvider> contentProviderProvider;
	
	@Inject
	protected Provider<ILabelProvider> labelProviderProvider;

	public void initialize(StructuredViewer viewer, URI resourceURI) {
		initialize(viewer, loadResource(resourceURI));
	}

	public void initialize(StructuredViewer viewer, Resource resource) {
		initialize(viewer, resource, createAdapterFactory());
	}

	public void initialize(StructuredViewer viewer, EObject eObject) {
		initialize(viewer, eObject, createAdapterFactory());
	}

	protected AdapterFactory createAdapterFactory() {
		return adapterFactoryProvider.get();
	}

	public void initialize(StructuredViewer viewer,
			AdapterFactoryEditingDomain editingDomain) {
		ResourceSet resourceSet = editingDomain.getResourceSet();
		AdapterFactory editingDomainAdapterFactory = editingDomain
				.getAdapterFactory();
		initialize(viewer, resourceSet, editingDomainAdapterFactory);
	}

	/**
	 * @param viewer
	 * @param input
	 * @param adapterFactory
	 */
	public void initialize(StructuredViewer viewer, Object input,
			AdapterFactory adapterFactory) {
//		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
//				adapterFactory);
		initialize(viewer, input, contentProviderProvider.get(),
				labelProviderProvider.get());
	}

	/**
	 * @param viewer
	 * @param input
	 * @param contentProvider
	 * @param labelProvider
	 *            can be null (in that case it is not set)
	 */
	public void initialize(StructuredViewer viewer, Object input,
			IContentProvider contentProvider,
			IBaseLabelProvider labelProvider) {
		viewer.setContentProvider(contentProvider);
		if (labelProvider != null)
			viewer.setLabelProvider(labelProvider);
		viewer.setInput(input);
	}

	/**
	 * Adds a context menu to the passed {@link StructuredViewer}.
	 * 
	 * The passed {@link IMenuListener} should implement a method like
	 * 
	 * <pre>
	 * public void menuAboutToShow(IMenuManager menuManager) {
	 * 	actionBarContributor.menuAboutToShow(menuManager);
	 * }
	 * </pre>
	 * 
	 * @param viewer
	 * @param actionBarContributor
	 *            should be created by injection
	 * @param editingDomain
	 *            should be created by injection
	 * @param menuListener
	 *            the listener should have a method like
	 * @param activePart
	 */
	public void addContextMenu(StructuredViewer viewer,
			WorkbenchActionBarContributor actionBarContributor,
			AdapterFactoryEditingDomain editingDomain,
			IMenuListener menuListener, IWorkbenchPart activePart) {

		MenuManager menuManager = viewerContextMenuFactory
				.createContextMenuFor(viewer, editingDomain);
		activePart.getSite().registerContextMenu(menuManager,
				new UnwrappingSelectionProvider(viewer));
		
		menuManager.addMenuListener(menuListener);

		ViewerSelectionProvider viewerSelectionProvider = new ViewerSelectionProvider(
				viewer);
		actionBarContributor
				.setExplicitSelectionProvider(viewerSelectionProvider);
		viewerSelectionProvider
				.addSelectionChangedListener(actionBarContributor);

		actionBarContributor.setActivePart(activePart);
	}
	
	
	
	
	public void addContextMenu(StructuredViewer viewer, 
			TreeActionBarContributor treeActionBarContributor,
			AdapterFactoryEditingDomain editingDomain, 
			IMenuListener menuListener){
		
		final MenuManager menuManager = viewerContextMenuFactory
				.createContextMenuFor(viewer, editingDomain);

		menuManager.addMenuListener(menuListener);
//		ViewerSelectionProvider viewerSelectionProvider = new ViewerSelectionProvider(viewer);
//		viewerSelectionProvider.addSelectionChangedListener(treeActionBarContributor);
		viewer.addSelectionChangedListener(treeActionBarContributor);
		treeActionBarContributor.initialize(editingDomain);
		
	}

	protected AdapterFactoryEditingDomain loadResource(URI resourceURI) {
		AdapterFactoryEditingDomain editingDomain = editingDomainProvider.get();
		resourceLoader.getResource(editingDomain, resourceURI);
		return editingDomain;
	}

}
