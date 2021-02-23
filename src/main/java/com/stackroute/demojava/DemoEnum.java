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

public class DemoEnum {
	
	
	
	public static void main(String[] args) throws IOException {

		
		Day firstday = Day.MONDAY;
	
		System.out.println(firstday);
		
		System.out.println(quotefortheday(Day.FRIDAY.toString()));
		
		Day daylist[] = Day.values();
		
		for(Day day: daylist) {
			System.out.println(day+ " " +day.ordinal());
		}
		
		firstday.displayday();
	}

	
	public static String quotefortheday(String day) {
		
		switch(day) {
		
		case "SUNDAY":
				 return "last day";
		
		case "FRIDAY":
			return "TGIF";

		default:
			return "No quotest";
		}
		
		
	}

}


enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
	Day(){
		System.out.println("Day constructor");
	}
	
	public void displayday() {
		System.out.println("Info about current day");
	}
	
	
}