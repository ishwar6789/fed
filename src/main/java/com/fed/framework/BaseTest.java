package com.fed.framework;

public class BaseTest {	
	
	public void setUpBase(){
		System.out.println("Starting TestSuite");
		GlobalVariables.setGlobalVariables();
		System.out.println("Browser is  "+ GlobalVariables.browser);
		System.out.println("");
		
	}
	
	
	

	public void cleanUpBase(){		
		System.out.println("Cleaining TestSuite");
	}
	
	
	

}
