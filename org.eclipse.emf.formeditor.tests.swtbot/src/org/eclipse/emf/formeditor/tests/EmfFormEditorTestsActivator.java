package org.eclipse.emf.formeditor.tests;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class EmfFormEditorTestsActivator extends AbstractUIPlugin {

	// The shared instance
	private static EmfFormEditorTestsActivator plugin;
	
	public static final String EMF_FORM_EDITOR_NO_MOUSE_ID = "org.eclipse.emf.formeditor.noMouseEvents";
	
	public static final String EMF_FORM_EDITOR_CUSTOM_LABEL = "org.eclipse.emf.formeditor.customLabel";

	public static final String EMF_FORM_EDITOR_FOR_STATEMACHINE = "org.eclipse.emf.formeditor.statemachine";

	public static final String EMF_EDITOR_FOR_LIBRARY = "org.eclipse.emf.formeditor.customLibrary";

	public EmfFormEditorTestsActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static EmfFormEditorTestsActivator getDefault() {
		return plugin;
	}

	public static String localFileContents(String filename)
			throws IOException {
		IPath path = new Path("models/" + filename);
		URL url = FileLocator.find(getDefault().getBundle(), path, null);
		url = FileLocator.resolve(url);
		url.toExternalForm();
		File f = new File(url.getFile());
		if (f.exists()) {
			return readFileAsString(f);
		}
		return f.getAbsolutePath();
	}

	private static String readFileAsString(File file) throws IOException {
		byte[] buffer = new byte[(int) file.length()];
		BufferedInputStream f = null;
		try {
			f = new BufferedInputStream(new FileInputStream(file));
			f.read(buffer);
		} finally {
			if (f != null)
				try {
					f.close();
				} catch (IOException ignored) {
				}
		}
		return new String(buffer);
	}

}
