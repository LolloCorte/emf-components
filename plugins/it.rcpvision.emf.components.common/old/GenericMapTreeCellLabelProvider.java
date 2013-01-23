package it.rcpvision.emf.components.builders;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

public class GenericMapTreeCellLabelProvider extends ObservableMapCellLabelProvider {
	
	private Map<IObservableMap[],String> map;

	//TODO Provisional: the param would be a single structure, instead of two...
	public GenericMapTreeCellLabelProvider(IObservableMap[] list,Map<IObservableMap[],String> map) {
		super(list);
		this.map = map;
	}

	@Override
	public void update(ViewerCell cell) {
		Object element = cell.getElement();
	
		for (Entry<IObservableMap[],String> entry : map.entrySet()) {
			IObservableMap[] attributeMaps=entry.getKey();
			String pattern=entry.getValue();
			Object[] values = new Object[attributeMaps.length];
			int i = 0;
			boolean found=true;
			for (IObservableMap m : attributeMaps) {
				values[i++] = m.get(element);
				if (values[i - 1] == null) {
					found=false;
				}
			}
			if(found){
				cell.setText(MessageFormat.format(pattern, values));
				return ;
			}
		}
		cell.setText("***");
	}
}
