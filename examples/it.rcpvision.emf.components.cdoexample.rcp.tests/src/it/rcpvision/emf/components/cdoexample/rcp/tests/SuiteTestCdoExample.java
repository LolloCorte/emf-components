package it.rcpvision.emf.components.cdoexample.rcp.tests;

import it.rcpvision.emf.components.cdoexample.rcp.tests.table.TestUiTable;
import it.rcpvision.emf.components.cdoexample.rcp.tests.tree.TestUiTree;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		
		TestUiTable.class,
		TestUiTree.class
})
public class SuiteTestCdoExample {
}