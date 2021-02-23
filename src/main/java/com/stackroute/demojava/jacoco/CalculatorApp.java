package com.stackroute.demojava.jacoco;



public class CalculatorApp {


	public int add(int number1,int number2) {
		return number1+number2;
	}
	

	public int sub(int number1,int number2) {
		if(number1 > number2) {
			return number1-number2;
		}else {
			return number2 - number1;
		}
	}

	public int mul(int number1,int number2) {
		return number1*number2;
	}
	

	public int div(int number1,int number2) {
		if(number2 == 0) {
			return 0;
		}
		return number1/number2;
	}
	
	
}
