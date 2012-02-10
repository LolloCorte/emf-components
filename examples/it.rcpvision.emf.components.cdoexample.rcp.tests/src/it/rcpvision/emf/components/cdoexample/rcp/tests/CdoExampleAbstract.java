package it.rcpvision.emf.components.cdoexample.rcp.tests;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CdoExampleAbstract {
	
	protected static SWTWorkbenchBot bot;
	protected static final String SAVE_BUTTON = "Save";
	protected static final String INSERT_BUTTON = "Insert";
	protected static final String DELETE_BUTTON = "Delete";
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
	}

}
