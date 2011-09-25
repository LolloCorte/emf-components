/**
 * 
 */
package it.rcpvision.emf.components.editors;

import it.rcpvision.emf.components.handlers.ContentOutlineSelectionHandler;
import it.rcpvision.emf.components.listeners.EmfViewerMouseAdapter;
import it.rcpvision.emf.components.resource.EditingDomainFactory;
import it.rcpvision.emf.components.resource.EditingDomainResourceLoader;
import it.rcpvision.emf.components.resource.LoadResourceResponse;
import it.rcpvision.emf.components.views.EmfViewerFactory;

import java.util.EventObject;
import java.util.Iterator;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.google.inject.Inject;

/**
 * @author bettini
 * 
 */
public class EmfFormEditor extends EcoreEditor {

	@Inject
	protected EmfViewerFactory emfTreeViewerFactory;

	@Inject
	private EmfViewerMouseAdapter emfViewerMouseAdapter;

	@Inject
	protected ContentOutlineSelectionHandler contentOutlineSelectionHandler;

	@Inject
	protected EditingDomainFactory editingDomainFactory;

	@Inject
	protected EditingDomainResourceLoader resourceLoader;

	/**
	 * 
	 */
	public EmfFormEditor() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		initializeEditingDomain();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * Overridden so that it does nothing: it will be the viewer who initializes
	 * the editingDomain.
	 * 
	 * @see org.eclipse.emf.ecore.presentation.EcoreEditor#initializeEditingDomain()
	 */
	@Override
	protected void initializeEditingDomain() {
		editingDomain = editingDomainFactory.create();
		adapterFactory = (ComposedAdapterFactory) editingDomain
				.getAdapterFactory();
		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		editingDomain.getCommandStack().addCommandStackListener(
				new CommandStackListener() {
					public void commandStackChanged(final EventObject event) {
						getContainer().getDisplay().asyncExec(new Runnable() {
							public void run() {
								firePropertyChange(IEditorPart.PROP_DIRTY);

								// Try to select the affected objects.
								//
								Command mostRecentCommand = ((CommandStack) event
										.getSource()).getMostRecentCommand();
								if (mostRecentCommand != null) {
									setSelectionToViewer(mostRecentCommand
											.getAffectedObjects());
								}
								if (propertySheetPage != null
										&& !propertySheetPage.getControl()
												.isDisposed()) {
									propertySheetPage.refresh();
								}
							}
						});
					}
				});
	}

	/**
	 * Overridden so that it does nothing: it will be the viewer who initializes
	 * the editingDomain.
	 * 
	 * @generated NOT
	 */
	@Override
	public void createModelGen() {
	}

	/**
	 * Overridden so that it does nothing: it will be the viewer who initializes
	 * the editingDomain.
	 * 
	 * @generated NOT
	 */
	@Override
	public void createModel() {

	}

	@Override
	protected void createContextMenuFor(StructuredViewer viewer) {
		createContextMenuForGen(viewer);

		EmfViewerMouseAdapter listener = getEmfViewerMouseAdapter();
		viewer.getControl().addMouseListener(listener);
	}

	protected EmfViewerMouseAdapter getEmfViewerMouseAdapter() {
		if (emfViewerMouseAdapter.getEmfFormEditor() == null)
			emfViewerMouseAdapter.setEmfFormEditor(this);
		return emfViewerMouseAdapter;
	}

	@Override
	public void createPages() {
		// Create a page for the selection tree view.
		URI resourceURI = EditUIUtil.getURI(getEditorInput());

		LoadResourceResponse response = resourceLoader.getResource(
				editingDomain, resourceURI);

		handleProblems(response);

		Tree tree = new Tree(getContainer(), SWT.MULTI);
		TreeViewer emfTreeViewer = emfTreeViewerFactory.createTreeViewer(tree,
				editingDomain);
		selectionViewer = emfTreeViewer;
		setCurrentViewer(selectionViewer);

		updateActionBarContributor();

		new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

		createContextMenuFor(selectionViewer);

		int pageIndex = addPage(tree);
		setPageText(pageIndex, getString("_UI_SelectionPage_label"));

		setActivePage(0);

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		updateProblemIndication();
	}

	protected void handleProblems(LoadResourceResponse response) {
		Resource resource = response.getResource();
		Exception exception = response.getException();
		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource,
					analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters()
				.add(problemIndicationAdapter);
	}

	protected void updateActionBarContributor() {
		if (!editingDomain.getResourceSet().getResources().isEmpty()) {
			for (Iterator<EObject> i = editingDomain.getResourceSet()
					.getResources().get(0).getAllContents(); i.hasNext();) {
				EObject eObject = i.next();
				if (eObject instanceof ETypeParameter
						|| eObject instanceof EGenericType
						&& !((EGenericType) eObject).getETypeArguments()
								.isEmpty()) {
					((EcoreActionBarContributor) getActionBarContributor())
							.showGenerics(true);
					break;
				}
			}
		}
	}

	@Override
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer
							.setContentProvider(new AdapterFactoryContentProvider(
									adapterFactory));
					contentOutlineViewer.setLabelProvider(getLabelProvider());
					contentOutlineViewer.setInput(editingDomain
							.getResourceSet());

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources()
							.isEmpty()) {
						// Select the root object in the view.
						//
						contentOutlineViewer
								.setSelection(new StructuredSelection(
										editingDomain.getResourceSet()
												.getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager,
						IToolBarManager toolBarManager,
						IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager,
							statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this,
							actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage
					.addSelectionChangedListener(new ISelectionChangedListener() {
						// This ensures that we handle selections correctly.
						//
						public void selectionChanged(SelectionChangedEvent event) {
							handleContentOutlineSelection(event.getSelection());
						}
					});
		}

		return contentOutlinePage;
	}

	protected IBaseLabelProvider getLabelProvider() {
		return selectionViewer.getLabelProvider();
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static String getString(String key) {
		return EcoreEditorPlugin.INSTANCE.getString(key);
	}

	@Override
	public void handleContentOutlineSelection(ISelection selection) {
		if (contentOutlineSelectionHandler.getSelectionViewer() == null)
			contentOutlineSelectionHandler.setSelectionViewer(selectionViewer);
		contentOutlineSelectionHandler.handleContentOutlineSelection(selection);
	}

	protected boolean showOutlineView() {
		return true;
	}
}
