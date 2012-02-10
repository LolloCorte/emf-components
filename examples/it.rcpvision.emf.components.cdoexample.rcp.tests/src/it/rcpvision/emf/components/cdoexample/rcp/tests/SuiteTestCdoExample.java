package it.rcpvision.emf.components.cdoexample.rcp.tests;

import it.rcpvision.emf.components.cdoexample.rcp.tests.table.DeleteAuthorTest;
import it.rcpvision.emf.components.cdoexample.rcp.tests.table.InsertAuthorTest;
import it.rcpvision.emf.components.cdoexample.rcp.tests.table.UpdateAuthorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//	InsertAuthorTest.class,
	UpdateAuthorTest.class,
	DeleteAuthorTest.class
})
public class SuiteTestCdoExample {
}