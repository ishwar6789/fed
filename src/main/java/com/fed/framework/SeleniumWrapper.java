package com.fed.framework;

import org.openqa.selenium.WebDriver;

public class SeleniumWrapper {
	
	WebDriver driver;
	String browser;

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	SeleniumWrapper(String browser){
		this.browser=browser;
	}
	
	


}
