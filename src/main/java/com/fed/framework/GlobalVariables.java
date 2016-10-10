package com.fed.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {
	public static String browser;
	public static String resourcePath;
	public static String screenshotPath;

	GlobalVariables() {
		// set all the global paths
		setConfigPath();
		// read configuration file
		configReader();
	}

	private static void setConfigPath() {
		resourcePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Configuration.properties";
	}

	private void configReader() {
		browser = getPropValues(resourcePath, "browser");
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
