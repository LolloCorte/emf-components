package it.rcpvision.emf.components.examples.firstexample;

import it.rcpvision.emf.components.resource.EmptyResourceInitializer; 
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory; 
import org.eclipse.emf.examples.extlibrary.Library; 

public class LibraryEmptyResourceInitializer  extends EmptyResourceInitializer {  
     
   public void initialize(Resource resource) {  
       super.initialize(resource);  
       Library library = EXTLibraryFactory.eINSTANCE.createLibrary();  
       resource.getContents().add(library);  
   }  

}  


