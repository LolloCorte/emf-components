package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.old.ui.ButtonsComposite;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class GenericDetailViewPart extends ViewPart implements
		ISelectionListener, ISaveablePart2 {
	private Composite main;

	private FormToolkit formToolkit;

	private ButtonsComposite buttonsComposite;

	private Resource modelResource;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;

	@Inject
	protected EObjectManager objectManager;

	protected GenericDetailComposite genericComponent;

	private boolean modified = false;

	@Override
	public void setFocus() {
		main.setFocus();
	}

	public void createPartControl(Composite parent) {
		formToolkit = new FormToolkit(parent.getDisplay());
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 0;
		gl_parent.marginHeight = 0;
		gl_parent.horizontalSpacing = 0;
		parent.setLayout(gl_parent);

		main = formToolkit.createComposite(parent, SWT.BORDER);
		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		main.setLayout(new GridLayout(2, false));

		buttonsComposite = new ButtonsComposite(parent, SWT.NONE);
		buttonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 1));
		formToolkit.adapt(buttonsComposite);
		GridLayout gl_buttonsComposite = new GridLayout(3, false);
		gl_buttonsComposite.marginLeft = 20;
		buttonsComposite.setLayout(gl_buttonsComposite);
		new Label(buttonsComposite, SWT.NONE);
		new Label(buttonsComposite, SWT.NONE);
		buttonsComposite.addSaveSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				objectManager.doSave(modelResource);
			}

		});

		getSite().getPage().addSelectionListener((ISelectionListener) this);

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			if (obj instanceof EObject) {
				EObject model = objectManager.prepareModel(obj);

				if (genericComponent != null) {
					genericComponent.dispose();
				}

				genericComponent = emfDetailsFactory.createDetailsComposite(
						main, SWT.NONE);
				formToolkit.adapt(genericComponent);
				genericComponent.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
						true, true, 1, 1));
				model.eAdapters().add(new Adapter() {

					@Override
					public void notifyChanged(Notification notification) {
						modified = true;
						firePropertyChange(PROP_DIRTY);
					}

					@Override
					public Notifier getTarget() {
						// Auto-generated method stub
						return null;
					}

					@Override
					public void setTarget(Notifier newTarget) {
					}

					@Override
					public boolean isAdapterForType(Object type) {
						// Auto-generated method stub
						return false;
					}

				});
				modelResource = model.eResource();

				genericComponent.init(model);

				main.layout(true);
			}
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		objectManager.doSave(modelResource);
		modified = false;
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public void doSaveAs() {
		//
	}

	@Override
	public boolean isDirty() {
		return modified
				|| (modelResource != null ? modelResource.isModified() : false);
	}

	@Override
	public boolean isSaveAsAllowed() {
		// Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveOnCloseNeeded() {
		// Auto-generated method stub
		return true;
	}

	@Override
	public int promptToSaveOnClose() {
		// Auto-generated method stub
		return 0;
	}

}
