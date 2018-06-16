package com.el.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.el.calculator.models.Calculator;



@Controller
public class CalculatorController {	
	
	private Calculator calc;
	
	public CalculatorController() {
		this.calc = new Calculator();
		
	}
	
	@GetMapping("/")
	public ModelAndView calculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView calculation(int firstNumber, String operation, int secondNumber) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		double result = 0;
		
		if(operation.equals("+")) {
			result = calc.add(firstNumber, secondNumber);
		}
		
		if(operation.equals("-")) {
			result = calc.subtract(firstNumber, secondNumber);
		}
		
		if(operation.equals("*")) {
			result = calc.multiply(firstNumber, secondNumber);
		}
		
		if(operation.equals("/")) {
			result = calc.divide(firstNumber, secondNumber);
		}
		
		if(operation.equals("^")) {
			result = calc.power(firstNumber, secondNumber);
		}
		
		
		String list = "";
		
		for(String entry : calc.getHistory()) {
			list += entry + "<br />";
		}
		
		mv.addObject("result", result);
		mv.addObject("history", list);

		return mv;
		
	}
	
}
