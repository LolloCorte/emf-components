package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import it.rcpvision.emf.components.cdoexample.rcp.tests.CdoExampleAbstract;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestUiTable extends CdoExampleAbstract {
	
	@Test
	public void testOpenTableMD() {
		bot.menu("Table Master Detail").click();
		bot.viewById("Table Master Detail").setFocus();
	}
}
