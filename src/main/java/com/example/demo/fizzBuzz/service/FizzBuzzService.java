package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class FizzBuzzService {

	public List<String> plus() {
		List<String> result = new ArrayList<>();
		
			int i = 0;
			while(i <=100) {
				if(i%3==0&&i%5==0) {
					result.add("FizzBuzz");
				}
				else if(i%3==0) {
					result.add("Fizz");
				}
				else if(i%5==0) {
					result.add("Buzz");
				}
				else {
					result.add(String.valueOf(i));
				}
				i++;
			}
		return result;
	}
}
