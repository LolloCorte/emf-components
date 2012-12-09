package it.rcpvision.emf.components.examples.firstexample.views;

import it.rcpvision.emf.components.views.AbstractSaveableTreeFormView; 
import org.eclipse.emf.common.util.URI; 

public class LibraryTreeFormView extends AbstractSaveableTreeFormView { 

    protected URI createResourceURI() { 
        return URI.createFileURI( System.getProperty("user.home") + "/MyLibrary.library" ); 
    } 

} 

