/*
* generated by Xtext
*/
package it.rcpvision.emf.components.examples.fowlerdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StatemachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("it/rcpvision/emf/components/examples/fowlerdsl/parser/antlr/internal/InternalStatemachine.tokens");
	}
}
