package com.fed.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {
	public static String browser;
	public static String configPath;
	public static String screenshotPath;
	public static String driverPath;

	public static void setGlobalVariables() {
		// set all the global paths
		setConfigPath();
		// read configuration file
		configReader();
	}

	private static void setConfigPath() {
		configPath = System.getProperty("user.dir") + "\\src\\main\\resources\\Configuration.properties";
		driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\DataTable\\Drivers";
	}

	private static void configReader() {
		browser = getPropValues(configPath, "browser");
	}

	public static String getPropValues(String propFile, String propKey) {
		try {
			Properties prop = new Properties();
			File file = new File(propFile);
			FileInputStream fileInput = new FileInputStream(file);
			prop.load(fileInput);
			return prop.getProperty(propKey);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
