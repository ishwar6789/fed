package com.fed.framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class FidelityTestCase extends BaseTest {

	@BeforeSuite(alwaysRun = true)
	public void setUpBase() {
		super.setUpBase();

	}

	@AfterSuite(alwaysRun = true)
	public void cleanUpBase() {
		super.cleanUpBase();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		System.out.println("Before Test: ");
		startSelenium();
		

	}

	private void startSelenium() {
	
		SeleniumWrapper wrap = new SeleniumWrapper(GlobalVariables.browser);
		
	}

	@AfterClass(alwaysRun = true)
	public void cleanUp() {
		System.out.println("After Test: ");
		stopSelenium();

	}

	private void stopSelenium() {
		// TODO Auto-generated method stub
		
	}

}
