package it.rcpvision.emf.components.dsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class EmfComponentsDslOutputConfigurationProvider extends
		OutputConfigurationProvider {

	public static final String PLUGIN_XML_EMFCOMPONENTS_GEN = "plugin.xml.emfcomponents_gen";
	public static final String EMFCOMPONENTS_GEN = "./emfcomponents-gen";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> outputconfigurations = super
				.getOutputConfigurations();
		OutputConfiguration outputConfiguration = outputconfigurations
				.iterator().next();
		outputConfiguration.setOutputDirectory(EMFCOMPONENTS_GEN);
	
		return outputconfigurations;
	}

}