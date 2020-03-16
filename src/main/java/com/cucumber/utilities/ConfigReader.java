package com.cucumber.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop = new Properties();

	public ConfigReader() throws Exception {
		try {
			File f = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\cucumber\\property\\configuration.properties");
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("File path is not valid");
		}
	}

public  String getBrowsername() throws Exception {
try {
	String browser = prop.getProperty("browsername");
	return browser;
} catch (Exception e) {
	e.printStackTrace();
	throw new Exception("Browser name is not valid in property file");
}
}
public String getUrl() throws Exception {
try {
	String URL=prop.getProperty("url");
	return URL;
} catch (Exception e) {
	e.printStackTrace();
	throw new Exception("Not a valid URL!");
}
}

public String getWait() throws Exception {
try {
	String wait=prop.getProperty("implicitwait");
	return wait;
} catch (Exception e) {
	e.printStackTrace();
	throw new Exception();
}
}



}
