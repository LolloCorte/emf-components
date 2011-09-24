package it.rcpvision.cdo04.editor.labeling;

import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider;
import my.Container;
import my.Customer;
import my.Item;
import my.Order;
import my.OrderRow;

import org.eclipse.emf.cdo.eresource.CDOResource;

public class DemoLabelProvider extends CompositeLabelProvider {

	public String text(OrderRow row) {
		return (row.getItem() == null ? "" : "N. "+row.getNumber() + " ... "+row.getItem().getCode());
	}
	
	public Object image(OrderRow row) {
		return "orderRow.png";
	}

	public Object image(Order order) {
		return "order.png";
	}

	public Object image(Item item) {
		return "item.png";
	}

	public Object image(Customer customer) {
		return "customer.png";
	}

	public Object image(Container container) {
		return "container.png";
	}

	public Object image(CDOResource cdoResource) {
		return "cdoResource.png";
	}

	public String text(CDOResource cdoResource) {
		return "";
	}
}
