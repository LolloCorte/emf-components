package it.rcpvision.emf.components.dsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class EmfComponentsDslOutputConfigurationProvider extends
		OutputConfigurationProvider {

	public static final String PLUGIN_XML_EMFCOMPONENTS_GEN = "plugin.xml.emfcomponents_gen";
	public static final String EMFCOMPONENTS_GEN = "./emfcomponents-gen";
	public static final String PROJECT_ROOT_OUTPUT = "emf.components.project.root.output";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> outputconfigurations = super
				.getOutputConfigurations();
		OutputConfiguration outputConfiguration = outputconfigurations
				.iterator().next();
		outputConfiguration.setOutputDirectory(EMFCOMPONENTS_GEN);

		// output configuration for plugin.xml.gen
		OutputConfiguration projectRootOutput = new OutputConfiguration(
				PROJECT_ROOT_OUTPUT);
		projectRootOutput.setDescription("Output Folder for "
				+ PLUGIN_XML_EMFCOMPONENTS_GEN);
		projectRootOutput.setOutputDirectory("./");
		projectRootOutput.setOverrideExistingResources(true);
		projectRootOutput.setCreateOutputDirectory(true);
		projectRootOutput.setCleanUpDerivedResources(true);
		projectRootOutput.setSetDerivedProperty(true);

		outputconfigurations.add(projectRootOutput);

		return outputconfigurations;
	}

}