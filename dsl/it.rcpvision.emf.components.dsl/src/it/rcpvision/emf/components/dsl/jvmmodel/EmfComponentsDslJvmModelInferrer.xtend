package it.rcpvision.emf.components.dsl.jvmmodel

import com.google.inject.Inject
import it.rcpvision.emf.components.EmfComponentsGenericModule
import it.rcpvision.emf.components.dsl.model.Module
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider
import it.rcpvision.emf.components.ui.provider.EStructuralFeaturesProvider$EClassToEStructuralFeatureAsStringsMap
import it.rcpvision.emf.components.ui.provider.PropertyDescriptionProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class EmfComponentsDslJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	
	@Inject extension IQualifiedNameProvider
	
	@Inject extension TypeReferences
	
	@Inject extension TypesFactory
	
	@Inject extension GeneratorUtils

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(Module element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		if (element.name == null)
   			return
   		
		val moduleClass = element.toClass(element.moduleQN)
		
		val labelProviderClass = element.inferLabelProvider(acceptor)
		val featureLabelProviderClass = element.inferFeatureLabelProvider(acceptor)
		val featureProviderClass = element.inferFeatureProvider(acceptor)
		
		acceptor.accept(moduleClass).initializeLater [
			documentation = element.documentation
			superTypes += element.newTypeRef(typeof(EmfComponentsGenericModule))
			
			members += element.toConstructor() [
				parameters += element.toParameter("plugin", element.newTypeRef(typeof(AbstractUIPlugin)))
				body = [it.append("super(plugin);")]
			]
			
			if (labelProviderClass != null)
				members += element.labelProvider.genBindMethod(labelProviderClass, typeof(CompositeLabelProvider))
			if (featureLabelProviderClass != null)
				members += element.featureLabelProvider.genBindMethod(featureLabelProviderClass, typeof(PropertyDescriptionProvider))
			if (featureProviderClass != null)
				members += element.featureProvider.genBindMethod(featureProviderClass, typeof(EStructuralFeaturesProvider))
		]
   	}
   	
   	def activatorQN(Module element) {
   		element.fullyQualifiedName + ".Activator"
   	}
   	
   	def moduleQN(Module element) {
   		element.fullyQualifiedName + ".EmfComponentsGuiceModuleGen"
   	}

   	def executableExtensionFactoryQN(Module element) {
   		element.fullyQualifiedName + ".ExecutableExtensionFactory"
   	}

	def labelProviderQN(Module element) {
		element.fullyQualifiedName + ".ui.provider.LabelProviderGen"
	}
	
	def featureLabelProviderQN(Module element) {
		element.fullyQualifiedName + ".ui.provider.FeatureLabelProviderGen"
	}

	def featureProviderQN(Module element) {
		element.fullyQualifiedName + ".ui.provider.EStructuralFeaturesProviderGen"
	}

	def inferLabelProvider(Module element, IJvmDeclaredTypeAcceptor acceptor) {
		if (element.labelProvider == null)
			null
		else {
			val labelProviderClass = element.labelProvider.toClass(element.labelProviderQN)
			acceptor.accept(labelProviderClass).initializeLater [
				superTypes += element.newTypeRef(typeof(CompositeLabelProvider))
				
				element.labelProvider.labelSpecifications.forEach [
					labelSpecification |
					members += labelSpecification.toMethod("text", element.newTypeRef(typeof(String))) [
						parameters += labelSpecification.toParameter(
							if (labelSpecification.name != null)
								labelSpecification.name
							else
								"it"
							, labelSpecification.parameterType
						)
						body = labelSpecification.expression
					]
				]
				
				element.labelProvider.imageSpecifications.forEach [
					imageSpecification |
					members += imageSpecification.toMethod("image", element.newTypeRef(typeof(Object))) [
						parameters += imageSpecification.toParameter(
							if (imageSpecification.name != null)
								imageSpecification.name
							else
								"it"
							, imageSpecification.parameterType
						)
						body = imageSpecification.expression
					]
				]
			]
			labelProviderClass
		}
	}
	
	def inferFeatureLabelProvider(Module element, IJvmDeclaredTypeAcceptor acceptor) {
		if (element.featureLabelProvider == null)
			null
		else {
			val featureLabelProviderClass = element.featureLabelProvider.toClass(element.featureLabelProviderQN)
			acceptor.accept(featureLabelProviderClass).initializeLater [
				superTypes += element.newTypeRef(typeof(PropertyDescriptionProvider))
				
				element.featureLabelProvider.labelSpecifications.forEach [
					labelSpecification |
					if (labelSpecification.feature != null &&
						(labelSpecification.feature as XFeatureCall).feature != null
					) {
						// associate the method to the expression, not to the whole
						// labelSpecification, otherwise the 'feature' is logically
						// contained in a method which should return a string
						// and the validator would complain
						members += labelSpecification.expression.toMethod
						("text_" + 
								labelSpecification.parameterType.simpleName + "_" +
								(labelSpecification.feature as XFeatureCall).
									feature.simpleName.propertyNameForGetterSetterMethod, 
							element.newTypeRef(typeof(String))
						) [
							parameters += labelSpecification.toParameter(
								"it", element.newTypeRef(typeof(EStructuralFeature))
							)
							body = labelSpecification.expression
						]
					}
				]
			]
			featureLabelProviderClass
		}
	}

	def inferFeatureProvider(Module element, IJvmDeclaredTypeAcceptor acceptor) {
		if (element.featureProvider == null)
			null
		else {
			val featureProviderClass = element.featureProvider.toClass(element.featureProviderQN)
			acceptor.accept(featureProviderClass).initializeLater [
				superTypes += element.newTypeRef(typeof(EStructuralFeaturesProvider))
				
				members += element.featureProvider.
						toMethod("buildStringMap", Void::TYPE.getTypeForName(element)) [
					annotations += element.toAnnotation(typeof(Override))
					parameters += element.featureProvider.toParameter("stringMap",
							element.newTypeRef(
								typeof(EStructuralFeaturesProvider$EClassToEStructuralFeatureAsStringsMap)
							)
					)
					body = [
						append("super.buildStringMap(stringMap);").newLine
						element.featureProvider.featureSpecifications.forEach [
							featureSpecification |
							newLine.
								append('''stringMap.mapTo("«featureSpecification.parameterType.identifier»",''').
									increaseIndentation.newLine
							val fs = featureSpecification.features.map [
								feature |
								'"' + (feature as XFeatureCall).
									feature.simpleName.propertyNameForGetterSetterMethod
								+ '"'
							]
							append(fs.join(", "))
							append(");").decreaseIndentation
						]
					]
				]
			]
			featureProviderClass
		}
	}
	
	def genBindMethod(EObject element, JvmGenericType type, Class<?> clazz) {
		val wildCard = createJvmWildcardTypeReference
		val upperBound = createJvmUpperBound
		upperBound.typeReference = element.newTypeRef(clazz)
		wildCard.constraints += upperBound
		element.toMethod("bind" + clazz.simpleName, 
				element.newTypeRef(typeof(Class), wildCard) ) [
			annotations += element.toAnnotation(typeof(Override))
			body = [
				append("return ")
				append(type)
				append(".class;")
			]
		]
	}
}

