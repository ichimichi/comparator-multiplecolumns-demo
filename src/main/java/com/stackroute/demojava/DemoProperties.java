package com.stackroute.demojava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
	
	
	public static void main(String[] args) throws IOException {

		Properties prop = System.getProperties();
		
		Iterator itr = prop.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}


}
