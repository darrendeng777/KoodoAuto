package com.koodo.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetProperties {
	
	Properties pro ;
	
	//constructor
	public GetProperties() {
		try {
			File src = new File("Darren.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			System.out.println("------I can find the properties file----");
		} catch (Exception e) {
			System.out.println("The exception is ------------"+e.getMessage());
		}
	}
	
	public String getURL() {
		String uRL = pro.getProperty("URL");
		return uRL;
	}
	
	public String getUserName() {
		String userName = pro.getProperty("username");
		return userName;
	}

}
