package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.EmfComponentsGuiceModule;
import it.rcpvision.emf.components.examples.rap.model.Element;
import it.rcpvision.emf.components.examples.rap.model.Item;
import it.rcpvision.emf.components.examples.rap.model.Model;
import it.rcpvision.emf.components.examples.rap.model.ModelFactory;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;
import it.rcpvision.emf.components.ui.provider.ViewerLabelProvider;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.google.inject.Inject;

public class GuiceModule extends EmfComponentsGuiceModule {

	public static class CustomEmptyResourceInitializer extends
			EmptyResourceInitializer {
		public void initialize(org.eclipse.emf.ecore.resource.Resource resource) {
			Model model = ModelFactory.eINSTANCE.createModel();
			model.setName("My Model");

			Element firstElement = addElement(model, "First Element", 1);
			Element secondElement = addElement(model, "Second Element", 2);
			addElement(model, "Third Element", 3);
			
			Item firstItem = addItem(model, "First Item");
			Item secondItem = addItem(model, "Second Item");
			addItem(model, "Third Item");
			addItem(model, "Fourth Item");
			
			firstElement.getItems().add(firstItem);
			firstElement.getItems().add(secondItem);

			secondElement.getItems().add(firstItem);
			
			resource.getContents().add(model);
		}

		private Element addElement(Model model, String name, int age) {
			Element element = ModelFactory.eINSTANCE.createElement();
			element.setName(name);
			element.setAge(age);
			model.getElements().add(element);
			return element;
		}
		
		private Item addItem(Model model, String name) {
			Item item = ModelFactory.eINSTANCE.createItem();
			item.setName(name);
			model.getItems().add(item);
			return item;
		}
	}

	public static class CustomLabelProvider extends ViewerLabelProvider {

		@Inject
		public CustomLabelProvider(AdapterFactoryLabelProvider delegate) {
			super(delegate);
		}

		public String text(Model o) {
			return "Model: " + (o.getName() != null ? o.getName() : "NO NAME");
		}

		public Object image(Model o) {
			return "component.jpg";
		}

		public String text(Element o) {
			return "Element: "
					+ (o.getName() != null ? o.getName() : "NO NAME")
					+ " (" + o.getAge() + ")";
		}
		
		public Object image(Element o) {
			return "detail.jpg";
		}
		
		public Object image(Item o) {
			return "table.jpg";
		}
	}

	public GuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ILabelProvider> bindILabelProvider() {
		return CustomLabelProvider.class;
	}

	@Override
	public Class<? extends EmptyResourceInitializer> bindEmptyResourceInitializer() {
		return CustomEmptyResourceInitializer.class;
	}
}
