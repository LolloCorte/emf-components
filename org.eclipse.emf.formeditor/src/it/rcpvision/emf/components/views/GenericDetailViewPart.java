package it.rcpvision.emf.components.views;

import it.rcpvision.emf.components.old.ui.ButtonsComposite;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;

public class GenericDetailViewPart extends ViewPart implements
		ISelectionListener {
	public GenericDetailViewPart() {
	}

	private Composite main;

	private FormToolkit formToolkit;

	private ButtonsComposite buttonsComposite;

	private Resource modelResource;

	@Inject
	protected EmfDetailsFactory emfDetailsFactory;
	
	protected GenericComposite genericComponent;

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
//		Section sec = formToolkit.createSection(parent,
//				ExpandableComposite.TITLE_BAR);
//		sec.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//		sec.marginWidth = 10;
//		sec.marginHeight = 5;
//		sec.setText("Properties");
		main = formToolkit.createComposite(parent, SWT.BORDER);
		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		main.setLayout(new GridLayout(2, false));
		// MenuManager mm = new MenuManager("#DetailsPartMenu");
		// mm.setRemoveAllWhenShown(false);
		// mm.add(new Action("Reset to default") {
		// @Override
		// public void run() {
		// main.getDisplay().syncExec(new ResetToDefaultRunnable());
		// }
		// });

		// IActionBars actionBars = editor.getActionBars();
		// IAction oldCopyAction = actionBars
		// .getGlobalActionHandler(ActionFactory.COPY.getId());
		// actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
		// new ActionWrapper(oldCopyAction));
//		IWorkbenchWindow window = getSite().getWorkbenchWindow();

		// mm.add(ActionFactory.COPY.create(window));
		// mm.add(new Separator("additions"));
		// Menu menu = mm.createContextMenu(main);

		// editor.getSite().registerContextMenu(mm.getId(), mm, this);
		// createGenericPart(menu);
//		sec.setClient(main);

		// Section for ButtonComposite
		// Section secButtons = formToolkit.createSection(main,
		// ExpandableComposite.TITLE_BAR);
		// secButtons.marginWidth = 10;
		// secButtons.marginHeight = 5;
		// secButtons.setText("Buttons");
		// secButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// false, 1, 1));
		buttonsComposite = new ButtonsComposite(parent, SWT.NONE);
		buttonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.adapt(buttonsComposite);
		GridLayout gl_buttonsComposite = new GridLayout(3, false);
		gl_buttonsComposite.marginLeft = 20;
		buttonsComposite.setLayout(gl_buttonsComposite);
		new Label(buttonsComposite, SWT.NONE);
		new Label(buttonsComposite, SWT.NONE);
		buttonsComposite.addSaveSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					modelResource.save(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		// secButtons.setClient(buttonsComposite);

		// TODO
		getSite().getPage().addSelectionListener((ISelectionListener) this);

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			if (obj instanceof EObject) {
				EObject model = (EObject) obj;
				modelResource = model.eResource();
				if (genericComponent != null) {
					genericComponent.dispose();
				}
				// modelResource=new
				// CDOResourceImpl(CDOURIUtil.createResourceURI(CommonBusiness.getSession().openTransaction(),
				// "Cashflow#"+model.cdoID()));
				// CDOTransaction
				// transaction=CommonBusiness.getSession().openTransaction();
				// modelResource=transaction.getResource(model.eResource().getURI().path());
				// CDOObject transactionalObject=null;
				// for (EObject eObj : modelResource.getContents()) {
				// if (eObj instanceof CDOObject) {
				// CDOObject cdoObject = (CDOObject) eObj;
				// if(cdoObject.cdoID().equals(model.cdoID())){
				// transactionalObject=cdoObject;
				// }
				// }
				// }

				// modelResource=model.cdoResource();
				genericComponent = emfDetailsFactory.createDetailsComposite(
						main, SWT.NONE);
				formToolkit.adapt(genericComponent);
				genericComponent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
				genericComponent.init(modelResource.getResourceSet(), model);
				main.layout(true);
			}
		}
	}

	// private ExtXptFacade createExtXptFacade() {
	//
	//
	// modelResource.getEditingDomain().getResourceSet().setURIConverter(new
	// ExtensibleURIConverterImpl() {
	// @Override
	// public URI normalize(URI uri) {
	// if (ClasspathUriResolver.isClasspathUri(uri)) {
	// URI result = new ClasspathUriResolver().resolve(project, uri);
	// if (ClasspathUriResolver.isClasspathUri(result))
	// throw new
	// IllegalArgumentException("Couldn't find resource on classpath : " +
	// result);
	// result = super.normalize(result);
	// return result;
	// }
	// return super.normalize(uri);
	// }
	// });
	//
	// final List<EPackage> packs = findMetaModelPackages();
	// TypeSystemImpl ts = new TypeSystemImpl();
	// ts.registerMetaModel(new EmfRegistryMetaModel() {
	// @Override
	// protected EPackage[] allPackages() {
	// return packs.toArray(new EPackage[packs.size()]);
	// }
	// });
	// ExecutionContext context = new ExecutionContextImpl(new
	// WorkspaceResourceManager(Activator
	// .getExtXptModelManager().findProject(project)), ts, null);
	// return new ExtXptFacade(project, context);
	//
	// }
	//
	// private List<EPackage> findMetaModelPackages() {
	// //XXX Che era?
	// //createModel(); // initialize resources
	//
	// final List<EPackage> packs = new ArrayList<EPackage>();
	// EcoreUtil.resolveAll(modelResource.getEditingDomain().getResourceSet());
	// EList<Resource> resources =
	// modelResource.getEditingDomain().getResourceSet().getResources();
	// if (resources != null) {
	// for (Resource res : resources) {
	// TreeIterator<EObject> allContents = res.getAllContents();
	// if (allContents.hasNext()) {
	// EObject rootObject = allContents.next();
	// if (rootObject instanceof EPackage)
	// packs.add((EPackage) rootObject);
	// }
	// }
	// }
	// return packs;
	// }

	// private void createGenericPart(EObject model) {
	//
	// cleanUpMainComposite();
	// EClass eClass = model.eClass();
	// EList<EStructuralFeature> allStructuralFeatures = new
	// BasicEList<EStructuralFeature>(eClass
	// .getEAllStructuralFeatures());
	// Collections.sort(allStructuralFeatures, new
	// EStructuralfeatureComparator());
	//
	// adapterFactory = new
	// ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	//
	// adapterFactory.addAdapterFactory(new
	// ResourceItemProviderAdapterFactory());
	// adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
	// adapterFactory.addAdapterFactory(new
	// ReflectiveItemProviderAdapterFactory());
	//
	//
	//
	// factory=new CDOEditorFactory().createEmfSwtBindingFactory(adapterFactory,
	// modelResource.getEditingDomain(), null, main, formToolkit,
	// getExtXptFacade());
	//
	// for (final EStructuralFeature feature : allStructuralFeatures) {
	// if (EEPlugin.getDefault().shouldHideFeature(feature))
	// continue;
	//
	// // derived, unchangeable, container and containment features
	// // ignored
	// if (feature.isChangeable()
	// && !feature.isDerived()
	// && !(feature instanceof EReference && (((EReference)
	// feature).isContainment() || ((EReference) feature)
	// .isContainer()))) {
	// // first search for a label with explicit class (in case of an inherited
	// feature from a superclass)
	// String labelForFeature =
	// EEPlugin.getDefault().labelForFeature(eClass.getName(), feature);
	// if (labelForFeature == null)
	// labelForFeature = EEPlugin.getDefault().labelForFeature(feature);
	// // otherwise search for a label for the feature (in the original defining
	// class)
	//
	// if (labelForFeature != null)
	// createLabel(labelForFeature);
	// //TODO
	// // else
	// //
	// createLabel(editor.getExtendedReflectiveItemProvider().getTextForFeature(feature));
	//
	// final Control contr = factory.create(feature);
	//
	// // contr.setMenu(menu);
	// // contr.addFocusListener(new FocusAdapter() {
	// // @Override
	// // public void focusGained(org.eclipse.swt.events.FocusEvent e) {
	// // // FIXME hook ecore's action contributor or create
	// // // an own
	// // if (contr instanceof Text) {
	// // TextActionHandler textHandlerh = new TextActionHandler(actionBars);
	// // Text t = (Text) contr;
	// // textHandlerh.addText(t);
	// //
	// // textHandlerh.setCopyAction(ecoreCopy);
	// // textHandlerh.setCutAction(ecoreCut);
	// // textHandlerh.setPasteAction(ecorePaste);
	// // textHandlerh.setDeleteAction(ecoreDelete);
	// // actionBars.updateActionBars();
	// //
	// // }
	// // setSelection(new StructuredSelection(feature));
	// // }
	// //
	// // @Override
	// // public void focusLost(FocusEvent e) {
	// // actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
	// ecoreCopy);
	// // actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
	// ecoreCut);
	// // actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
	// ecoreDelete);
	// // actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
	// ecorePaste);
	// // }
	// // });
	// }
	// }
	// //TODO che fa?
	// // formToolkit.paintBordersFor(main);
	// }
	//
	// private ExtXptFacade getExtXptFacade() {
	// if(extXptFacade==null){
	// extXptFacade=createExtXptFacade();
	// }
	// return extXptFacade;
	// }
	//
	// private Label createLabel(String string) {
	// Label lab = formToolkit.createLabel(main, string);
	// lab.setLayoutData(new GridData());
	// return lab;
	// }
	//
	// private void cleanUpMainComposite() {
	// for (Control child : main.getChildren()) {
	// child.dispose();
	// }
	// }
	//
	// private final static class EStructuralfeatureComparator implements
	// Comparator<EStructuralFeature> {
	// public int compare(EStructuralFeature o1, EStructuralFeature o2) {
	// return nullSafe(o1).compareTo(nullSafe(o2));
	// }
	//
	// /**
	// * @param o1
	// * @return
	// */
	// private String nullSafe(EStructuralFeature o) {
	// String name = o.getName();
	// return name != null ? name : "";
	// }
	// }
	//
	// protected CDOResourceImpl getModelResource(){
	// if(modelResource==null){
	// URI uri
	// =CommonBusiness.createResourceURI("http://localhost:2036/demo/Cashflow");
	// modelResource=new CDOResourceImpl(uri);
	//
	// // Cashflow cashflow= CountervisionFactory.eINSTANCE.createCashflow();
	// // cashflow.getEntries().addAll(CashflowBusiness.findAllEntries());
	// // modelResource.setModel(cashflow);
	// }
	// return modelResource;
	// }

}
