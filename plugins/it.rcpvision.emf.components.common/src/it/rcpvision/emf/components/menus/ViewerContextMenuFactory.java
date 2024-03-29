/**
 * 
 */
package it.rcpvision.emf.components.menus;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Menu;

/**
 * @author Lorenzo Bettini
 * 
 */
public class ViewerContextMenuFactory {

	public MenuManager createContextMenuFor(StructuredViewer viewer,
			AdapterFactoryEditingDomain editingDomain) {
		MenuManager menuManager = createMenuManager();
		createMenu(viewer, menuManager);
		
		addDragAndDrop(viewer, editingDomain);
		
		return menuManager;
	}

	protected void addDragAndDrop(StructuredViewer viewer,
			AdapterFactoryEditingDomain editingDomain) {
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(
				viewer));
		viewer.addDropSupport(dndOperations, transfers,
				new EditingDomainViewerDropAdapter(editingDomain,
						viewer));
	}

	protected void createMenu(StructuredViewer viewer,
			MenuManager menuManager) {
		Menu menu = menuManager.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		
	}

	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("#PopUp");
		menuManager.add(new Separator("additions"));
		menuManager.setRemoveAllWhenShown(true);
		return menuManager;
	}

}
