package it.rcpvision.emf.components.cdoexample.rcp.tests.table;

import it.rcpvision.emf.components.cdoexample.rcp.tests.CdoExampleAbstract;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class UpdateCustomerTest extends CdoExampleAbstract{

	private static final String CUSTOMER_CODE_TOTEST = "CT";
	private static final String CUSTOMER_DETAILFIELD_TOCHANGE = "name";
	
	@Test
	public void testUpdateCustomerName() {
//		bot.menu("Table Master Detail").click();
//		bot.viewByTitle("Table Master Detail").setFocus();
//		
//		SWTBotTableItem rcpItem = getCustomerItemByCode(CUSTOMER_CODE_TOTEST);
//		bot.table().select(rcpItem.getText());
//		String modifiedCustomerName = rcpItem.getText(getPositionColumn(CUSTOMER_DETAILFIELD_TOCHANGE)) + " modificato";
//		bot.textWithLabel(CUSTOMER_DETAILFIELD_TOCHANGE).setText(modifiedCustomerName);
//
//		bot.button(SAVE_BUTTON).click();
//		bot.viewByTitle(CUSTOMER_TITLE).close();
//		
//		bot.menu(CUSTOMER_MENUITEM).click();
//		bot.viewByTitle(CUSTOMER_TITLE).setFocus();
//		String modifiedNameRetrieved = getCustomerItemByCode(CUSTOMER_CODE_TOTEST).getText(getPositionColumn(CUSTOMER_DETAILFIELD_TOCHANGE));
//		assertTrue(modifiedNameRetrieved.equals(modifiedCustomerName));
	}
}
