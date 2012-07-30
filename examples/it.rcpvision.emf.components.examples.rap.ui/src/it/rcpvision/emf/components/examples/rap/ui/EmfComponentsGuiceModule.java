package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.EmfComponentsGenericModule;
import it.rcpvision.emf.components.examples.rap.model.Element;
import it.rcpvision.emf.components.examples.rap.model.Model;
import it.rcpvision.emf.components.examples.rap.model.ModelFactory;
import it.rcpvision.emf.components.resource.EmptyResourceInitializer;
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfComponentsGuiceModule extends EmfComponentsGenericModule {

	public static class CustomEmptyResourceInitializer extends
			EmptyResourceInitializer {
		public void initialize(org.eclipse.emf.ecore.resource.Resource resource) {
			Model model = ModelFactory.eINSTANCE.createModel();
			model.setName("My Model");

			addElement(model, "First Element", 1);
			addElement(model, "Second Element", 2);
			addElement(model, "Third Element", 3);

			resource.getContents().add(model);
		}

		private void addElement(Model model, String name, int age) {
			Element element = ModelFactory.eINSTANCE.createElement();
			element.setName(name);
			element.setAge(age);
			model.getElements().add(element);
		}
	}

	public static class CustomLabelProvider extends CompositeLabelProvider {

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
	}

	public EmfComponentsGuiceModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends CompositeLabelProvider> bindCompositeLabelProvider() {
		return CustomLabelProvider.class;
	}

	@Override
	public Class<? extends EmptyResourceInitializer> bindEmptyResourceInitializer() {
		return CustomEmptyResourceInitializer.class;
	}
}
