/*
* generated by Xtext
*/
package it.rcpvision.emf.components.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EmfComponentsDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("it/rcpvision/emf/components/dsl/parser/antlr/internal/InternalEmfComponentsDsl.tokens");
	}
}
