package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;
@Service
public class CalculatorService {

	public int doGet(int num1, String operator, int num2) {

		switch (operator) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;

		default:
			if (num2 == 0) {
				return 0;
			}
			else {
				return num1 / num2;
			}
		}
	}
}
