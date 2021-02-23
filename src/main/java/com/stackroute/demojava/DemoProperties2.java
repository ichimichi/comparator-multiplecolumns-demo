package com.stackroute.demojava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class DemoProperties2 {
	
	
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(System.getProperty("user.dir")+"/config/demo.properties");
		Properties prop = new Properties();
		
		prop.load(fr);
		
		
		if(prop.getProperty("env").equals("production")) {
			System.out.println("Using Production instances");
		}else {
			System.out.println("Dev environment");
		}
		String ser = "";
		if((ser = prop.getProperty("server", "tomcat")).equals("weblogic")) {
			System.out.println("Server - Weblogic");
		}else {
			System.out.println(ser);
		}
	}


}
