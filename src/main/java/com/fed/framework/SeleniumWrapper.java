package com.fed.framework;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SeleniumWrapper {

	WebDriver driver;
	String browser;

	public WebDriver getDriver() {
		return driver;
	}

	SeleniumWrapper(String browserName) {
		browser = browserName;
		setDriver(browser);
	}

	void setDriver(String value) {
		switch (value.toUpperCase()) {
		case "FIREFOX":
			this.driver = getFireFoxDriver();
			break;
		case "CHROME":
			this.driver = getChromeDriver();
			break;
		}

	}

	WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				GlobalVariables.driverPath + File.pathSeparator + "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("start-maximized");
		return new ChromeDriver(options);

	}

	WebDriver getFireFoxDriver() {
		FirefoxProfile ffprofile = new ProfilesIni().getProfile("default");
		ffprofile.setPreference("browser.download.folderList", 2);
		ffprofile.setPreference("browser.download.manager.showWhenStarting", false);
		ffprofile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/zip,application/octet-stream");
		return new FirefoxDriver(ffprofile);
	}

}
