package it.rcpvision.emf.components.ui.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class EStructuralFeaturesColumnProvider extends EStructuralFeaturesProvider{
	
	@Inject
	protected EStructuralFeaturesProvider featuresProvider;
	
	private List<Integer> weights;
	

	@Override
	protected List<EStructuralFeature> getFromMap(EClass eClass) {
		List<EStructuralFeature> columnDefinition=super.getFromMap(eClass);
		if(columnDefinition!=null){
			return columnDefinition;
		}
		return featuresProvider.getFromMap(eClass);
	}


	public List<Integer> getWeights() {
		return weights;
	}


	public void setWeights(Integer... weights) {
		this.weights=Lists.newArrayList(weights);
	}
}
