/**
 * 
 */
package it.rcpvision.emf.components.ecore;

/**
 * @author Lorenzo Bettini
 *
 */
public abstract class FeatureNamePath {

	String featureName;
	
	FeatureNamePath path;

	public FeatureNamePath(String featureName) {
		super();
		this.featureName = featureName;
	}

	public FeatureNamePath(String featureName, FeatureNamePath path) {
		super();
		this.featureName = featureName;
		this.path = path;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public FeatureNamePath getPath() {
		return path;
	}

	public void setPath(FeatureNamePath path) {
		this.path = path;
	}
	
	
}
