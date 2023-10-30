package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculator")
	public String doGet() {
		return "calculator.html";
	}

	@PostMapping("calculator")
	public String doGet(@RequestParam int num1, @RequestParam String operator,@RequestParam int num2,
			 Model model) {
		int answer = calculatorService.doGet(num1, operator, num2);
		model.addAttribute("answer", answer);
		return "calculator.html";
	}
}
