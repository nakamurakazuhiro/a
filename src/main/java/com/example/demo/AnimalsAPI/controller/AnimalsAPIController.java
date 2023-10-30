package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.AnimalsAPIData;
import com.example.demo.AnimalsAPI.service.AnimalsAPIService;

@Controller
public class AnimalsAPIController { 

	private final AnimalsAPIService animalsAPIService; 

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService; 
	}

	@GetMapping("animalsSerch")
	public String animalsSearch(Model model) throws IOException {


		List<AnimalsAPIData> animalsList = animalsAPIService.getAnimalsAPIData();

		model.addAttribute("animalsList", animalsList);

		return "animalsSerch.html";

	}

	@GetMapping("animalsResult")
	public String animalDetails(@RequestParam("animals") String animals, Model model) throws IOException {

		List<AnimalsAPIData> matchingAnimalsList = animalsAPIService.getSelectedAnimalsAPIData(animals);

		model.addAttribute("matchingAnimalsList", matchingAnimalsList);

		return "animalsResult.html";

	}

}