package com.el.calculator.models;

import java.util.ArrayList;

public class Calculator {

		int firstNumber;
		int secondNumber;
		String operation;
		private ArrayList<String> history = new ArrayList<String>();
		//double ans = 0;
		
	public Calculator() {
		// TODO Auto-generated constructor stub
		
	}
	

	public double add(int a, int b) {
		double result = a+b;
		String equation = a + "+" + b + "=" + result;
		history.add(0, equation);
		return result;
	}
	public double subtract(int a, int b) {
		double result = a-b;
		String equation = a + "-" + b + "=" + result;
		history.add(0, equation);
		return result;
	}
	public double multiply(int a, int b) {
		double result = a+b;
		String equation = a + "-" + b + "=" + result;
		history.add(0, equation);
		return result;
	}
	public double divide(int a, int b) {
		double result = a+b;
		String equation = a + "/" + b + "=" + result;
		history.add(0, equation);
		return result;
	}
	public double power(int a, int b) {
		double result = Math.pow(a, b);
		String equation = a + "^" + b + "=" + result;
		history.add(0, equation);
		return result;
	}


	public ArrayList<String> getHistory() {
		return history;
	}
	
	
}
