package it.rcpvision.emf.components.cdoexample.rcp.tests.tree;

import it.rcpvision.emf.components.cdoexample.rcp.tests.CdoExampleAbstract;

import org.junit.Test;

public class TestUiTree extends CdoExampleAbstract {
	
	@Test
	public void testOpenTreeMD() {
		bot.menu("Tables").menu("Tree Master Detail").click();
		bot.viewByTitle("Tree Master Detail").setFocus();
	}
}
