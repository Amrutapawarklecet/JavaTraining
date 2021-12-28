package com.marlabs.training.P41_PropertiesFile;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("db.properties");
		Properties p = new Properties();
		p.load(fr);

		System.out.println("the user name is :" + p.getProperty("username"));
		System.out.println("the password is :" + p.getProperty("password"));
		System.out.println("the Driver is :" + p.getProperty("driver_class"));

	}
}