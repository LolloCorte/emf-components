package it.rcpvision.emf.components.ui.provider;

import java.util.HashMap;
import java.util.List;

import com.google.common.collect.Lists;

public class EClassToEStructuralFeatureAsStringsMap extends
		HashMap<String, List<String>> {

	private static final long serialVersionUID = -5838485782229839444L;

	public void mapTo(String eClass, String... features) {
		put(eClass, Lists.newArrayList(features));
	}

}