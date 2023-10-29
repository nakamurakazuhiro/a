package com.example.demo.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

@Controller
public class MultiController {

	private final MultiService mutliService;

	public MultiController(MultiService multiService) {
		this.mutliService = multiService;
	}

	@GetMapping("multi")
	public String plus(Model model) {

		String result = "";

		result = String.valueOf(mutliService.plus(5, 6));

		model.addAttribute("result", result);

		return "multi.html";
	}

}
