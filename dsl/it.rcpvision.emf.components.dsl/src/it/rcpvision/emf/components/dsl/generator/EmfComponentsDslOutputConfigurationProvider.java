package it.rcpvision.emf.components.dsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class EmfComponentsDslOutputConfigurationProvider extends
		OutputConfigurationProvider {

	public static final String EMFCOMPONENTS_GEN = "./emfcomponents-gen";

	public static final String PROJECT_ROOT_OUTPUT = "PROJECT_ROOT";

	public static final String PLUGIN_XML_EMFCOMPONENTS_REL_GEN_PATH = "../";

	public static final String PLUGIN_XML_EMFCOMPONENTS_GEN = "plugin.xml_emfcomponents_gen";

	public static final String PLUGIN_XML_EMFCOMPONENTS_GEN_PATH = PLUGIN_XML_EMFCOMPONENTS_REL_GEN_PATH
			+ PLUGIN_XML_EMFCOMPONENTS_GEN;

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> outputconfigurations = super
				.getOutputConfigurations();
		OutputConfiguration outputConfiguration = outputconfigurations
				.iterator().next();
		outputConfiguration.setOutputDirectory(EMFCOMPONENTS_GEN);

		OutputConfiguration projectRootOutput = new OutputConfiguration(
				PROJECT_ROOT_OUTPUT);
		projectRootOutput.setDescription("Output Folder for generated "
				+ PLUGIN_XML_EMFCOMPONENTS_GEN);
		projectRootOutput.setOutputDirectory("src");
		projectRootOutput.setOverrideExistingResources(true);
		projectRootOutput.setCreateOutputDirectory(true);
		projectRootOutput.setCanClearOutputDirectory(false);
		projectRootOutput.setCleanUpDerivedResources(true);
		projectRootOutput.setSetDerivedProperty(true);

		outputconfigurations.add(projectRootOutput);

		return outputconfigurations;
	}

}