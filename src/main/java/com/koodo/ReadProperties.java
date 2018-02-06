package com.koodo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	Properties prop;
	
	public ReadProperties() {
		try {
			File f = new File("koodo.properties");
			FileInputStream fis = new FileInputStream(f);
		    prop = new Properties();
		    prop.load(fis);
		} catch (Exception e) {
			System.out.println("The exception is "+ e.getMessage());
	   }
	}
	
	public String getURL() {
		String uRL = prop.getProperty("url");
		return uRL;
	}
	
	public String getUserName() {
		String userName = prop.getProperty("username");
		return userName;
	}
	
	public String getPassWord() {
		String passWord = prop.getProperty("password");
		return passWord;
	}

}
