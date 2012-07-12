package it.rcpvision.emf.components.dsl.jvmmodel

import com.google.inject.Inject
import it.rcpvision.emf.components.EmfComponentsGenericModule
import it.rcpvision.emf.components.dsl.model.Module
import it.rcpvision.emf.components.ui.provider.CompositeLabelProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.TypesFactory

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
	
	@Inject extension TypesFactory

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
		
		acceptor.accept(moduleClass).initializeLater [
			documentation = element.documentation
			superTypes += element.newTypeRef(typeof(EmfComponentsGenericModule))
			
			members += element.toConstructor() [
				parameters += element.toParameter("plugin", element.newTypeRef(typeof(AbstractUIPlugin)))
				body = [it.append("super(plugin);")]
			]
			
			if (labelProviderClass != null)
				members += element.labelProvider.genBindMethod(labelProviderClass, typeof(CompositeLabelProvider))
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
	
	def genBindMethod(EObject element, JvmGenericType type, Class<?> clazz) {
		val wildCard = createJvmWildcardTypeReference
		val upperBound = createJvmUpperBound
		upperBound.typeReference = element.newTypeRef(clazz)
		wildCard.constraints += upperBound
		element.toMethod("bind" + clazz.simpleName, 
				element.newTypeRef(typeof(Class), wildCard) ) [
			body = [
				append("return ")
				append(type)
				append(".class;")
			]
		]
	}
}

