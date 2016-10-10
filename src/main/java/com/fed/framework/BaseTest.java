package com.fed.framework;

public class BaseTest {	
	
	public void setUpBase(){
		System.out.println("Starting TestSuite");
		GlobalVariables.setGlobalVariables();
	
		
	}
	
	
	

	public void cleanUpBase(){		
		System.out.println("Cleaining TestSuite");
	}
	
	
	

}
