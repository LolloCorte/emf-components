package it.rcpvision.emf.components.examples.rap.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 */
public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);

		layout.addStandaloneView(View.ID, false, IPageLayout.LEFT, 1.0f,
				editorArea);
		
//		IFolderLayout left =
//                layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.26, editorArea);
//        left.addView(IPageLayout.ID_PROP_SHEET);
	}
}
